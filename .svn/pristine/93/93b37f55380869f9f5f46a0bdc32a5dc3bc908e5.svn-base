package eu.reitmayer.schemagen.lang;

import java.util.LinkedList;
import java.util.List;

public class SchemaEntity {

	public String id;
	
	public List<SchemaElement> elements = new LinkedList<SchemaElement>();
	
	public List<SchemaElement> keys = new LinkedList<SchemaElement>();
	
	public List<SchemaElement> foreignKeys = new LinkedList<SchemaElement>();
	
	
	public SchemaEntity(String id) {
		super();
		this.id = id;
	}


	public void addElement(SchemaElement element, Boolean isKey) {
		elements.add(element);
		if (isKey) { // if key, then also add to keys
			keys.add(element);
		}
	}


	@Override
	public String toString() {
		return "SchemaEntity [id=" + id + ", elements=" + elements + ", keys="
				+ keys + "]";
	}
	
	public List<String> getForeignKeyIds() {
		List<String> foreignKeyIds = new LinkedList<String>();
		for (SchemaElement elem: foreignKeys) {
			foreignKeyIds.add(elem.id);
		}
		return foreignKeyIds;
	}
	
	public List<String> getForeignKeyIds(String linkId) {
		List<String> foreignKeyIds = new LinkedList<String>();
		for (SchemaElement elem: foreignKeys) {
			if (elem.id.startsWith(linkId))
			foreignKeyIds.add(elem.id);
		}
		return foreignKeyIds;
	}

	public List<String> getKeyIds() {
		List<String> keyIds = new LinkedList<String>();
		for (SchemaElement elem: keys) {
			keyIds.add(elem.id);
		}
		return keyIds;
	}
	
}
