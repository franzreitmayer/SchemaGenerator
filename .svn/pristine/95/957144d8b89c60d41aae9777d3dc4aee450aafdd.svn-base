package eu.reitmayer.schemagen.lang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class Schema {

	public String schemaName = "";
	
	public Properties properties = new Properties();
	
	public List<SchemaDomain> domains = new LinkedList<SchemaDomain>();
	
	public List<SchemaElement> elements = new LinkedList<SchemaElement>();
	 
	public List<SchemaEntity> entities = new LinkedList<SchemaEntity>();
	
	public List<SchemaLink> links = new LinkedList<SchemaLink>();

	public Schema(String schemaName, Properties properties,
			List<SchemaDomain> domains, List<SchemaElement> elements,
			List<SchemaEntity> entities) {
		super();
		this.schemaName = schemaName;
		this.properties = properties;
		this.domains = domains;
		this.elements = elements;
		this.entities = entities;
	}

	public Schema() {
		super();
	}

	public Schema(String schemaName) {
		super();
		this.schemaName = schemaName;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<SchemaDomain> getDomains() {
		return domains;
	}

	public void setDomains(List<SchemaDomain> domains) {
		this.domains = domains;
	}

	public List<SchemaElement> getElements() {
		return elements;
	}

	public void setElements(List<SchemaElement> elements) {
		this.elements = elements;
	}

	public List<SchemaEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<SchemaEntity> entities) {
		this.entities = entities;
	}
	
	public void addDomain(String id, String type, Integer length, Integer precision) {
		SchemaDomain domain = _findDomain(id);
		if (domain != null) {
			throw new SchemaException("The domain " + id + " is already defined.");
		}
		domain = new SchemaDomain(id, type, length, precision);
		domains.add(domain);
	}
	
	public void addDomain(String id, String type, String stringLength, String stringPrecision) {
		addDomain(id, type,
				stringLength != null ? Integer.parseInt(stringLength) : null,
				stringPrecision != null ? Integer.parseInt(stringPrecision): null);
	}

		private SchemaDomain _findDomain(String id) {
		for (SchemaDomain domain: domains) {
			if (domain.id.equals(id)) {
				return domain;
			}
		}
		return null;
	}
	
	public SchemaDomain findDomain(String id) {
		SchemaDomain domain = _findDomain(id);
		if (domain == null) {
			throw new SchemaException("The domain " + id + " isn't defined.");
		}
		return domain;
	}
	
	private SchemaElement _findElement(String id) {
		for(SchemaElement element: elements) {
			if(element.id.equals(id)) {
				return element;
			}
		}
		return null;
	}
	
	public SchemaElement findElement(String id) {
		SchemaElement element = _findElement(id);
		if (element == null) 
			throw new SchemaException("The element " + id + " isn't defined.");
		return element;
	}
	
	public void addElement(String id, String shortText, String middleText, String longText, SchemaDomain domain) {
		SchemaElement element = _findElement(id);
		if (element != null) 
			throw new SchemaException("The element " + id + " is already defined.");
		element = new SchemaElement(id, longText, middleText, shortText, domain);
		elements.add(element);
	}
	
	public void setProperty(String propertyName, String propertValue) {
		properties.put(propertyName, propertValue);
	}
	
	private SchemaEntity _findEntity(String id) {
		for(SchemaEntity entity: entities) {
			if (entity.id.equals(id)) {
				return entity;
			}
		}
		return null;
	}
	
	public SchemaEntity findEntity(String id) {
		SchemaEntity entity = _findEntity(id);
		if (entity == null)
			throw new SchemaException("The entity with id " + id + " isn't defined.");
		return entity;
	}
	
	public void addEntity(String id) {
		SchemaEntity entity = _findEntity(id);
		if (entity != null) 
			throw new SchemaException("The entity " + id + " is already defined,");
		entity = new SchemaEntity(id);
		entities.add(entity);
	}

	public List<String> getKeysOfEntity(String entityID) {
		SchemaEntity entity = findEntity(entityID);
		List<String> keyColumnNames = new LinkedList<String>();
		for (SchemaElement key: entity.keys) {
			keyColumnNames.add(key.id);
		}
		return keyColumnNames;
	}
	
	private SchemaLink _findSchemaLink(String linkID) {
		for (SchemaLink link: links) {
			if (link.id.equals(linkID)) return link;
		}
		return null;
	}
	
	public SchemaLink findSchemaLink(String linkID) {
		SchemaLink link = _findSchemaLink(linkID);
		if (link == null)
			throw new SchemaException("The link " + linkID + " isn't defined.");
		return link;
	}
	
	public void addSchemaLink(String id, String leftSideEntityId, String rightSideEntityId, String leftSideCardinalty
			, String rightSideCardinality, String navigateDirection) {
		SchemaLink link = _findSchemaLink(id);
		if (link != null)
			throw new SchemaException("The link " + id + " is already defined.");
		
		if (_findEntity(leftSideEntityId) == null)
			throw new SchemaException("The left side entity " + leftSideEntityId + " of link " + id + " isn't defined.");
		
		if (_findEntity(rightSideEntityId) == null)
			throw new SchemaException("The right side entity " + rightSideEntityId + " of link " + id + " isn't defined.");
		link = new SchemaLink(
				id, 
				leftSideEntityId, 
				rightSideEntityId, 
				leftSideCardinalty, 
				rightSideCardinality, 
				navigateDirection);
		links.add(link);
		
		if (	(leftSideCardinalty.equals("ONE") && rightSideCardinality.equals("MANY"))
				|| (rightSideCardinality.equals("ONE") && leftSideCardinalty.equals("MANY"))) {
			if (leftSideCardinalty.equals("MANY")) {
				SchemaEntity leftSideEntity = findEntity(leftSideEntityId);
				SchemaEntity rightSideEntity = findEntity(rightSideEntityId);
				for (SchemaElement key: rightSideEntity.keys) {
					SchemaElement foreignKeyElement = 
							new SchemaElement(id + "_" + key.id, key.longText, key.middleText, key.shortText, key.domain);
					leftSideEntity.foreignKeys.add(foreignKeyElement);
				}
			} else {
				SchemaEntity leftSideEntity = findEntity(leftSideEntityId);
				SchemaEntity rightSideEntity = findEntity(rightSideEntityId);
				for (SchemaElement key: leftSideEntity.keys) {
					SchemaElement foreignKeyElement = 
							new SchemaElement(id + "_" + key.id, key.longText, key.middleText, key.shortText, key.domain);
					rightSideEntity.foreignKeys.add(foreignKeyElement);
				}
				
			}
		}
	}
	
	@Override
	public String toString() {
		return "Schema [schemaName=" + schemaName + ", properties="
				+ properties + ", domains=" + domains + ", elements="
				+ elements + ", entities=" + entities + "]";
	}
	
	
	
	
}
