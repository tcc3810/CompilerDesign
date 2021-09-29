grammar Cactus;

// parser rule
program : PROGRAM ID BEGIN 
	{
		System.out.println("\t.data");
	}
	declarations
	{
		System.out.println("\t.text");
		System.out.println("main:");
	}
	statements[0 , 1] END;

//declarations
declarations : 
	declarations_E;

declarations_E : 
	VAR ID 
	{ 
		System.out.println($ID.text + ":\t.word\t0");
	}
	declarations_E
	|
	;

// statements
statements[int reg , int label] returns [int nreg , int nlabel] : 
	{
		$nreg = $reg;
		$nlabel = $label;
	}
	statements_E[$reg , $label];

statements_E[int reg , int label] returns [int nreg , int nlabel] :
	{
		$nreg = $reg;
		$nlabel = $label;
	}
	statement[$reg , $label] 
	{
		$label = $statement.nlabel;
	}
	statements_E[$reg , $label]
	|
	{
		$nreg = $reg;
		$nlabel = $label;
	}
	;

statement[int reg , int label] returns [int nreg , int nlabel] :
	{
		$nreg = $reg;
	}
	SET ID ASSIGN arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
		System.out.println("\tla\t\$t" + ($reg) + ",\t" + $ID.text);
		System.out.println("\tsw\t\$t" + ($reg - 1) + ",\t0(\$t" + ($reg) + ")");
		$nlabel = $label;
	}
	| 
	{
		$nreg = $reg;
		int t = $label++;
		int f = $label++;
		int end = $label++;
	}
	IF booleanExpression[$reg , $label , t , f] 
	{
		System.out.println("L" + t + ":");
		$label = $booleanExpression.nlabel;
	}
	THEN statements[$reg , $label] ENDIF
	{
		System.out.println("L" + f + ":");
		$nlabel = $statements.nlabel;
	}
	|
	{
		$nreg = $reg;
		int t = $label++;
		int f = $label++;
		int end = $label++;
	}
	IF booleanExpression[$reg , $label , t , f] 
	{
		System.out.println("L" + t + ":");
		$label = $booleanExpression.nlabel;
	}
	THEN statements[$reg , $label] 
	{
		System.out.println("\tb\tL" + end);
		System.out.println("L" + f + ":");
		$label = $statements.nlabel;
	}
	ELSE statements[$reg , $label] ENDIF
	{
		System.out.println("L" + end + ":");
		$nlabel = $statements.nlabel;
	}
	| 
	{
		$nreg = $reg;
		int begin = $label++;
		int t = $label++;
		int f = $label++;
		System.out.println("L" + begin + ":");
	}
	WHILE booleanExpression[$reg , $label , t , f] 
	{
		System.out.println("L" + t + ":");
		$label = $booleanExpression.nlabel;
	}
	DO statements[$reg , $label] ENDWHILE
	{
		System.out.println("\tb\tL" + begin);
		System.out.println("L" + f + ":");
		$nlabel = $statements.nlabel;
	}
	| 
	READ ID
	{
		System.out.println("\tli\t\$v0,\t5");
		System.out.println("\tsyscall");
		System.out.println("\tla\t\$t" + $reg + ",\t" + $ID.text);
		System.out.println("\tsw\t\$v0,\t0(\$t" + $reg + ")");
		$nreg = $reg;
		$nlabel = $label;
	}
	| 
	WRITE arithmeticExpression[$reg]
	{
		System.out.println("\tmove\t\$a0,\t\$t" + $arithmeticExpression.nplace);
		System.out.println("\tli\t\$v0,\t1");
		System.out.println("\tsyscall");
		$nreg = $reg;
		$nlabel = $label;
	}
	| 
	EXIT
	{
		System.out.println("\tli\t\$v0,\t10");
		System.out.println("\tsyscall");
		$nreg = $reg;
		$nlabel = $label;
	}
	;

// booleanExpression
// ex :	---	t0,	t1,	L1
//      b	L2
booleanExpression[int reg , int label , int t , int f] returns [int nreg , int nlabel] : 
	booleanTerm[$reg , $label , $t , $f]
	{
		$t = $booleanTerm.nt;
		$f = $booleanTerm.nf;
		$reg = $booleanTerm.nreg;
		$label = $booleanTerm.nlabel;
		$reg = $reg - 1;
		System.out.println("\t\$t" + ($reg - 1) + ",\t\$t" + ($reg) + ",\tL" + $t);/////
	}
	booleanExpression_E[$reg , $label , $t , $f]
	{
		$t = $booleanExpression_E.nt;
		$f = $booleanExpression_E.nf;
		System.out.println("\tb\tL" + $f);
		$nreg = $booleanExpression_E.nreg;
		$nlabel = $booleanExpression_E.nlabel;
	}
	;
