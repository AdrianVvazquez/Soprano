from collections import defaultdict
from sopranoVisitor import sopranoVisitor

class SopranoException(Exception):
    def __init__(self, message):
        self.message = 'Error' + message

class Procedimiento():
    def __init__(self, name, params, inss):
        self.name = name
        self.params = params
        self.inss = inss

class Visitor(sopranoVisitor):
    def __init__(self, entryProc='Main', entryParams=[]):
        self.entryProc = entryProc
        self.entryParams = entryParams
    
        self.procs = []         # procedimientos
        self.stack = []         # TABLA DE SÍMBOLOS
        self.partituras = []    # lista para partituras
        
        self.notas = {}         # dicc para notas
        self.notas["A0"] = 0
        self.notas["B0"] = 1
        self.notas["C1"] = 2
        self.notas["D1"] = 3
        self.notas["E1"] = 4
        self.notas["F1"] = 5
        self.notas["G1"] = 6
        self.notas["A1"] = 7
        self.notas["B1"] = 8
        self.notas["C2"] = 9
        self.notas["D2"] = 10
        self.notas["E2"] = 11
        self.notas["F2"] = 12
        self.notas["G2"] = 13
        self.notas["A2"] = 14
        self.notas["B2"] = 15
        self.notas["C3"] = 16
        self.notas["D3"] = 17
        self.notas["E3"] = 18
        self.notas["F3"] = 19
        self.notas["G3"] = 20
        self.notas["A3"] = 21
        self.notas["B3"] = 22
        self.notas["C4"] = 23
        self.notas["D4"] = 24
        self.notas["E4"] = 25
        self.notas["F4"] = 26
        self.notas["G4"] = 27
        self.notas["A4"] = 28
        self.notas["B4"] = 29
        self.notas["C5"] = 30
        self.notas["D5"] = 31
        self.notas["E5"] = 32
        self.notas["F5"] = 33
        self.notas["G5"] = 34
        self.notas["A5"] = 35
        self.notas["B5"] = 36
        self.notas["C6"] = 37
        self.notas["D6"] = 38
        self.notas["E6"] = 39
        self.notas["F6"] = 40
        self.notas["G6"] = 41
        self.notas["A6"] = 42
        self.notas["B6"] = 43
        self.notas["C7"] = 44
        self.notas["D7"] = 45
        self.notas["E7"] = 46
        self.notas["F7"] = 47
        self.notas["G7"] = 48
        self.notas["A7"] = 49
        self.notas["B7"] = 50
        self.notas["C8"] = 51

    def __proc__(self, name, paramsValues):
        # error handling
        if(len(self.procs[name].params) != len(paramsValues)):
            raise SopranoException('En \"' + name + '\" proc se esperaba' + str(len(self.procs[name].params))+ 'param(s), '+ str(len(paramsValues))+ ' param(s) recibidos.')
        
        newvars = defaultdict(lambda:0)
        for param, value in zip(self.procs[name].params, paramsValues):
            newvars[param] = value

        self.stack.append(newvars)          # Agregamos los argumentos del procedimiento
        self.visit(self.procs[name].inss)   # Ejecutamos el procedimiento
        self.stack.pop()                    # Sacamos los argumentos que no necesitamos
        
    def visitRoot(self,ctx):
        for proc in list(ctx.getChildren()):
            self.visit(proc)
            
    def visitInss(self,ctx):
        for ins in list(ctx.getChildren()):
            self.visit(ins)
            
    def visitIns(self,ctx):
        return self.visitChildren(ctx)
            
          
    def visitParamsId(self,ctx):
    # Regresa una lista con los ids para los parámetros
        lista = []
        for param in list(ctx.getChildren()):
            lista.append(param.getText())
        return lista

    def visitParamsExpr(self,ctx):
    # Evalua expresiones y regresa una lista con los resultados
        lista = []
        for param in list(ctx.getChildren()):
            lista.append(self.visit(param))
        return lista

    def visitLectura(self, ctx):
        self.stack[-1][ctx.getChild(1).getText()] = int(input())
    
    def visitEscritura(self, ctx):
        l = list(ctx.getChildren())
        for expr in l[1:]:
            a = self.visit(expr)
            if isinstance(a, list):
                b = str(a)  
                b = b.replace(",", "")  # format list
                b = b.replace("'", "")
                if(expr != l[-1]):
                    print(b, end=" ")
                else:
                    print(b)
            else:
                if(expr != l[-1]):
                    print(self.visit(expr), end=" ")
                else:
                    print(self.visit(expr))
        
    def visitCondicion(self, ctx):
        l = list(ctx.getChildren())
        
        if self.visit(l[1]) == 1:
            self.visit(ctx.inss(0))
        elif len(l) > 5: # else exists
            if ctx.getChild(5).getText() == 'else':
                self.visit(ctx.inss(1))

    def visitIteracion(self, ctx):  # while
        l = list(ctx.getChildren())
        while self.visit(l[1]) == 1:
            self.visit(l[3])

    def visitAsignacion(self, ctx):
        l = list(ctx.getChildren())
        self.stack[-1][ctx.VAR().getText()] = self.visit(l[2])

    def visitReproduccion(self, ctx):
        l = list(ctx.getChildren())
        k = self.visit(l[1])
        t = []
        # lista de notas en formato para LilyPond
        if isinstance(k, list):
            for nota in k:
                nota = nota[:1] +"'"+ nota[1:] # (A2 -> A'2)
                t.append(nota)
            # extender la lista global de notas con la lista local de notas
            self.partituras.extend(t) 
        else:
            t = k[:1] + "'" + k[1:]
            self.partituras.append(t)

    def visitLlamada_procedimiento(self, ctx):
        l = list(ctx.getChildren())
        name = l[0].getText()
        # Obtener lista de parámetros(paramsExp)
        params = self.visit(l[1]) 
        if name in self.procs:
            self.__proc__(name, params)
        else:
            raise SopranoException('Procedure \"'+ name + '\" non defined.')

    def visitProcedimiento(self, ctx):
        l = list(ctx.getChildren())
        name = l[0].getText()
        # Obtener lista con parámetros(paramsId)
        params = self.visit(l[1]) 
        if name in self.procs:
            raise SopranoException('Procedure \"'+ name + '\" already defined.')
        else:
            self.procs[name] = Procedimiento(name, params, ctx.inss())

