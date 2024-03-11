// Generated from /home/nobelium/ANTLR/proyecto_soprano/soprano.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sopranoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LB=6, RB=7, LS=8, RS=9, LC=10, 
		RC=11, LP=12, RP=13, ASSIGN=14, SIZE=15, CORTA=16, AGREGA=17, REPROD=18, 
		MUL=19, DIV=20, MOD=21, SUM=22, RESTA=23, EQ=24, NEQ=25, GT=26, LT=27, 
		GET=28, LET=29, PROCNAME=30, NOTA=31, VAR=32, NUM=33, STRING=34, COMMENT=35, 
		WS=36;
	public static final int
		RULE_root = 0, RULE_inss = 1, RULE_ins = 2, RULE_lectura = 3, RULE_escritura = 4, 
		RULE_condicion = 5, RULE_iteracion = 6, RULE_procedimiento = 7, RULE_llamadaProcedimiento = 8, 
		RULE_paramsId = 9, RULE_paramsExpr = 10, RULE_asignacion = 11, RULE_reproduccion = 12, 
		RULE_lista = 13, RULE_listaSize = 14, RULE_consult = 15, RULE_cut = 16, 
		RULE_push = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inss", "ins", "lectura", "escritura", "condicion", "iteracion", 
			"procedimiento", "llamadaProcedimiento", "paramsId", "paramsExpr", "asignacion", 
			"reproduccion", "lista", "listaSize", "consult", "cut", "push", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<?>'", "'<w>'", "'if'", "'else'", "'while'", "'|:'", "':|'", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", "'<-'", "'#'", "'8<'", "'<<'", 
			"'(:)'", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "'/='", "'>'", "'<'", 
			"'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LB", "RB", "LS", "RS", "LC", "RC", 
			"LP", "RP", "ASSIGN", "SIZE", "CORTA", "AGREGA", "REPROD", "MUL", "DIV", 
			"MOD", "SUM", "RESTA", "EQ", "NEQ", "GT", "LT", "GET", "LET", "PROCNAME", 
			"NOTA", "VAR", "NUM", "STRING", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "soprano.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sopranoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sopranoParser.EOF, 0); }
		public List<ProcedimientoContext> procedimiento() {
			return getRuleContexts(ProcedimientoContext.class);
		}
		public ProcedimientoContext procedimiento(int i) {
			return getRuleContext(ProcedimientoContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCNAME) {
				{
				{
				setState(38);
				procedimiento();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InssContext extends ParserRuleContext {
		public List<InsContext> ins() {
			return getRuleContexts(InsContext.class);
		}
		public InsContext ins(int i) {
			return getRuleContext(InsContext.class,i);
		}
		public InssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inss; }
	}

	public final InssContext inss() throws RecognitionException {
		InssContext _localctx = new InssContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5369036846L) != 0)) {
				{
				{
				setState(46);
				ins();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsContext extends ParserRuleContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public IteracionContext iteracion() {
			return getRuleContext(IteracionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public LlamadaProcedimientoContext llamadaProcedimiento() {
			return getRuleContext(LlamadaProcedimientoContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ReproduccionContext reproduccion() {
			return getRuleContext(ReproduccionContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public CutContext cut() {
			return getRuleContext(CutContext.class,0);
		}
		public InsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ins; }
	}

	public final InsContext ins() throws RecognitionException {
		InsContext _localctx = new InsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ins);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(52);
					condicion();
					}
					break;
				case T__4:
					{
					setState(53);
					iteracion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(56);
					lectura();
					}
					break;
				case T__1:
					{
					setState(57);
					escritura();
					}
					break;
				case PROCNAME:
					{
					setState(58);
					llamadaProcedimiento();
					}
					break;
				case VAR:
					{
					setState(59);
					asignacion();
					}
					break;
				case REPROD:
					{
					setState(60);
					reproduccion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(63);
					push();
					}
					break;
				case CORTA:
					{
					setState(64);
					cut();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_escritura);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__1);
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LB() { return getTokens(sopranoParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(sopranoParser.LB, i);
		}
		public List<InssContext> inss() {
			return getRuleContexts(InssContext.class);
		}
		public InssContext inss(int i) {
			return getRuleContext(InssContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(sopranoParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(sopranoParser.RB, i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__2);
			setState(79);
			expr(0);
			setState(80);
			match(LB);
			setState(81);
			inss();
			setState(82);
			match(RB);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(83);
				match(T__3);
				setState(84);
				match(LB);
				setState(85);
				inss();
				setState(86);
				match(RB);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IteracionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LB() { return getToken(sopranoParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(sopranoParser.RB, 0); }
		public IteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracion; }
	}

	public final IteracionContext iteracion() throws RecognitionException {
		IteracionContext _localctx = new IteracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iteracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__4);
			setState(91);
			expr(0);
			setState(92);
			match(LB);
			setState(93);
			inss();
			setState(94);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimientoContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(sopranoParser.PROCNAME, 0); }
		public ParamsIdContext paramsId() {
			return getRuleContext(ParamsIdContext.class,0);
		}
		public TerminalNode LB() { return getToken(sopranoParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(sopranoParser.RB, 0); }
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PROCNAME);
			setState(97);
			paramsId();
			setState(98);
			match(LB);
			setState(99);
			inss();
			setState(100);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaProcedimientoContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(sopranoParser.PROCNAME, 0); }
		public ParamsExprContext paramsExpr() {
			return getRuleContext(ParamsExprContext.class,0);
		}
		public LlamadaProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaProcedimiento; }
	}

	public final LlamadaProcedimientoContext llamadaProcedimiento() throws RecognitionException {
		LlamadaProcedimientoContext _localctx = new LlamadaProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_llamadaProcedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PROCNAME);
			setState(103);
			paramsExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsIdContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(sopranoParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(sopranoParser.VAR, i);
		}
		public ParamsIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsId; }
	}

	public final ParamsIdContext paramsId() throws RecognitionException {
		ParamsIdContext _localctx = new ParamsIdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramsId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(105);
				match(VAR);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsExpr; }
	}

	public final ParamsExprContext paramsExpr() throws RecognitionException {
		ParamsExprContext _localctx = new ParamsExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paramsExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					expr(0);
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(sopranoParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(VAR);
			setState(118);
			match(ASSIGN);
			setState(119);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReproduccionContext extends ParserRuleContext {
		public TerminalNode REPROD() { return getToken(sopranoParser.REPROD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReproduccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reproduccion; }
	}

	public final ReproduccionContext reproduccion() throws RecognitionException {
		ReproduccionContext _localctx = new ReproduccionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_reproduccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(REPROD);
			setState(122);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(sopranoParser.LC, 0); }
		public TerminalNode RC() { return getToken(sopranoParser.RC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(LC);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212292608L) != 0)) {
				{
				{
				setState(125);
				expr(0);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaSizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(sopranoParser.SIZE, 0); }
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public ListaSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSize; }
	}

	public final ListaSizeContext listaSize() throws RecognitionException {
		ListaSizeContext _localctx = new ListaSizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SIZE);
			setState(134);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConsultContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public TerminalNode LS() { return getToken(sopranoParser.LS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RS() { return getToken(sopranoParser.RS, 0); }
		public ConsultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consult; }
	}

	public final ConsultContext consult() throws RecognitionException {
		ConsultContext _localctx = new ConsultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_consult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(VAR);
			setState(137);
			match(LS);
			setState(138);
			expr(0);
			setState(139);
			match(RS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CutContext extends ParserRuleContext {
		public TerminalNode CORTA() { return getToken(sopranoParser.CORTA, 0); }
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public TerminalNode LS() { return getToken(sopranoParser.LS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RS() { return getToken(sopranoParser.RS, 0); }
		public CutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cut; }
	}

	public final CutContext cut() throws RecognitionException {
		CutContext _localctx = new CutContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(CORTA);
			setState(142);
			match(VAR);
			setState(143);
			match(LS);
			setState(144);
			expr(0);
			setState(145);
			match(RS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public TerminalNode AGREGA() { return getToken(sopranoParser.AGREGA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VAR);
			setState(148);
			match(AGREGA);
			setState(149);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(sopranoParser.MOD, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public TerminalNode VAR() { return getToken(sopranoParser.VAR, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SizeContext extends ExprContext {
		public ListaSizeContext listaSize() {
			return getRuleContext(ListaSizeContext.class,0);
		}
		public SizeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(sopranoParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentsContext extends ExprContext {
		public TerminalNode LP() { return getToken(sopranoParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(sopranoParser.RP, 0); }
		public ParentsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(sopranoParser.LT, 0); }
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(sopranoParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotaContext extends ExprContext {
		public TerminalNode NOTA() { return getToken(sopranoParser.NOTA, 0); }
		public NotaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(sopranoParser.EQ, 0); }
		public EqContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(sopranoParser.GT, 0); }
		public GtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(sopranoParser.DIV, 0); }
		public DivideContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(sopranoParser.SUM, 0); }
		public SumaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(sopranoParser.MUL, 0); }
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsultaContext extends ExprContext {
		public ConsultContext consult() {
			return getRuleContext(ConsultContext.class,0);
		}
		public ConsultaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GET() { return getToken(sopranoParser.GET, 0); }
		public GetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ExprContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ListContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LET() { return getToken(sopranoParser.LET, 0); }
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(sopranoParser.NEQ, 0); }
		public NeqContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(sopranoParser.RESTA, 0); }
		public RestaContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				match(VAR);
				}
				break;
			case 2:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(NUM);
				}
				break;
			case 4:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				lista();
				}
				break;
			case 5:
				{
				_localctx = new SizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				listaSize();
				}
				break;
			case 6:
				{
				_localctx = new ConsultaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				consult();
				}
				break;
			case 7:
				{
				_localctx = new NotaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(NOTA);
				}
				break;
			case 8:
				{
				_localctx = new ParentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(LP);
				setState(160);
				expr(0);
				setState(161);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(166);
						match(MUL);
						setState(167);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(169);
						match(DIV);
						setState(170);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(172);
						match(MOD);
						setState(173);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new SumaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(175);
						match(SUM);
						setState(176);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new RestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(178);
						match(RESTA);
						setState(179);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(181);
						match(GT);
						setState(182);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new GetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(184);
						match(GET);
						setState(185);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(187);
						match(LT);
						setState(188);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new LetContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(190);
						match(LET);
						setState(191);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new EqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193);
						match(EQ);
						setState(194);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new NeqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(196);
						match(NEQ);
						setState(197);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002B\b\u0002\u0003\u0002D\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004K\b\u0004\u000b"+
		"\u0004\f\u0004L\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005Y\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0005\tk\b\t\n\t\f"+
		"\tn\t\t\u0001\n\u0005\nq\b\n\n\n\f\nt\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u007f"+
		"\b\r\n\r\f\r\u0082\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00a4\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00c7\b\u0012\n\u0012\f\u0012\u00ca"+
		"\t\u0012\u0001\u0012\u0000\u0001$\u0013\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0000"+
		"\u00d9\u0000)\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004"+
		"C\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bH\u0001\u0000"+
		"\u0000\u0000\nN\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e"+
		"`\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012l\u0001"+
		"\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000"+
		"\u0000\u0018y\u0001\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c"+
		"\u0085\u0001\u0000\u0000\u0000\u001e\u0088\u0001\u0000\u0000\u0000 \u008d"+
		"\u0001\u0000\u0000\u0000\"\u0093\u0001\u0000\u0000\u0000$\u00a3\u0001"+
		"\u0000\u0000\u0000&(\u0003\u000e\u0007\u0000\'&\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000"+
		"\u0000\u0001-\u0001\u0001\u0000\u0000\u0000.0\u0003\u0004\u0002\u0000"+
		"/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000047\u0003\n\u0005\u000057\u0003\f\u0006\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007D\u0001\u0000\u0000\u0000"+
		"8>\u0003\u0006\u0003\u00009>\u0003\b\u0004\u0000:>\u0003\u0010\b\u0000"+
		";>\u0003\u0016\u000b\u0000<>\u0003\u0018\f\u0000=8\u0001\u0000\u0000\u0000"+
		"=9\u0001\u0000\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>D\u0001\u0000\u0000\u0000?B\u0003\"\u0011"+
		"\u0000@B\u0003 \u0010\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000BD\u0001\u0000\u0000\u0000C6\u0001\u0000\u0000\u0000C=\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000D\u0005\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0001\u0000\u0000FG\u0005 \u0000\u0000G\u0007\u0001\u0000\u0000"+
		"\u0000HJ\u0005\u0002\u0000\u0000IK\u0003$\u0012\u0000JI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\u0003\u0000\u0000OP\u0003"+
		"$\u0012\u0000PQ\u0005\u0006\u0000\u0000QR\u0003\u0002\u0001\u0000RX\u0005"+
		"\u0007\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005\u0006\u0000\u0000"+
		"UV\u0003\u0002\u0001\u0000VW\u0005\u0007\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XS\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u000b\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0005\u0000\u0000[\\\u0003$\u0012\u0000\\]"+
		"\u0005\u0006\u0000\u0000]^\u0003\u0002\u0001\u0000^_\u0005\u0007\u0000"+
		"\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\u001e\u0000\u0000ab\u0003\u0012"+
		"\t\u0000bc\u0005\u0006\u0000\u0000cd\u0003\u0002\u0001\u0000de\u0005\u0007"+
		"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0005\u001e\u0000\u0000"+
		"gh\u0003\u0014\n\u0000h\u0011\u0001\u0000\u0000\u0000ik\u0005 \u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0013\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000oq\u0003$\u0012\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s\u0015\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005 \u0000"+
		"\u0000vw\u0005\u000e\u0000\u0000wx\u0003$\u0012\u0000x\u0017\u0001\u0000"+
		"\u0000\u0000yz\u0005\u0012\u0000\u0000z{\u0003$\u0012\u0000{\u0019\u0001"+
		"\u0000\u0000\u0000|\u0080\u0005\n\u0000\u0000}\u007f\u0003$\u0012\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u000b\u0000\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u000f\u0000\u0000\u0086\u0087\u0005 \u0000\u0000\u0087\u001d\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0005\b"+
		"\u0000\u0000\u008a\u008b\u0003$\u0012\u0000\u008b\u008c\u0005\t\u0000"+
		"\u0000\u008c\u001f\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0010\u0000"+
		"\u0000\u008e\u008f\u0005 \u0000\u0000\u008f\u0090\u0005\b\u0000\u0000"+
		"\u0090\u0091\u0003$\u0012\u0000\u0091\u0092\u0005\t\u0000\u0000\u0092"+
		"!\u0001\u0000\u0000\u0000\u0093\u0094\u0005 \u0000\u0000\u0094\u0095\u0005"+
		"\u0011\u0000\u0000\u0095\u0096\u0003$\u0012\u0000\u0096#\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0006\u0012\uffff\uffff\u0000\u0098\u00a4\u0005 \u0000"+
		"\u0000\u0099\u00a4\u0005\"\u0000\u0000\u009a\u00a4\u0005!\u0000\u0000"+
		"\u009b\u00a4\u0003\u001a\r\u0000\u009c\u00a4\u0003\u001c\u000e\u0000\u009d"+
		"\u00a4\u0003\u001e\u000f\u0000\u009e\u00a4\u0005\u001f\u0000\u0000\u009f"+
		"\u00a0\u0005\f\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u00a2"+
		"\u0005\r\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u0097\u0001"+
		"\u0000\u0000\u0000\u00a3\u0099\u0001\u0000\u0000\u0000\u00a3\u009a\u0001"+
		"\u0000\u0000\u0000\u00a3\u009b\u0001\u0000\u0000\u0000\u00a3\u009c\u0001"+
		"\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009e\u0001"+
		"\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4\u00c8\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\n\u0013\u0000\u0000\u00a6\u00a7\u0005\u0013"+
		"\u0000\u0000\u00a7\u00c7\u0003$\u0012\u0014\u00a8\u00a9\n\u0012\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000\u00aa\u00c7\u0003$\u0012\u0013"+
		"\u00ab\u00ac\n\u0011\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000\u00ad"+
		"\u00c7\u0003$\u0012\u0012\u00ae\u00af\n\u0010\u0000\u0000\u00af\u00b0"+
		"\u0005\u0016\u0000\u0000\u00b0\u00c7\u0003$\u0012\u0011\u00b1\u00b2\n"+
		"\u000f\u0000\u0000\u00b2\u00b3\u0005\u0017\u0000\u0000\u00b3\u00c7\u0003"+
		"$\u0012\u0010\u00b4\u00b5\n\u000e\u0000\u0000\u00b5\u00b6\u0005\u001a"+
		"\u0000\u0000\u00b6\u00c7\u0003$\u0012\u000f\u00b7\u00b8\n\r\u0000\u0000"+
		"\u00b8\u00b9\u0005\u001c\u0000\u0000\u00b9\u00c7\u0003$\u0012\u000e\u00ba"+
		"\u00bb\n\f\u0000\u0000\u00bb\u00bc\u0005\u001b\u0000\u0000\u00bc\u00c7"+
		"\u0003$\u0012\r\u00bd\u00be\n\u000b\u0000\u0000\u00be\u00bf\u0005\u001d"+
		"\u0000\u0000\u00bf\u00c7\u0003$\u0012\f\u00c0\u00c1\n\n\u0000\u0000\u00c1"+
		"\u00c2\u0005\u0018\u0000\u0000\u00c2\u00c7\u0003$\u0012\u000b\u00c3\u00c4"+
		"\n\t\u0000\u0000\u00c4\u00c5\u0005\u0019\u0000\u0000\u00c5\u00c7\u0003"+
		"$\u0012\n\u00c6\u00a5\u0001\u0000\u0000\u0000\u00c6\u00a8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00ab\u0001\u0000\u0000\u0000\u00c6\u00ae\u0001\u0000"+
		"\u0000\u0000\u00c6\u00b1\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00b7\u0001\u0000\u0000\u0000\u00c6\u00ba\u0001\u0000"+
		"\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9%\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u000e)16=ACLXlr\u0080\u00a3\u00c6\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}