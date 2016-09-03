package rendezvous.rdf2nosql;

import static org.junit.Assert.*;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RDF2NoSQLTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	

	private RDF2NoSQL rdf2nosql;
	private Model model; 
	
	@Before
	public void setup(){
		rdf2nosql = new RDF2NoSQL();
		model = FileManager.get().loadModel("sample.rdf");	
	}
	
	@Test
	public void insertSimpleTest(){
		model = FileManager.get().loadModel("sample-simple.rdf");	
		rdf2nosql.insert(model);
	}	

	@Test
	public void insertTest(){
		rdf2nosql.insert(model);
	}	

	@Test
	public void getModelTest(){
		Model actualModel = rdf2nosql.getModel();
		
		Assert.assertEquals(model, actualModel);
	}	
	
	@Test
	public void validateModelTest(){
				
		for(Statement statement1:model.listStatements().toList()){
			
			System.out.println("---STATEMENT 1---");
			System.out.println(statement1.getSubject().toString());
			System.out.println(statement1.getPredicate().toString());
			System.out.println(statement1.getObject().toString());
			
			
			//check if have subnodes
						/*
			System.out.println("---SUBJECT---");
			System.out.println(statement.getSubject().);			

			System.out.println("---VALUE---");
			System.out.println(statement.getString());
			*/
			
		}
	}
	/*
	
	public void list(Statement statement){
		if(statement.isReified()){
	}/*/

}
