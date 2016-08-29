package rendezvous.rdf2nosql.mapper;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.RDF2NoSQL.Type;

public abstract class Mapper {
	
	public abstract Type getStatementType(Statement statement);

}
