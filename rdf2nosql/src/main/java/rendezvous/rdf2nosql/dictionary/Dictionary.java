package rendezvous.rdf2nosql.dictionary;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;

public abstract class Dictionary {
	
	private final static String KEY_SEPARATOR = ":";
	
	public abstract Collection<Fragment> getAll();

	public abstract Fragment get(String id, Type type);
	
	public abstract void register(Fragment fragment);	

	public Set<Fragment> get(String id){
		Set<Fragment> fragments = new HashSet<Fragment>();
		fragments.add(get(id, Type.COLUNAR));
		fragments.add(get(id, Type.DOCUMENT));
		fragments.add(get(id, Type.GRAPH));
		fragments.add(get(id, Type.KEYVALUE));
		
		return fragments;
	}

	public void register(Set<Fragment> fragments){
		
		for(Fragment fragment: fragments){
			register(fragment);
		}
	}
	
	public String generateKey(Fragment fragment){
		return generateKey(fragment.getId(), fragment.getType());
	}
	
	public String generateKey(String id, Type type){
		return new StringBuilder()
			    .append(type.toString())
			    .append(KEY_SEPARATOR)
			    .append(id)
			    .toString();
	}
}
