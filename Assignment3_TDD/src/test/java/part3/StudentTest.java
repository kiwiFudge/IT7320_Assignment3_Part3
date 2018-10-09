package part3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	Student stud;
	
	@Before
	public void setUp() throws Exception {
		stud = new Student();
	}

	@After
	public void tearDown() throws Exception {
		stud = null;
	}

	@Test
	public void testCurrentStudent() {
		stud.studentStatus(true);
		assertTrue(stud.currentStudent());
		stud.studentStatus(false);
		assertFalse(stud.currentStudent());
	}
}
