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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, VOID=6, PRINCIPAL=7, NUM=8, POTENCIA=9, 
		MAS=10, POR=11, MENOS=12, ENTRE=13, EQUALS=14, FOR=15, OR=16, AND=17, 
		BOOL=18, IF=19, ELSE=20, TYPE=21, MAYOR=22, MAYORIGUAL=23, MENOR=24, MENORIGUAL=25, 
		DIFERENTEDE=26, IGUALQUE=27, PRINT=28, ID=29, STRING=30, ARG=31, ENDL=32, 
		IGNORE=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "VOID", "PRINCIPAL", "NUM", "POTENCIA", 
			"MAS", "POR", "MENOS", "ENTRE", "EQUALS", "FOR", "OR", "AND", "BOOL", 
			"IF", "ELSE", "TYPE", "MAYOR", "MAYORIGUAL", "MENOR", "MENORIGUAL", "DIFERENTEDE", 
			"IGUALQUE", "PRINT", "ID", "STRING", "ARG", "ENDL", "IGNORE"
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
		"\u0004\u0000!\u00d7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0004\u0007_\b\u0007\u000b\u0007\f\u0007`\u0001\u0007"+
		"\u0001\u0007\u0004\u0007e\b\u0007\u000b\u0007\f\u0007f\u0005\u0007i\b"+
		"\u0007\n\u0007\f\u0007l\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u008e\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00a0\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00c1"+
		"\b\u001c\u000b\u001c\f\u001c\u00c2\u0001\u001d\u0001\u001d\u0004\u001d"+
		"\u00c7\b\u001d\u000b\u001d\f\u001d\u00c8\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0004\u001e\u00ce\b\u001e\u000b\u001e\f\u001e\u00cf\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0000\u0000!\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!\u0001\u0000\u0006\u0001\u0000"+
		"09\u0004\u000009AZ__az\u0004\u0000  ..AZaz\u0003\u000009AZaz\u0001\u0000"+
		"\n\n\u0003\u0000\t\t\r\r  \u00de\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000"+
		"\u0003E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007I"+
		"\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bN\u0001\u0000"+
		"\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000f^\u0001\u0000\u0000\u0000"+
		"\u0011m\u0001\u0000\u0000\u0000\u0013o\u0001\u0000\u0000\u0000\u0015q"+
		"\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000\u0000\u0019u\u0001\u0000"+
		"\u0000\u0000\u001bw\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000"+
		"\u001f}\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#\u008d"+
		"\u0001\u0000\u0000\u0000%\u008f\u0001\u0000\u0000\u0000\'\u0092\u0001"+
		"\u0000\u0000\u0000)\u009f\u0001\u0000\u0000\u0000+\u00a1\u0001\u0000\u0000"+
		"\u0000-\u00a3\u0001\u0000\u0000\u0000/\u00a6\u0001\u0000\u0000\u00001"+
		"\u00a8\u0001\u0000\u0000\u00003\u00ab\u0001\u0000\u0000\u00005\u00ae\u0001"+
		"\u0000\u0000\u00007\u00b1\u0001\u0000\u0000\u00009\u00c0\u0001\u0000\u0000"+
		"\u0000;\u00c4\u0001\u0000\u0000\u0000=\u00cd\u0001\u0000\u0000\u0000?"+
		"\u00d1\u0001\u0000\u0000\u0000A\u00d3\u0001\u0000\u0000\u0000CD\u0005"+
		"(\u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005)\u0000\u0000F\u0004"+
		"\u0001\u0000\u0000\u0000GH\u0005{\u0000\u0000H\u0006\u0001\u0000\u0000"+
		"\u0000IJ\u0005}\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005,\u0000"+
		"\u0000LM\u0005 \u0000\u0000M\n\u0001\u0000\u0000\u0000NO\u0005v\u0000"+
		"\u0000OP\u0005o\u0000\u0000PQ\u0005i\u0000\u0000QR\u0005d\u0000\u0000"+
		"R\f\u0001\u0000\u0000\u0000ST\u0005p\u0000\u0000TU\u0005r\u0000\u0000"+
		"UV\u0005i\u0000\u0000VW\u0005n\u0000\u0000WX\u0005c\u0000\u0000XY\u0005"+
		"i\u0000\u0000YZ\u0005p\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005l\u0000"+
		"\u0000\\\u000e\u0001\u0000\u0000\u0000]_\u0007\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000aj\u0001\u0000\u0000\u0000bd\t\u0000\u0000\u0000"+
		"ce\u0007\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000hb\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0010\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mn\u0005^\u0000\u0000n\u0012\u0001\u0000"+
		"\u0000\u0000op\u0005+\u0000\u0000p\u0014\u0001\u0000\u0000\u0000qr\u0005"+
		"*\u0000\u0000r\u0016\u0001\u0000\u0000\u0000st\u0005-\u0000\u0000t\u0018"+
		"\u0001\u0000\u0000\u0000uv\u0005/\u0000\u0000v\u001a\u0001\u0000\u0000"+
		"\u0000wx\u0005=\u0000\u0000x\u001c\u0001\u0000\u0000\u0000yz\u0005f\u0000"+
		"\u0000z{\u0005o\u0000\u0000{|\u0005r\u0000\u0000|\u001e\u0001\u0000\u0000"+
		"\u0000}~\u0005o\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f \u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005a\u0000\u0000\u0081\u0082\u0005n\u0000\u0000"+
		"\u0082\u0083\u0005d\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005t\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086\u0087\u0005"+
		"u\u0000\u0000\u0087\u008e\u0005e\u0000\u0000\u0088\u0089\u0005f\u0000"+
		"\u0000\u0089\u008a\u0005a\u0000\u0000\u008a\u008b\u0005l\u0000\u0000\u008b"+
		"\u008c\u0005s\u0000\u0000\u008c\u008e\u0005e\u0000\u0000\u008d\u0084\u0001"+
		"\u0000\u0000\u0000\u008d\u0088\u0001\u0000\u0000\u0000\u008e$\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090\u0091\u0005f\u0000\u0000"+
		"\u0091&\u0001\u0000\u0000\u0000\u0092\u0093\u0005e\u0000\u0000\u0093\u0094"+
		"\u0005l\u0000\u0000\u0094\u0095\u0005s\u0000\u0000\u0095\u0096\u0005e"+
		"\u0000\u0000\u0096(\u0001\u0000\u0000\u0000\u0097\u0098\u0005i\u0000\u0000"+
		"\u0098\u0099\u0005n\u0000\u0000\u0099\u00a0\u0005t\u0000\u0000\u009a\u009b"+
		"\u0005f\u0000\u0000\u009b\u009c\u0005l\u0000\u0000\u009c\u009d\u0005o"+
		"\u0000\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u00a0\u0005t\u0000\u0000"+
		"\u009f\u0097\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000"+
		"\u00a0*\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005>\u0000\u0000\u00a2,"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005>\u0000\u0000\u00a4\u00a5\u0005"+
		"=\u0000\u0000\u00a5.\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005<\u0000"+
		"\u0000\u00a70\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005<\u0000\u0000\u00a9"+
		"\u00aa\u0005=\u0000\u0000\u00aa2\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"!\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad4\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005=\u0000\u0000\u00af\u00b0\u0005=\u0000\u0000\u00b0"+
		"6\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005c\u0000\u0000\u00b2\u00b3\u0005"+
		"o\u0000\u0000\u00b3\u00b4\u0005n\u0000\u0000\u00b4\u00b5\u0005s\u0000"+
		"\u0000\u00b5\u00b6\u0005o\u0000\u0000\u00b6\u00b7\u0005l\u0000\u0000\u00b7"+
		"\u00b8\u0005e\u0000\u0000\u00b8\u00b9\u0005.\u0000\u0000\u00b9\u00ba\u0005"+
		"p\u0000\u0000\u00ba\u00bb\u0005r\u0000\u0000\u00bb\u00bc\u0005i\u0000"+
		"\u0000\u00bc\u00bd\u0005n\u0000\u0000\u00bd\u00be\u0005t\u0000\u0000\u00be"+
		"8\u0001\u0000\u0000\u0000\u00bf\u00c1\u0007\u0001\u0000\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3:\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0005\"\u0000\u0000\u00c5\u00c7\u0007\u0002"+
		"\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\"\u0000"+
		"\u0000\u00cb<\u0001\u0000\u0000\u0000\u00cc\u00ce\u0007\u0003\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0>\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0004\u0000\u0000\u00d2"+
		"@\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0005\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006 \u0000\u0000\u00d6B\u0001\u0000"+
		"\u0000\u0000\t\u0000`fj\u008d\u009f\u00c2\u00c8\u00cf\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}