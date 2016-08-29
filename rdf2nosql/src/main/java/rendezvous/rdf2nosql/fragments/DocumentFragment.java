package rendezvous.rdf2nosql.fragments;

import java.util.Collection;
import java.util.Set;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;
import rendezvous.rdf2nosql.basicStructures.DocumentBasicStructure;

public class DocumentFragment extends Fragment<DocumentBasicStructure>{

	public DocumentFragment(Statement statement) {
		super(Type.DOCUMENT, statement);
	}

	@Override
	public void setBasicStructures(Collection<DocumentBasicStructure> basicStructures) {
		// TODO Auto-generated method stub
		
	}
	
}
