// Generated from java-escape by ANTLR 4.11.1
package compilador.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, VOID=6, PRINCIPAL=7, NUM=8, POTENCIA=9, 
		MAS=10, POR=11, MENOS=12, ENTRE=13, EQUALS=14, FOR=15, OR=16, AND=17, 
		BOOL=18, IF=19, ELSE=20, TYPE=21, MAYOR=22, MAYORIGUAL=23, MENOR=24, MENORIGUAL=25, 
		DIFERENTEDE=26, IGUALQUE=27, PRINT=28, ID=29, STRING=30, ARG=31, ENDL=32, 
		IGNORE=33;
	public static final int
		RULE_compilador = 0, RULE_cuerpo = 1, RULE_fin = 2, RULE_args = 3, RULE_contenido = 4, 
		RULE_if = 5, RULE_condicion = 6, RULE_else = 7, RULE_for = 8, RULE_declaration = 9, 
		RULE_assign = 10, RULE_impresion = 11, RULE_expr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilador", "cuerpo", "fin", "args", "contenido", "if", "condicion", 
			"else", "for", "declaration", "assign", "impresion", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "', '", "'void'", "'principal'", null, 
			"'^'", "'+'", "'*'", "'-'", "'/'", "'='", "'for'", "'or'", "'and'", null, 
			"'if'", "'else'", null, "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'console.print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "VOID", "PRINCIPAL", "NUM", "POTENCIA", 
			"MAS", "POR", "MENOS", "ENTRE", "EQUALS", "FOR", "OR", "AND", "BOOL", 
			"IF", "ELSE", "TYPE", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", "DIFERENTEDE", 
			"IGUALQUE", "PRINT", "ID", "STRING", "ARG", "ENDL", "IGNORE"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompiladorContext extends ParserRuleContext {
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public CompiladorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilador; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitCompilador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompiladorContext compilador() throws RecognitionException {
		CompiladorContext _localctx = new CompiladorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			cuerpo();
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
	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CompiladorParser.VOID, 0); }
		public TerminalNode PRINCIPAL() { return getToken(CompiladorParser.PRINCIPAL, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(CompiladorParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(CompiladorParser.ENDL, i);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(28);
				match(ENDL);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(VOID);
			setState(35);
			match(PRINCIPAL);
			setState(36);
			match(T__0);
			setState(37);
			args();
			setState(38);
			match(T__1);
			setState(39);
			match(T__2);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(40);
				match(ENDL);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 807960576L) != 0) {
				{
				{
				setState(46);
				contenido();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			fin();
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
	public static class FinContext extends ParserRuleContext {
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitFin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
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
	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> ARG() { return getTokens(CompiladorParser.ARG); }
		public TerminalNode ARG(int i) {
			return getToken(CompiladorParser.ARG, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARG) {
				{
				{
				setState(56);
				match(ARG);
				}
				}
				setState(61);
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
	public static class ContenidoContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(CompiladorParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(CompiladorParser.ENDL, i);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_contenido);
		try {
			int _alt;
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				assign();
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						match(ENDL);
						}
						} 
					}
					setState(68);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				declaration();
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						match(ENDL);
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				impresion();
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						match(ENDL);
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				if_();
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						match(ENDL);
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				for_();
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(ENDL);
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompiladorParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(CompiladorParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(CompiladorParser.ENDL, i);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IF);
			setState(100);
			match(T__0);
			setState(101);
			condicion(0);
			setState(102);
			match(T__1);
			setState(103);
			match(T__2);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(ENDL);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 807960576L) != 0) {
				{
				{
				setState(110);
				contenido();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(116);
				match(ENDL);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__3);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(ENDL);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(129);
				else_();
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
	public static class CondicionContext extends ParserRuleContext {
		public Token op;
		public Token opLog;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(CompiladorParser.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(CompiladorParser.MAYORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(CompiladorParser.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(CompiladorParser.MENORIGUAL, 0); }
		public TerminalNode IGUALQUE() { return getToken(CompiladorParser.IGUALQUE, 0); }
		public TerminalNode DIFERENTEDE() { return getToken(CompiladorParser.DIFERENTEDE, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CompiladorParser.OR, 0); }
		public TerminalNode AND() { return getToken(CompiladorParser.AND, 0); }
		public TerminalNode BOOL() { return getToken(CompiladorParser.BOOL, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(133);
				expr(0);
				setState(134);
				((CondicionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0) ) {
					((CondicionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				expr(0);
				}
				break;
			case 2:
				{
				setState(137);
				match(T__0);
				setState(138);
				condicion(0);
				setState(139);
				match(T__1);
				setState(140);
				((CondicionContext)_localctx).opLog = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
					((CondicionContext)_localctx).opLog = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				match(T__0);
				setState(142);
				condicion(0);
				setState(143);
				match(T__1);
				}
				break;
			case 3:
				{
				setState(145);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(148);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(149);
					((CondicionContext)_localctx).opLog = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
						((CondicionContext)_localctx).opLog = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(150);
					condicion(4);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompiladorParser.ELSE, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(CompiladorParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(CompiladorParser.ENDL, i);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ELSE);
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(157);
				match(T__2);
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						match(ENDL);
						}
						} 
					}
					setState(163);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 807960576L) != 0) {
					{
					{
					setState(164);
					contenido();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ENDL) {
					{
					{
					setState(170);
					match(ENDL);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__3);
				}
				break;
			case IF:
				{
				setState(177);
				if_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CompiladorParser.FOR, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<TerminalNode> ENDL() { return getTokens(CompiladorParser.ENDL); }
		public TerminalNode ENDL(int i) {
			return getToken(CompiladorParser.ENDL, i);
		}
		public List<ContenidoContext> contenido() {
			return getRuleContexts(ContenidoContext.class);
		}
		public ContenidoContext contenido(int i) {
			return getRuleContext(ContenidoContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FOR);
			setState(181);
			match(T__0);
			setState(182);
			declaration();
			setState(183);
			match(T__4);
			setState(184);
			condicion(0);
			setState(185);
			match(T__4);
			setState(186);
			assign();
			setState(187);
			match(T__1);
			setState(188);
			match(T__2);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(ENDL);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 807960576L) != 0) {
				{
				{
				setState(195);
				contenido();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENDL) {
				{
				{
				setState(201);
				match(ENDL);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(T__3);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CompiladorParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(CompiladorParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TYPE);
			setState(210);
			match(ID);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(211);
				match(EQUALS);
				setState(212);
				expr(0);
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
	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends AssignContext {
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(CompiladorParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ID);
			setState(216);
			match(EQUALS);
			setState(217);
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
	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CompiladorParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CompiladorParser.STRING, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_impresion);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(PRINT);
				setState(220);
				match(T__0);
				setState(221);
				expr(0);
				setState(222);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(PRINT);
				setState(225);
				match(T__0);
				setState(226);
				match(STRING);
				setState(227);
				match(T__1);
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
	public static class PareContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitPare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PotenciaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POTENCIA() { return getToken(CompiladorParser.POTENCIA, 0); }
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ExprContext {
		public TerminalNode NUM() { return getToken(CompiladorParser.NUM, 0); }
		public NumeroContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Multiplicacion_o_divisionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(CompiladorParser.POR, 0); }
		public TerminalNode ENTRE() { return getToken(CompiladorParser.ENTRE, 0); }
		public Multiplicacion_o_divisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitMultiplicacion_o_division(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(CompiladorParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Suma_o_restaContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(CompiladorParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(CompiladorParser.MENOS, 0); }
		public Suma_o_restaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompiladorVisitor ) return ((CompiladorVisitor<? extends T>)visitor).visitSuma_o_resta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new PareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(231);
				match(T__0);
				setState(232);
				expr(0);
				setState(233);
				match(T__1);
				}
				break;
			case NUM:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(240);
						match(POTENCIA);
						setState(241);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Multiplicacion_o_divisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(243);
						((Multiplicacion_o_divisionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==ENTRE) ) {
							((Multiplicacion_o_divisionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(244);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new Suma_o_restaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(246);
						((Suma_o_restaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((Suma_o_restaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(247);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 6:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e\b\u0001"+
		"\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003:\b"+
		"\u0003\n\u0003\f\u0003=\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004A\b"+
		"\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004H\b"+
		"\u0004\n\u0004\f\u0004K\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b"+
		"\u0004\n\u0004\f\u0004R\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b"+
		"\u0004\n\u0004\f\u0004Y\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004]\b"+
		"\u0004\n\u0004\f\u0004`\t\u0004\u0003\u0004b\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005j\b"+
		"\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0005\u0005p\b\u0005\n\u0005"+
		"\f\u0005s\t\u0005\u0001\u0005\u0005\u0005v\b\u0005\n\u0005\f\u0005y\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005\u0080"+
		"\t\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0093\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0098\b\u0006\n\u0006\f\u0006\u009b\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00a0\b\u0007\n\u0007\f\u0007\u00a3\t\u0007\u0001\u0007"+
		"\u0005\u0007\u00a6\b\u0007\n\u0007\f\u0007\u00a9\t\u0007\u0001\u0007\u0005"+
		"\u0007\u00ac\b\u0007\n\u0007\f\u0007\u00af\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b3\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00bf\b\b\n\b\f\b\u00c2\t\b"+
		"\u0001\b\u0005\b\u00c5\b\b\n\b\f\b\u00c8\t\b\u0001\b\u0005\b\u00cb\b\b"+
		"\n\b\f\b\u00ce\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d6\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e5\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00ee\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f9\b\f\n\f\f\f\u00fc\t\f"+
		"\u0001\f\u0000\u0002\f\u0018\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000\u0016\u001b\u0001\u0000"+
		"\u0010\u0011\u0002\u0000\u000b\u000b\r\r\u0002\u0000\n\n\f\f\u0113\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004"+
		"6\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\ba\u0001\u0000"+
		"\u0000\u0000\nc\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000"+
		"\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00b4\u0001\u0000\u0000\u0000"+
		"\u0012\u00d1\u0001\u0000\u0000\u0000\u0014\u00d7\u0001\u0000\u0000\u0000"+
		"\u0016\u00e4\u0001\u0000\u0000\u0000\u0018\u00ed\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u0001\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0005 \u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0006\u0000\u0000#$\u0005\u0007\u0000\u0000$%\u0005\u0001"+
		"\u0000\u0000%&\u0003\u0006\u0003\u0000&\'\u0005\u0002\u0000\u0000\'+\u0005"+
		"\u0003\u0000\u0000(*\u0005 \u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",1\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.0\u0003\b\u0004\u0000"+
		"/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000045\u0003\u0004\u0002\u00005\u0003\u0001\u0000\u0000\u0000"+
		"67\u0005\u0004\u0000\u00007\u0005\u0001\u0000\u0000\u00008:\u0005\u001f"+
		"\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0007\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>B\u0003\u0014\n\u0000?A\u0005 \u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000Cb\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000EI\u0003\u0012\t\u0000FH\u0005 \u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000Jb\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000LP\u0003\u0016\u000b\u0000MO\u0005 \u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000Qb\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SW\u0003"+
		"\n\u0005\u0000TV\u0005 \u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"Xb\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z^\u0003\u0010\b\u0000"+
		"[]\u0005 \u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000a>\u0001\u0000\u0000\u0000aE\u0001\u0000"+
		"\u0000\u0000aL\u0001\u0000\u0000\u0000aS\u0001\u0000\u0000\u0000aZ\u0001"+
		"\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005\u0013\u0000\u0000"+
		"de\u0005\u0001\u0000\u0000ef\u0003\f\u0006\u0000fg\u0005\u0002\u0000\u0000"+
		"gk\u0005\u0003\u0000\u0000hj\u0005 \u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lq\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0003\b\u0004"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rw\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tv\u0005 \u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z~\u0005\u0004\u0000"+
		"\u0000{}\u0005 \u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0003\u000e\u0007\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u000b\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0006\u0006\uffff\uffff\u0000\u0085\u0086\u0003\u0018\f\u0000\u0086"+
		"\u0087\u0007\u0000\u0000\u0000\u0087\u0088\u0003\u0018\f\u0000\u0088\u0093"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008b"+
		"\u0003\f\u0006\u0000\u008b\u008c\u0005\u0002\u0000\u0000\u008c\u008d\u0007"+
		"\u0001\u0000\u0000\u008d\u008e\u0005\u0001\u0000\u0000\u008e\u008f\u0003"+
		"\f\u0006\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u0093\u0005\u0012\u0000\u0000\u0092\u0084\u0001\u0000"+
		"\u0000\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094\u0095\n\u0003\u0000"+
		"\u0000\u0095\u0096\u0007\u0001\u0000\u0000\u0096\u0098\u0003\f\u0006\u0004"+
		"\u0097\u0094\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\r\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u00b2\u0005\u0014\u0000\u0000\u009d\u00a1\u0005\u0003\u0000\u0000\u009e"+
		"\u00a0\u0005 \u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a7\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003\b\u0004\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ad\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005"+
		" \u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0005\u0004\u0000\u0000\u00b1\u00b3\u0003\n\u0005"+
		"\u0000\u00b2\u009d\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u000f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u000f\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0001\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000"+
		"\u00b7\u00b8\u0005\u0005\u0000\u0000\u00b8\u00b9\u0003\f\u0006\u0000\u00b9"+
		"\u00ba\u0005\u0005\u0000\u0000\u00ba\u00bb\u0003\u0014\n\u0000\u00bb\u00bc"+
		"\u0005\u0002\u0000\u0000\u00bc\u00c0\u0005\u0003\u0000\u0000\u00bd\u00bf"+
		"\u0005 \u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c6\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0003\b\u0004\u0000\u00c4\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00cc\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005 \u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u0004\u0000\u0000\u00d0\u0011\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0015\u0000\u0000\u00d2\u00d5\u0005\u001d\u0000"+
		"\u0000\u00d3\u00d4\u0005\u000e\u0000\u0000\u00d4\u00d6\u0003\u0018\f\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u0013\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u001d\u0000\u0000"+
		"\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d9\u00da\u0003\u0018\f\u0000\u00da"+
		"\u0015\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001c\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0001\u0000\u0000\u00dd\u00de\u0003\u0018\f\u0000\u00de\u00df"+
		"\u0005\u0002\u0000\u0000\u00df\u00e5\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005\u001c\u0000\u0000\u00e1\u00e2\u0005\u0001\u0000\u0000\u00e2\u00e3"+
		"\u0005\u001e\u0000\u0000\u00e3\u00e5\u0005\u0002\u0000\u0000\u00e4\u00db"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e5\u0017"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0006\f\uffff\uffff\u0000\u00e7\u00e8"+
		"\u0005\u0001\u0000\u0000\u00e8\u00e9\u0003\u0018\f\u0000\u00e9\u00ea\u0005"+
		"\u0002\u0000\u0000\u00ea\u00ee\u0001\u0000\u0000\u0000\u00eb\u00ee\u0005"+
		"\b\u0000\u0000\u00ec\u00ee\u0005\u001d\u0000\u0000\u00ed\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00fa\u0001\u0000\u0000\u0000\u00ef\u00f0\n\u0006\u0000"+
		"\u0000\u00f0\u00f1\u0005\t\u0000\u0000\u00f1\u00f9\u0003\u0018\f\u0007"+
		"\u00f2\u00f3\n\u0005\u0000\u0000\u00f3\u00f4\u0007\u0002\u0000\u0000\u00f4"+
		"\u00f9\u0003\u0018\f\u0006\u00f5\u00f6\n\u0004\u0000\u0000\u00f6\u00f7"+
		"\u0007\u0003\u0000\u0000\u00f7\u00f9\u0003\u0018\f\u0005\u00f8\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0019\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u001d\u001f+1;"+
		"BIPW^akqw~\u0082\u0092\u0099\u00a1\u00a7\u00ad\u00b2\u00c0\u00c6\u00cc"+
		"\u00d5\u00e4\u00ed\u00f8\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}