// Generated from gc.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, INT=4, FLOAT=5, MUL=6, DIV=7, ADD=8, SUB=9, EXP=10, 
		WHITESPACE=11, NEWLINE=12, ASSIGN=13, BLOCK_START=14, BLOCK_END=15, IF=16, 
		ELSE=17, WHILE=18, AND=19, OR=20, NOT=21, PAREN_OPEN=22, PAREN_CLOSE=23, 
		STRING=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'second'", "','", "'first'", "INT", "FLOAT", "'*'", "'/'", 
		"'+'", "'-'", "'^'", "WHITESPACE", "'\n'", "'='", "'{'", "'}'", "'if'", 
		"'else'", "'while'", "'and'", "'or'", "'not'", "'('", "')'", "STRING"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_lvalue = 3, 
		RULE_expression = 4;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "lvalue", "expression"
	};

	@Override
	public String getGrammarFileName() { return "gc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(gcParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(gcParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); statement();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(13); match(NEWLINE);
				setState(14); statement();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmpContext extends StatementContext {
		public EmpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public TerminalNode ASSIGN() { return getToken(gcParser.ASSIGN, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20); lvalue();
				setState(21); match(ASSIGN);
				setState(22); expression();
				}
				break;
			case 2:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24); expression();
				}
				break;
			case 3:
				_localctx = new EmpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gcParser.STRING, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SecondContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SecondContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitSecond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(gcParser.STRING, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FirstContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(gcParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PairContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gcListener ) ((gcListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gcVisitor ) return ((gcVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case PAREN_OPEN:
				_localctx = new PairContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(PAREN_OPEN);
				setState(31); expression();
				setState(32); match(T__1);
				setState(33); expression();
				setState(34); match(PAREN_CLOSE);
				}
				break;
			case STRING:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(STRING);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37); match(INT);
				}
				break;
			case T__0:
				_localctx = new FirstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38); match(T__0);
				setState(39); match(PAREN_OPEN);
				setState(40); expression();
				setState(41); match(PAREN_CLOSE);
				}
				break;
			case T__2:
				_localctx = new SecondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(43); match(T__2);
				setState(44); match(PAREN_OPEN);
				setState(45); expression();
				setState(46); match(PAREN_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\35\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\6\2\2"+
		"\7\2\4\6\b\n\2\2\66\2\f\3\2\2\2\4\16\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2"+
		"\n\62\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\23\5\6\4\2\17\20\7\16\2\2\20"+
		"\22\5\6\4\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24"+
		"\5\3\2\2\2\25\23\3\2\2\2\26\27\5\b\5\2\27\30\7\17\2\2\30\31\5\n\6\2\31"+
		"\35\3\2\2\2\32\35\5\n\6\2\33\35\3\2\2\2\34\26\3\2\2\2\34\32\3\2\2\2\34"+
		"\33\3\2\2\2\35\7\3\2\2\2\36\37\7\32\2\2\37\t\3\2\2\2 !\7\30\2\2!\"\5\n"+
		"\6\2\"#\7\4\2\2#$\5\n\6\2$%\7\31\2\2%\63\3\2\2\2&\63\7\32\2\2\'\63\7\6"+
		"\2\2()\7\5\2\2)*\7\30\2\2*+\5\n\6\2+,\7\31\2\2,\63\3\2\2\2-.\7\3\2\2."+
		"/\7\30\2\2/\60\5\n\6\2\60\61\7\31\2\2\61\63\3\2\2\2\62 \3\2\2\2\62&\3"+
		"\2\2\2\62\'\3\2\2\2\62(\3\2\2\2\62-\3\2\2\2\63\13\3\2\2\2\5\23\34\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}