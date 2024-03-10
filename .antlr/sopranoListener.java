// Generated from /home/nobelium/ANTLR/proyecto_soprano/soprano.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sopranoParser}.
 */
public interface sopranoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sopranoParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(sopranoParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(sopranoParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#inss}.
	 * @param ctx the parse tree
	 */
	void enterInss(sopranoParser.InssContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#inss}.
	 * @param ctx the parse tree
	 */
	void exitInss(sopranoParser.InssContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#ins}.
	 * @param ctx the parse tree
	 */
	void enterIns(sopranoParser.InsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#ins}.
	 * @param ctx the parse tree
	 */
	void exitIns(sopranoParser.InsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#input_}.
	 * @param ctx the parse tree
	 */
	void enterInput_(sopranoParser.Input_Context ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#input_}.
	 * @param ctx the parse tree
	 */
	void exitInput_(sopranoParser.Input_Context ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#output_}.
	 * @param ctx the parse tree
	 */
	void enterOutput_(sopranoParser.Output_Context ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#output_}.
	 * @param ctx the parse tree
	 */
	void exitOutput_(sopranoParser.Output_Context ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(sopranoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(sopranoParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(sopranoParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(sopranoParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#procDef}.
	 * @param ctx the parse tree
	 */
	void enterProcDef(sopranoParser.ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#procDef}.
	 * @param ctx the parse tree
	 */
	void exitProcDef(sopranoParser.ProcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(sopranoParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(sopranoParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#paramsId}.
	 * @param ctx the parse tree
	 */
	void enterParamsId(sopranoParser.ParamsIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#paramsId}.
	 * @param ctx the parse tree
	 */
	void exitParamsId(sopranoParser.ParamsIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamsExpr(sopranoParser.ParamsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamsExpr(sopranoParser.ParamsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(sopranoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(sopranoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#reprod}.
	 * @param ctx the parse tree
	 */
	void enterReprod(sopranoParser.ReprodContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#reprod}.
	 * @param ctx the parse tree
	 */
	void exitReprod(sopranoParser.ReprodContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(sopranoParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(sopranoParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#siz}.
	 * @param ctx the parse tree
	 */
	void enterSiz(sopranoParser.SizContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#siz}.
	 * @param ctx the parse tree
	 */
	void exitSiz(sopranoParser.SizContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#consult}.
	 * @param ctx the parse tree
	 */
	void enterConsult(sopranoParser.ConsultContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#consult}.
	 * @param ctx the parse tree
	 */
	void exitConsult(sopranoParser.ConsultContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#corte}.
	 * @param ctx the parse tree
	 */
	void enterCorte(sopranoParser.CorteContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#corte}.
	 * @param ctx the parse tree
	 */
	void exitCorte(sopranoParser.CorteContext ctx);
	/**
	 * Enter a parse tree produced by {@link sopranoParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(sopranoParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link sopranoParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(sopranoParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(sopranoParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(sopranoParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(sopranoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(sopranoParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Size}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSize(sopranoParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Size}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSize(sopranoParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(sopranoParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(sopranoParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParents(sopranoParser.ParentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parents}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParents(sopranoParser.ParentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(sopranoParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(sopranoParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(sopranoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(sopranoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nota}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNota(sopranoParser.NotaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nota}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNota(sopranoParser.NotaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq(sopranoParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq(sopranoParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGt(sopranoParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGt(sopranoParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivide(sopranoParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivide(sopranoParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuma(sopranoParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuma(sopranoParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(sopranoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(sopranoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Consulta}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConsulta(sopranoParser.ConsultaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Consulta}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConsulta(sopranoParser.ConsultaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Get}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGet(sopranoParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGet(sopranoParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code List}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterList(sopranoParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code List}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitList(sopranoParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLet(sopranoParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLet(sopranoParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Neq}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeq(sopranoParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Neq}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeq(sopranoParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterResta(sopranoParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Resta}
	 * labeled alternative in {@link sopranoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitResta(sopranoParser.RestaContext ctx);
}