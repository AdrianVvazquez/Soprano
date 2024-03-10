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


    # Visit a parse tree produced by sopranoParser#procedimiento.
    def visitProcedimiento(self, ctx:sopranoParser.ProcedimientoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#llamada_procedimiento.
    def visitLlamada_procedimiento(self, ctx:sopranoParser.Llamada_procedimientoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#paramsId.
    def visitParamsId(self, ctx:sopranoParser.ParamsIdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#paramsExpr.
    def visitParamsExpr(self, ctx:sopranoParser.ParamsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#asignacion.
    def visitAsignacion(self, ctx:sopranoParser.AsignacionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#reproduccion.
    def visitReproduccion(self, ctx:sopranoParser.ReproduccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#lista.
    def visitLista(self, ctx:sopranoParser.ListaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#lista_size.
    def visitLista_size(self, ctx:sopranoParser.Lista_sizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#consult.
    def visitConsult(self, ctx:sopranoParser.ConsultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#cut.
    def visitCut(self, ctx:sopranoParser.CutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#push.
    def visitPush(self, ctx:sopranoParser.PushContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Mod.
    def visitMod(self, ctx:sopranoParser.ModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Var.
    def visitVar(self, ctx:sopranoParser.VarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Size.
    def visitSize(self, ctx:sopranoParser.SizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Num.
    def visitNum(self, ctx:sopranoParser.NumContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Parents.
    def visitParents(self, ctx:sopranoParser.ParentsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Lt.
    def visitLt(self, ctx:sopranoParser.LtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#String.
    def visitString(self, ctx:sopranoParser.StringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Nota.
    def visitNota(self, ctx:sopranoParser.NotaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Eq.
    def visitEq(self, ctx:sopranoParser.EqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Gt.
    def visitGt(self, ctx:sopranoParser.GtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Divide.
    def visitDivide(self, ctx:sopranoParser.DivideContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Suma.
    def visitSuma(self, ctx:sopranoParser.SumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Mult.
    def visitMult(self, ctx:sopranoParser.MultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Consulta.
    def visitConsulta(self, ctx:sopranoParser.ConsultaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Get.
    def visitGet(self, ctx:sopranoParser.GetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#List.
    def visitList(self, ctx:sopranoParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Let.
    def visitLet(self, ctx:sopranoParser.LetContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Neq.
    def visitNeq(self, ctx:sopranoParser.NeqContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by sopranoParser#Resta.
    def visitResta(self, ctx:sopranoParser.RestaContext):
        return self.visitChildren(ctx)



del sopranoParser