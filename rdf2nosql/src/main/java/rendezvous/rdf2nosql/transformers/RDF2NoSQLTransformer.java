package rendezvous.rdf2nosql.transformers;

import org.apache.jena.rdf.model.Statement;

public abstract class RDF2NoSQLTransformer {
	
	protected abstract void updateCanonicalModel(Statement statement);


}
