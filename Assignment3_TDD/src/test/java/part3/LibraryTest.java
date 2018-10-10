package part3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

	Library obj;
	Book book1, book2, book3;
	
	@Before
	public void setUp() throws Exception {
		obj = new Library();
		book1 = new Book("title1");
		book2 = new Book("title2");
		book3 = new Book("title3");
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		book1 = null; book2 = null; book3 = null;
	}

	@Test
	public void testAddBook() {	
		obj.addBook(book1);
		obj.addBook(book2);
		obj.addBook(book3);
		assertEquals(Arrays.asList(book1, book2, book3), obj.books);
	}
	
	@Test
	public void testBookAvailable() {
		obj.addBook(book1);
		obj.addBook(book2);
		obj.books.get(0).checkIn();
		assertTrue(obj.bookAvailable("title1"));
		obj.books.get(0).checkOut();
		assertFalse(obj.bookAvailable("title1"));
		
		assertFalse(obj.bookAvailable("title2"));
	}
}

