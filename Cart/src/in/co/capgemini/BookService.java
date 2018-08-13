package in.co.capgemini;
import java.util.Collection;



public interface BookService {
	
	public void addNewBook();

	public Collection<Book> viewAllBooks();

 	public Book getBookByName(String bookName);


}