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
		T__0=1, T__1=2, Dot=3, Add=4, Subtract=5, Slash=6, Separator=7, WhiteSpace=8, 
		NewLine=9, Zero_dwaczt=10, DZIEN=11, MIESIAC=12, ROK=13, MINUTY=14, LICZBA_DNI=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"Dot", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", "NewLine", 
		"Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'.'", "'+'", "'-'", "'/'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Dot", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\6\rB\n\r\r\r\16"+
		"\rC\3\r\3\r\3\16\3\16\6\16J\n\16\r\16\16\16K\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17V\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20^\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0084\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\6\24\u008f\n\24\r\24\16\24\u0090\2\2\25"+
		"\3\3\5\4\7\2\t\2\13\2\r\2\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37"+
		"\r!\16#\17%\20\'\21\3\2\b\3\2\62;\3\2\62\66\3\2\63;\3\2\63\64\3\2\62\63"+
		"\3\2\62\67\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3"+
		"\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17"+
		"\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2\31A\3\2"+
		"\2\2\33I\3\2\2\2\35U\3\2\2\2\37]\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2"+
		"%\u008a\3\2\2\2\'\u008e\3\2\2\2)*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2"+
		"\2-.\7\"\2\2.\b\3\2\2\2/\60\7\13\2\2\60\n\3\2\2\2\61\62\7\f\2\2\62\f\3"+
		"\2\2\2\63\64\7\17\2\2\64\16\3\2\2\2\65\66\7\60\2\2\66\20\3\2\2\2\678\7"+
		"-\2\28\22\3\2\2\29:\7/\2\2:\24\3\2\2\2;<\7\61\2\2<\26\3\2\2\2=>\7<\2\2"+
		">\30\3\2\2\2?B\5\7\4\2@B\5\t\5\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EF\b\r\2\2F\32\3\2\2\2GJ\5\r\7\2HJ\5\13\6\2IG\3"+
		"\2\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\16\2\2N\34"+
		"\3\2\2\2OP\7\62\2\2PV\t\2\2\2QR\7\63\2\2RV\t\2\2\2ST\7\64\2\2TV\t\3\2"+
		"\2UO\3\2\2\2UQ\3\2\2\2US\3\2\2\2V\36\3\2\2\2WX\7\62\2\2X^\t\4\2\2YZ\t"+
		"\5\2\2Z^\t\2\2\2[\\\7\65\2\2\\^\t\6\2\2]W\3\2\2\2]Y\3\2\2\2][\3\2\2\2"+
		"^ \3\2\2\2_`\7U\2\2`a\7V\2\2a\u0084\7[\2\2bc\7N\2\2cd\7W\2\2d\u0084\7"+
		"V\2\2ef\7O\2\2fg\7C\2\2g\u0084\7T\2\2hi\7M\2\2ij\7Y\2\2j\u0084\7K\2\2"+
		"kl\7O\2\2lm\7C\2\2m\u0084\7L\2\2no\7E\2\2op\7\\\2\2p\u0084\7G\2\2qr\7"+
		"N\2\2rs\7K\2\2s\u0084\7R\2\2tu\7U\2\2uv\7K\2\2v\u0084\7G\2\2wx\7Y\2\2"+
		"xy\7T\2\2y\u0084\7\\\2\2z{\7R\2\2{|\7C\2\2|\u0084\7\\\2\2}~\7N\2\2~\177"+
		"\7K\2\2\177\u0084\7U\2\2\u0080\u0081\7I\2\2\u0081\u0082\7T\2\2\u0082\u0084"+
		"\7W\2\2\u0083_\3\2\2\2\u0083b\3\2\2\2\u0083e\3\2\2\2\u0083h\3\2\2\2\u0083"+
		"k\3\2\2\2\u0083n\3\2\2\2\u0083q\3\2\2\2\u0083t\3\2\2\2\u0083w\3\2\2\2"+
		"\u0083z\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\t\2\2\2\u0086\u0087\t\2\2\2\u0087\u0088\t\2\2\2\u0088\u0089\t\2"+
		"\2\2\u0089$\3\2\2\2\u008a\u008b\t\7\2\2\u008b\u008c\t\2\2\2\u008c&\3\2"+
		"\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091(\3\2\2\2\13\2ACIKU]\u0083\u0090"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}