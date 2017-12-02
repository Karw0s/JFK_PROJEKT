// Generated from c:\Users\Karwos\Documents\Visual Studio 2015\Projects\JFK_PROJEKT\JFK_PROJEKT\DateCalculator.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateCalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DOT=3, Add=4, Subtract=5, Slash=6, Separator=7, WhiteSpace=8, 
		NewLine=9, Zero_dwaczt=10, DZIEN=11, MIESIAC=12, ROK=13, MINUTY=14, LICZBA_DNI=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"DOT", "FRACTION", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", 
		"NewLine", "Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'.'", "'+'", "'-'", "'/'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DOT", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", 
		"NewLine", "Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
	};
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


	public DateCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DateCalculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t<\n\t\f\t\16\t?\13\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\6\16M\n\16\r\16\16\16N\3\16\3\16"+
		"\3\17\3\17\6\17U\n\17\r\17\16\17V\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21i\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u008f\n\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\6\25\u009a\n\25\r\25\16\25\u009b\2\2\26\3\3\5\4\7\2\t"+
		"\2\13\2\r\2\17\5\21\2\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'"+
		"\20)\21\3\2\b\3\2\62;\3\2\62\66\3\2\63;\3\2\63\64\3\2\62\63\3\2\62\67"+
		"\2\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3"+
		"\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2"+
		"\2\219\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33L\3\2"+
		"\2\2\35T\3\2\2\2\37`\3\2\2\2!h\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'"+
		"\u0095\3\2\2\2)\u0099\3\2\2\2+,\7*\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2"+
		"/\60\7\"\2\2\60\b\3\2\2\2\61\62\7\13\2\2\62\n\3\2\2\2\63\64\7\f\2\2\64"+
		"\f\3\2\2\2\65\66\7\17\2\2\66\16\3\2\2\2\678\7\60\2\28\20\3\2\2\29=\5\17"+
		"\b\2:<\t\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2"+
		"\2\2@A\4\63;\2A\22\3\2\2\2BC\7-\2\2C\24\3\2\2\2DE\7/\2\2E\26\3\2\2\2F"+
		"G\7\61\2\2G\30\3\2\2\2HI\7<\2\2I\32\3\2\2\2JM\5\7\4\2KM\5\t\5\2LJ\3\2"+
		"\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\16\2\2Q\34"+
		"\3\2\2\2RU\5\r\7\2SU\5\13\6\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WX\3\2\2\2XY\b\17\2\2Y\36\3\2\2\2Z[\7\62\2\2[a\t\2\2\2\\]\7"+
		"\63\2\2]a\t\2\2\2^_\7\64\2\2_a\t\3\2\2`Z\3\2\2\2`\\\3\2\2\2`^\3\2\2\2"+
		"a \3\2\2\2bc\7\62\2\2ci\t\4\2\2de\t\5\2\2ei\t\2\2\2fg\7\65\2\2gi\t\6\2"+
		"\2hb\3\2\2\2hd\3\2\2\2hf\3\2\2\2i\"\3\2\2\2jk\7U\2\2kl\7V\2\2l\u008f\7"+
		"[\2\2mn\7N\2\2no\7W\2\2o\u008f\7V\2\2pq\7O\2\2qr\7C\2\2r\u008f\7T\2\2"+
		"st\7M\2\2tu\7Y\2\2u\u008f\7K\2\2vw\7O\2\2wx\7C\2\2x\u008f\7L\2\2yz\7E"+
		"\2\2z{\7\\\2\2{\u008f\7G\2\2|}\7N\2\2}~\7K\2\2~\u008f\7R\2\2\177\u0080"+
		"\7U\2\2\u0080\u0081\7K\2\2\u0081\u008f\7G\2\2\u0082\u0083\7Y\2\2\u0083"+
		"\u0084\7T\2\2\u0084\u008f\7\\\2\2\u0085\u0086\7R\2\2\u0086\u0087\7C\2"+
		"\2\u0087\u008f\7\\\2\2\u0088\u0089\7N\2\2\u0089\u008a\7K\2\2\u008a\u008f"+
		"\7U\2\2\u008b\u008c\7I\2\2\u008c\u008d\7T\2\2\u008d\u008f\7W\2\2\u008e"+
		"j\3\2\2\2\u008em\3\2\2\2\u008ep\3\2\2\2\u008es\3\2\2\2\u008ev\3\2\2\2"+
		"\u008ey\3\2\2\2\u008e|\3\2\2\2\u008e\177\3\2\2\2\u008e\u0082\3\2\2\2\u008e"+
		"\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f$\3\2\2\2"+
		"\u0090\u0091\t\2\2\2\u0091\u0092\t\2\2\2\u0092\u0093\t\2\2\2\u0093\u0094"+
		"\t\2\2\2\u0094&\3\2\2\2\u0095\u0096\t\7\2\2\u0096\u0097\t\2\2\2\u0097"+
		"(\3\2\2\2\u0098\u009a\t\2\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c*\3\2\2\2\f\2=LNTV`h\u008e"+
		"\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}