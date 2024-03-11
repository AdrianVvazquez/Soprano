# 24/03/2024
# Autor: Adrian V.
import os
from collections import defaultdict
if __name__ is not None and "." in __name__:
    from .sopranoVisitor import sopranoVisitor
else:
    from sopranoVisitor import sopranoVisitor

class bcolors:
    OK = "\033[92m"  # GREEN
    WARNING = "\033[93m"  # YELLOW
    FAIL = "\033[91m"  # RED
    RESET = "\033[0m"  # RESET COLOR

class SopranoException(Exception):
    def __init__(self, message, error_code=400):
        self.args = [error_code]
        self.message = message

    def __str__(self) -> str:
        return self.message

class Procedimiento():
    def __init__(self, name, params, inss):
        self.name = name
        self.params = params
        self.inss = inss

class Visitor(sopranoVisitor):
    def __init__(self, uploads_dir, file_name, entryProc='Main', entryParams=[]):
        self.entryProc = entryProc
        self.entryParams = entryParams
        self.uploads_dir = uploads_dir
        self.file_name = file_name
        self.procs = {}         # procedimientos
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
            raise SopranoException('En \"' + name + '\" proc se esperaba ' + str(len(self.procs[name].params))+ ' param(s), '+ str(len(paramsValues))+ ' param(s) recibidos.')
        
        # Lista de variables locales 
        newvars = defaultdict(lambda:0)
        for param, value in zip(self.procs[name].params, paramsValues):
            newvars[param] = value

        self.stack.append(newvars)          # Agregamos los argumentos del procedimiento a las variables locales
        self.visit(self.procs[name].inss)   # Ejecutamos la lista de instrucciones del proc
        self.stack.pop()                    # Sacamos los argumentos que no necesitamos
        
    def visitRoot(self,ctx):
        # Guardar todos los procedimientos
        for proc in list(ctx.getChildren()):
            self.visit(proc)
        # No existe proc Main y no se especificó al ejecutar
        if not self.entryProc in self.procs:
            raise SopranoException("No existe el procedimiento "+self.entryProc+".", error_code=400)
        # Ejecutar procedimientos
        self.__proc__(self.entryProc,self.entryParams)
        # Formatear lista de notas para lilypond
        notas_partitura = ' '.join(map(str,self.partituras))
        notas = notas_partitura.lower()
        # Directorio para los archivos .ly, .midi, .wav, .pdf y .mp3
        os.mkdir(f'{self.uploads_dir}/{self.file_name}')
        print(bcolors.OK+"Generating FILES..."+bcolors.RESET)
        # Crear lilypond
        file = open(f'{self.uploads_dir}/{self.file_name}/{self.file_name}.ly', "w+")
        file.write("\\version \"2.20.0\"" + os.linesep)
        file.write("\score {" + os.linesep)
        file.write("\t \\absolute {" + os.linesep)
        file.write("\t\t" + "\\tempo 4 = 120" + os.linesep)
        file.write("\t\t" + notas + os.linesep)
        file.write("\t }" + os.linesep)
        file.write("\t \layout { }" + os.linesep)
        file.write("\t \midi { }" + os.linesep)
        file.write("}")
        file.close()
        os.chdir(f'{self.uploads_dir}/{self.file_name}')
        os.system(f'lilypond {self.file_name}.ly')
        os.system(f'timidity -Ow -o {self.file_name}.wav {self.file_name}.midi')
        os.system(f'ffmpeg -i {self.file_name}.wav -codec:a libmp3lame -qscale:a 2 {self.file_name}.mp3')
        print(bcolors.OK+"[STATUS] Ok."+bcolors.RESET)
            
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

    def visitLlamadaProcedimiento(self, ctx):
        l = list(ctx.getChildren())
        name = l[0].getText()
        # Obtener lista de paramsExp
        params = self.visit(l[1]) 
        if name in self.procs:
            self.__proc__(name, params)
        else:
            raise SopranoException('Procedure \"'+ name + '\" non defined.')

    def visitProcedimiento(self, ctx):
        l = list(ctx.getChildren())
        name = l[0].getText()
        # Obtener lista con paramsId
        params = self.visit(l[1]) 
        if name in self.procs:
            raise SopranoException('Procedure \"'+ name + '\" already defined.')
        else:
            self.procs[name] = Procedimiento(name, params, ctx.inss())

    def visitString(self, ctx):
        # Regresar texto sin comillas "fun" -> fun
        l = list(ctx.getChildren())
        s = l[0].getText()
        return s[1:-1]
    
    def visitMult(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[0]) * self.visit(l[2])
    
    def visitDivide(self, ctx):
        l = list(ctx.getChildren())
        divisor = self.visit(l[2])
        if divisor == 0:
            raise SopranoException('Division by zero.')
        else:
            return self.visit(l[0]) / divisor
        
    def visitModulo(self, ctx):
        l = list(ctx.getChildren())
        return self.visit(l[0]) % self.visit(l[2])
        
    def visitVariable(self, ctx):
        # access stack and get the value. self.stack[i]={}
        return self.stack[-1][ctx.VAR().getText()]
    
    def visitNumber(self, ctx):
        return int(ctx.NUM().getText())
    
    def visitLista(self, ctx):
        l = list(ctx.getChildren())
        values = [self.visit(child) for child in l[1:-1]]
        return values

    def visitListaSize(self, ctx):
        # si variable existe y es una lista, devolver el número de elementos
        if self.stack[-1][ctx.VAR().getText()]:
            if isinstance(self.stack[-1][ctx.VAR().getText()], list):
                size = len(self.stack[-1][ctx.VAR().getText()])
                return size
            else:
                raise SopranoException("Variable " + ctx.VAR().getText()+ " is not a list.")
        else:
            raise SopranoException("Variable " + ctx.VAR().getText()+ " is not defined in the scope.")


    def visitConsult(self, ctx):
        # En Soprano las listas comienzan por el índice 1, regresar L[i-1]
        l = list(ctx.getChildren())
        index = self.visit(ctx.expr())
        size = len(self.stack[-1][ctx.VAR().getText()])
        if index < 1 or index > size:
            raise SopranoException('index ' + str(index) + ' does not belong to variable '+ ctx.VAR().getText()+".")
        else:
            return ((self.stack[-1][ctx.VAR().getText()]) [index-1])
        
    def visitNota(self,ctx):        
        note = ctx.NOTA().getText()
        if len(note) == 1:
            return f'{note}4'
        else: # len(note) == 1
            return note
        
    def visitParents(self,ctx):
        l = list(ctx.getChildren())
        return self.visit(l[1])
    
    def visitSuma(self,ctx):
        l = list(ctx.getChildren())
        # Sum pure_note + integer
        if (ctx.getChild(0).getText() in self.notas.keys()):
            note = ctx.expr(0).getText()
            val1 = self.notas[note]
            result = val1 + self.visit(l[2])
            for key,value in self.notas.items():
                if result == value:
                    return key
                
        # Sum integer + pure_note
        elif (ctx.getChild(2).getText() in self.notas.keys()):
            note = ctx.expr(1).getText()
            val1 = self.notas[note]
            result = val1 + self.visit(l[0])
            for key,value in self.notas.items():
                if result == value:
                    return key
       
        # Sum variable_note + integer
        elif(self.stack[-1][ctx.expr(0).getText()] in self.notas.keys()):
            note = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note]
            result = val1 + self.visit(l[2])
            for key,value in self.notas.items():
                if result == value:
                    return key
       
       # Sum integer + variable_note
        elif(self.stack[-1][ctx.expr(1).getText()] in self.notas.keys()):
            note = self.stack[-1][ctx.expr(1).getText()]
            val1 = self.notas[note]
            result = val1 + self.visit(l[0]) 
            for key,value in self.notas.items():
                if result == value:
                    return key
       # Sum integer + integer
        else:
            return self.visit(l[0]) + self.visit(l[2])
    
    def visitResta(self,ctx):
        l = list(ctx.getChildren())
        # Restar pure_note - integer
        if (ctx.getChild(0).getText() in self.notas.keys()):
            note = ctx.expr(0).getText()
            val1 = self.notas[note]
            result = val1 - self.visit(l[2])
            for key,value in self.notas.items():
                if result == value:
                    return key
                
        # Restar integer - note
        elif (ctx.getChild(2).getText() in self.notas.keys()):
            note = ctx.expr(1).getText()
            val1 = self.notas[note]
            result = val1 - self.visit(l[0])
            for key,value in self.notas.items():
                if result == value:
                    return key
       
        # Restar nota_en_variable - entero
        elif(self.stack[-1][ctx.expr(0).getText()] in self.notas.keys()):
            note = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note]
            result = val1 - self.visit(l[2])
            for key,value in self.notas.items():
                if result == value:
                    return key
       
       # Restar entero - nota_en_variable
        elif(self.stack[-1][ctx.expr(1).getText()] in self.notas.keys()):
            note = self.stack[-1][ctx.expr(1).getText()]
            val1 = self.notas[note]
            result = val1 - self.visit(l[0]) 
            for key,value in self.notas.items():
                if result == value:
                    return key
       # Sum integer + integer
        else:
            return self.visit(l[0]) - self.visit(l[2])
        
    def visitLessThan(self, ctx):
        l = list(ctx.getChildren())

        a = (self.stack[-1][ctx.expr(0).getText()] in self.notas.keys())
        b = (self.stack[-1][ctx.expr(1).getText()] in self.notas.keys())

        if a and b:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 < val2)
        elif a:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = ctx.expr(1).getText()
            val2 = self.notas[note2]
            return int(val1 < val2)
        # nota < nota_en_variable
        elif b:
            note1 = ctx.expr(0).getText()
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 < val2)
        # integer < integer
        else: 
            return int(self.visit(l[0]) < self.visit(l[2])) 

    def visitGreaterThan(self, ctx):
        l = list(ctx.getChildren())

        a = (self.stack[-1][ctx.expr(0).getText()] in self.notas.keys())
        b = (self.stack[-1][ctx.expr(1).getText()] in self.notas.keys())

        # variable_note > variable_note
        if a and b:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 > val2)
        # pure_note > variable_note
        if a:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = ctx.expr(1).getText()
            val2 = self.notas[note2]
            return int(val1 > val2)
        # nota > variable
        if b:
            note1 = ctx.expr(0).getText()
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 > val2)
        # integer > integer
        else: 
            return int(self.visit(l[0]) > self.visit(l[2]))

    def visitEqual(self, ctx):
        l = list(ctx.getChildren())

        a = (self.stack[-1][ctx.expr(0).getText()] in self.notas.keys())
        b = (self.stack[-1][ctx.expr(1).getText()] in self.notas.keys())

        # variable_note > variable_note
        if a and b:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 == val2)
        # pure_note > variable_note
        elif a:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = ctx.expr(1).getText()
            val2 = self.notas[note2]
            return int(val1 == val2)
        # nota < variable
        elif b:
            note1 = ctx.expr(0).getText()
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 == val2)
        # integer < integer
        else: 
            return int(self.visit(l[0]) == self.visit(l[2])) 

    def visitNotEqual(self, ctx):
        l = list(ctx.getChildren())

        a = (self.stack[-1][ctx.expr(0).getText()] in self.notas.keys())
        b = (self.stack[-1][ctx.expr(1).getText()] in self.notas.keys())

        # variable_note > variable_note
        if a and b:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 != val2)
        # pure_note > variable_note
        elif a:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = ctx.expr(1).getText()
            val2 = self.notas[note2]
            return int(val1 != val2)
        # nota < variable
        elif b:
            note1 = ctx.expr(0).getText()
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 != val2)
        # integer < integer
        else: 
            return int(self.visit(l[0]) != self.visit(l[2])) 

    def visitLessOrEqualThan(self, ctx):
        l = list(ctx.getChildren())

        a = (self.stack[-1][ctx.expr(0).getText()] in self.notas.keys())
        b = (self.stack[-1][ctx.expr(1).getText()] in self.notas.keys())
        # variable_note <= variable_note
        if a and b:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 <= val2)
        # variable_note <= pure_note
        elif a:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = ctx.expr(1).getText()
            val2 = self.notas[note2]
            return int(val1 <= val2)
        # nota <= variable
        elif b:
            note1 = ctx.expr(0).getText()
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 <= val2)
        # integer <= integer
        else: 
            return int(self.visit(l[0]) <= self.visit(l[2])) 

    def visitGreaterOrEqualThan(self, ctx):
        l = list(ctx.getChildren())

        a = (self.stack[-1][ctx.expr(0).getText()] in self.notas.keys())
        b = (self.stack[-1][ctx.expr(1).getText()] in self.notas.keys())

        # variable_note > variable_note
        if a and b:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 >= val2)
        # pure_note > variable_note
        elif a:
            note1 = self.stack[-1][ctx.expr(0).getText()]
            val1 = self.notas[note1]
            note2 = ctx.expr(1).getText()
            val2 = self.notas[note2]
            return int(val1 >= val2)
        # nota < variable
        elif b:
            note1 = ctx.expr(0).getText()
            val1 = self.notas[note1]
            note2 = self.stack[-1][ctx.expr(1).getText()]
            val2 = self.notas[note2]
            return int(val1 >= val2)
        # integer < integer
        else: 
            return int(self.visit(l[0]) >= self.visit(l[2])) 

    def visitPush(self, ctx):
        l = list(ctx.getChildren())
        e = self.visit(ctx.expr())
        self.stack[-1][ctx.VAR().getText()].append(e)

    def visitCut(self, ctx):
        l = list(ctx.getChildren())
        expresion = self.visit(ctx.expr())
        size = len(self.stack[-1][ctx.VAR().getText()])
        if expresion < 1 or expresion > size:
            raise SopranoException('index' + str(expresion) + 'does not belong to the list '+ ctx.VAR().getText()+".")
        else:
            del((self.stack[-1][ctx.VAR().getText()])[expresion-1])