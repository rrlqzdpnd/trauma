// Generated from Trauma.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraumaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'void'", "'bool'", "'break'", "'while'", "'echo'", "'string'", "'if'", 
		"'int'", "'else'", "'return'", "'float'", "'char'", "Whitespace", "Newline", 
		"BlockComment", "LineComment", "INTCONST", "FLOATCONST", "CHARCONST", 
		"STRINGCONST", "NEWLINE", "TAB", "';'", "','", "'.'", "Id", "'||'", "'&&'", 
		"'!'", "Relop", "Sumop", "Multop", "'('", "')'", "'{'", "'}'", "'-'", 
		"'true'", "'false'", "':='"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "Whitespace", "Newline", "BlockComment", "LineComment", 
		"INTCONST", "FLOATCONST", "CHARCONST", "STRINGCONST", "NEWLINE", "TAB", 
		"Semicolon", "Comma", "Period", "Id", "Or", "And", "Not", "Relop", "Sumop", 
		"Multop", "LeftParen", "RightParen", "LeftBrace", "RightBrace", "Unaryop", 
		"True", "False", "Equal"
	};


	public TraumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trauma.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12: Whitespace_action((RuleContext)_localctx, actionIndex); break;

		case 13: Newline_action((RuleContext)_localctx, actionIndex); break;

		case 14: BlockComment_action((RuleContext)_localctx, actionIndex); break;

		case 15: LineComment_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void BlockComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void LineComment_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void Newline_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void Whitespace_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2*\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u0095\n\16\r\16\16"+
		"\16\u0096\3\16\3\16\3\17\3\17\5\17\u009d\n\17\3\17\5\17\u00a0\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\7\20\u00a8\n\20\f\20\16\20\u00ab\13\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9"+
		"\13\21\3\21\3\21\3\22\5\22\u00be\n\22\3\22\6\22\u00c1\n\22\r\22\16\22"+
		"\u00c2\3\23\5\23\u00c6\n\23\3\23\6\23\u00c9\n\23\r\23\16\23\u00ca\3\23"+
		"\3\23\6\23\u00cf\n\23\r\23\16\23\u00d0\3\24\3\24\3\24\3\24\3\25\3\25\7"+
		"\25\u00d9\n\25\f\25\16\25\u00dc\13\25\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33\u00eb\n\33\r\33\16\33\u00ec\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0101\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3\u00a9*\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\2\35\20\3\37\21\4!\22\5#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1\3\2\f\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;"+
		"\6\2\f\f\17\17))^^\4\2\"ac\177\3\2\f\f\3\2\13\13\5\2C\\aac|\4\2--//\5"+
		"\2\'\',,\61\61\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\3S\3\2\2\2\5X\3\2\2\2\7]\3\2\2\2\tc\3\2\2\2\13i\3\2\2\2\rn\3"+
		"\2\2\2\17u\3\2\2\2\21x\3\2\2\2\23|\3\2\2\2\25\u0081\3\2\2\2\27\u0088\3"+
		"\2\2\2\31\u008e\3\2\2\2\33\u0094\3\2\2\2\35\u009f\3\2\2\2\37\u00a3\3\2"+
		"\2\2!\u00b1\3\2\2\2#\u00bd\3\2\2\2%\u00c5\3\2\2\2\'\u00d2\3\2\2\2)\u00d6"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00e1\3\2\2\2/\u00e3\3\2\2\2\61\u00e5\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00ea\3\2\2\2\67\u00ee\3\2\2\29\u00f1\3\2\2\2;\u00f4"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0102\3\2\2\2A\u0104\3\2\2\2C\u0106\3\2\2\2E"+
		"\u0108\3\2\2\2G\u010a\3\2\2\2I\u010c\3\2\2\2K\u010e\3\2\2\2M\u0110\3\2"+
		"\2\2O\u0115\3\2\2\2Q\u011b\3\2\2\2ST\7x\2\2TU\7q\2\2UV\7k\2\2VW\7f\2\2"+
		"W\4\3\2\2\2XY\7d\2\2YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\\6\3\2\2\2]^\7d\2\2"+
		"^_\7t\2\2_`\7g\2\2`a\7c\2\2ab\7m\2\2b\b\3\2\2\2cd\7y\2\2de\7j\2\2ef\7"+
		"k\2\2fg\7n\2\2gh\7g\2\2h\n\3\2\2\2ij\7g\2\2jk\7e\2\2kl\7j\2\2lm\7q\2\2"+
		"m\f\3\2\2\2no\7u\2\2op\7v\2\2pq\7t\2\2qr\7k\2\2rs\7p\2\2st\7i\2\2t\16"+
		"\3\2\2\2uv\7k\2\2vw\7h\2\2w\20\3\2\2\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{\22"+
		"\3\2\2\2|}\7g\2\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080\24\3\2\2"+
		"\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7w\2\2\u0085\u0086\7t\2\2\u0086\u0087\7p\2\2\u0087\26\3\2\2\2\u0088\u0089"+
		"\7h\2\2\u0089\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7v\2\2\u008d\30\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090\7j\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092\32\3\2\2\2\u0093\u0095\t\2\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\16\2\2\u0099\34\3\2\2\2\u009a"+
		"\u009c\7\17\2\2\u009b\u009d\7\f\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\7\f\2\2\u009f\u009a\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\17\3\2\u00a2\36\3\2\2"+
		"\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7,\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8"+
		"\13\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad"+
		"\7,\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\20\4\2"+
		"\u00b0 \3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b7"+
		"\3\2\2\2\u00b4\u00b6\n\3\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bb\b\21\5\2\u00bb\"\3\2\2\2\u00bc\u00be\5K&\2\u00bd\u00bc"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3$\3\2\2\2\u00c4\u00c6\5K&\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c9\t\4\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\5\63\32\2\u00cd\u00cf\t\4\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1&\3\2\2\2"+
		"\u00d2\u00d3\7)\2\2\u00d3\u00d4\n\5\2\2\u00d4\u00d5\7)\2\2\u00d5(\3\2"+
		"\2\2\u00d6\u00da\7$\2\2\u00d7\u00d9\t\6\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$\2\2\u00de*\3\2\2\2\u00df\u00e0"+
		"\t\7\2\2\u00e0,\3\2\2\2\u00e1\u00e2\t\b\2\2\u00e2.\3\2\2\2\u00e3\u00e4"+
		"\7=\2\2\u00e4\60\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6\62\3\2\2\2\u00e7\u00e8"+
		"\7\60\2\2\u00e8\64\3\2\2\2\u00e9\u00eb\t\t\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\66\3\2\2"+
		"\2\u00ee\u00ef\7~\2\2\u00ef\u00f0\7~\2\2\u00f08\3\2\2\2\u00f1\u00f2\7"+
		"(\2\2\u00f2\u00f3\7(\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5<\3\2"+
		"\2\2\u00f6\u00f7\7>\2\2\u00f7\u0101\7?\2\2\u00f8\u0101\7>\2\2\u00f9\u00fa"+
		"\7?\2\2\u00fa\u0101\7?\2\2\u00fb\u0101\7@\2\2\u00fc\u00fd\7@\2\2\u00fd"+
		"\u0101\7?\2\2\u00fe\u00ff\7#\2\2\u00ff\u0101\7?\2\2\u0100\u00f6\3\2\2"+
		"\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101>\3\2\2\2\u0102\u0103\t\n\2\2\u0103"+
		"@\3\2\2\2\u0104\u0105\t\13\2\2\u0105B\3\2\2\2\u0106\u0107\7*\2\2\u0107"+
		"D\3\2\2\2\u0108\u0109\7+\2\2\u0109F\3\2\2\2\u010a\u010b\7}\2\2\u010bH"+
		"\3\2\2\2\u010c\u010d\7\177\2\2\u010dJ\3\2\2\2\u010e\u010f\7/\2\2\u010f"+
		"L\3\2\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7w\2\2\u0113"+
		"\u0114\7g\2\2\u0114N\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117\7c\2\2\u0117"+
		"\u0118\7n\2\2\u0118\u0119\7u\2\2\u0119\u011a\7g\2\2\u011aP\3\2\2\2\u011b"+
		"\u011c\7<\2\2\u011c\u011d\7?\2\2\u011dR\3\2\2\2\20\2\u0096\u009c\u009f"+
		"\u00a9\u00b7\u00bd\u00c2\u00c5\u00ca\u00d0\u00da\u00ec\u0100";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}