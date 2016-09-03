package rendezvous.rdf2nosql.transformers.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.CanonicalModel;
import rendezvous.rdf2nosql.basicStructures.KeyValueBasicStructure;
import rendezvous.rdf2nosql.fragments.KeyValueFragment;
import rendezvous.rdf2nosql.transformers.RDF2NoSQLTransformer;

public class RDF2KeyValue extends RDF2NoSQLTransformer{

	private static RDF2KeyValue instance;
	
	public static RDF2KeyValue getInstance(){		
		if(instance==null){
			return new RDF2KeyValue();
		}
		return instance;
	}
	
	CanonicalModel canonicalModel = CanonicalModel.getInstance();
	
	
	public KeyValueFragment transform(Statement statement) {
		
		KeyValueFragment fragment = new KeyValueFragment(statement);
		
		Set<KeyValueBasicStructure> basicStructures = new HashSet<KeyValueBasicStructure>();
		
		Resource subject = statement.getSubject();

		if(!canonicalModel.containsDataStructure(subject)){
			KeyValueBasicStructure basicStructureSubject = new KeyValueBasicStructure();
			
			basicStructures.add(basicStructureSubject);
		}
		
		RDFNode node = statement.getObject();

		if(node!=null && node.isResource()){
			
			Resource object = node.asResource();
			
			if(!canonicalModel.containsDataStructure(object)){
	
				KeyValueBasicStructure basicStructureObject = new KeyValueBasicStructure();
				
				basicStructures.add(basicStructureObject);
				
			}
		}

		fragment.setBasicStructures(basicStructures);
		
		return fragment;		
	}

	@Override
	protected void updateCanonicalModel(Statement statement) {
		
		Resource subject = statement.getSubject();
		
		if(!canonicalModel.containsDataStructure(subject)){
			canonicalModel.addDataStructure(subject);
		}

		Resource object = statement.getObject().asResource();
		
		if(!canonicalModel.containsDataStructure(object)){
			canonicalModel.addDataStructure(object);
		}
		
		canonicalModel.addProperty(statement);		
	}

}
