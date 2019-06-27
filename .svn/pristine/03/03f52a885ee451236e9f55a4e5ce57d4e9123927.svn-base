package eu.reitmayer.schemagen.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

import eu.reitmayer.schemagen.lang.Schema;
import eu.reitmayer.schemagen.lang.SchemaLangLexer;
import eu.reitmayer.schemagen.lang.SchemaLangParser;
import eu.reitmayer.schemagen.lang.SchemaWalker;
import eu.reitmayer.schemagen.lang.TableField;

public class TestSchemaWalker {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws RecognitionException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, RecognitionException {
		ANTLRInputStream inStream = new ANTLRInputStream(new FileInputStream(new File(args[0])));
		SchemaLangLexer lexer = new SchemaLangLexer(inStream);
		
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		SchemaLangParser parser = new SchemaLangParser(tokenStream);
		
		SchemaLangParser.schema_file_return schemaFile = 
				parser.schema_file();
		
		CommonTree tree = (CommonTree)schemaFile.getTree();
		System.out.println(tree.toStringTree());
	
		List<TableField> t = parser.keyFields;
		for (TableField field: t) {
			System.out.println("Table: " + field.tableName + ", Key Field: " + field.fieldName);
		}
		FileReader fr = new FileReader("./src/OracleSchema.stg");
		StringTemplateGroup stg = new StringTemplateGroup(fr);
		fr.close();
		
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
		nodeStream.setTokenStream(tokenStream);
		/*
		SchemaOracleSQL oracleSQL = new SchemaOracleSQL(nodeStream);
		oracleSQL.setTemplateLib(stg);
		oracleSQL.keyFields = parser.keyFields;
		SchemaOracleSQL.schema_file_return oracleSchema = oracleSQL.schema_file();
		System.out.println(oracleSchema.getTemplate());
		*/
		SchemaWalker walker = new SchemaWalker(nodeStream);
		walker.schema = new Schema();
		walker.schema_file();
	}

}
