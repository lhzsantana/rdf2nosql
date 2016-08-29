package rendezvous.rdf2nosql;

import rendezvous.rdf2nosql.mapper.Mapper;

public abstract class DataHandler {
	
	protected static Mapper mapper;
	
	public DataHandler(Mapper mapper){
		if(mapper==null){
			throw new RuntimeException("Can't proceed without a mapper");
		}
		DataHandler.mapper=mapper;
	}

}
