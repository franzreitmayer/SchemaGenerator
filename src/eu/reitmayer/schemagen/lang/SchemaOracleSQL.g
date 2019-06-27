tree grammar SchemaOracleSQL;

options {
  language = Java;
  output = template;
  tokenVocab = SchemaLang;
  ASTLabelType = CommonTree;
}

@header {
package eu.reitmayer.schemagen.lang;
}

@members {
public List<TableField> keyFields = new ArrayList<TableField>();

public String getOracleType(String internalType) {
	return SchemaOracleUtil.getOracleType(internalType);
}

public List<String> getKeyList(String tableName) {
	return SchemaOracleUtil.getKeyList(tableName, keyFields);
}

public Schema schema = new Schema();
}

schema_file:
	(d+=entity_def  
	|d+=attr_def)* -> file(defs={$d})
	 
	;
	
	
entity_def:
	^(ENTITY id=ID
		ua+=use_attr*)
	 -> table(name={$id.text}, cols={$ua}, keys={getKeyList($id.text)})
	;


use_attr:
	ad=attr_def -> {$ad.st};


	
attr_def:
	^(ATTR id=ID (t=TYPE_STRING | t=TYPE_INT | t=TYPE_NUMBER))
		-> simple_column(name={$id.text}, type={getOracleType($t.text)}) |
	^(ATTR id=ID (t=TYPE_STRING | t=TYPE_INT | t=TYPE_NUMBER) i=INT)
		-> length_column(name={$id.text}, type={getOracleType($t.text)}, len={$i.text}) |
	^(ATTR id=ID (t=TYPE_STRING | t=TYPE_INT | t=TYPE_NUMBER) i=INT p=INT)
		-> precision_column(name={$id.text}, type={getOracleType($t.text)}, len={$i.text}, precision={$p.text})
		
	;
