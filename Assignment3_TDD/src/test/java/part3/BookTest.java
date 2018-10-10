package part3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	Book obj;

	@Before
	public void setUp() throws Exception {
		obj = new Book();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void test() {
		obj.checkIn();
		assertTrue(obj.getAvailable());
		obj.checkOut();
		assertFalse(obj.getAvailable());
	}
}

