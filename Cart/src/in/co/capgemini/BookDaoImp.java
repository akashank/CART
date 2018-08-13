package in.co.capgemini;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



public class BookDaoImp implements BookDao{

	public static Map<String, Book> bookDB = new HashMap<>();
	
	@Override
	public void addBook(Book books) {
		
		bookDB.put(books.getBookName(), books);
		
	}

	@Override
	public Collection<Book> viewAllBooks() {
		
		return bookDB.values();
		
	}

	@Override
	public Book getBookByName(String bookName) {
		
		return bookDB.get(bookName);
		
	}

}