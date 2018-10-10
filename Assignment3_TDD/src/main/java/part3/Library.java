package part3;

import java.util.ArrayList;
import java.util.List;

public class Library {

	public List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book b) {
		this.books.add(b);
	}
	
	public boolean bookAvailable(String t) {
		for(Book b : books) {
			if(b.getTitle().equals(t)) {
				return b.getAvailable();
			}
		}
		return false;
	}
}

