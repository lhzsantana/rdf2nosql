package rendezvous.rdf2nosql.basicStructures;

import rendezvous.rdf2nosql.BasicStructure;

public class KeyValueBasicStructure extends BasicStructure{

	private String key;
	private String value;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}	
	
}