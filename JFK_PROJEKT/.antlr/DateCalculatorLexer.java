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
		Dot=1, Add=2, Subtract=3, Slash=4, Separator=5, WhiteSpace=6, NewLine=7, 
		Zero_dwaczt=8, DZIEN=9, MIESIAC=10, ROK=11, MINUTY=12, LICZBA_DNI=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "Dot", "Add", 
		"Subtract", "Slash", "Separator", "WhiteSpace", "NewLine", "Zero_dwaczt", 
		"DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'+'", "'-'", "'/'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dot", "Add", "Subtract", "Slash", "Separator", "WhiteSpace", "NewLine", 
		"Zero_dwaczt", "DZIEN", "MIESIAC", "ROK", "MINUTY", "LICZBA_DNI"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\6\13:\n\13\r\13\16\13;\3\13\3\13\3\f\3\f\6\fB\n\f\r"+
		"\f\16\fC\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\rN\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16V\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17|\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\6\22\u0087\n\22\r\22\16"+
		"\22\u0088\2\2\23\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31"+
		"\n\33\13\35\f\37\r!\16#\17\3\2\b\3\2\62;\3\2\62\66\3\2\63;\3\2\63\64\3"+
		"\2\62\63\3\2\62\67\2\u0099\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3"+
		"\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63"+
		"\3\2\2\2\23\65\3\2\2\2\259\3\2\2\2\27A\3\2\2\2\31M\3\2\2\2\33U\3\2\2\2"+
		"\35{\3\2\2\2\37}\3\2\2\2!\u0082\3\2\2\2#\u0086\3\2\2\2%&\7\"\2\2&\4\3"+
		"\2\2\2\'(\7\13\2\2(\6\3\2\2\2)*\7\f\2\2*\b\3\2\2\2+,\7\17\2\2,\n\3\2\2"+
		"\2-.\7\60\2\2.\f\3\2\2\2/\60\7-\2\2\60\16\3\2\2\2\61\62\7/\2\2\62\20\3"+
		"\2\2\2\63\64\7\61\2\2\64\22\3\2\2\2\65\66\7<\2\2\66\24\3\2\2\2\67:\5\3"+
		"\2\28:\5\5\3\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3"+
		"\2\2\2=>\b\13\2\2>\26\3\2\2\2?B\5\t\5\2@B\5\7\4\2A?\3\2\2\2A@\3\2\2\2"+
		"BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\f\2\2F\30\3\2\2\2GH\7\62"+
		"\2\2HN\t\2\2\2IJ\7\63\2\2JN\t\2\2\2KL\7\64\2\2LN\t\3\2\2MG\3\2\2\2MI\3"+
		"\2\2\2MK\3\2\2\2N\32\3\2\2\2OP\7\62\2\2PV\t\4\2\2QR\t\5\2\2RV\t\2\2\2"+
		"ST\7\65\2\2TV\t\6\2\2UO\3\2\2\2UQ\3\2\2\2US\3\2\2\2V\34\3\2\2\2WX\7U\2"+
		"\2XY\7V\2\2Y|\7[\2\2Z[\7N\2\2[\\\7W\2\2\\|\7V\2\2]^\7O\2\2^_\7C\2\2_|"+
		"\7T\2\2`a\7M\2\2ab\7Y\2\2b|\7K\2\2cd\7O\2\2de\7C\2\2e|\7L\2\2fg\7E\2\2"+
		"gh\7\\\2\2h|\7G\2\2ij\7N\2\2jk\7K\2\2k|\7R\2\2lm\7U\2\2mn\7K\2\2n|\7G"+
		"\2\2op\7Y\2\2pq\7T\2\2q|\7\\\2\2rs\7R\2\2st\7C\2\2t|\7\\\2\2uv\7N\2\2"+
		"vw\7K\2\2w|\7U\2\2xy\7I\2\2yz\7T\2\2z|\7W\2\2{W\3\2\2\2{Z\3\2\2\2{]\3"+
		"\2\2\2{`\3\2\2\2{c\3\2\2\2{f\3\2\2\2{i\3\2\2\2{l\3\2\2\2{o\3\2\2\2{r\3"+
		"\2\2\2{u\3\2\2\2{x\3\2\2\2|\36\3\2\2\2}~\t\2\2\2~\177\t\2\2\2\177\u0080"+
		"\t\2\2\2\u0080\u0081\t\2\2\2\u0081 \3\2\2\2\u0082\u0083\t\7\2\2\u0083"+
		"\u0084\t\2\2\2\u0084\"\3\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089$\3"+
		"\2\2\2\13\29;ACMU{\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}