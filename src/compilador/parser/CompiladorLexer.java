// Generated from java-escape by ANTLR 4.11.1
package compilador.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CompiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VOID=7, PRINCIPAL=8, NUM=9, 
		POTENCIA=10, MAS=11, POR=12, MENOS=13, ENTRE=14, EQUALS=15, FOR=16, OR=17, 
		AND=18, BOOL=19, IF=20, ELSE=21, TYPE=22, MAYOR=23, MAYORIGUAL=24, MENOR=25, 
		MENORIGUAL=26, DIFERENTEDE=27, IGUALQUE=28, PRINT=29, ID=30, STRING=31, 
		ARG=32, ENDL=33, IGNORE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "VOID", "PRINCIPAL", 
			"NUM", "POTENCIA", "MAS", "POR", "MENOS", "ENTRE", "EQUALS", "FOR", "OR", 
			"AND", "BOOL", "IF", "ELSE", "TYPE", "MAYOR", "MAYORIGUAL", "MENOR", 
			"MENORIGUAL", "DIFERENTEDE", "IGUALQUE", "PRINT", "ID", "STRING", "ARG", 
			"ENDL", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'('", "')'", "'{'", "'}'", "', '", "'void'", "'principal'", 
			null, "'^'", "'+'", "'*'", "'-'", "'/'", "'='", "'for'", "'or'", "'and'", 
			null, "'if'", "'else'", null, "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'console.print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "VOID", "PRINCIPAL", "NUM", 
			"POTENCIA", "MAS", "POR", "MENOS", "ENTRE", "EQUALS", "FOR", "OR", "AND", 
			"BOOL", "IF", "ELSE", "TYPE", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", 
			"DIFERENTEDE", "IGUALQUE", "PRINT", "ID", "STRING", "ARG", "ENDL", "IGNORE"
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


	public CompiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\"\u00db\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bc\b\b"+
		"\u000b\b\f\bd\u0001\b\u0001\b\u0004\bi\b\b\u000b\b\f\bj\u0005\bm\b\b\n"+
		"\b\f\bp\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0092\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u00a4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u00c5\b\u001d\u000b\u001d"+
		"\f\u001d\u00c6\u0001\u001e\u0001\u001e\u0004\u001e\u00cb\b\u001e\u000b"+
		"\u001e\f\u001e\u00cc\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u00d2"+
		"\b\u001f\u000b\u001f\f\u001f\u00d3\u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001!\u0000\u0000\"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"\u0001\u0000\u0006\u0001\u000009\u0002\u0000AZaz"+
		"\u0003\u0000  AZaz\u0003\u000009AZaz\u0001\u0000\n\n\u0003\u0000\t\t\r"+
		"\r  \u00e2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0001E\u0001"+
		"\u0000\u0000\u0000\u0003G\u0001\u0000\u0000\u0000\u0005I\u0001\u0000\u0000"+
		"\u0000\u0007K\u0001\u0000\u0000\u0000\tM\u0001\u0000\u0000\u0000\u000b"+
		"O\u0001\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000\u000fW\u0001\u0000"+
		"\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000"+
		"\u0015s\u0001\u0000\u0000\u0000\u0017u\u0001\u0000\u0000\u0000\u0019w"+
		"\u0001\u0000\u0000\u0000\u001by\u0001\u0000\u0000\u0000\u001d{\u0001\u0000"+
		"\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000"+
		"#\u0084\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000\u0000\'\u0093"+
		"\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000+\u00a3\u0001\u0000"+
		"\u0000\u0000-\u00a5\u0001\u0000\u0000\u0000/\u00a7\u0001\u0000\u0000\u0000"+
		"1\u00aa\u0001\u0000\u0000\u00003\u00ac\u0001\u0000\u0000\u00005\u00af"+
		"\u0001\u0000\u0000\u00007\u00b2\u0001\u0000\u0000\u00009\u00b5\u0001\u0000"+
		"\u0000\u0000;\u00c4\u0001\u0000\u0000\u0000=\u00c8\u0001\u0000\u0000\u0000"+
		"?\u00d1\u0001\u0000\u0000\u0000A\u00d5\u0001\u0000\u0000\u0000C\u00d7"+
		"\u0001\u0000\u0000\u0000EF\u0005 \u0000\u0000F\u0002\u0001\u0000\u0000"+
		"\u0000GH\u0005(\u0000\u0000H\u0004\u0001\u0000\u0000\u0000IJ\u0005)\u0000"+
		"\u0000J\u0006\u0001\u0000\u0000\u0000KL\u0005{\u0000\u0000L\b\u0001\u0000"+
		"\u0000\u0000MN\u0005}\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005,"+
		"\u0000\u0000PQ\u0005 \u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005v"+
		"\u0000\u0000ST\u0005o\u0000\u0000TU\u0005i\u0000\u0000UV\u0005d\u0000"+
		"\u0000V\u000e\u0001\u0000\u0000\u0000WX\u0005p\u0000\u0000XY\u0005r\u0000"+
		"\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005c\u0000\u0000"+
		"\\]\u0005i\u0000\u0000]^\u0005p\u0000\u0000^_\u0005a\u0000\u0000_`\u0005"+
		"l\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ac\u0007\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000en\u0001\u0000\u0000\u0000fh\t\u0000\u0000"+
		"\u0000gi\u0007\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0012\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005^\u0000\u0000r\u0014\u0001"+
		"\u0000\u0000\u0000st\u0005+\u0000\u0000t\u0016\u0001\u0000\u0000\u0000"+
		"uv\u0005*\u0000\u0000v\u0018\u0001\u0000\u0000\u0000wx\u0005-\u0000\u0000"+
		"x\u001a\u0001\u0000\u0000\u0000yz\u0005/\u0000\u0000z\u001c\u0001\u0000"+
		"\u0000\u0000{|\u0005=\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0005"+
		"f\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005r\u0000\u0000"+
		"\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083"+
		"\u0005r\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"a\u0000\u0000\u0085\u0086\u0005n\u0000\u0000\u0086\u0087\u0005d\u0000"+
		"\u0000\u0087$\u0001\u0000\u0000\u0000\u0088\u0089\u0005t\u0000\u0000\u0089"+
		"\u008a\u0005r\u0000\u0000\u008a\u008b\u0005u\u0000\u0000\u008b\u0092\u0005"+
		"e\u0000\u0000\u008c\u008d\u0005f\u0000\u0000\u008d\u008e\u0005a\u0000"+
		"\u0000\u008e\u008f\u0005l\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090"+
		"\u0092\u0005e\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008c"+
		"\u0001\u0000\u0000\u0000\u0092&\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"i\u0000\u0000\u0094\u0095\u0005f\u0000\u0000\u0095(\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005l\u0000\u0000\u0098"+
		"\u0099\u0005s\u0000\u0000\u0099\u009a\u0005e\u0000\u0000\u009a*\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005i\u0000\u0000\u009c\u009d\u0005n\u0000"+
		"\u0000\u009d\u00a4\u0005t\u0000\u0000\u009e\u009f\u0005f\u0000\u0000\u009f"+
		"\u00a0\u0005l\u0000\u0000\u00a0\u00a1\u0005o\u0000\u0000\u00a1\u00a2\u0005"+
		"a\u0000\u0000\u00a2\u00a4\u0005t\u0000\u0000\u00a3\u009b\u0001\u0000\u0000"+
		"\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a4,\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005>\u0000\u0000\u00a6.\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005>\u0000\u0000\u00a8\u00a9\u0005=\u0000\u0000\u00a90\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005<\u0000\u0000\u00ab2\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005<\u0000\u0000\u00ad\u00ae\u0005=\u0000\u0000\u00ae4"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005!\u0000\u0000\u00b0\u00b1\u0005"+
		"=\u0000\u0000\u00b16\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005=\u0000"+
		"\u0000\u00b3\u00b4\u0005=\u0000\u0000\u00b48\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005c\u0000\u0000\u00b6\u00b7\u0005o\u0000\u0000\u00b7\u00b8\u0005"+
		"n\u0000\u0000\u00b8\u00b9\u0005s\u0000\u0000\u00b9\u00ba\u0005o\u0000"+
		"\u0000\u00ba\u00bb\u0005l\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000\u00bc"+
		"\u00bd\u0005.\u0000\u0000\u00bd\u00be\u0005p\u0000\u0000\u00be\u00bf\u0005"+
		"r\u0000\u0000\u00bf\u00c0\u0005i\u0000\u0000\u00c0\u00c1\u0005n\u0000"+
		"\u0000\u00c1\u00c2\u0005t\u0000\u0000\u00c2:\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c5\u0007\u0001\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7<\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0005\"\u0000\u0000\u00c9\u00cb\u0007\u0002\u0000\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf>\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0007\u0003\u0000\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4@\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0007\u0004\u0000\u0000\u00d6B\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0007\u0005\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u00da\u0006!\u0000\u0000\u00daD\u0001\u0000\u0000\u0000\t\u0000"+
		"djn\u0091\u00a3\u00c6\u00cc\u00d3\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}