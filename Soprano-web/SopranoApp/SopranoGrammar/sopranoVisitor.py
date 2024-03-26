# Generated from soprano.g by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .sopranoParser import sopranoParser
else:
    from sopranoParser import sopranoParser

# This class defines a complete generic visitor for a parse tree produced by sopranoParser.

class sopranoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by sopranoParser#root.
    def visitRoot(self, ctx:sopranoParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#inss.
    def visitInss(self, ctx:sopranoParser.InssContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#ins.
    def visitIns(self, ctx:sopranoParser.InsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#lectura.
    def visitLectura(self, ctx:sopranoParser.LecturaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#escritura.
    def visitEscritura(self, ctx:sopranoParser.EscrituraContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#condicion.
    def visitCondicion(self, ctx:sopranoParser.CondicionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#iteracion.
    def visitIteracion(self, ctx:sopranoParser.IteracionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#listaSize.
    def visitListaSize(self, ctx:sopranoParser.ListaSizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#procedimiento.
    def visitProcedimiento(self, ctx:sopranoParser.ProcedimientoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#llamadaProcedimiento.
    def visitLlamadaProcedimiento(self, ctx:sopranoParser.LlamadaProcedimientoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#asignacion.
    def visitAsignacion(self, ctx:sopranoParser.AsignacionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#paramsId.
    def visitParamsId(self, ctx:sopranoParser.ParamsIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#paramsExpr.
    def visitParamsExpr(self, ctx:sopranoParser.ParamsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#reproduccion.
    def visitReproduccion(self, ctx:sopranoParser.ReproduccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#cut.
    def visitCut(self, ctx:sopranoParser.CutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#consult.
    def visitConsult(self, ctx:sopranoParser.ConsultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#push.
    def visitPush(self, ctx:sopranoParser.PushContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#lista.
    def visitLista(self, ctx:sopranoParser.ListaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Variable.
    def visitVariable(self, ctx:sopranoParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#NotEqual.
    def visitNotEqual(self, ctx:sopranoParser.NotEqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Modulo.
    def visitModulo(self, ctx:sopranoParser.ModuloContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Parents.
    def visitParents(self, ctx:sopranoParser.ParentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#String.
    def visitString(self, ctx:sopranoParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Nota.
    def visitNota(self, ctx:sopranoParser.NotaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#SizeList.
    def visitSizeList(self, ctx:sopranoParser.SizeListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Divide.
    def visitDivide(self, ctx:sopranoParser.DivideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Suma.
    def visitSuma(self, ctx:sopranoParser.SumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#LessThan.
    def visitLessThan(self, ctx:sopranoParser.LessThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Number.
    def visitNumber(self, ctx:sopranoParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Mult.
    def visitMult(self, ctx:sopranoParser.MultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#GreaterThan.
    def visitGreaterThan(self, ctx:sopranoParser.GreaterThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Equal.
    def visitEqual(self, ctx:sopranoParser.EqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#GreaterOrEqualThan.
    def visitGreaterOrEqualThan(self, ctx:sopranoParser.GreaterOrEqualThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Consulta.
    def visitConsulta(self, ctx:sopranoParser.ConsultaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#List.
    def visitList(self, ctx:sopranoParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#LessOrEqualThan.
    def visitLessOrEqualThan(self, ctx:sopranoParser.LessOrEqualThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Resta.
    def visitResta(self, ctx:sopranoParser.RestaContext):
        return self.visitChildren(ctx)



del sopranoParser