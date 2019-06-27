package eu.reitmayer.schemagen.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import eu.reitmayer.schemagen.lang.SchemaLangLexer;
import eu.reitmayer.schemagen.lang.SchemaLangParser;

public class TestTree {

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
	}

}
