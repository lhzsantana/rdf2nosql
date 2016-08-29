package rendezvous.rdf2nosql.transformers.impl;

import java.util.List;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.basicStructures.DocumentBasicStructure;
import rendezvous.rdf2nosql.transformers.RDF2NoSQLTransformer;

public class RDF2Document extends RDF2NoSQLTransformer{

	private static RDF2Document instance;
	
	public static RDF2Document getInstance(){		
		if(instance==null){
			return new RDF2Document();
		}
		return instance;
	}
	
	public List<DocumentBasicStructure> transform(Statement statement) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	protected void updateCanonicalModel(Statement statement) {
		// TODO Auto-generated method stub
		
	}
}
