package rendezvous.rdf2nosql.dictionary.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import rendezvous.rdf2nosql.Fragment;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;
import rendezvous.rdf2nosql.dictionary.Dictionary;

public class HashMapDictionary extends Dictionary {
	
	public static Map<String, Fragment> map = new HashMap<String, Fragment>();

	@Override
	public Fragment get(String id, Type type) {
		return map.get(generateKey(id, type));
	}

	@Override
	public void register(Fragment fragment) {
		map.put(generateKey(fragment), fragment);
	}

	@Override
	public Collection<Fragment> getAll() {
		return (Collection<Fragment>) map.values();
	}
}
