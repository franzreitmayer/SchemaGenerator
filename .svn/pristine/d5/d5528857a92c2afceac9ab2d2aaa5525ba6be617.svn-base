package eu.reitmayer.schemagen.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;



public class SchemaOracleUtil {

	
	public static StringTemplateGroup stg = null;
	
	static {
		try {
			stg = new StringTemplateGroup(new FileReader(new File("./src/OracleSchema.stg")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getOracleType(String internalType) {
		internalType = internalType.toLowerCase();
		if (internalType.equals("string")) {
			return "VARCHAR2";
		} else if (internalType.equals("int")) {
			return "INTEGER";
		} else if (internalType.equals("number")) {
			return "NUMBER";
		} else if (internalType.equals("date")) {
			return "DATE";
		} else if (internalType.equals("timestamp")) {
			return "TIMESTAMP";
		}
		return null;
	}
	
	public static List<String> getKeyList(String tableName, List<TableField> tableFields) {
		List<String> list = new ArrayList<String>();
		for (TableField field: tableFields) {
			if (field.tableName.equals(tableName)) {
				list.add(field.fieldName);
			}
		}
		return list;
	}
	
	public static String getColumnSpec(SchemaElement element) {
		StringTemplate template = stg.getInstanceOf("column_named");
		template.setAttribute("name", element.id);
		template.setAttribute("type", getOracleType(element.domain.type));
		template.setAttribute("len", element.domain.length);
		template.setAttribute("precision", element.domain.precision);
		return template.toString();
	}
	
	public static List<String> getForeignKeyDefinitions(Schema schema, String entityID) {
		List<String> foreignKeyDefs = new LinkedList<String>();
		for (SchemaElement element: schema.findEntity(entityID).foreignKeys) {
			foreignKeyDefs.add(getColumnSpec(element));
		}
		return foreignKeyDefs;
	}
	
	public static List<String> getLinkTableColumns(Schema schema, String leftTable, String rightTable) {
		SchemaEntity leftEntity = schema.findEntity(leftTable);
		SchemaEntity rightEntity = schema.findEntity(rightTable);
		List<String> columns = new LinkedList<String>();
		for (SchemaElement element: leftEntity.keys) {
			columns.add(getColumnSpec(element));
		}
		for (SchemaElement element: rightEntity.keys) {
			columns.add(getColumnSpec(element));
		}
		return columns;
	}
}