// ex : L1:
booleanExpression_E[int reg , int label , int t , int f] returns [int nreg , int nlabel , int nt , int nf] :
	{
		System.out.println("\tb\tL" + $label);
		System.out.println("L" + $label + ":");
		$label = $label + 1;
	}
	OR booleanTerm[$reg , $label , $t , $f] booleanExpression_E[$reg , $label , $t , $f]
	{
		$t = $booleanExpression_E.nt;
		$f = $booleanExpression_E.nf;
		System.out.println("\t\$t0,\t\$t1,\tL" + $t);
		$nlabel = $booleanExpression_E.nlabel;
		$nt = $t;
		$nf = $f;
	}
	|
	{
		$nt = $t;
		$nf = $f;
		$nreg = $reg;
		$nlabel = $label;
	}
	;

booleanTerm[int reg , int label , int t , int f] returns [int nreg , int nlabel , int nt , int nf] :
	booleanFactor[$reg , $label , $t , $f]
	{
		$t = $booleanFactor.nt;
		$f = $booleanFactor.nf;
		$reg = $booleanFactor.nreg;
	}
	booleanTerm_E[$reg , $label , $t , $f]
	{
		$nt = $booleanTerm_E.nt;
		$nf = $booleanTerm_E.nf;
		$nreg = $booleanTerm_E.nreg;
		$nlabel = $booleanTerm_E.nlabel;
	}
	;
booleanTerm_E[int reg , int label , int t , int f] returns [int nreg , int nlabel , int nt , int nf] :
	{
		$reg = $reg - 1;
		System.out.println("\t\$t" + ($reg - 1) + ",\t\$t" + ($reg) + ",\tL" + $label);
		System.out.println("\tb\tL" + $f);
		System.out.println("L" + $label + ":");
		$label = $label + 1;
	}
	AND booleanFactor[$reg , $label , $t , $f] 
	{
		$t = $booleanFactor.nt;
		$f = $booleanFactor.nf;
		$reg = $booleanFactor.nreg;
	}
	booleanTerm_E[$reg , $label , $t , $f]
	{
		$nt = $booleanTerm_E.nt;
		$nf = $booleanTerm_E.nf;
		$nreg = $booleanTerm_E.nreg;
		$nlabel = $booleanTerm_E.nlabel;
	}
	|
	{
		$nt = $t;
		$nf = $f;
		$nreg = $reg;
		$nlabel = $label;
	}
	;
booleanFactor[int reg , int label , int t , int f] returns [int nreg , int nt , int nf] :
	NOT booleanFactor[$reg , $label , $t , $f]
	{
		$nt = $booleanFactor.nf;
		$nf = $booleanFactor.nt;
		$nreg = $booleanFactor.nreg;
	}
	|
	relationExpression[$reg , $label , $t , $f]
	{
		$nreg = $relationExpression.nreg;
		$nt = $t;
		$nf = $f;
	}
	;
relationExpression[int reg , int label , int t , int f] returns [int nreg] :
	arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
	}
	EQUAL arithmeticExpression[$reg]
	{
		System.out.print("\tbeq");
		$nreg = $arithmeticExpression.nreg;
	}
	|
	arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
	}
	INSIDE arithmeticExpression[$reg]
	{
		System.out.print("\tbne");
		$nreg = $arithmeticExpression.nreg;
	}
	|
	arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
	}
	MORETHAN arithmeticExpression[$reg]
	{
		System.out.print("\tbgt");
		$nreg = $arithmeticExpression.nreg;
	}
	|
	arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
	}
	MORETHANEQUAL arithmeticExpression[$reg]
	{
		System.out.print("\tbge");
		$nreg = $arithmeticExpression.nreg;
	}
	|
	arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
	}
	LESSTHAN arithmeticExpression[$reg]
	{
		System.out.print("\tblt");
		$nreg = $arithmeticExpression.nreg;
	}
	|
	arithmeticExpression[$reg]
	{
		$reg = $arithmeticExpression.nreg;
	}
	LESSTHANEQUAL arithmeticExpression[$reg]
	{
		System.out.print("\tble");
		$nreg = $arithmeticExpression.nreg;
	}
	;

// arithmeticExpression
arithmeticExpression[int reg] returns [int nreg , int nplace] : 
	arithmeticTerm[$reg]
	{
		$reg = $arithmeticTerm.nreg;
		$nplace = $arithmeticTerm.nplace;
	}
	arithmeticExpression_E[$reg , $nplace]
	{
		$nreg = $arithmeticExpression_E.nreg;
		$nplace = $arithmeticExpression_E.nplace;
	}
	;

arithmeticExpression_E[int reg , int place] returns [int nreg , int nplace] :
	ADD arithmeticTerm[$reg]
	{
		$reg = $arithmeticTerm.nreg;
		$nplace = $arithmeticTerm.nplace;
		System.out.println("\tadd\t\$t" + ($place) + ",\t\$t" + ($place) + ",\t\$t" + ($nplace));
	}
	arithmeticExpression_E[$reg , $place]
	{
		$nreg = $arithmeticExpression_E.nreg - 1;
		$nplace = $arithmeticExpression_E.nplace;
	}
	|
	MINUS arithmeticTerm[$reg]
	{
		$reg = $arithmeticTerm.nreg;
		$nplace = $arithmeticTerm.nplace;
		System.out.println("\tsub\t\$t" + ($place) + ",\t\$t" + ($place) + ",\t\$t" + ($nplace));
	}
	arithmeticExpression_E[$reg , $place]
	{
		$nreg = $arithmeticExpression_E.nreg - 1;
		$nplace = $arithmeticExpression_E.nplace;
	}
	|
	{
		$nreg = $reg;
		$nplace = $place;
	}
	;
