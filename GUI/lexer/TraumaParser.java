// Generated from Trauma.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraumaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, Whitespace=13, Newline=14, BlockComment=15, 
		LineComment=16, INTCONST=17, FLOATCONST=18, CHARCONST=19, STRINGCONST=20, 
		NEWLINE=21, TAB=22, Semicolon=23, Comma=24, Period=25, Id=26, Or=27, And=28, 
		Not=29, Relop=30, Sumop=31, Multop=32, LeftParen=33, RightParen=34, LeftBrace=35, 
		RightBrace=36, Unaryop=37, True=38, False=39, Equal=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'void'", "'bool'", "'break'", "'while'", "'echo'", "'string'", 
		"'if'", "'int'", "'else'", "'return'", "'float'", "'char'", "Whitespace", 
		"Newline", "BlockComment", "LineComment", "INTCONST", "FLOATCONST", "CHARCONST", 
		"STRINGCONST", "NEWLINE", "TAB", "';'", "','", "'.'", "Id", "'||'", "'&&'", 
		"'!'", "Relop", "Sumop", "Multop", "'('", "')'", "'{'", "'}'", "'-'", 
		"'true'", "'false'", "':='"
	};
	public static final int
		RULE_program = 0, RULE_declarationlist = 1, RULE_declaration = 2, RULE_vardeclaration = 3, 
		RULE_typespecifier = 4, RULE_vardeclist = 5, RULE_vardeclinit = 6, RULE_simpleexpression = 7, 
		RULE_andexpression = 8, RULE_unaryrelexpression = 9, RULE_relexpression = 10, 
		RULE_sumexpression = 11, RULE_multexpression = 12, RULE_unaryexpression = 13, 
		RULE_factor = 14, RULE_mutable = 15, RULE_immutable = 16, RULE_call = 17, 
		RULE_args = 18, RULE_arglist = 19, RULE_constant = 20, RULE_expression = 21, 
		RULE_funcdeclaration = 22, RULE_params = 23, RULE_paramlist = 24, RULE_statement = 25, 
		RULE_breakstmt = 26, RULE_returnstmt = 27, RULE_iterationstmt = 28, RULE_selectionstmt = 29, 
		RULE_compoundstmt = 30, RULE_localdeclarations = 31, RULE_statementlist = 32, 
		RULE_expressionstmt = 33, RULE_printstmt = 34;
	public static final String[] ruleNames = {
		"program", "declarationlist", "declaration", "vardeclaration", "typespecifier", 
		"vardeclist", "vardeclinit", "simpleexpression", "andexpression", "unaryrelexpression", 
		"relexpression", "sumexpression", "multexpression", "unaryexpression", 
		"factor", "mutable", "immutable", "call", "args", "arglist", "constant", 
		"expression", "funcdeclaration", "params", "paramlist", "statement", "breakstmt", 
		"returnstmt", "iterationstmt", "selectionstmt", "compoundstmt", "localdeclarations", 
		"statementlist", "expressionstmt", "printstmt"
	};

	@Override
	public String getGrammarFileName() { return "Trauma.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TraumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); declarationlist(0);
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

	public static class DeclarationlistContext extends ParserRuleContext {
		public int _p;
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclarationlistContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_declarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterDeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitDeclarationlist(this);
		}
	}

	public final DeclarationlistContext declarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationlistContext _localctx = new DeclarationlistContext(_ctx, _parentState, _p);
		DeclarationlistContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_declarationlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(73); declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationlistContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationlist);
					setState(75);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(76); declaration();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public FuncdeclarationContext funcdeclaration() {
			return getRuleContext(FuncdeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); vardeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); funcdeclaration();
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

	public static class VardeclarationContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(TraumaParser.Semicolon, 0); }
		public VardeclistContext vardeclist() {
			return getRuleContext(VardeclistContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterVardeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitVardeclaration(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); typespecifier();
			setState(87); vardeclist(0);
			setState(88); match(Semicolon);
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

	public static class TypespecifierContext extends ParserRuleContext {
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typespecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 6) | (1L << 8) | (1L << 11) | (1L << 12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VardeclistContext extends ParserRuleContext {
		public int _p;
		public VardeclistContext vardeclist() {
			return getRuleContext(VardeclistContext.class,0);
		}
		public VardeclinitContext vardeclinit() {
			return getRuleContext(VardeclinitContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TraumaParser.Comma, 0); }
		public VardeclistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VardeclistContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_vardeclist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterVardeclist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitVardeclist(this);
		}
	}

	public final VardeclistContext vardeclist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VardeclistContext _localctx = new VardeclistContext(_ctx, _parentState, _p);
		VardeclistContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_vardeclist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93); vardeclinit();
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VardeclistContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_vardeclist);
					setState(95);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(96); match(Comma);
					setState(97); vardeclinit();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class VardeclinitContext extends ParserRuleContext {
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(TraumaParser.Id, 0); }
		public TerminalNode Equal() { return getToken(TraumaParser.Equal, 0); }
		public VardeclinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterVardeclinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitVardeclinit(this);
		}
	}

	public final VardeclinitContext vardeclinit() throws RecognitionException {
		VardeclinitContext _localctx = new VardeclinitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardeclinit);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(Id);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(Id);
				setState(105); match(Equal);
				setState(106); simpleexpression(0);
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

	public static class SimpleexpressionContext extends ParserRuleContext {
		public int _p;
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(TraumaParser.Or, 0); }
		public SimpleexpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SimpleexpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_simpleexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterSimpleexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitSimpleexpression(this);
		}
	}

	public final SimpleexpressionContext simpleexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleexpressionContext _localctx = new SimpleexpressionContext(_ctx, _parentState, _p);
		SimpleexpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_simpleexpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(110); andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SimpleexpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_simpleexpression);
					setState(112);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(113); match(Or);
					setState(114); andexpression(0);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class AndexpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode And() { return getToken(TraumaParser.And, 0); }
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public UnaryrelexpressionContext unaryrelexpression() {
			return getRuleContext(UnaryrelexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AndexpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState, _p);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_andexpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121); unaryrelexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(123);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(124); match(And);
					setState(125); unaryrelexpression();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class UnaryrelexpressionContext extends ParserRuleContext {
		public RelexpressionContext relexpression() {
			return getRuleContext(RelexpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(TraumaParser.Not, 0); }
		public UnaryrelexpressionContext unaryrelexpression() {
			return getRuleContext(UnaryrelexpressionContext.class,0);
		}
		public UnaryrelexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryrelexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterUnaryrelexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitUnaryrelexpression(this);
		}
	}

	public final UnaryrelexpressionContext unaryrelexpression() throws RecognitionException {
		UnaryrelexpressionContext _localctx = new UnaryrelexpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryrelexpression);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(Not);
				setState(132); unaryrelexpression();
				}
				break;
			case INTCONST:
			case FLOATCONST:
			case CHARCONST:
			case STRINGCONST:
			case NEWLINE:
			case TAB:
			case Id:
			case LeftParen:
			case Unaryop:
			case True:
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); relexpression(0);
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

	public static class RelexpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode Relop() { return getToken(TraumaParser.Relop, 0); }
		public RelexpressionContext relexpression() {
			return getRuleContext(RelexpressionContext.class,0);
		}
		public SumexpressionContext sumexpression() {
			return getRuleContext(SumexpressionContext.class,0);
		}
		public RelexpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RelexpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_relexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterRelexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitRelexpression(this);
		}
	}

	public final RelexpressionContext relexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelexpressionContext _localctx = new RelexpressionContext(_ctx, _parentState, _p);
		RelexpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_relexpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137); sumexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelexpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_relexpression);
					setState(139);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(140); match(Relop);
					setState(141); sumexpression(0);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class SumexpressionContext extends ParserRuleContext {
		public int _p;
		public SumexpressionContext sumexpression() {
			return getRuleContext(SumexpressionContext.class,0);
		}
		public TerminalNode Sumop() { return getToken(TraumaParser.Sumop, 0); }
		public MultexpressionContext multexpression() {
			return getRuleContext(MultexpressionContext.class,0);
		}
		public SumexpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SumexpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_sumexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterSumexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitSumexpression(this);
		}
	}

	public final SumexpressionContext sumexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumexpressionContext _localctx = new SumexpressionContext(_ctx, _parentState, _p);
		SumexpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_sumexpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148); multexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SumexpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_sumexpression);
					setState(150);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(151); match(Sumop);
					setState(152); multexpression(0);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class MultexpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode Multop() { return getToken(TraumaParser.Multop, 0); }
		public MultexpressionContext multexpression() {
			return getRuleContext(MultexpressionContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public MultexpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultexpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterMultexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitMultexpression(this);
		}
	}

	public final MultexpressionContext multexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultexpressionContext _localctx = new MultexpressionContext(_ctx, _parentState, _p);
		MultexpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_multexpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159); unaryexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultexpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_multexpression);
					setState(161);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(162); match(Multop);
					setState(163); unaryexpression();
					}
					} 
				}
				setState(168);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public TerminalNode Unaryop() { return getToken(TraumaParser.Unaryop, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryexpression);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case Unaryop:
				enterOuterAlt(_localctx, 1);
				{
				setState(169); match(Unaryop);
				setState(170); unaryexpression();
				}
				break;
			case INTCONST:
			case FLOATCONST:
			case CHARCONST:
			case STRINGCONST:
			case NEWLINE:
			case TAB:
			case Id:
			case LeftParen:
			case True:
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); factor();
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

	public static class FactorContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public ImmutableContext immutable() {
			return getRuleContext(ImmutableContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); mutable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); immutable();
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

	public static class MutableContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(TraumaParser.Id, 0); }
		public MutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterMutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitMutable(this);
		}
	}

	public final MutableContext mutable() throws RecognitionException {
		MutableContext _localctx = new MutableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mutable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(Id);
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

	public static class ImmutableContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TraumaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TraumaParser.RightParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ImmutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immutable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterImmutable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitImmutable(this);
		}
	}

	public final ImmutableContext immutable() throws RecognitionException {
		ImmutableContext _localctx = new ImmutableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_immutable);
		try {
			setState(186);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); match(LeftParen);
				setState(181); expression();
				setState(182); match(RightParen);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); call();
				}
				break;
			case INTCONST:
			case FLOATCONST:
			case CHARCONST:
			case STRINGCONST:
			case NEWLINE:
			case TAB:
			case True:
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(185); constant();
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TraumaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TraumaParser.RightParen, 0); }
		public TerminalNode Id() { return getToken(TraumaParser.Id, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(Id);
			setState(189); match(LeftParen);
			setState(190); args();
			setState(191); match(RightParen);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case INTCONST:
			case FLOATCONST:
			case CHARCONST:
			case STRINGCONST:
			case NEWLINE:
			case TAB:
			case Id:
			case Not:
			case LeftParen:
			case Unaryop:
			case True:
			case False:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); arglist(0);
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArglistContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TraumaParser.Comma, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArglistContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitArglist(this);
		}
	}

	public final ArglistContext arglist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArglistContext _localctx = new ArglistContext(_ctx, _parentState, _p);
		ArglistContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, RULE_arglist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198); expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArglistContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_arglist);
					setState(200);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(201); match(Comma);
					setState(202); expression();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(TraumaParser.NEWLINE, 0); }
		public TerminalNode STRINGCONST() { return getToken(TraumaParser.STRINGCONST, 0); }
		public TerminalNode INTCONST() { return getToken(TraumaParser.INTCONST, 0); }
		public TerminalNode False() { return getToken(TraumaParser.False, 0); }
		public TerminalNode CHARCONST() { return getToken(TraumaParser.CHARCONST, 0); }
		public TerminalNode FLOATCONST() { return getToken(TraumaParser.FLOATCONST, 0); }
		public TerminalNode True() { return getToken(TraumaParser.True, 0); }
		public TerminalNode TAB() { return getToken(TraumaParser.TAB, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTCONST) | (1L << FLOATCONST) | (1L << CHARCONST) | (1L << STRINGCONST) | (1L << NEWLINE) | (1L << TAB) | (1L << True) | (1L << False))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public MutableContext mutable() {
			return getRuleContext(MutableContext.class,0);
		}
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(TraumaParser.Equal, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); mutable();
				setState(211); match(Equal);
				setState(212); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); simpleexpression(0);
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

	public static class FuncdeclarationContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TraumaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TraumaParser.RightParen, 0); }
		public TerminalNode Id() { return getToken(TraumaParser.Id, 0); }
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FuncdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterFuncdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitFuncdeclaration(this);
		}
	}

	public final FuncdeclarationContext funcdeclaration() throws RecognitionException {
		FuncdeclarationContext _localctx = new FuncdeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); typespecifier();
			setState(218); match(Id);
			setState(219); match(LeftParen);
			setState(220); params();
			setState(221); match(RightParen);
			setState(222); statement();
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_params);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 6:
			case 8:
			case 11:
			case 12:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); paramlist(0);
				}
				break;
			case RightParen:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParamlistContext extends ParserRuleContext {
		public int _p;
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode Id() { return getToken(TraumaParser.Id, 0); }
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TraumaParser.Comma, 0); }
		public ParamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamlistContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitParamlist(this);
		}
	}

	public final ParamlistContext paramlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamlistContext _localctx = new ParamlistContext(_ctx, _parentState, _p);
		ParamlistContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, RULE_paramlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(229); typespecifier();
			setState(230); match(Id);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamlistContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_paramlist);
					setState(232);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(233); match(Comma);
					setState(234); typespecifier();
					setState(235); match(Id);
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionstmtContext expressionstmt() {
			return getRuleContext(ExpressionstmtContext.class,0);
		}
		public IterationstmtContext iterationstmt() {
			return getRuleContext(IterationstmtContext.class,0);
		}
		public BreakstmtContext breakstmt() {
			return getRuleContext(BreakstmtContext.class,0);
		}
		public SelectionstmtContext selectionstmt() {
			return getRuleContext(SelectionstmtContext.class,0);
		}
		public PrintstmtContext printstmt() {
			return getRuleContext(PrintstmtContext.class,0);
		}
		public CompoundstmtContext compoundstmt() {
			return getRuleContext(CompoundstmtContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); breakstmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); returnstmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); iterationstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 4);
				{
				setState(245); selectionstmt();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(246); compoundstmt();
				}
				break;
			case INTCONST:
			case FLOATCONST:
			case CHARCONST:
			case STRINGCONST:
			case NEWLINE:
			case TAB:
			case Semicolon:
			case Id:
			case Not:
			case LeftParen:
			case Unaryop:
			case True:
			case False:
				enterOuterAlt(_localctx, 6);
				{
				setState(247); expressionstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 7);
				{
				setState(248); printstmt();
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

	public static class BreakstmtContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(TraumaParser.Semicolon, 0); }
		public BreakstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterBreakstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitBreakstmt(this);
		}
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_breakstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(3);
			setState(252); match(Semicolon);
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(TraumaParser.Semicolon, 0); }
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnstmt);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(10);
				setState(255); match(Semicolon);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(10);
				setState(257); simpleexpression(0);
				setState(258); match(Semicolon);
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

	public static class IterationstmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TraumaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TraumaParser.RightParen, 0); }
		public IterationstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterIterationstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitIterationstmt(this);
		}
	}

	public final IterationstmtContext iterationstmt() throws RecognitionException {
		IterationstmtContext _localctx = new IterationstmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_iterationstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(4);
			setState(263); match(LeftParen);
			setState(264); simpleexpression(0);
			setState(265); match(RightParen);
			setState(266); statement();
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

	public static class SelectionstmtContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TraumaParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TraumaParser.RightParen, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterSelectionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitSelectionstmt(this);
		}
	}

	public final SelectionstmtContext selectionstmt() throws RecognitionException {
		SelectionstmtContext _localctx = new SelectionstmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selectionstmt);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(7);
				setState(269); match(LeftParen);
				setState(270); simpleexpression(0);
				setState(271); match(RightParen);
				setState(272); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); match(7);
				setState(275); match(LeftParen);
				setState(276); simpleexpression(0);
				setState(277); match(RightParen);
				setState(278); statement();
				setState(279); match(9);
				setState(280); statement();
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

	public static class CompoundstmtContext extends ParserRuleContext {
		public TerminalNode RightBrace() { return getToken(TraumaParser.RightBrace, 0); }
		public LocaldeclarationsContext localdeclarations() {
			return getRuleContext(LocaldeclarationsContext.class,0);
		}
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TraumaParser.LeftBrace, 0); }
		public CompoundstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterCompoundstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitCompoundstmt(this);
		}
	}

	public final CompoundstmtContext compoundstmt() throws RecognitionException {
		CompoundstmtContext _localctx = new CompoundstmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_compoundstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(LeftBrace);
			setState(285); localdeclarations(0);
			setState(286); statementlist(0);
			setState(287); match(RightBrace);
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

	public static class LocaldeclarationsContext extends ParserRuleContext {
		public int _p;
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public LocaldeclarationsContext localdeclarations() {
			return getRuleContext(LocaldeclarationsContext.class,0);
		}
		public LocaldeclarationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LocaldeclarationsContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_localdeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterLocaldeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitLocaldeclarations(this);
		}
	}

	public final LocaldeclarationsContext localdeclarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LocaldeclarationsContext _localctx = new LocaldeclarationsContext(_ctx, _parentState, _p);
		LocaldeclarationsContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, RULE_localdeclarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LocaldeclarationsContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_localdeclarations);
					setState(290);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(291); vardeclaration();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class StatementlistContext extends ParserRuleContext {
		public int _p;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementlistContext statementlist() {
			return getRuleContext(StatementlistContext.class,0);
		}
		public StatementlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementlistContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_statementlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterStatementlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitStatementlist(this);
		}
	}

	public final StatementlistContext statementlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementlistContext _localctx = new StatementlistContext(_ctx, _parentState, _p);
		StatementlistContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, RULE_statementlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementlistContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_statementlist);
					setState(298);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(299); statement();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class ExpressionstmtContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(TraumaParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterExpressionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitExpressionstmt(this);
		}
	}

	public final ExpressionstmtContext expressionstmt() throws RecognitionException {
		ExpressionstmtContext _localctx = new ExpressionstmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionstmt);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case INTCONST:
			case FLOATCONST:
			case CHARCONST:
			case STRINGCONST:
			case NEWLINE:
			case TAB:
			case Id:
			case Not:
			case LeftParen:
			case Unaryop:
			case True:
			case False:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); expression();
				setState(306); match(Semicolon);
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(308); match(Semicolon);
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

	public static class PrintstmtContext extends ParserRuleContext {
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(TraumaParser.Semicolon, 0); }
		public PrintstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).enterPrintstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraumaListener ) ((TraumaListener)listener).exitPrintstmt(this);
		}
	}

	public final PrintstmtContext printstmt() throws RecognitionException {
		PrintstmtContext _localctx = new PrintstmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_printstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(5);
			setState(312); simpleexpression(0);
			setState(313); match(Semicolon);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return declarationlist_sempred((DeclarationlistContext)_localctx, predIndex);

		case 5: return vardeclist_sempred((VardeclistContext)_localctx, predIndex);

		case 7: return simpleexpression_sempred((SimpleexpressionContext)_localctx, predIndex);

		case 8: return andexpression_sempred((AndexpressionContext)_localctx, predIndex);

		case 10: return relexpression_sempred((RelexpressionContext)_localctx, predIndex);

		case 11: return sumexpression_sempred((SumexpressionContext)_localctx, predIndex);

		case 12: return multexpression_sempred((MultexpressionContext)_localctx, predIndex);

		case 19: return arglist_sempred((ArglistContext)_localctx, predIndex);

		case 24: return paramlist_sempred((ParamlistContext)_localctx, predIndex);

		case 31: return localdeclarations_sempred((LocaldeclarationsContext)_localctx, predIndex);

		case 32: return statementlist_sempred((StatementlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arglist_sempred(ArglistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean relexpression_sempred(RelexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean declarationlist_sempred(DeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean statementlist_sempred(StatementlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean multexpression_sempred(MultexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean localdeclarations_sempred(LocaldeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean sumexpression_sempred(SumexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean vardeclist_sempred(VardeclistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean simpleexpression_sempred(SimpleexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean paramlist_sempred(ParamlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3*\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16\3"+
		"S\13\3\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\tv\n\t\f\t\16\ty\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f"+
		"\n\16\n\u0084\13\n\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0091\n\f\f\f\16\f\u0094\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009c"+
		"\n\r\f\r\16\r\u009f\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a7\n\16"+
		"\f\16\16\16\u00aa\13\16\3\17\3\17\3\17\5\17\u00af\n\17\3\20\3\20\5\20"+
		"\u00b3\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bd\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00c6\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u00ce\n\25\f\25\16\25\u00d1\13\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u00da\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\5\31\u00e5\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u00f0\n\32\f\32\16\32\u00f3\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00fc\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0107"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u011d\n\37\3 \3 \3 \3 \3 \3!"+
		"\3!\3!\7!\u0127\n!\f!\16!\u012a\13!\3\"\3\"\3\"\7\"\u012f\n\"\f\"\16\""+
		"\u0132\13\"\3#\3#\3#\3#\5#\u0138\n#\3$\3$\3$\3$\3$\2%\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\4\6\2\3\4\b\b\n\n"+
		"\r\16\4\2\23\30()\u0138\2H\3\2\2\2\4J\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2\n"+
		"\\\3\2\2\2\f^\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22z\3\2\2\2\24\u0088\3\2"+
		"\2\2\26\u008a\3\2\2\2\30\u0095\3\2\2\2\32\u00a0\3\2\2\2\34\u00ae\3\2\2"+
		"\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\"\u00bc\3\2\2\2$\u00be\3\2\2\2&\u00c5"+
		"\3\2\2\2(\u00c7\3\2\2\2*\u00d2\3\2\2\2,\u00d9\3\2\2\2.\u00db\3\2\2\2\60"+
		"\u00e4\3\2\2\2\62\u00e6\3\2\2\2\64\u00fb\3\2\2\2\66\u00fd\3\2\2\28\u0106"+
		"\3\2\2\2:\u0108\3\2\2\2<\u011c\3\2\2\2>\u011e\3\2\2\2@\u0123\3\2\2\2B"+
		"\u012b\3\2\2\2D\u0137\3\2\2\2F\u0139\3\2\2\2HI\5\4\3\2I\3\3\2\2\2JK\b"+
		"\3\1\2KL\5\6\4\2LQ\3\2\2\2MN\6\3\2\3NP\5\6\4\2OM\3\2\2\2PS\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2R\5\3\2\2\2SQ\3\2\2\2TW\5\b\5\2UW\5.\30\2VT\3\2\2\2VU"+
		"\3\2\2\2W\7\3\2\2\2XY\5\n\6\2YZ\5\f\7\2Z[\7\31\2\2[\t\3\2\2\2\\]\t\2\2"+
		"\2]\13\3\2\2\2^_\b\7\1\2_`\5\16\b\2`f\3\2\2\2ab\6\7\3\3bc\7\32\2\2ce\5"+
		"\16\b\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hf\3\2\2\2i"+
		"n\7\34\2\2jk\7\34\2\2kl\7*\2\2ln\5\20\t\2mi\3\2\2\2mj\3\2\2\2n\17\3\2"+
		"\2\2op\b\t\1\2pq\5\22\n\2qw\3\2\2\2rs\6\t\4\3st\7\35\2\2tv\5\22\n\2ur"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3\2\2\2z{\b\n\1\2"+
		"{|\5\24\13\2|\u0082\3\2\2\2}~\6\n\5\3~\177\7\36\2\2\177\u0081\5\24\13"+
		"\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\37\2\2\u0086"+
		"\u0089\5\24\13\2\u0087\u0089\5\26\f\2\u0088\u0085\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\25\3\2\2\2\u008a\u008b\b\f\1\2\u008b\u008c\5\30\r\2\u008c"+
		"\u0092\3\2\2\2\u008d\u008e\6\f\6\3\u008e\u008f\7 \2\2\u008f\u0091\5\30"+
		"\r\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\27\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\r\1"+
		"\2\u0096\u0097\5\32\16\2\u0097\u009d\3\2\2\2\u0098\u0099\6\r\7\3\u0099"+
		"\u009a\7!\2\2\u009a\u009c\5\32\16\2\u009b\u0098\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\31\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\b\16\1\2\u00a1\u00a2\5\34\17\2\u00a2\u00a8"+
		"\3\2\2\2\u00a3\u00a4\6\16\b\3\u00a4\u00a5\7\"\2\2\u00a5\u00a7\5\34\17"+
		"\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac"+
		"\u00af\5\34\17\2\u00ad\u00af\5\36\20\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\35\3\2\2\2\u00b0\u00b3\5 \21\2\u00b1\u00b3\5\"\22\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\34\2"+
		"\2\u00b5!\3\2\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\5,\27\2\u00b8\u00b9\7"+
		"$\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bd\5$\23\2\u00bb\u00bd\5*\26\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd#\3\2\2\2"+
		"\u00be\u00bf\7\34\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\5&\24\2\u00c1\u00c2"+
		"\7$\2\2\u00c2%\3\2\2\2\u00c3\u00c6\5(\25\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00c8\b\25\1\2\u00c8"+
		"\u00c9\5,\27\2\u00c9\u00cf\3\2\2\2\u00ca\u00cb\6\25\t\3\u00cb\u00cc\7"+
		"\32\2\2\u00cc\u00ce\5,\27\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0)\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d2\u00d3\t\3\2\2\u00d3+\3\2\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\7"+
		"*\2\2\u00d6\u00d7\5,\27\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5\20\t\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da-\3\2\2\2\u00db\u00dc\5\n\6\2"+
		"\u00dc\u00dd\7\34\2\2\u00dd\u00de\7#\2\2\u00de\u00df\5\60\31\2\u00df\u00e0"+
		"\7$\2\2\u00e0\u00e1\5\64\33\2\u00e1/\3\2\2\2\u00e2\u00e5\5\62\32\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\61\3\2\2"+
		"\2\u00e6\u00e7\b\32\1\2\u00e7\u00e8\5\n\6\2\u00e8\u00e9\7\34\2\2\u00e9"+
		"\u00f1\3\2\2\2\u00ea\u00eb\6\32\n\3\u00eb\u00ec\7\32\2\2\u00ec\u00ed\5"+
		"\n\6\2\u00ed\u00ee\7\34\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\63\3\2\2"+
		"\2\u00f3\u00f1\3\2\2\2\u00f4\u00fc\5\66\34\2\u00f5\u00fc\58\35\2\u00f6"+
		"\u00fc\5:\36\2\u00f7\u00fc\5<\37\2\u00f8\u00fc\5> \2\u00f9\u00fc\5D#\2"+
		"\u00fa\u00fc\5F$\2\u00fb\u00f4\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00f6"+
		"\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\7\31\2"+
		"\2\u00ff\67\3\2\2\2\u0100\u0101\7\f\2\2\u0101\u0107\7\31\2\2\u0102\u0103"+
		"\7\f\2\2\u0103\u0104\5\20\t\2\u0104\u0105\7\31\2\2\u0105\u0107\3\2\2\2"+
		"\u0106\u0100\3\2\2\2\u0106\u0102\3\2\2\2\u01079\3\2\2\2\u0108\u0109\7"+
		"\6\2\2\u0109\u010a\7#\2\2\u010a\u010b\5\20\t\2\u010b\u010c\7$\2\2\u010c"+
		"\u010d\5\64\33\2\u010d;\3\2\2\2\u010e\u010f\7\t\2\2\u010f\u0110\7#\2\2"+
		"\u0110\u0111\5\20\t\2\u0111\u0112\7$\2\2\u0112\u0113\5\64\33\2\u0113\u011d"+
		"\3\2\2\2\u0114\u0115\7\t\2\2\u0115\u0116\7#\2\2\u0116\u0117\5\20\t\2\u0117"+
		"\u0118\7$\2\2\u0118\u0119\5\64\33\2\u0119\u011a\7\13\2\2\u011a\u011b\5"+
		"\64\33\2\u011b\u011d\3\2\2\2\u011c\u010e\3\2\2\2\u011c\u0114\3\2\2\2\u011d"+
		"=\3\2\2\2\u011e\u011f\7%\2\2\u011f\u0120\5@!\2\u0120\u0121\5B\"\2\u0121"+
		"\u0122\7&\2\2\u0122?\3\2\2\2\u0123\u0128\b!\1\2\u0124\u0125\6!\13\3\u0125"+
		"\u0127\5\b\5\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129A\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0130"+
		"\b\"\1\2\u012c\u012d\6\"\f\3\u012d\u012f\5\64\33\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131C\3"+
		"\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5,\27\2\u0134\u0135\7\31\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0138\7\31\2\2\u0137\u0133\3\2\2\2\u0137\u0136\3"+
		"\2\2\2\u0138E\3\2\2\2\u0139\u013a\7\7\2\2\u013a\u013b\5\20\t\2\u013b\u013c"+
		"\7\31\2\2\u013cG\3\2\2\2\32QVfmw\u0082\u0088\u0092\u009d\u00a8\u00ae\u00b2"+
		"\u00bc\u00c5\u00cf\u00d9\u00e4\u00f1\u00fb\u0106\u011c\u0128\u0130\u0137";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}