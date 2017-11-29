// Generated from c:\Users\Karwos\Documents\Visual Studio 2015\Projects\JFK_PROJEKT\JFK_PROJEKT\G4\DateCalculator.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, Add=3, Subtract=4, WhiteSpace=5, NewLine=6, Date=7, Timespan=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"DOT", "FRACTION", "Add", "Subtract", "WhiteSpace", "NewLine", "MIESIAC", 
		"Date", "Timespan"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Add", "Subtract", "WhiteSpace", "NewLine", "Date", 
		"Timespan"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t\62\n\t\f\t\16\t\65"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\6\f?\n\f\r\f\16\f@\3\f\3\f\3\r"+
		"\3\r\6\rG\n\r\r\r\16\rH\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16q\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0091\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00ab\n\20\2\2\21\3\3\5\4\7\2\t\2\13\2\r\2\17\2\21"+
		"\2\23\5\25\6\27\7\31\b\33\2\35\t\37\n\3\2\b\3\2\62;\3\2\63;\3\2\63\64"+
		"\3\2\62\63\3\2\62\67\3\2\62\66\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2"+
		"\17-\3\2\2\2\21/\3\2\2\2\238\3\2\2\2\25:\3\2\2\2\27>\3\2\2\2\31F\3\2\2"+
		"\2\33p\3\2\2\2\35\u0090\3\2\2\2\37\u00aa\3\2\2\2!\"\7*\2\2\"\4\3\2\2\2"+
		"#$\7+\2\2$\6\3\2\2\2%&\7\"\2\2&\b\3\2\2\2\'(\7\13\2\2(\n\3\2\2\2)*\7\f"+
		"\2\2*\f\3\2\2\2+,\7\17\2\2,\16\3\2\2\2-.\7\60\2\2.\20\3\2\2\2/\63\5\17"+
		"\b\2\60\62\t\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\4\63;\2\67\22\3\2\2\289\7-\2\2"+
		"9\24\3\2\2\2:;\7/\2\2;\26\3\2\2\2<?\5\7\4\2=?\5\t\5\2><\3\2\2\2>=\3\2"+
		"\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\f\2\2C\30\3\2\2\2DG\5"+
		"\r\7\2EG\5\13\6\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ"+
		"\3\2\2\2JK\b\r\2\2K\32\3\2\2\2LM\7U\2\2MN\7V\2\2Nq\7[\2\2OP\7N\2\2PQ\7"+
		"W\2\2Qq\7V\2\2RS\7O\2\2ST\7C\2\2Tq\7T\2\2UV\7M\2\2VW\7Y\2\2Wq\7K\2\2X"+
		"Y\7O\2\2YZ\7C\2\2Zq\7L\2\2[\\\7E\2\2\\]\7\\\2\2]q\7G\2\2^_\7N\2\2_`\7"+
		"K\2\2`q\7R\2\2ab\7U\2\2bc\7K\2\2cq\7G\2\2de\7Y\2\2ef\7T\2\2fq\7\\\2\2"+
		"gh\7R\2\2hi\7C\2\2iq\7\\\2\2jk\7N\2\2kl\7K\2\2lq\7U\2\2mn\7I\2\2no\7T"+
		"\2\2oq\7W\2\2pL\3\2\2\2pO\3\2\2\2pR\3\2\2\2pU\3\2\2\2pX\3\2\2\2p[\3\2"+
		"\2\2p^\3\2\2\2pa\3\2\2\2pd\3\2\2\2pg\3\2\2\2pj\3\2\2\2pm\3\2\2\2q\34\3"+
		"\2\2\2rs\7\62\2\2st\t\3\2\2tu\7/\2\2uv\5\33\16\2vw\7/\2\2wx\t\2\2\2xy"+
		"\t\2\2\2yz\t\2\2\2z{\t\2\2\2{\u0091\3\2\2\2|}\t\4\2\2}~\t\2\2\2~\177\7"+
		"/\2\2\177\u0080\5\33\16\2\u0080\u0081\7/\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\u0083\t\2\2\2\u0083\u0084\t\2\2\2\u0084\u0085\t\2\2\2\u0085\u0091\3\2"+
		"\2\2\u0086\u0087\7\65\2\2\u0087\u0088\t\5\2\2\u0088\u0089\7/\2\2\u0089"+
		"\u008a\5\33\16\2\u008a\u008b\7/\2\2\u008b\u008c\t\2\2\2\u008c\u008d\t"+
		"\2\2\2\u008d\u008e\t\2\2\2\u008e\u008f\t\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"r\3\2\2\2\u0090|\3\2\2\2\u0090\u0086\3\2\2\2\u0091\36\3\2\2\2\u0092\u0093"+
		"\7\62\2\2\u0093\u0094\t\2\2\2\u0094\u0095\7<\2\2\u0095\u0096\t\6\2\2\u0096"+
		"\u0097\t\2\2\2\u0097\u0098\7<\2\2\u0098\u0099\t\6\2\2\u0099\u00ab\t\2"+
		"\2\2\u009a\u009b\7\63\2\2\u009b\u009c\t\2\2\2\u009c\u009d\7<\2\2\u009d"+
		"\u009e\t\6\2\2\u009e\u009f\t\2\2\2\u009f\u00a0\7<\2\2\u00a0\u00a1\t\6"+
		"\2\2\u00a1\u00ab\t\2\2\2\u00a2\u00a3\7\64\2\2\u00a3\u00a4\t\7\2\2\u00a4"+
		"\u00a5\7<\2\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7\t\2\2\2\u00a7\u00a8\7<\2"+
		"\2\u00a8\u00a9\t\6\2\2\u00a9\u00ab\t\2\2\2\u00aa\u0092\3\2\2\2\u00aa\u009a"+
		"\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab \3\2\2\2\13\2\63>@FHp\u0090\u00aa\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}