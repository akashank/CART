package in.co.capgemini;

import java.util.Collection;

public  class BookServiceImp implements BookService {

	private BookDao dao = new BookDaoImp();
	private CartList cart = new CartList();

	public void addNewBook() {
		dao.addBook(new Book("Twilight", 500, 1, "Part 1 of the Saga", "Stephenie Meyer", "Twilight.jpg"));

		dao.addBook(new Book("New Moon", 350, 1, "Part 2 of the Saga", "Stephenie Meyer", "New Moon.jpg"));

		dao.addBook(new Book("Eclipse", 600, 1, "Part 3 of the Saga", "Stephenie Meyer", "Eclipse.jpg"));

		dao.addBook(new Book("Breaking Dawn Part ", 500, 1, "Part 4 of the Saga", "Stephenie Meyer",
				"Breaking Dawn Part 1.jpg"));

		dao.addBook(new Book("Breaking Dawn Part 2", 700, 1, "Part 5 of the Saga", "Stephenie Meyer",
				"Breaking Dawn Part 2.jpg"));

	}

	@Override
	public Collection<Book> viewAllBooks() {

		return dao.viewAllBooks();
	}

	public Book getBookByName(String bookName) {

		return dao.getBookByName(bookName);
	}

	public void addBooksToCart(String bookName) {

		cart.addBookToCart(bookName);
	}

	public Collection<Book> displayCart() {

		return displayCart();
	}

	public void removeFromCart(String removedBook) {

		cart.removeFromCart(removedBook);
	}

	public int getCount() {
		return cart.getCount();
	}
}