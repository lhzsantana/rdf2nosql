package rendezvous.rdf2nosql.transformers.impl;

import java.util.List;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.BasicStructure;
import rendezvous.rdf2nosql.basicStructures.ColunarBasicStructure;
import rendezvous.rdf2nosql.transformers.RDF2NoSQLTransformer;

public class RDF2Colunar extends RDF2NoSQLTransformer{
	
	private static RDF2Colunar instance;
	
	public static RDF2Colunar getInstance(){		
		if(instance==null){
			return new RDF2Colunar();
		}
		return instance;
	}

	public List<ColunarBasicStructure> transform(Statement statement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void updateCanonicalModel(Statement statement) {
		// TODO Auto-generated method stub
		
	}
}
