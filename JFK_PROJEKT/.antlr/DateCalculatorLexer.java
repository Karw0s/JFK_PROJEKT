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
		NewLine=9, Zero_dwaczt=10, DZIEN=11, MIESIAC=12, ROK=13, MINUTY=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"DOT", "FRACTION", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", 
		"NewLine", "Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'.'", "'+'", "'-'", "'/'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DOT", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", 
		"NewLine", "Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\7\t:\n\t\f\t\16\t=\13\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\6\16K\n\16\r\16\16\16L\3\16\3\16\3\17\3\17"+
		"\6\17S\n\17\r\17\16\17T\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20_"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21g\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u008d\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\2\2\25\3\3\5\4\7\2\t\2\13\2\r\2\17\5\21\2\23\6\25\7\27\b\31\t\33\n\35"+
		"\13\37\f!\r#\16%\17\'\20\3\2\b\3\2\62;\3\2\62\66\3\2\63;\3\2\63\64\3\2"+
		"\62\63\3\2\62\67\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\17\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2"+
		"\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2"+
		"\2\2\21\67\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27D\3\2\2\2\31F\3\2\2\2\33"+
		"J\3\2\2\2\35R\3\2\2\2\37^\3\2\2\2!f\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2"+
		"\2\2\'\u0093\3\2\2\2)*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7\"\2\2"+
		".\b\3\2\2\2/\60\7\13\2\2\60\n\3\2\2\2\61\62\7\f\2\2\62\f\3\2\2\2\63\64"+
		"\7\17\2\2\64\16\3\2\2\2\65\66\7\60\2\2\66\20\3\2\2\2\67;\5\17\b\28:\t"+
		"\2\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\4"+
		"\63;\2?\22\3\2\2\2@A\7-\2\2A\24\3\2\2\2BC\7/\2\2C\26\3\2\2\2DE\7\61\2"+
		"\2E\30\3\2\2\2FG\7<\2\2G\32\3\2\2\2HK\5\7\4\2IK\5\t\5\2JH\3\2\2\2JI\3"+
		"\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\16\2\2O\34\3\2\2\2"+
		"PS\5\r\7\2QS\5\13\6\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2UV\3\2\2\2VW\b\17\2\2W\36\3\2\2\2XY\7\62\2\2Y_\t\2\2\2Z[\7\63\2\2[_"+
		"\t\2\2\2\\]\7\64\2\2]_\t\3\2\2^X\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_ \3\2\2"+
		"\2`a\7\62\2\2ag\t\4\2\2bc\t\5\2\2cg\t\2\2\2de\7\65\2\2eg\t\6\2\2f`\3\2"+
		"\2\2fb\3\2\2\2fd\3\2\2\2g\"\3\2\2\2hi\7U\2\2ij\7V\2\2j\u008d\7[\2\2kl"+
		"\7N\2\2lm\7W\2\2m\u008d\7V\2\2no\7O\2\2op\7C\2\2p\u008d\7T\2\2qr\7M\2"+
		"\2rs\7Y\2\2s\u008d\7K\2\2tu\7O\2\2uv\7C\2\2v\u008d\7L\2\2wx\7E\2\2xy\7"+
		"\\\2\2y\u008d\7G\2\2z{\7N\2\2{|\7K\2\2|\u008d\7R\2\2}~\7U\2\2~\177\7K"+
		"\2\2\177\u008d\7G\2\2\u0080\u0081\7Y\2\2\u0081\u0082\7T\2\2\u0082\u008d"+
		"\7\\\2\2\u0083\u0084\7R\2\2\u0084\u0085\7C\2\2\u0085\u008d\7\\\2\2\u0086"+
		"\u0087\7N\2\2\u0087\u0088\7K\2\2\u0088\u008d\7U\2\2\u0089\u008a\7I\2\2"+
		"\u008a\u008b\7T\2\2\u008b\u008d\7W\2\2\u008ch\3\2\2\2\u008ck\3\2\2\2\u008c"+
		"n\3\2\2\2\u008cq\3\2\2\2\u008ct\3\2\2\2\u008cw\3\2\2\2\u008cz\3\2\2\2"+
		"\u008c}\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0086\3"+
		"\2\2\2\u008c\u0089\3\2\2\2\u008d$\3\2\2\2\u008e\u008f\t\2\2\2\u008f\u0090"+
		"\t\2\2\2\u0090\u0091\t\2\2\2\u0091\u0092\t\2\2\2\u0092&\3\2\2\2\u0093"+
		"\u0094\t\7\2\2\u0094\u0095\t\2\2\2\u0095(\3\2\2\2\13\2;JLRT^f\u008c\3"+
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