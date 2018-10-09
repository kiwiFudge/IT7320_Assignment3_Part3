package part3;

import java.util.ArrayList;

public class Library {

	ArrayList<Book> books = new ArrayList<Book>();
	
	public boolean bookAvailable(String t) {
		
		for(Book b : books) {
			if(b.getTitle().equals(t)) {
				return b.getAvailable();
			}
		}
		return false;
	}
}

