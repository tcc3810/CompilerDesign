// Generated from Cactus.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CactusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, ASSIGN=2, BEGIN=3, END=4, VAR=5, SET=6, IF=7, THEN=8, ENDIF=9, 
		ELSE=10, WHILE=11, DO=12, ENDWHILE=13, READ=14, WRITE=15, EXIT=16, OR=17, 
		AND=18, NOT=19, EQUAL=20, INSIDE=21, MORETHAN=22, MORETHANEQUAL=23, LESSTHAN=24, 
		LESSTHANEQUAL=25, ADD=26, MINUS=27, MULTIPLICATION=28, DIVISION=29, MOD=30, 
		INTCONST=31, LEFTBRACKET=32, RIGHTBRACKET=33, ID=34, WHITESPACE=35, COMMENT=36;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_declarations_E = 2, RULE_statements = 3, 
		RULE_statements_E = 4, RULE_statement = 5, RULE_booleanExpression = 6, 
		RULE_booleanExpression_E = 7, RULE_booleanTerm = 8, RULE_booleanTerm_E = 9, 
		RULE_booleanFactor = 10, RULE_relationExpression = 11, RULE_arithmeticExpression = 12, 
		RULE_arithmeticExpression_E = 13, RULE_arithmeticTerm = 14, RULE_arithmeticTerm_E = 15, 
		RULE_arithmeticFactor = 16, RULE_primaryExpression = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "declarations_E", "statements", "statements_E", 
			"statement", "booleanExpression", "booleanExpression_E", "booleanTerm", 
			"booleanTerm_E", "booleanFactor", "relationExpression", "arithmeticExpression", 
			"arithmeticExpression_E", "arithmeticTerm", "arithmeticTerm_E", "arithmeticFactor", 
			"primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Program'", "'='", "'Begin'", "'End'", "'Var'", "'Set'", "'If'", 
			"'Then'", "'EndIf'", "'Else'", "'While'", "'Do'", "'EndWhile'", "'Read'", 
			"'Write'", "'Exit'", "'Or'", "'And'", "'Not'", "'=='", "'<>'", "'>'", 
			"'>='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "ASSIGN", "BEGIN", "END", "VAR", "SET", "IF", "THEN", 
			"ENDIF", "ELSE", "WHILE", "DO", "ENDWHILE", "READ", "WRITE", "EXIT", 
			"OR", "AND", "NOT", "EQUAL", "INSIDE", "MORETHAN", "MORETHANEQUAL", "LESSTHAN", 
			"LESSTHANEQUAL", "ADD", "MINUS", "MULTIPLICATION", "DIVISION", "MOD", 
			"INTCONST", "LEFTBRACKET", "RIGHTBRACKET", "ID", "WHITESPACE", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Cactus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CactusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(CactusParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(CactusParser.BEGIN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(CactusParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(PROGRAM);
			setState(37);
			match(ID);
			setState(38);
			match(BEGIN);

					System.out.println("\t.data");
				
			setState(40);
			declarations();

					System.out.println("\t.text");
					System.out.println("main:");
				
			setState(42);
			statements(0 , 1);
			setState(43);
			match(END);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public Declarations_EContext declarations_E() {
			return getRuleContext(Declarations_EContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			declarations_E();
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

	public static class Declarations_EContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode VAR() { return getToken(CactusParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public Declarations_EContext declarations_E() {
			return getRuleContext(Declarations_EContext.class,0);
		}
		public Declarations_EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterDeclarations_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitDeclarations_E(this);
		}
	}

	public final Declarations_EContext declarations_E() throws RecognitionException {
		Declarations_EContext _localctx = new Declarations_EContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations_E);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(VAR);
				setState(48);
				((Declarations_EContext)_localctx).ID = match(ID);
				 
						System.out.println((((Declarations_EContext)_localctx).ID!=null?((Declarations_EContext)_localctx).ID.getText():null) + ":\t.word\t0");
					
				setState(50);
				declarations_E();
				}
				break;
			case END:
			case SET:
			case IF:
			case WHILE:
			case READ:
			case WRITE:
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementsContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Statements_EContext statements_E() {
			return getRuleContext(Statements_EContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{

					((StatementsContext)_localctx).nreg =  _localctx.reg;
					((StatementsContext)_localctx).nlabel =  _localctx.label;
				
			setState(55);
			statements_E(_localctx.reg , _localctx.label);
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

	public static class Statements_EContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statements_EContext statements_E() {
			return getRuleContext(Statements_EContext.class,0);
		}
		public Statements_EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statements_EContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatements_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatements_E(this);
		}
	}

	public final Statements_EContext statements_E(int reg,int label) throws RecognitionException {
		Statements_EContext _localctx = new Statements_EContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_statements_E);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case IF:
			case WHILE:
			case READ:
			case WRITE:
			case EXIT:
				enterOuterAlt(_localctx, 1);
				{

						((Statements_EContext)_localctx).nreg =  _localctx.reg;
						((Statements_EContext)_localctx).nlabel =  _localctx.label;
					
				setState(58);
				((Statements_EContext)_localctx).statement = statement(_localctx.reg , _localctx.label);

						((Statements_EContext)_localctx).label =  ((Statements_EContext)_localctx).statement.nlabel;
					
				setState(60);
				statements_E(_localctx.reg , _localctx.label);
				}
				break;
			case END:
			case ENDIF:
			case ELSE:
			case ENDWHILE:
				enterOuterAlt(_localctx, 2);
				{

						((Statements_EContext)_localctx).nreg =  _localctx.reg;
						((Statements_EContext)_localctx).nlabel =  _localctx.label;
					
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

	public static class StatementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public ArithmeticExpressionContext arithmeticExpression;
		public BooleanExpressionContext booleanExpression;
		public StatementsContext statements;
		public TerminalNode SET() { return getToken(CactusParser.SET, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CactusParser.ASSIGN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(CactusParser.IF, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CactusParser.THEN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(CactusParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(CactusParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CactusParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CactusParser.DO, 0); }
		public TerminalNode ENDWHILE() { return getToken(CactusParser.ENDWHILE, 0); }
		public TerminalNode READ() { return getToken(CactusParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(CactusParser.WRITE, 0); }
		public TerminalNode EXIT() { return getToken(CactusParser.EXIT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{

						((StatementContext)_localctx).nreg =  _localctx.reg;
					
				setState(66);
				match(SET);
				setState(67);
				((StatementContext)_localctx).ID = match(ID);
				setState(68);
				match(ASSIGN);
				setState(69);
				((StatementContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((StatementContext)_localctx).reg =  ((StatementContext)_localctx).arithmeticExpression.nreg;
						System.out.println("\tla\t$t" + (_localctx.reg) + ",\t" + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
						System.out.println("\tsw\t$t" + (_localctx.reg - 1) + ",\t0($t" + (_localctx.reg) + ")");
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{

						((StatementContext)_localctx).nreg =  _localctx.reg;
						int t = _localctx.label++;
						int f = _localctx.label++;
						int end = _localctx.label++;
					
				setState(73);
				match(IF);
				setState(74);
				((StatementContext)_localctx).booleanExpression = booleanExpression(_localctx.reg , _localctx.label , t , f);

						System.out.println("L" + t + ":");
						((StatementContext)_localctx).label =  ((StatementContext)_localctx).booleanExpression.nlabel;
					
				setState(76);
				match(THEN);
				setState(77);
				((StatementContext)_localctx).statements = statements(_localctx.reg , _localctx.label);
				setState(78);
				match(ENDIF);

						System.out.println("L" + f + ":");
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).statements.nlabel;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{

						((StatementContext)_localctx).nreg =  _localctx.reg;
						int t = _localctx.label++;
						int f = _localctx.label++;
						int end = _localctx.label++;
					
				setState(82);
				match(IF);
				setState(83);
				((StatementContext)_localctx).booleanExpression = booleanExpression(_localctx.reg , _localctx.label , t , f);

						System.out.println("L" + t + ":");
						((StatementContext)_localctx).label =  ((StatementContext)_localctx).booleanExpression.nlabel;
					
				setState(85);
				match(THEN);
				setState(86);
				((StatementContext)_localctx).statements = statements(_localctx.reg , _localctx.label);

						System.out.println("\tb\tL" + end);
						System.out.println("L" + f + ":");
						((StatementContext)_localctx).label =  ((StatementContext)_localctx).statements.nlabel;
					
				setState(88);
				match(ELSE);
				setState(89);
				((StatementContext)_localctx).statements = statements(_localctx.reg , _localctx.label);
				setState(90);
				match(ENDIF);

						System.out.println("L" + end + ":");
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).statements.nlabel;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{

						((StatementContext)_localctx).nreg =  _localctx.reg;
						int begin = _localctx.label++;
						int t = _localctx.label++;
						int f = _localctx.label++;
						System.out.println("L" + begin + ":");
					
				setState(94);
				match(WHILE);
				setState(95);
				((StatementContext)_localctx).booleanExpression = booleanExpression(_localctx.reg , _localctx.label , t , f);

						System.out.println("L" + t + ":");
						((StatementContext)_localctx).label =  ((StatementContext)_localctx).booleanExpression.nlabel;
					
				setState(97);
				match(DO);
				setState(98);
				((StatementContext)_localctx).statements = statements(_localctx.reg , _localctx.label);
				setState(99);
				match(ENDWHILE);

						System.out.println("\tb\tL" + begin);
						System.out.println("L" + f + ":");
						((StatementContext)_localctx).nlabel =  ((StatementContext)_localctx).statements.nlabel;
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(READ);
				setState(103);
				((StatementContext)_localctx).ID = match(ID);

						System.out.println("\tli\t$v0,\t5");
						System.out.println("\tsyscall");
						System.out.println("\tla\t$t" + _localctx.reg + ",\t" + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null));
						System.out.println("\tsw\t$v0,\t0($t" + _localctx.reg + ")");
						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(WRITE);
				setState(106);
				((StatementContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.println("\tmove\t$a0,\t$t" + ((StatementContext)_localctx).arithmeticExpression.nplace);
						System.out.println("\tli\t$v0,\t1");
						System.out.println("\tsyscall");
						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				match(EXIT);

						System.out.println("\tli\t$v0,\t10");
						System.out.println("\tsyscall");
						((StatementContext)_localctx).nreg =  _localctx.reg;
						((StatementContext)_localctx).nlabel =  _localctx.label;
					
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public BooleanTermContext booleanTerm;
		public BooleanExpression_EContext booleanExpression_E;
		public BooleanTermContext booleanTerm() {
			return getRuleContext(BooleanTermContext.class,0);
		}
		public BooleanExpression_EContext booleanExpression_E() {
			return getRuleContext(BooleanExpression_EContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression(int reg,int label,int t,int f) throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 12, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((BooleanExpressionContext)_localctx).booleanTerm = booleanTerm(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((BooleanExpressionContext)_localctx).t =  ((BooleanExpressionContext)_localctx).booleanTerm.nt;
					((BooleanExpressionContext)_localctx).f =  ((BooleanExpressionContext)_localctx).booleanTerm.nf;
					((BooleanExpressionContext)_localctx).reg =  ((BooleanExpressionContext)_localctx).booleanTerm.nreg;
					((BooleanExpressionContext)_localctx).label =  ((BooleanExpressionContext)_localctx).booleanTerm.nlabel;
					((BooleanExpressionContext)_localctx).reg =  _localctx.reg - 1;
					System.out.println("\t$t" + (_localctx.reg - 1) + ",\t$t" + (_localctx.reg) + ",\tL" + _localctx.t);/////
				
			setState(115);
			((BooleanExpressionContext)_localctx).booleanExpression_E = booleanExpression_E(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((BooleanExpressionContext)_localctx).t =  ((BooleanExpressionContext)_localctx).booleanExpression_E.nt;
					((BooleanExpressionContext)_localctx).f =  ((BooleanExpressionContext)_localctx).booleanExpression_E.nf;
					System.out.println("\tb\tL" + _localctx.f);
					((BooleanExpressionContext)_localctx).nreg =  ((BooleanExpressionContext)_localctx).booleanExpression_E.nreg;
					((BooleanExpressionContext)_localctx).nlabel =  ((BooleanExpressionContext)_localctx).booleanExpression_E.nlabel;
				
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

	public static class BooleanExpression_EContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public int nt;
		public int nf;
		public BooleanExpression_EContext booleanExpression_E;
		public TerminalNode OR() { return getToken(CactusParser.OR, 0); }
		public BooleanTermContext booleanTerm() {
			return getRuleContext(BooleanTermContext.class,0);
		}
		public BooleanExpression_EContext booleanExpression_E() {
			return getRuleContext(BooleanExpression_EContext.class,0);
		}
		public BooleanExpression_EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanExpression_EContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBooleanExpression_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBooleanExpression_E(this);
		}
	}

	public final BooleanExpression_EContext booleanExpression_E(int reg,int label,int t,int f) throws RecognitionException {
		BooleanExpression_EContext _localctx = new BooleanExpression_EContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 14, RULE_booleanExpression_E);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{

						System.out.println("\tb\tL" + _localctx.label);
						System.out.println("L" + _localctx.label + ":");
						((BooleanExpression_EContext)_localctx).label =  _localctx.label + 1;
					
				setState(119);
				match(OR);
				setState(120);
				booleanTerm(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);
				setState(121);
				((BooleanExpression_EContext)_localctx).booleanExpression_E = booleanExpression_E(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((BooleanExpression_EContext)_localctx).t =  ((BooleanExpression_EContext)_localctx).booleanExpression_E.nt;
						((BooleanExpression_EContext)_localctx).f =  ((BooleanExpression_EContext)_localctx).booleanExpression_E.nf;
						System.out.println("\t$t0,\t$t1,\tL" + _localctx.t);
						((BooleanExpression_EContext)_localctx).nlabel =  ((BooleanExpression_EContext)_localctx).booleanExpression_E.nlabel;
						((BooleanExpression_EContext)_localctx).nt =  _localctx.t;
						((BooleanExpression_EContext)_localctx).nf =  _localctx.f;
					
				}
				break;
			case THEN:
			case DO:
				enterOuterAlt(_localctx, 2);
				{

						((BooleanExpression_EContext)_localctx).nt =  _localctx.t;
						((BooleanExpression_EContext)_localctx).nf =  _localctx.f;
						((BooleanExpression_EContext)_localctx).nreg =  _localctx.reg;
						((BooleanExpression_EContext)_localctx).nlabel =  _localctx.label;
					
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

	public static class BooleanTermContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public int nt;
		public int nf;
		public BooleanFactorContext booleanFactor;
		public BooleanTerm_EContext booleanTerm_E;
		public BooleanFactorContext booleanFactor() {
			return getRuleContext(BooleanFactorContext.class,0);
		}
		public BooleanTerm_EContext booleanTerm_E() {
			return getRuleContext(BooleanTerm_EContext.class,0);
		}
		public BooleanTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanTermContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_booleanTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBooleanTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBooleanTerm(this);
		}
	}

	public final BooleanTermContext booleanTerm(int reg,int label,int t,int f) throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 16, RULE_booleanTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((BooleanTermContext)_localctx).booleanFactor = booleanFactor(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((BooleanTermContext)_localctx).t =  ((BooleanTermContext)_localctx).booleanFactor.nt;
					((BooleanTermContext)_localctx).f =  ((BooleanTermContext)_localctx).booleanFactor.nf;
					((BooleanTermContext)_localctx).reg =  ((BooleanTermContext)_localctx).booleanFactor.nreg;
				
			setState(129);
			((BooleanTermContext)_localctx).booleanTerm_E = booleanTerm_E(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

					((BooleanTermContext)_localctx).nt =  ((BooleanTermContext)_localctx).booleanTerm_E.nt;
					((BooleanTermContext)_localctx).nf =  ((BooleanTermContext)_localctx).booleanTerm_E.nf;
					((BooleanTermContext)_localctx).nreg =  ((BooleanTermContext)_localctx).booleanTerm_E.nreg;
					((BooleanTermContext)_localctx).nlabel =  ((BooleanTermContext)_localctx).booleanTerm_E.nlabel;
				
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

	public static class BooleanTerm_EContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nlabel;
		public int nt;
		public int nf;
		public BooleanFactorContext booleanFactor;
		public BooleanTerm_EContext booleanTerm_E;
		public TerminalNode AND() { return getToken(CactusParser.AND, 0); }
		public BooleanFactorContext booleanFactor() {
			return getRuleContext(BooleanFactorContext.class,0);
		}
		public BooleanTerm_EContext booleanTerm_E() {
			return getRuleContext(BooleanTerm_EContext.class,0);
		}
		public BooleanTerm_EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanTerm_EContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_booleanTerm_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBooleanTerm_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBooleanTerm_E(this);
		}
	}

	public final BooleanTerm_EContext booleanTerm_E(int reg,int label,int t,int f) throws RecognitionException {
		BooleanTerm_EContext _localctx = new BooleanTerm_EContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 18, RULE_booleanTerm_E);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{

						((BooleanTerm_EContext)_localctx).reg =  _localctx.reg - 1;
						System.out.println("\t$t" + (_localctx.reg - 1) + ",\t$t" + (_localctx.reg) + ",\tL" + _localctx.label + "@@@@@@@@@@@@");
						System.out.println("\tb\tL" + _localctx.f);
						System.out.println("L" + _localctx.label + ":");
						((BooleanTerm_EContext)_localctx).label =  _localctx.label + 1;
					
				setState(133);
				match(AND);
				setState(134);
				((BooleanTerm_EContext)_localctx).booleanFactor = booleanFactor(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((BooleanTerm_EContext)_localctx).t =  ((BooleanTerm_EContext)_localctx).booleanFactor.nt;
						((BooleanTerm_EContext)_localctx).f =  ((BooleanTerm_EContext)_localctx).booleanFactor.nf;
						((BooleanTerm_EContext)_localctx).reg =  ((BooleanTerm_EContext)_localctx).booleanFactor.nreg;
					
				setState(136);
				((BooleanTerm_EContext)_localctx).booleanTerm_E = booleanTerm_E(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((BooleanTerm_EContext)_localctx).nt =  ((BooleanTerm_EContext)_localctx).booleanTerm_E.nt;
						((BooleanTerm_EContext)_localctx).nf =  ((BooleanTerm_EContext)_localctx).booleanTerm_E.nf;
						((BooleanTerm_EContext)_localctx).nreg =  ((BooleanTerm_EContext)_localctx).booleanTerm_E.nreg;
						((BooleanTerm_EContext)_localctx).nlabel =  ((BooleanTerm_EContext)_localctx).booleanTerm_E.nlabel;
					
				}
				break;
			case THEN:
			case DO:
			case OR:
				enterOuterAlt(_localctx, 2);
				{

						((BooleanTerm_EContext)_localctx).nt =  _localctx.t;
						((BooleanTerm_EContext)_localctx).nf =  _localctx.f;
						((BooleanTerm_EContext)_localctx).nreg =  _localctx.reg;
						((BooleanTerm_EContext)_localctx).nlabel =  _localctx.label;
					
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

	public static class BooleanFactorContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public int nt;
		public int nf;
		public BooleanFactorContext booleanFactor;
		public RelationExpressionContext relationExpression;
		public TerminalNode NOT() { return getToken(CactusParser.NOT, 0); }
		public BooleanFactorContext booleanFactor() {
			return getRuleContext(BooleanFactorContext.class,0);
		}
		public RelationExpressionContext relationExpression() {
			return getRuleContext(RelationExpressionContext.class,0);
		}
		public BooleanFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BooleanFactorContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_booleanFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterBooleanFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitBooleanFactor(this);
		}
	}

	public final BooleanFactorContext booleanFactor(int reg,int label,int t,int f) throws RecognitionException {
		BooleanFactorContext _localctx = new BooleanFactorContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 20, RULE_booleanFactor);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(NOT);
				setState(143);
				((BooleanFactorContext)_localctx).booleanFactor = booleanFactor(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((BooleanFactorContext)_localctx).nt =  ((BooleanFactorContext)_localctx).booleanFactor.nf;
						((BooleanFactorContext)_localctx).nf =  ((BooleanFactorContext)_localctx).booleanFactor.nt;
						((BooleanFactorContext)_localctx).nreg =  ((BooleanFactorContext)_localctx).booleanFactor.nreg;
					
				}
				break;
			case MINUS:
			case INTCONST:
			case LEFTBRACKET:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				((BooleanFactorContext)_localctx).relationExpression = relationExpression(_localctx.reg , _localctx.label , _localctx.t , _localctx.f);

						((BooleanFactorContext)_localctx).nreg =  ((BooleanFactorContext)_localctx).relationExpression.nreg;
						((BooleanFactorContext)_localctx).nt =  _localctx.t;
						((BooleanFactorContext)_localctx).nf =  _localctx.f;
					
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

	public static class RelationExpressionContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int t;
		public int f;
		public int nreg;
		public ArithmeticExpressionContext arithmeticExpression;
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(CactusParser.EQUAL, 0); }
		public TerminalNode INSIDE() { return getToken(CactusParser.INSIDE, 0); }
		public TerminalNode MORETHAN() { return getToken(CactusParser.MORETHAN, 0); }
		public TerminalNode MORETHANEQUAL() { return getToken(CactusParser.MORETHANEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(CactusParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(CactusParser.LESSTHANEQUAL, 0); }
		public RelationExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RelationExpressionContext(ParserRuleContext parent, int invokingState, int reg, int label, int t, int f) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
			this.t = t;
			this.f = f;
		}
		@Override public int getRuleIndex() { return RULE_relationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterRelationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitRelationExpression(this);
		}
	}

	public final RelationExpressionContext relationExpression(int reg,int label,int t,int f) throws RecognitionException {
		RelationExpressionContext _localctx = new RelationExpressionContext(_ctx, getState(), reg, label, t, f);
		enterRule(_localctx, 22, RULE_relationExpression);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((RelationExpressionContext)_localctx).reg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				setState(153);
				match(EQUAL);
				setState(154);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.print("\tbeq");
						((RelationExpressionContext)_localctx).nreg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((RelationExpressionContext)_localctx).reg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				setState(159);
				match(INSIDE);
				setState(160);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.print("\tbne");
						((RelationExpressionContext)_localctx).nreg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((RelationExpressionContext)_localctx).reg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				setState(165);
				match(MORETHAN);
				setState(166);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.print("\tbgt");
						((RelationExpressionContext)_localctx).nreg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((RelationExpressionContext)_localctx).reg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				setState(171);
				match(MORETHANEQUAL);
				setState(172);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.print("\tbge");
						((RelationExpressionContext)_localctx).nreg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((RelationExpressionContext)_localctx).reg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				setState(177);
				match(LESSTHAN);
				setState(178);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.print("\tblt");
						((RelationExpressionContext)_localctx).nreg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						((RelationExpressionContext)_localctx).reg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
				setState(183);
				match(LESSTHANEQUAL);
				setState(184);
				((RelationExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);

						System.out.print("\tble");
						((RelationExpressionContext)_localctx).nreg =  ((RelationExpressionContext)_localctx).arithmeticExpression.nreg;
					
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public ArithmeticTermContext arithmeticTerm;
		public ArithmeticExpression_EContext arithmeticExpression_E;
		public ArithmeticTermContext arithmeticTerm() {
			return getRuleContext(ArithmeticTermContext.class,0);
		}
		public ArithmeticExpression_EContext arithmeticExpression_E() {
			return getRuleContext(ArithmeticExpression_EContext.class,0);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression(int reg) throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 24, RULE_arithmeticExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			((ArithmeticExpressionContext)_localctx).arithmeticTerm = arithmeticTerm(_localctx.reg);

					((ArithmeticExpressionContext)_localctx).reg =  ((ArithmeticExpressionContext)_localctx).arithmeticTerm.nreg;
					((ArithmeticExpressionContext)_localctx).nplace =  ((ArithmeticExpressionContext)_localctx).arithmeticTerm.nplace;
				
			setState(191);
			((ArithmeticExpressionContext)_localctx).arithmeticExpression_E = arithmeticExpression_E(_localctx.reg , _localctx.nplace);

					((ArithmeticExpressionContext)_localctx).nreg =  ((ArithmeticExpressionContext)_localctx).arithmeticExpression_E.nreg;
					((ArithmeticExpressionContext)_localctx).nplace =  ((ArithmeticExpressionContext)_localctx).arithmeticExpression_E.nplace;
				
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

	public static class ArithmeticExpression_EContext extends ParserRuleContext {
		public int reg;
		public int place;
		public int nreg;
		public int nplace;
		public ArithmeticTermContext arithmeticTerm;
		public ArithmeticExpression_EContext arithmeticExpression_E;
		public TerminalNode ADD() { return getToken(CactusParser.ADD, 0); }
		public ArithmeticTermContext arithmeticTerm() {
			return getRuleContext(ArithmeticTermContext.class,0);
		}
		public ArithmeticExpression_EContext arithmeticExpression_E() {
			return getRuleContext(ArithmeticExpression_EContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public ArithmeticExpression_EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArithmeticExpression_EContext(ParserRuleContext parent, int invokingState, int reg, int place) {
			super(parent, invokingState);
			this.reg = reg;
			this.place = place;
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArithmeticExpression_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArithmeticExpression_E(this);
		}
	}

	public final ArithmeticExpression_EContext arithmeticExpression_E(int reg,int place) throws RecognitionException {
		ArithmeticExpression_EContext _localctx = new ArithmeticExpression_EContext(_ctx, getState(), reg, place);
		enterRule(_localctx, 26, RULE_arithmeticExpression_E);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ADD);
				setState(195);
				((ArithmeticExpression_EContext)_localctx).arithmeticTerm = arithmeticTerm(_localctx.reg);

						((ArithmeticExpression_EContext)_localctx).reg =  ((ArithmeticExpression_EContext)_localctx).arithmeticTerm.nreg;
						((ArithmeticExpression_EContext)_localctx).nplace =  ((ArithmeticExpression_EContext)_localctx).arithmeticTerm.nplace;
						System.out.println("\tadd\t$t" + (_localctx.place) + ",\t$t" + (_localctx.place) + ",\t$t" + (_localctx.nplace));
					
				setState(197);
				((ArithmeticExpression_EContext)_localctx).arithmeticExpression_E = arithmeticExpression_E(_localctx.reg , _localctx.place);

						((ArithmeticExpression_EContext)_localctx).nreg =  ((ArithmeticExpression_EContext)_localctx).arithmeticExpression_E.nreg - 1;
						((ArithmeticExpression_EContext)_localctx).nplace =  ((ArithmeticExpression_EContext)_localctx).arithmeticExpression_E.nplace;
					
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(MINUS);
				setState(201);
				((ArithmeticExpression_EContext)_localctx).arithmeticTerm = arithmeticTerm(_localctx.reg);

						((ArithmeticExpression_EContext)_localctx).reg =  ((ArithmeticExpression_EContext)_localctx).arithmeticTerm.nreg;
						((ArithmeticExpression_EContext)_localctx).nplace =  ((ArithmeticExpression_EContext)_localctx).arithmeticTerm.nplace;
						System.out.println("\tsub\t$t" + (_localctx.place) + ",\t$t" + (_localctx.place) + ",\t$t" + (_localctx.nplace));
					
				setState(203);
				((ArithmeticExpression_EContext)_localctx).arithmeticExpression_E = arithmeticExpression_E(_localctx.reg , _localctx.place);

						((ArithmeticExpression_EContext)_localctx).nreg =  ((ArithmeticExpression_EContext)_localctx).arithmeticExpression_E.nreg - 1;
						((ArithmeticExpression_EContext)_localctx).nplace =  ((ArithmeticExpression_EContext)_localctx).arithmeticExpression_E.nplace;
					
				}
				break;
			case END:
			case SET:
			case IF:
			case THEN:
			case ENDIF:
			case ELSE:
			case WHILE:
			case DO:
			case ENDWHILE:
			case READ:
			case WRITE:
			case EXIT:
			case OR:
			case AND:
			case EQUAL:
			case INSIDE:
			case MORETHAN:
			case MORETHANEQUAL:
			case LESSTHAN:
			case LESSTHANEQUAL:
			case RIGHTBRACKET:
				enterOuterAlt(_localctx, 3);
				{

						((ArithmeticExpression_EContext)_localctx).nreg =  _localctx.reg;
						((ArithmeticExpression_EContext)_localctx).nplace =  _localctx.place;
					
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

	public static class ArithmeticTermContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public ArithmeticFactorContext arithmeticFactor;
		public ArithmeticTerm_EContext arithmeticTerm_E;
		public ArithmeticFactorContext arithmeticFactor() {
			return getRuleContext(ArithmeticFactorContext.class,0);
		}
		public ArithmeticTerm_EContext arithmeticTerm_E() {
			return getRuleContext(ArithmeticTerm_EContext.class,0);
		}
		public ArithmeticTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArithmeticTermContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arithmeticTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArithmeticTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArithmeticTerm(this);
		}
	}

	public final ArithmeticTermContext arithmeticTerm(int reg) throws RecognitionException {
		ArithmeticTermContext _localctx = new ArithmeticTermContext(_ctx, getState(), reg);
		enterRule(_localctx, 28, RULE_arithmeticTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((ArithmeticTermContext)_localctx).arithmeticFactor = arithmeticFactor(_localctx.reg);

					((ArithmeticTermContext)_localctx).reg =  ((ArithmeticTermContext)_localctx).arithmeticFactor.nreg;
					((ArithmeticTermContext)_localctx).nplace =  ((ArithmeticTermContext)_localctx).arithmeticFactor.nplace;
				
			setState(211);
			((ArithmeticTermContext)_localctx).arithmeticTerm_E = arithmeticTerm_E(_localctx.reg , _localctx.nplace);

					((ArithmeticTermContext)_localctx).nreg =  ((ArithmeticTermContext)_localctx).arithmeticTerm_E.nreg;
					((ArithmeticTermContext)_localctx).nplace =  ((ArithmeticTermContext)_localctx).arithmeticTerm_E.nplace;
				
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

	public static class ArithmeticTerm_EContext extends ParserRuleContext {
		public int reg;
		public int place;
		public int nreg;
		public int nplace;
		public ArithmeticFactorContext arithmeticFactor;
		public ArithmeticTerm_EContext arithmeticTerm_E;
		public TerminalNode MULTIPLICATION() { return getToken(CactusParser.MULTIPLICATION, 0); }
		public ArithmeticFactorContext arithmeticFactor() {
			return getRuleContext(ArithmeticFactorContext.class,0);
		}
		public ArithmeticTerm_EContext arithmeticTerm_E() {
			return getRuleContext(ArithmeticTerm_EContext.class,0);
		}
		public TerminalNode DIVISION() { return getToken(CactusParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(CactusParser.MOD, 0); }
		public ArithmeticTerm_EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArithmeticTerm_EContext(ParserRuleContext parent, int invokingState, int reg, int place) {
			super(parent, invokingState);
			this.reg = reg;
			this.place = place;
		}
		@Override public int getRuleIndex() { return RULE_arithmeticTerm_E; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArithmeticTerm_E(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArithmeticTerm_E(this);
		}
	}

	public final ArithmeticTerm_EContext arithmeticTerm_E(int reg,int place) throws RecognitionException {
		ArithmeticTerm_EContext _localctx = new ArithmeticTerm_EContext(_ctx, getState(), reg, place);
		enterRule(_localctx, 30, RULE_arithmeticTerm_E);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(MULTIPLICATION);
				setState(215);
				((ArithmeticTerm_EContext)_localctx).arithmeticFactor = arithmeticFactor(_localctx.reg);

						((ArithmeticTerm_EContext)_localctx).reg =  ((ArithmeticTerm_EContext)_localctx).arithmeticFactor.nreg;
						((ArithmeticTerm_EContext)_localctx).nplace =  ((ArithmeticTerm_EContext)_localctx).arithmeticFactor.nplace;
						System.out.println("\tmul\t$t" + (_localctx.place) + ",\t$t" + (_localctx.place) + ",\t$t" + (_localctx.nplace));
					
				setState(217);
				((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E = arithmeticTerm_E(_localctx.reg , _localctx.place);

						((ArithmeticTerm_EContext)_localctx).nreg =  ((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E.nreg - 1;
						((ArithmeticTerm_EContext)_localctx).nplace =  ((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E.nplace;
					
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(DIVISION);
				setState(221);
				((ArithmeticTerm_EContext)_localctx).arithmeticFactor = arithmeticFactor(_localctx.reg);

						((ArithmeticTerm_EContext)_localctx).reg =  ((ArithmeticTerm_EContext)_localctx).arithmeticFactor.nreg;
						((ArithmeticTerm_EContext)_localctx).nplace =  ((ArithmeticTerm_EContext)_localctx).arithmeticFactor.nplace;
						System.out.println("\tdiv\t$t" + (_localctx.place) + ",\t$t" + (_localctx.place) + ",\t$t" + (_localctx.nplace));
					
				setState(223);
				((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E = arithmeticTerm_E(_localctx.reg , _localctx.place);

						((ArithmeticTerm_EContext)_localctx).nreg =  ((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E.nreg - 1;
						((ArithmeticTerm_EContext)_localctx).nplace =  ((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E.nplace;
					
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(MOD);
				setState(227);
				((ArithmeticTerm_EContext)_localctx).arithmeticFactor = arithmeticFactor(_localctx.reg);

						((ArithmeticTerm_EContext)_localctx).reg =  ((ArithmeticTerm_EContext)_localctx).arithmeticFactor.nreg;
						((ArithmeticTerm_EContext)_localctx).nplace =  ((ArithmeticTerm_EContext)_localctx).arithmeticFactor.nplace;
						System.out.println("\trem\t$t" + (_localctx.place) + ",\t$t" + (_localctx.place) + ",\t$t" + (_localctx.nplace));
					
				setState(229);
				((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E = arithmeticTerm_E(_localctx.reg , _localctx.place);

						((ArithmeticTerm_EContext)_localctx).nreg =  ((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E.nreg - 1;
						((ArithmeticTerm_EContext)_localctx).nplace =  ((ArithmeticTerm_EContext)_localctx).arithmeticTerm_E.nplace;
					
				}
				break;
			case END:
			case SET:
			case IF:
			case THEN:
			case ENDIF:
			case ELSE:
			case WHILE:
			case DO:
			case ENDWHILE:
			case READ:
			case WRITE:
			case EXIT:
			case OR:
			case AND:
			case EQUAL:
			case INSIDE:
			case MORETHAN:
			case MORETHANEQUAL:
			case LESSTHAN:
			case LESSTHANEQUAL:
			case ADD:
			case MINUS:
			case RIGHTBRACKET:
				enterOuterAlt(_localctx, 4);
				{

						((ArithmeticTerm_EContext)_localctx).nreg =  _localctx.reg;
						((ArithmeticTerm_EContext)_localctx).nplace =  _localctx.place;
					
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

	public static class ArithmeticFactorContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public ArithmeticFactorContext arithmeticFactor;
		public PrimaryExpressionContext primaryExpression;
		public TerminalNode MINUS() { return getToken(CactusParser.MINUS, 0); }
		public ArithmeticFactorContext arithmeticFactor() {
			return getRuleContext(ArithmeticFactorContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ArithmeticFactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArithmeticFactorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arithmeticFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterArithmeticFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitArithmeticFactor(this);
		}
	}

	public final ArithmeticFactorContext arithmeticFactor(int reg) throws RecognitionException {
		ArithmeticFactorContext _localctx = new ArithmeticFactorContext(_ctx, getState(), reg);
		enterRule(_localctx, 32, RULE_arithmeticFactor);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(MINUS);
				setState(236);
				((ArithmeticFactorContext)_localctx).arithmeticFactor = arithmeticFactor(_localctx.reg);

						((ArithmeticFactorContext)_localctx).nreg =  ((ArithmeticFactorContext)_localctx).arithmeticFactor.nreg;
						((ArithmeticFactorContext)_localctx).nplace =  ((ArithmeticFactorContext)_localctx).arithmeticFactor.nplace;
						System.out.println("\tneg\t$t" + (_localctx.nplace) + ",\t$t" + (_localctx.nplace));
					
				}
				break;
			case INTCONST:
			case LEFTBRACKET:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((ArithmeticFactorContext)_localctx).primaryExpression = primaryExpression(_localctx.reg);

						((ArithmeticFactorContext)_localctx).nreg =  ((ArithmeticFactorContext)_localctx).primaryExpression.nreg;
						((ArithmeticFactorContext)_localctx).nplace =  ((ArithmeticFactorContext)_localctx).primaryExpression.nplace;
					
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public Token INTCONST;
		public Token ID;
		public ArithmeticExpressionContext arithmeticExpression;
		public TerminalNode INTCONST() { return getToken(CactusParser.INTCONST, 0); }
		public TerminalNode ID() { return getToken(CactusParser.ID, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(CactusParser.LEFTBRACKET, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(CactusParser.RIGHTBRACKET, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CactusListener ) ((CactusListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression(int reg) throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 34, RULE_primaryExpression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((PrimaryExpressionContext)_localctx).INTCONST = match(INTCONST);

						System.out.println("\tli\t$t" + (_localctx.reg) + ",\t" + (((PrimaryExpressionContext)_localctx).INTCONST!=null?((PrimaryExpressionContext)_localctx).INTCONST.getText():null));
						((PrimaryExpressionContext)_localctx).nreg =  _localctx.reg + 1;
						((PrimaryExpressionContext)_localctx).nplace =  _localctx.reg;
					
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				((PrimaryExpressionContext)_localctx).ID = match(ID);

				                System.out.println("\tla\t$t" + (_localctx.reg) + ",\t" + (((PrimaryExpressionContext)_localctx).ID!=null?((PrimaryExpressionContext)_localctx).ID.getText():null));
				                System.out.println("\tlw\t$t" + (_localctx.reg) + ",\t0($t" + (_localctx.reg) + ")");
				                ((PrimaryExpressionContext)_localctx).nreg =  _localctx.reg + 1;
						((PrimaryExpressionContext)_localctx).nplace =  _localctx.reg;
					
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(LEFTBRACKET);
				setState(249);
				((PrimaryExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(_localctx.reg);
				setState(250);
				match(RIGHTBRACKET);

						((PrimaryExpressionContext)_localctx).nreg =  ((PrimaryExpressionContext)_localctx).arithmeticExpression.nreg;
						((PrimaryExpressionContext)_localctx).nplace =  ((PrimaryExpressionContext)_localctx).arithmeticExpression.nplace;
					
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0098\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d2\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ec\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f5\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0100\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\2\2\u0107\2&\3\2\2\2\4/\3\2\2\2\6\66\3\2\2\2"+
		"\b8\3\2\2\2\nA\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20\177\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u008e\3\2\2\2\26\u0097\3\2\2\2\30\u00bd\3\2\2\2\32\u00bf\3"+
		"\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2\2\2 \u00eb\3\2\2\2\"\u00f4\3\2\2"+
		"\2$\u00ff\3\2\2\2&\'\7\3\2\2\'(\7$\2\2()\7\5\2\2)*\b\2\1\2*+\5\4\3\2+"+
		",\b\2\1\2,-\5\b\5\2-.\7\6\2\2.\3\3\2\2\2/\60\5\6\4\2\60\5\3\2\2\2\61\62"+
		"\7\7\2\2\62\63\7$\2\2\63\64\b\4\1\2\64\67\5\6\4\2\65\67\3\2\2\2\66\61"+
		"\3\2\2\2\66\65\3\2\2\2\67\7\3\2\2\289\b\5\1\29:\5\n\6\2:\t\3\2\2\2;<\b"+
		"\6\1\2<=\5\f\7\2=>\b\6\1\2>?\5\n\6\2?B\3\2\2\2@B\b\6\1\2A;\3\2\2\2A@\3"+
		"\2\2\2B\13\3\2\2\2CD\b\7\1\2DE\7\b\2\2EF\7$\2\2FG\7\4\2\2GH\5\32\16\2"+
		"HI\b\7\1\2Ir\3\2\2\2JK\b\7\1\2KL\7\t\2\2LM\5\16\b\2MN\b\7\1\2NO\7\n\2"+
		"\2OP\5\b\5\2PQ\7\13\2\2QR\b\7\1\2Rr\3\2\2\2ST\b\7\1\2TU\7\t\2\2UV\5\16"+
		"\b\2VW\b\7\1\2WX\7\n\2\2XY\5\b\5\2YZ\b\7\1\2Z[\7\f\2\2[\\\5\b\5\2\\]\7"+
		"\13\2\2]^\b\7\1\2^r\3\2\2\2_`\b\7\1\2`a\7\r\2\2ab\5\16\b\2bc\b\7\1\2c"+
		"d\7\16\2\2de\5\b\5\2ef\7\17\2\2fg\b\7\1\2gr\3\2\2\2hi\7\20\2\2ij\7$\2"+
		"\2jr\b\7\1\2kl\7\21\2\2lm\5\32\16\2mn\b\7\1\2nr\3\2\2\2op\7\22\2\2pr\b"+
		"\7\1\2qC\3\2\2\2qJ\3\2\2\2qS\3\2\2\2q_\3\2\2\2qh\3\2\2\2qk\3\2\2\2qo\3"+
		"\2\2\2r\r\3\2\2\2st\5\22\n\2tu\b\b\1\2uv\5\20\t\2vw\b\b\1\2w\17\3\2\2"+
		"\2xy\b\t\1\2yz\7\23\2\2z{\5\22\n\2{|\5\20\t\2|}\b\t\1\2}\u0080\3\2\2\2"+
		"~\u0080\b\t\1\2\177x\3\2\2\2\177~\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082"+
		"\5\26\f\2\u0082\u0083\b\n\1\2\u0083\u0084\5\24\13\2\u0084\u0085\b\n\1"+
		"\2\u0085\23\3\2\2\2\u0086\u0087\b\13\1\2\u0087\u0088\7\24\2\2\u0088\u0089"+
		"\5\26\f\2\u0089\u008a\b\13\1\2\u008a\u008b\5\24\13\2\u008b\u008c\b\13"+
		"\1\2\u008c\u008f\3\2\2\2\u008d\u008f\b\13\1\2\u008e\u0086\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\25\2\2\u0091\u0092\5\26"+
		"\f\2\u0092\u0093\b\f\1\2\u0093\u0098\3\2\2\2\u0094\u0095\5\30\r\2\u0095"+
		"\u0096\b\f\1\2\u0096\u0098\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0094\3\2"+
		"\2\2\u0098\27\3\2\2\2\u0099\u009a\5\32\16\2\u009a\u009b\b\r\1\2\u009b"+
		"\u009c\7\26\2\2\u009c\u009d\5\32\16\2\u009d\u009e\b\r\1\2\u009e\u00be"+
		"\3\2\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\b\r\1\2\u00a1\u00a2\7\27\2"+
		"\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\b\r\1\2\u00a4\u00be\3\2\2\2\u00a5"+
		"\u00a6\5\32\16\2\u00a6\u00a7\b\r\1\2\u00a7\u00a8\7\30\2\2\u00a8\u00a9"+
		"\5\32\16\2\u00a9\u00aa\b\r\1\2\u00aa\u00be\3\2\2\2\u00ab\u00ac\5\32\16"+
		"\2\u00ac\u00ad\b\r\1\2\u00ad\u00ae\7\31\2\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b0\b\r\1\2\u00b0\u00be\3\2\2\2\u00b1\u00b2\5\32\16\2\u00b2\u00b3\b"+
		"\r\1\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\b\r\1\2"+
		"\u00b6\u00be\3\2\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\b\r\1\2\u00b9\u00ba"+
		"\7\33\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc\b\r\1\2\u00bc\u00be\3\2\2"+
		"\2\u00bd\u0099\3\2\2\2\u00bd\u009f\3\2\2\2\u00bd\u00a5\3\2\2\2\u00bd\u00ab"+
		"\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be\31\3\2\2\2\u00bf"+
		"\u00c0\5\36\20\2\u00c0\u00c1\b\16\1\2\u00c1\u00c2\5\34\17\2\u00c2\u00c3"+
		"\b\16\1\2\u00c3\33\3\2\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\5\36\20\2"+
		"\u00c6\u00c7\b\17\1\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\b\17\1\2\u00c9"+
		"\u00d2\3\2\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00cc\5\36\20\2\u00cc\u00cd"+
		"\b\17\1\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\b\17\1\2\u00cf\u00d2\3\2\2"+
		"\2\u00d0\u00d2\b\17\1\2\u00d1\u00c4\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\35\3\2\2\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5\b\20"+
		"\1\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\b\20\1\2\u00d7\37\3\2\2\2\u00d8\u00d9"+
		"\7\36\2\2\u00d9\u00da\5\"\22\2\u00da\u00db\b\21\1\2\u00db\u00dc\5 \21"+
		"\2\u00dc\u00dd\b\21\1\2\u00dd\u00ec\3\2\2\2\u00de\u00df\7\37\2\2\u00df"+
		"\u00e0\5\"\22\2\u00e0\u00e1\b\21\1\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\b"+
		"\21\1\2\u00e3\u00ec\3\2\2\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\5\"\22\2\u00e6"+
		"\u00e7\b\21\1\2\u00e7\u00e8\5 \21\2\u00e8\u00e9\b\21\1\2\u00e9\u00ec\3"+
		"\2\2\2\u00ea\u00ec\b\21\1\2\u00eb\u00d8\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb"+
		"\u00e4\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec!\3\2\2\2\u00ed\u00ee\7\35\2\2"+
		"\u00ee\u00ef\5\"\22\2\u00ef\u00f0\b\22\1\2\u00f0\u00f5\3\2\2\2\u00f1\u00f2"+
		"\5$\23\2\u00f2\u00f3\b\22\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00ed\3\2\2\2"+
		"\u00f4\u00f1\3\2\2\2\u00f5#\3\2\2\2\u00f6\u00f7\7!\2\2\u00f7\u0100\b\23"+
		"\1\2\u00f8\u00f9\7$\2\2\u00f9\u0100\b\23\1\2\u00fa\u00fb\7\"\2\2\u00fb"+
		"\u00fc\5\32\16\2\u00fc\u00fd\7#\2\2\u00fd\u00fe\b\23\1\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u00f6\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100"+
		"%\3\2\2\2\r\66Aq\177\u008e\u0097\u00bd\u00d1\u00eb\u00f4\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}