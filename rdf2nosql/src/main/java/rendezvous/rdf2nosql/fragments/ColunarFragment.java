package rendezvous.rdf2nosql.fragments;

import java.util.Collection;
import java.util.Set;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;
import rendezvous.rdf2nosql.basicStructures.ColunarBasicStructure;

public class ColunarFragment extends Fragment<ColunarBasicStructure>{

	public ColunarFragment(Statement statement) {
		super(Type.COLUNAR, statement);
	}

	@Override
	public void setBasicStructures(Collection<ColunarBasicStructure> basicStructures) {
		// TODO Auto-generated method stub
		
	}
	

}
