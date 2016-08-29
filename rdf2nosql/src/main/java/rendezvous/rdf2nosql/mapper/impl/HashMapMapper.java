package rendezvous.rdf2nosql.mapper.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.RDF2NoSQL;
import rendezvous.rdf2nosql.RDF2NoSQL.Type;
import rendezvous.rdf2nosql.mapper.Mapper;

public class HashMapMapper extends Mapper {
	
	public static Map<Statement, Type> map = new HashMap<Statement, Type>();

	@Override
	public Type getStatementType(Statement statement) {
				
		System.out.println(statement);
		
		//return map.get(statement);
		
		return RDF2NoSQL.Type.KEYVALUE;
	}

}
