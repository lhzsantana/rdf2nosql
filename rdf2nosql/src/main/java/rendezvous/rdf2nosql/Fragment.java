package rendezvous.rdf2nosql;

import java.util.Collection;
import java.util.Set;
import java.util.UUID;

import org.apache.jena.rdf.model.Statement;

import rendezvous.rdf2nosql.RDF2NoSQL.Type;

public abstract class Fragment<K> {
	
	private String id;
	private Type type;
	private Statement statement;
	
	public Fragment(Type type, Statement statement){
		this.id=UUID.randomUUID().toString();
		this.type=type;
		this.setStatement(statement);
	}
	
	public String getId(){
		return id;
	}

	public Type getType(){
		return type;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	public abstract void setBasicStructures(Collection<K> basicStructures);
}
