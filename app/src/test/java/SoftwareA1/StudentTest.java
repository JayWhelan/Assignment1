package SoftwareA1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
	private Student testStudent ;
	
	
	@BeforeEach
	void setUp() throws Exception {
		 System.out.println("Setting up JUnit");
		 List<String> tmp = new ArrayList<String>();

			// add example
			tmp.add("A");
			tmp.add("B");
			tmp.add("C");
			testStudent = new Student("jay",14,"10/11/22",44,tmp,tmp);
	     
	}

	@AfterEach
	void tearDown() throws Exception {
		 System.out.println("Running: tearDown JUnit");
		 testStudent = null;
	     assertNull(testStudent);
	}

	@Test
	void test() {
		assertNotNull(testStudent.getUsername());
		//fail("Not yet implemented");
	}

}
