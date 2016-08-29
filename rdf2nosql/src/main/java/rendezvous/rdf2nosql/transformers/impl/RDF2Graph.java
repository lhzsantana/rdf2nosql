package rendezvous.rdf2nosql.transformers.impl;

import java.util.Collection;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.basicStructures.GraphBasicStructure;
import rendezvous.rdf2nosql.transformers.RDF2NoSQLTransformer;

public class RDF2Graph extends RDF2NoSQLTransformer{

	private static RDF2Graph instance;
	
	public static RDF2Graph getInstance(){		
		if(instance==null){
			return new RDF2Graph();
		}
		return instance;
	}
	
	public Collection<GraphBasicStructure> transform(Statement statement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void updateCanonicalModel(Statement statement) {
		// TODO Auto-generated method stub
		
	}
}
