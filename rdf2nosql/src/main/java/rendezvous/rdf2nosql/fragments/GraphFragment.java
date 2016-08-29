package rendezvous.rdf2nosql.fragments;

import java.util.Collection;
import java.util.Set;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;
import rendezvous.rdf2nosql.basicStructures.GraphBasicStructure;

public class GraphFragment extends Fragment<GraphBasicStructure>{

	public GraphFragment(Statement statement) {
		super(Type.GRAPH, statement);
	}

	@Override
	public void setBasicStructures(Collection<GraphBasicStructure> basicStructures) {
		// TODO Auto-generated method stub
		
	}
}
