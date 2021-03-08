package book;
import javax.servlet.annotation.WebServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//annotations 


@WebServlet("/book")  //URI 
public class Book {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayHello() {
	 String response = "<?xml version='1.0'?>" + "<book>Book XML</book>";
		return response ;
	}
    
	/*
	 * public static void main(String[] args) { Book bK= new Book(); String
	 * Sample=bK.sayHello(); System.out.println(Sample); }
	 */
}