arithmeticTerm[int reg] returns [int nreg , int nplace] : 
	arithmeticFactor[$reg]
	{
		$reg = $arithmeticFactor.nreg;
		$nplace = $arithmeticFactor.nplace;
	}
	arithmeticTerm_E[$reg , $nplace]
	{
		$nreg = $arithmeticTerm_E.nreg;
		$nplace = $arithmeticTerm_E.nplace;
	}
	;
arithmeticTerm_E[int reg , int place] returns [int nreg , int nplace] : 
	MULTIPLICATION arithmeticFactor[$reg]
	{
		$reg = $arithmeticFactor.nreg;
		$nplace = $arithmeticFactor.nplace;
		System.out.println("\tmul\t\$t" + ($place) + ",\t\$t" + ($place) + ",\t\$t" + ($nplace));
	}
	arithmeticTerm_E[$reg , $place]
	{
		$nreg = $arithmeticTerm_E.nreg - 1;
		$nplace = $arithmeticTerm_E.nplace;
	}
	| 
	DIVISION arithmeticFactor[$reg] 
	{
		$reg = $arithmeticFactor.nreg;
		$nplace = $arithmeticFactor.nplace;
		System.out.println("\tdiv\t\$t" + ($place) + ",\t\$t" + ($place) + ",\t\$t" + ($nplace));
	}
	arithmeticTerm_E[$reg , $place]
	{
		$nreg = $arithmeticTerm_E.nreg - 1;
		$nplace = $arithmeticTerm_E.nplace;
	}
	| 
	MOD arithmeticFactor[$reg]
	{
		$reg = $arithmeticFactor.nreg;
		$nplace = $arithmeticFactor.nplace;
		System.out.println("\trem\t\$t" + ($place) + ",\t\$t" + ($place) + ",\t\$t" + ($nplace));
	} 
	arithmeticTerm_E[$reg , $place]
	{
		$nreg = $arithmeticTerm_E.nreg - 1;
		$nplace = $arithmeticTerm_E.nplace;
	}
	|
	{
		$nreg = $reg;
		$nplace = $place;
	}
	;
arithmeticFactor[int reg] returns [int nreg , int nplace] : 
	MINUS arithmeticFactor[$reg]
	{
		$nreg = $arithmeticFactor.nreg;
		$nplace = $arithmeticFactor.nplace;
		System.out.println("\tneg\t\$t" + ($nplace) + ",\t\$t" + ($nplace));
	}
	| 
	primaryExpression[$reg]
	{
		$nreg = $primaryExpression.nreg;
		$nplace = $primaryExpression.nplace;
	}
	;

primaryExpression[int reg] returns [int nreg , int nplace] : 
	INTCONST 
	{
		System.out.println("\tli\t\$t" + ($reg) + ",\t" + $INTCONST.text);
		$nreg = $reg + 1;
		$nplace = $reg;
	}
	|
	ID
	{
                System.out.println("\tla\t\$t" + ($reg) + ",\t" + $ID.text);
                System.out.println("\tlw\t\$t" + ($reg) + ",\t0(\$t" + ($reg) + ")");
                $nreg = $reg + 1;
		$nplace = $reg;
	}
	|
	LEFTBRACKET arithmeticExpression[$reg] RIGHTBRACKET	
	{
		$nreg = $arithmeticExpression.nreg;
		$nplace = $arithmeticExpression.nplace;
	}
	;


//lexer rules
PROGRAM : 'Program';
ASSIGN : '=';
BEGIN : 'Begin';
END : 'End';
VAR : 'Var';
SET : 'Set';
IF : 'If';
THEN : 'Then';
ENDIF : 'EndIf';
ELSE : 'Else';
WHILE : 'While';
DO : 'Do';
ENDWHILE : 'EndWhile';
READ : 'Read';
WRITE : 'Write';
EXIT : 'Exit';
OR : 'Or';
AND : 'And';
NOT : 'Not';
EQUAL : '==';
INSIDE : '<>';
MORETHAN : '>';
MORETHANEQUAL : '>=';
LESSTHAN : '<';
LESSTHANEQUAL : '<=';
ADD : '+';
MINUS : '-';
MULTIPLICATION : '*';
DIVISION : '/';
MOD : '%';
INTCONST : [0-9]+;
LEFTBRACKET : '(';
RIGHTBRACKET : ')';
ID : [_a-zA-Z][_a-zA-Z0-9]*;
WHITESPACE : [ \t\n]+->channel(HIDDEN);
COMMENT : '//'.*?'\n'->channel(HIDDEN);
