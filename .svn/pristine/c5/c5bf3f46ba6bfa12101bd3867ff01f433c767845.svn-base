package eu.reitmayer.schemagen.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;


public class SchemaLangUtil {

	private static StringTemplateGroup errorMessages;
	
	static {
		try {
			if (errorMessages == null)
			errorMessages = new StringTemplateGroup(new FileReader(new File("./src/ErrorMessages.stg")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static String getErrorMessage(String templateName) {
		StringTemplate template = errorMessages.lookupTemplate(templateName);
		return template != null ? "" : template.toString();
	}
	public static String getDomainUsageError() {
		return getErrorMessage("dom_use");
	}
	
	
}
