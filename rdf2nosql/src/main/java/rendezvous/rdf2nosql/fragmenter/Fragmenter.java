package rendezvous.rdf2nosql.fragmenter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.DataHandler;
import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.fragments.ColunarFragment;
import rendezvous.rdf2nosql.fragments.DocumentFragment;
import rendezvous.rdf2nosql.fragments.GraphFragment;
import rendezvous.rdf2nosql.fragments.KeyValueFragment;
import rendezvous.rdf2nosql.mapper.Mapper;
import rendezvous.rdf2nosql.transformers.impl.RDF2Colunar;
import rendezvous.rdf2nosql.transformers.impl.RDF2Document;
import rendezvous.rdf2nosql.transformers.impl.RDF2Graph;
import rendezvous.rdf2nosql.transformers.impl.RDF2KeyValue;

public class Fragmenter extends DataHandler {
	
	public Fragmenter(Mapper mapper) {
		super(mapper);
	}

	public Set<Fragment> fragment(List<Statement> statements){

		Set<Fragment> fragments = new HashSet<Fragment>();

		for(Statement statement : statements){				
			fragments.add(toFragment(statement));
		}
		
		return fragments;
	}
	
	private Fragment toFragment(Statement statement){
		
		switch(mapper.getStatementType(statement)){
			case COLUNAR:
					return getColunarFragment(statement);
			case DOCUMENT:
					return getDocumentFragment(statement);
			case GRAPH:
					return getGraphFragment(statement);
			case KEYVALUE:
					return getKeyValueFragment(statement);
			default:
					throw new RuntimeException();					
		}
	}

	private ColunarFragment getColunarFragment(Statement statement){
		
		ColunarFragment colunarFragment = new ColunarFragment(statement);

		colunarFragment.setBasicStructures(RDF2Colunar.getInstance().transform(statement));
				
		return colunarFragment;
	}
	
	private DocumentFragment getDocumentFragment(Statement statement){
		
		DocumentFragment documentFragment = new DocumentFragment(statement);
		
		documentFragment.setBasicStructures(RDF2Document.getInstance().transform(statement));
				
		return documentFragment;
	}
		
	private GraphFragment getGraphFragment(Statement statement){
		
		GraphFragment graphFragment = new GraphFragment(statement);

		graphFragment.setBasicStructures(RDF2Graph.getInstance().transform(statement));
				
		return graphFragment;
	}
	
	private KeyValueFragment getKeyValueFragment(Statement statement){				
				
		return RDF2KeyValue.getInstance().transform(statement);
	}	
}
