package rendezvous.rdf2nosql;

import java.util.Set;

import org.apache.jena.rdf.model.Model;

import rendezvous.rdf2nosql.assembler.Assembler;
import rendezvous.rdf2nosql.dictionary.Dictionary;
import rendezvous.rdf2nosql.dictionary.impl.HashMapDictionary;
import rendezvous.rdf2nosql.fragmenter.Fragmenter;
import rendezvous.rdf2nosql.mapper.Mapper;
import rendezvous.rdf2nosql.mapper.impl.HashMapMapper;

public class RDF2NoSQL 
{
	public Mapper mapper = new HashMapMapper();
	public Dictionary dictionary = new HashMapDictionary();
	public Assembler assembler = new Assembler(mapper);
	
	public enum Type {DOCUMENT, KEYVALUE, COLUNAR, GRAPH}
	
	public void insert(Model model) {
		
		Fragmenter fragmenter = new Fragmenter(mapper);
		
		@SuppressWarnings("rawtypes")
		Set<Fragment> fragments = fragmenter.fragment(model.listStatements().toList());
		
		dictionary.register(fragments);
	}

	public Model getModel() {
		
		assembler.assembly(dictionary.getAll());
		
		return null;
	};

}
