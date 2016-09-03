package rendezvous.rdf2nosql;

import java.util.HashSet;
import java.util.Set;

import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;

public class CanonicalModel {

	private static CanonicalModel instance;
	
	public static CanonicalModel getInstance(){		
		if(instance==null){
			return new CanonicalModel();
		}
		return instance;
	}
	
	private Set<Resource> dataStructures = new HashSet<Resource>();
	private Set<Statement> properties = new HashSet<Statement>();

	public void addDataStructure(Resource resource){
		dataStructures.add(resource);
	}
	
	public boolean containsDataStructure(Resource resource){
		return dataStructures.contains(resource);
	}
	
	public void addProperty(Statement statement){
		properties.add(statement);
	}
	
	public boolean containsProperty(Statement statement){
		return properties.contains(statement);
	}

}
