// Generated from gc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INT=4, FLOAT=5, MUL=6, DIV=7, ADD=8, SUB=9, EXP=10, 
		WHITESPACE=11, NEWLINE=12, ASSIGN=13, BLOCK_START=14, BLOCK_END=15, IF=16, 
		ELSE=17, WHILE=18, AND=19, OR=20, NOT=21, PAREN_OPEN=22, PAREN_CLOSE=23, 
		STRING=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "INT", "FLOAT", "MUL", "DIV", "ADD", "SUB", "EXP", 
		"WHITESPACE", "NEWLINE", "ASSIGN", "BLOCK_START", "BLOCK_END", "IF", "ELSE", 
		"WHILE", "AND", "OR", "NOT", "PAREN_OPEN", "PAREN_CLOSE", "STRING", "DIGIT"
	};


	public gcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\6\5F\n\5\r\5\16\5G\3\6\6\6K\n\6\r\6\16\6L\3\6\3\6\7\6Q\n\6"+
		"\f\6\16\6T\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u008b"+
		"\n\31\f\31\16\31\u008e\13\31\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\2\3\2\6\4\2\13\13\"\"\4\2C\\c|\5\2\62;C\\c|\3\2"+
		"\62;\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\3\65\3\2\2\2\5<\3\2\2\2\7>\3\2\2\2\tE\3\2\2\2"+
		"\13J\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2"+
		"\2\27_\3\2\2\2\31c\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37i\3\2\2\2!k\3\2\2"+
		"\2#n\3\2\2\2%s\3\2\2\2\'y\3\2\2\2)}\3\2\2\2+\u0080\3\2\2\2-\u0084\3\2"+
		"\2\2/\u0086\3\2\2\2\61\u0088\3\2\2\2\63\u008f\3\2\2\2\65\66\7u\2\2\66"+
		"\67\7g\2\2\678\7e\2\289\7q\2\29:\7p\2\2:;\7f\2\2;\4\3\2\2\2<=\7.\2\2="+
		"\6\3\2\2\2>?\7h\2\2?@\7k\2\2@A\7t\2\2AB\7u\2\2BC\7v\2\2C\b\3\2\2\2DF\5"+
		"\63\32\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\n\3\2\2\2IK\5\63\32"+
		"\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NR\7\60\2\2OQ\5\63"+
		"\32\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\f\3\2\2\2TR\3\2\2\2UV\7"+
		",\2\2V\16\3\2\2\2WX\7\61\2\2X\20\3\2\2\2YZ\7-\2\2Z\22\3\2\2\2[\\\7/\2"+
		"\2\\\24\3\2\2\2]^\7`\2\2^\26\3\2\2\2_`\t\2\2\2`a\3\2\2\2ab\b\f\2\2b\30"+
		"\3\2\2\2cd\7\f\2\2d\32\3\2\2\2ef\7?\2\2f\34\3\2\2\2gh\7}\2\2h\36\3\2\2"+
		"\2ij\7\177\2\2j \3\2\2\2kl\7k\2\2lm\7h\2\2m\"\3\2\2\2no\7g\2\2op\7n\2"+
		"\2pq\7u\2\2qr\7g\2\2r$\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7"+
		"g\2\2x&\3\2\2\2yz\7c\2\2z{\7p\2\2{|\7f\2\2|(\3\2\2\2}~\7q\2\2~\177\7t"+
		"\2\2\177*\3\2\2\2\u0080\u0081\7p\2\2\u0081\u0082\7q\2\2\u0082\u0083\7"+
		"v\2\2\u0083,\3\2\2\2\u0084\u0085\7*\2\2\u0085.\3\2\2\2\u0086\u0087\7+"+
		"\2\2\u0087\60\3\2\2\2\u0088\u008c\t\3\2\2\u0089\u008b\t\4\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\62\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\t\5\2\2\u0090\64\3\2\2\2\7"+
		"\2GLR\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}