package rendezvous.rdf2nosql.fragments;

import java.util.Collection;
import java.util.Set;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;
import rendezvous.rdf2nosql.basicStructures.KeyValueBasicStructure;

public class KeyValueFragment extends Fragment<KeyValueBasicStructure>{

	public KeyValueFragment(Statement statement) {
		super(Type.KEYVALUE, statement);
	}
	
	@Override
	public void setBasicStructures(Collection<KeyValueBasicStructure> basicStructures) {
		// TODO Auto-generated method stub
		
	}
}
