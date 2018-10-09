package part3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

	Library obj;
	Book book;
	
	@Before
	public void setUp() throws Exception {
		obj = new Library();
		book = new Book();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		book = null;
	}

	@Test
	public void testBookAvailable() {
		book.checkOut();
		assertFalse(obj.bookAvailable());
		book.checkIn();
		assertTrue(obj.bookAvailable());
	}
}
