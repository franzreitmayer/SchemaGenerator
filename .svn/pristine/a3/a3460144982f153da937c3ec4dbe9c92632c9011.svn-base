grammar SchemaLang;

options {
  language = Java;
  output = AST;
}


@lexer::header {
package eu.reitmayer.schemagen.lang;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Stack;
import org.antlr.stringtemplate.StringTemplateGroup;
}

@parser::header {
package eu.reitmayer.schemagen.lang;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Stack;
import org.antlr.stringtemplate.StringTemplateGroup;
}

@members {
	// key fields: (table, column)
	public ArrayList<TableField> keyFields = new ArrayList<TableField>();
	public String currentTable = "";
	public StringTemplateGroup errorMessages;
}

@token {
	
}

schema_file:
	SCHEMA ID SEMI  
	set_property*
	schema_def* -> ^(SCHEMA ID set_property* schema_def*)
	;
	catch [RecognitionException re] {
		System.out.println("Error in schema file definition");
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}

schema_def:
	 (entity_def SEMI) -> entity_def
	|(dom_def SEMI) -> dom_def
	|(elem_def SEMI) -> elem_def
	|(link_def SEMI) -> link_def
;
	catch [RecognitionException re] {
		System.out.println(SchemaLangUtil.getErrorMessage("schema_def"));
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}

link_def:
	LINK id=ID (dir=FROM|dir=BETWEEN) left_side=ID (left_card=ONE|left_card=MANY) 
	(TO|AND) right_side=ID (right_card=ONE|right_card=MANY) -> ^(LINK $id $dir $left_side $left_card $right_side $right_card)
	;

set_property:
	SET ID '=' STRING SEMI -> ^(SET ID STRING)
	;
		catch [RecognitionException re] {
		System.out.println(SchemaLangUtil.getErrorMessage("set_property"));
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}

	
entity_def:
	ENTITY id=ID {currentTable = $id.text;}  '('
		eu+=elem_use (',' eu+=elem_use)*
	')' -> ^(ENTITY ID $eu+) 
	;
		catch [RecognitionException re] {
		System.out.println(SchemaLangUtil.getErrorMessage("entity_def"));
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}

dom_def:
	DOMAIN ID TYPE (t=TYPE_STRING | t=TYPE_INT | t=TYPE_NUMBER | t=TYPE_TIMESTAMP | t=TYPE_DATE)(LENGTH l=INT (PRECISION p=INT)?)?
	-> ^(DOMAIN ID $t  (LENGTH $l (PRECISION $p)?)?) ;
		catch [RecognitionException re] {
		System.out.println(SchemaLangUtil.getErrorMessage("dom_def"));
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}
	
dom_use:
	dom_def -> dom_def|
	DOMAIN ID -> ^(DOMAIN ID)
	;
		catch [RecognitionException re] {
		System.out.println(SchemaLangUtil.getDomainUsageError());
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}
	
elem_def:
	ELEMENT ID (STEXT STRING)? (MTEXT STRING)? (LTEXT STRING)? dom_use
	-> ^(ELEMENT ID (STEXT STRING)? (MTEXT STRING)? (LTEXT STRING)? dom_use)
	;
		catch [RecognitionException re] {
		System.out.println(SchemaLangUtil.getErrorMessage("elem_def"));
		reportError(re);
		consumeUntil(input, SEMI); // throw away all until ';'
		input.consume(); // eat the ';'
	}
	
key_elem_def:
	KEY ed=elem_def -> ^(KEY $ed)|
	KEY ne=named_elem -> ^(KEY $ne)
	;
	
named_elem:
	ELEMENT ID -> ^(ELEMENT ID)
	;
	
elem_use:
	elem_def -> elem_def |
	key_elem_def -> key_elem_def |
	named_elem -> named_elem
	;
	
WS :
  (' ' | '\t' | '\f')+ {$channel=HIDDEN;};

NL :
   ('\r' '\n' | '\r' | '\n') {$channel=HIDDEN;};

ML :
  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

SL :
  '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;};


SCHEMA: ('S'|'s')('C'|'c')('H'|'h')('E'|'e')('M'|'m')('A'|'a');
   
ATTR: ('A' | 'a')('T' | 't')('T' | 't')('R' | 'r');

TYPE: ('T' | 't')('Y' | 'y')('P' | 'p')('E' | 'e');

KEY: ('K' | 'k')('E' | 'e')('Y' | 'y');

LENGTH: ('L' | 'l')('E' | 'e')('N' | 'n')('G' | 'g')('T' | 't')('H' | 'h');

PRECISION: ('P' | 'p')('R' | 'r')('E' | 'e')('C' | 'c')('I' | 'i')('S' | 's')('I' | 'i')('O' | 'o')('N' | 'n');

ENTITY: ('E' | 'e')('N' | 'n')('T' | 't')('I' | 'i')('T' | 't')('Y' | 'y');

DOMAIN: ('D' | 'd')('O' | 'o')('M' | 'm')('A' | 'a')('I' | 'i')('N' | 'n');

ELEMENT: ('E'|'e')('L'|'l')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

MTEXT: ('M'|'m')('T'|'t')('E'|'e')('X'|'x')('T'|'t');

LTEXT: ('L'|'l')('T'|'t')('E'|'e')('X'|'x')('T'|'t');

STEXT: ('S'|'s')('T'|'t')('E'|'e')('X'|'x')('T'|'t');
 
TYPE_INT: ('I' | 'i')('N' | 'n')('T' | 't');

TYPE_DATE: ('D' | 'd')('A' | 'a')('T' | 't')('E'|'e');

TYPE_TIMESTAMP: ('T'|'t')('I'|'i')('M'|'m')('E'|'e')('S'|'s')('T'|'t')('A'|'a')('M'|'m')('P'|'p');

SET: ('S' |'s')('E'|'e')('T'|'t');

TYPE_STRING: ('S' | 's')('T' | 't')('R' | 'r')('I' | 'i')('N' | 'n')('G' | 'g');

TYPE_NUMBER: ('N' | 'n')('U' | 'u')('M' | 'm')('B' | 'b')('E' | 'e')('R' | 'r');

ONE: ('O'|'o')('N'|'n')('E'|'e');

MANY: ('M'|'m')('A'|'a')('N'|'n')('Y'|'y');

LINK: ('L'|'l')('I'|'i')('N'|'n')('K'|'k');

FROM: ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

TO: ('T'|'t')('O'|'o');

AND: ('A'|'a')('N'|'n')('D'|'d');

BETWEEN: ('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n');


fragment
Letter :
  'a'..'z' |
  'A'..'Z';
 
fragment
Digit :
  '0'..'9';

ID :
  Letter (Letter | Digit | '_')*;

SEMI: ';';



STRING :
  '"' (~('"'|'\n'|'\r'))* '"';
 

INT :
  Digit Digit*;