package in.co.capgemini;


import java.util.Collection;



public interface BookDao {

	void addBook(Book books);
	
	Collection<Book> viewAllBooks();
	
	Book getBookByName(String bookName);
	
}