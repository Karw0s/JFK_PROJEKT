//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from DateCalculator.g4 by ANTLR 4.7

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7")]
[System.CLSCompliant(false)]
public partial class DateCalculatorLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, Add=3, Subtract=4, WhiteSpace=5, NewLine=6, Date=7, Timespan=8;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"DOT", "FRACTION", "Add", "Subtract", "WhiteSpace", "NewLine", "MIESIAC", 
		"Date", "Timespan"
	};


	public DateCalculatorLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public DateCalculatorLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'('", "')'", "'+'", "'-'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, "Add", "Subtract", "WhiteSpace", "NewLine", "Date", 
		"Timespan"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "DateCalculator.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static DateCalculatorLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\n', '\xAC', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x3', 
		'\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', 
		'\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', 
		'\a', '\t', '\x32', '\n', '\t', '\f', '\t', '\xE', '\t', '\x35', '\v', 
		'\t', '\x3', '\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', 
		'\x3', '\v', '\x3', '\f', '\x3', '\f', '\x6', '\f', '?', '\n', '\f', '\r', 
		'\f', '\xE', '\f', '@', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', 
		'\r', '\x6', '\r', 'G', '\n', '\r', '\r', '\r', '\xE', '\r', 'H', '\x3', 
		'\r', '\x3', '\r', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', 
		'\x3', '\xE', '\x3', '\xE', '\x5', '\xE', 'q', '\n', '\xE', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x5', '\xF', 
		'\x91', '\n', '\xF', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x5', '\x10', '\xAB', '\n', '\x10', '\x2', '\x2', '\x11', '\x3', 
		'\x3', '\x5', '\x4', '\a', '\x2', '\t', '\x2', '\v', '\x2', '\r', '\x2', 
		'\xF', '\x2', '\x11', '\x2', '\x13', '\x5', '\x15', '\x6', '\x17', '\a', 
		'\x19', '\b', '\x1B', '\x2', '\x1D', '\t', '\x1F', '\n', '\x3', '\x2', 
		'\b', '\x3', '\x2', '\x32', ';', '\x3', '\x2', '\x33', ';', '\x3', '\x2', 
		'\x33', '\x34', '\x3', '\x2', '\x32', '\x33', '\x3', '\x2', '\x32', '\x37', 
		'\x3', '\x2', '\x32', '\x36', '\x2', '\xB8', '\x2', '\x3', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x17', '\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1F', 
		'\x3', '\x2', '\x2', '\x2', '\x3', '!', '\x3', '\x2', '\x2', '\x2', '\x5', 
		'#', '\x3', '\x2', '\x2', '\x2', '\a', '%', '\x3', '\x2', '\x2', '\x2', 
		'\t', '\'', '\x3', '\x2', '\x2', '\x2', '\v', ')', '\x3', '\x2', '\x2', 
		'\x2', '\r', '+', '\x3', '\x2', '\x2', '\x2', '\xF', '-', '\x3', '\x2', 
		'\x2', '\x2', '\x11', '/', '\x3', '\x2', '\x2', '\x2', '\x13', '\x38', 
		'\x3', '\x2', '\x2', '\x2', '\x15', ':', '\x3', '\x2', '\x2', '\x2', '\x17', 
		'>', '\x3', '\x2', '\x2', '\x2', '\x19', '\x46', '\x3', '\x2', '\x2', 
		'\x2', '\x1B', 'p', '\x3', '\x2', '\x2', '\x2', '\x1D', '\x90', '\x3', 
		'\x2', '\x2', '\x2', '\x1F', '\xAA', '\x3', '\x2', '\x2', '\x2', '!', 
		'\"', '\a', '*', '\x2', '\x2', '\"', '\x4', '\x3', '\x2', '\x2', '\x2', 
		'#', '$', '\a', '+', '\x2', '\x2', '$', '\x6', '\x3', '\x2', '\x2', '\x2', 
		'%', '&', '\a', '\"', '\x2', '\x2', '&', '\b', '\x3', '\x2', '\x2', '\x2', 
		'\'', '(', '\a', '\v', '\x2', '\x2', '(', '\n', '\x3', '\x2', '\x2', '\x2', 
		')', '*', '\a', '\f', '\x2', '\x2', '*', '\f', '\x3', '\x2', '\x2', '\x2', 
		'+', ',', '\a', '\xF', '\x2', '\x2', ',', '\xE', '\x3', '\x2', '\x2', 
		'\x2', '-', '.', '\a', '\x30', '\x2', '\x2', '.', '\x10', '\x3', '\x2', 
		'\x2', '\x2', '/', '\x33', '\x5', '\xF', '\b', '\x2', '\x30', '\x32', 
		'\t', '\x2', '\x2', '\x2', '\x31', '\x30', '\x3', '\x2', '\x2', '\x2', 
		'\x32', '\x35', '\x3', '\x2', '\x2', '\x2', '\x33', '\x31', '\x3', '\x2', 
		'\x2', '\x2', '\x33', '\x34', '\x3', '\x2', '\x2', '\x2', '\x34', '\x36', 
		'\x3', '\x2', '\x2', '\x2', '\x35', '\x33', '\x3', '\x2', '\x2', '\x2', 
		'\x36', '\x37', '\x4', '\x33', ';', '\x2', '\x37', '\x12', '\x3', '\x2', 
		'\x2', '\x2', '\x38', '\x39', '\a', '-', '\x2', '\x2', '\x39', '\x14', 
		'\x3', '\x2', '\x2', '\x2', ':', ';', '\a', '/', '\x2', '\x2', ';', '\x16', 
		'\x3', '\x2', '\x2', '\x2', '<', '?', '\x5', '\a', '\x4', '\x2', '=', 
		'?', '\x5', '\t', '\x5', '\x2', '>', '<', '\x3', '\x2', '\x2', '\x2', 
		'>', '=', '\x3', '\x2', '\x2', '\x2', '?', '@', '\x3', '\x2', '\x2', '\x2', 
		'@', '>', '\x3', '\x2', '\x2', '\x2', '@', '\x41', '\x3', '\x2', '\x2', 
		'\x2', '\x41', '\x42', '\x3', '\x2', '\x2', '\x2', '\x42', '\x43', '\b', 
		'\f', '\x2', '\x2', '\x43', '\x18', '\x3', '\x2', '\x2', '\x2', '\x44', 
		'G', '\x5', '\r', '\a', '\x2', '\x45', 'G', '\x5', '\v', '\x6', '\x2', 
		'\x46', '\x44', '\x3', '\x2', '\x2', '\x2', '\x46', '\x45', '\x3', '\x2', 
		'\x2', '\x2', 'G', 'H', '\x3', '\x2', '\x2', '\x2', 'H', '\x46', '\x3', 
		'\x2', '\x2', '\x2', 'H', 'I', '\x3', '\x2', '\x2', '\x2', 'I', 'J', '\x3', 
		'\x2', '\x2', '\x2', 'J', 'K', '\b', '\r', '\x2', '\x2', 'K', '\x1A', 
		'\x3', '\x2', '\x2', '\x2', 'L', 'M', '\a', 'U', '\x2', '\x2', 'M', 'N', 
		'\a', 'V', '\x2', '\x2', 'N', 'q', '\a', '[', '\x2', '\x2', 'O', 'P', 
		'\a', 'N', '\x2', '\x2', 'P', 'Q', '\a', 'W', '\x2', '\x2', 'Q', 'q', 
		'\a', 'V', '\x2', '\x2', 'R', 'S', '\a', 'O', '\x2', '\x2', 'S', 'T', 
		'\a', '\x43', '\x2', '\x2', 'T', 'q', '\a', 'T', '\x2', '\x2', 'U', 'V', 
		'\a', 'M', '\x2', '\x2', 'V', 'W', '\a', 'Y', '\x2', '\x2', 'W', 'q', 
		'\a', 'K', '\x2', '\x2', 'X', 'Y', '\a', 'O', '\x2', '\x2', 'Y', 'Z', 
		'\a', '\x43', '\x2', '\x2', 'Z', 'q', '\a', 'L', '\x2', '\x2', '[', '\\', 
		'\a', '\x45', '\x2', '\x2', '\\', ']', '\a', '\\', '\x2', '\x2', ']', 
		'q', '\a', 'G', '\x2', '\x2', '^', '_', '\a', 'N', '\x2', '\x2', '_', 
		'`', '\a', 'K', '\x2', '\x2', '`', 'q', '\a', 'R', '\x2', '\x2', '\x61', 
		'\x62', '\a', 'U', '\x2', '\x2', '\x62', '\x63', '\a', 'K', '\x2', '\x2', 
		'\x63', 'q', '\a', 'G', '\x2', '\x2', '\x64', '\x65', '\a', 'Y', '\x2', 
		'\x2', '\x65', '\x66', '\a', 'T', '\x2', '\x2', '\x66', 'q', '\a', '\\', 
		'\x2', '\x2', 'g', 'h', '\a', 'R', '\x2', '\x2', 'h', 'i', '\a', '\x43', 
		'\x2', '\x2', 'i', 'q', '\a', '\\', '\x2', '\x2', 'j', 'k', '\a', 'N', 
		'\x2', '\x2', 'k', 'l', '\a', 'K', '\x2', '\x2', 'l', 'q', '\a', 'U', 
		'\x2', '\x2', 'm', 'n', '\a', 'I', '\x2', '\x2', 'n', 'o', '\a', 'T', 
		'\x2', '\x2', 'o', 'q', '\a', 'W', '\x2', '\x2', 'p', 'L', '\x3', '\x2', 
		'\x2', '\x2', 'p', 'O', '\x3', '\x2', '\x2', '\x2', 'p', 'R', '\x3', '\x2', 
		'\x2', '\x2', 'p', 'U', '\x3', '\x2', '\x2', '\x2', 'p', 'X', '\x3', '\x2', 
		'\x2', '\x2', 'p', '[', '\x3', '\x2', '\x2', '\x2', 'p', '^', '\x3', '\x2', 
		'\x2', '\x2', 'p', '\x61', '\x3', '\x2', '\x2', '\x2', 'p', '\x64', '\x3', 
		'\x2', '\x2', '\x2', 'p', 'g', '\x3', '\x2', '\x2', '\x2', 'p', 'j', '\x3', 
		'\x2', '\x2', '\x2', 'p', 'm', '\x3', '\x2', '\x2', '\x2', 'q', '\x1C', 
		'\x3', '\x2', '\x2', '\x2', 'r', 's', '\a', '\x32', '\x2', '\x2', 's', 
		't', '\t', '\x3', '\x2', '\x2', 't', 'u', '\a', '/', '\x2', '\x2', 'u', 
		'v', '\x5', '\x1B', '\xE', '\x2', 'v', 'w', '\a', '/', '\x2', '\x2', 'w', 
		'x', '\t', '\x2', '\x2', '\x2', 'x', 'y', '\t', '\x2', '\x2', '\x2', 'y', 
		'z', '\t', '\x2', '\x2', '\x2', 'z', '{', '\t', '\x2', '\x2', '\x2', '{', 
		'\x91', '\x3', '\x2', '\x2', '\x2', '|', '}', '\t', '\x4', '\x2', '\x2', 
		'}', '~', '\t', '\x2', '\x2', '\x2', '~', '\x7F', '\a', '/', '\x2', '\x2', 
		'\x7F', '\x80', '\x5', '\x1B', '\xE', '\x2', '\x80', '\x81', '\a', '/', 
		'\x2', '\x2', '\x81', '\x82', '\t', '\x2', '\x2', '\x2', '\x82', '\x83', 
		'\t', '\x2', '\x2', '\x2', '\x83', '\x84', '\t', '\x2', '\x2', '\x2', 
		'\x84', '\x85', '\t', '\x2', '\x2', '\x2', '\x85', '\x91', '\x3', '\x2', 
		'\x2', '\x2', '\x86', '\x87', '\a', '\x35', '\x2', '\x2', '\x87', '\x88', 
		'\t', '\x5', '\x2', '\x2', '\x88', '\x89', '\a', '/', '\x2', '\x2', '\x89', 
		'\x8A', '\x5', '\x1B', '\xE', '\x2', '\x8A', '\x8B', '\a', '/', '\x2', 
		'\x2', '\x8B', '\x8C', '\t', '\x2', '\x2', '\x2', '\x8C', '\x8D', '\t', 
		'\x2', '\x2', '\x2', '\x8D', '\x8E', '\t', '\x2', '\x2', '\x2', '\x8E', 
		'\x8F', '\t', '\x2', '\x2', '\x2', '\x8F', '\x91', '\x3', '\x2', '\x2', 
		'\x2', '\x90', 'r', '\x3', '\x2', '\x2', '\x2', '\x90', '|', '\x3', '\x2', 
		'\x2', '\x2', '\x90', '\x86', '\x3', '\x2', '\x2', '\x2', '\x91', '\x1E', 
		'\x3', '\x2', '\x2', '\x2', '\x92', '\x93', '\a', '\x32', '\x2', '\x2', 
		'\x93', '\x94', '\t', '\x2', '\x2', '\x2', '\x94', '\x95', '\a', '<', 
		'\x2', '\x2', '\x95', '\x96', '\t', '\x6', '\x2', '\x2', '\x96', '\x97', 
		'\t', '\x2', '\x2', '\x2', '\x97', '\x98', '\a', '<', '\x2', '\x2', '\x98', 
		'\x99', '\t', '\x6', '\x2', '\x2', '\x99', '\xAB', '\t', '\x2', '\x2', 
		'\x2', '\x9A', '\x9B', '\a', '\x33', '\x2', '\x2', '\x9B', '\x9C', '\t', 
		'\x2', '\x2', '\x2', '\x9C', '\x9D', '\a', '<', '\x2', '\x2', '\x9D', 
		'\x9E', '\t', '\x6', '\x2', '\x2', '\x9E', '\x9F', '\t', '\x2', '\x2', 
		'\x2', '\x9F', '\xA0', '\a', '<', '\x2', '\x2', '\xA0', '\xA1', '\t', 
		'\x6', '\x2', '\x2', '\xA1', '\xAB', '\t', '\x2', '\x2', '\x2', '\xA2', 
		'\xA3', '\a', '\x34', '\x2', '\x2', '\xA3', '\xA4', '\t', '\a', '\x2', 
		'\x2', '\xA4', '\xA5', '\a', '<', '\x2', '\x2', '\xA5', '\xA6', '\t', 
		'\x6', '\x2', '\x2', '\xA6', '\xA7', '\t', '\x2', '\x2', '\x2', '\xA7', 
		'\xA8', '\a', '<', '\x2', '\x2', '\xA8', '\xA9', '\t', '\x6', '\x2', '\x2', 
		'\xA9', '\xAB', '\t', '\x2', '\x2', '\x2', '\xAA', '\x92', '\x3', '\x2', 
		'\x2', '\x2', '\xAA', '\x9A', '\x3', '\x2', '\x2', '\x2', '\xAA', '\xA2', 
		'\x3', '\x2', '\x2', '\x2', '\xAB', ' ', '\x3', '\x2', '\x2', '\x2', '\v', 
		'\x2', '\x33', '>', '@', '\x46', 'H', 'p', '\x90', '\xAA', '\x3', '\b', 
		'\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}