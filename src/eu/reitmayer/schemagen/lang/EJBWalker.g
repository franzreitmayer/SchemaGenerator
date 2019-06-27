tree grammar EJBWalker;

options {
  language = Java;
  output = template;
  tokenVocab = SchemaLang;
  ASTLabelType = CommonTree;
}
@header{
package eu.reitmayer.schemagen.lang;
}

@members {
	public Schema schema = new Schema();
}

schema_file:
 ^(SCHEMA ID set_property* schema_def*) {schema.setSchemaName($ID.text);}
	;

schema_def:
	  entity_def
	| dom_def
	| elem_def
	| link_def
;




set_property:
	^(SET ID STRING)
	;
	
entity_def:
	^(ENTITY ID elem_use+) -> pojo_class()
	;


link_def:
	 ^(LINK id=ID (dir=FROM|dir=BETWEEN) left_side=ID (left_card=ONE|left_card=MANY) right_side=ID (right_card=ONE|right_card=MANY))
	{
		schema.addSchemaLink($id.text, $left_side.text, $right_side.text, $left_card.text, $right_card.text, $dir.text);
	}
	;

dom_def returns[String domainID]:
	^(DOMAIN ID (t=TYPE_STRING | t=TYPE_INT | t=TYPE_NUMBER | t=TYPE_TIMESTAMP | t=TYPE_DATE) (LENGTH l=INT (PRECISION p=INT)?)? ) 
	{schema.addDomain($ID.text, $t.text, $l.text, $p.text);
	$domainID = $ID.text;}
	;
	
dom_use returns[String domainID]:
	dom_def {$domainID = $dom_def.domainID;}|
	^(DOMAIN ID) {$domainID = $ID.text;}
	;
	
elem_def returns[String elementID]:
	^(ELEMENT id=ID (STEXT s=STRING)? (MTEXT m=STRING)? (LTEXT l=STRING)? dom_use)
	{
	schema.addElement($id.text, $s.text, $m.text, $l.text, schema.findDomain($dom_use.domainID));
	$elementID = $id.text;
	}
	;
	

key_elem_def returns[String elementID]:
	^(KEY ed=elem_def) {$elementID = $ed.elementID;}|
	^(KEY ne=named_elem) {$elementID = $ne.elementID;}
	;
	
named_elem returns[String elementID]:
	^(ELEMENT ID) {$elementID = $ID.text;}
	;
	
elem_use returns[String elementID, Boolean isKey]:
	elem_def |
	key_elem_def |
	named_elem 
	;
