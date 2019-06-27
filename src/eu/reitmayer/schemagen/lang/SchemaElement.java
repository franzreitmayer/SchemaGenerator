package eu.reitmayer.schemagen.lang;

public class SchemaElement {

	public String id;
	
	public String longText;
	
	public String middleText;
	
	public String shortText;
	
	public SchemaDomain domain;

	public SchemaElement(String id, String longText, String middleText,
			String shortText, SchemaDomain domain) {
		super();
		this.id = id;
		this.longText = longText;
		this.middleText = middleText;
		this.shortText = shortText;
		this.domain = domain;
	}
	
	public SchemaElement(String id, String longText, String middleText,
			String shortText) {
		super();
		this.id = id;
		this.longText = longText;
		this.middleText = middleText;
		this.shortText = shortText;
	}

	public SchemaElement(String id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "SchemaElement [id=" + id + ", longText=" + longText
				+ ", middleText=" + middleText + ", shortText=" + shortText
				+ ", domain=" + domain + "]";
	}

	
	
}
