package SoftwareA1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mainTest {
	private Module testModule ;
	private Student testStudent1,testStudent2,testStudent3,testStudent4,testStudent5;
	private Lecturer testLecturer1;
	private CourseProgramme testCourse;
	
	
	@BeforeEach
	void setUp() throws Exception {
		 System.out.println("Setting up JUnit Module");
		 
		 List<Module> modules = new ArrayList<Module>();
		 List<Student> students = new ArrayList<Student>();
		 List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
		 
		 testLecturer1 = new Lecturer("Charlie", 42, "10/11/94", 424, null, "IT102");
		 
		 testModule = new Module("Database", testLecturer1, "CT22", null, null, "IT122");
		 
		 testStudent1 = new Student("James", 19, "10/11/2001", 4413, null, null);
		 testStudent2 = new Student("Oisin", 20, "21/11/2000", 4416, null, null);
		 testStudent3 = new Student("Chalie", 20, "19/12/2000", 7234, null, null);
		 testStudent4 = new Student("Emily", 21, "16/06/2000", 4623, null, null);
		 testStudent5 = new Student("Jermey", 19, "11/03/2001", 8463, null, null);
		 
		 DateTime dt1 = new DateTime("2020-12-13T21:39:45.618-08:00");
		 DateTime dt2 = new DateTime("2021-12-13T21:39:45.618-08:00");
		 
		 testCourse = new CourseProgramme("Computers", null, null, dt1, dt2);
		 
		 testModule.addStudent(testStudent1);
		 testModule.addStudent(testStudent2);
		 testModule.addStudent(testStudent3);
		 testModule.addCourses(testCourse);
		 
		 testCourse.addStudent(testStudent1);
		 testCourse.addStudent(testStudent4);
		 testCourse.addStudent(testStudent5);
		 testCourse.addModule(testModule);
		 
		 testLecturer1.addModule(testModule);
		 
		 testStudent1.addCourse(testCourse);
		 testStudent2.addCourse(testCourse);
		 testStudent3.addCourse(testCourse);
		 testStudent4.addCourse(testCourse);
		 testStudent5.addCourse(testCourse);
		 testStudent1.addModule(testModule);
		 testStudent2.addModule(testModule);
		 testStudent3.addModule(testModule);
		 testStudent4.addModule(testModule);
		 testStudent5.addModule(testModule);
	}

	@AfterEach
	void tearDown() throws Exception {
		 System.out.println("Running: tearDown JUnit");
		 testStudent1 = null;
		 testStudent2 = null;
		 testStudent3 = null;
		 testStudent4 = null;
		 testStudent5 = null;
		 testModule = null;
		 testLecturer1=null;
		 testCourse= null;
		 assertNull(testModule);
		 assertNull(testLecturer1);
		 assertNull(testStudent1);
		 assertNull(testStudent2);
		 assertNull(testStudent3);
		 assertNull(testStudent4);
		 assertNull(testStudent5);
		 assertNull(testCourse);
	}

	@Test
	void testStudent() {
		assertNotNull(testStudent1.getUsername());
		assertNotNull(testStudent1.getAge());
		assertNotNull(testStudent1.getCourses());
		assertNotNull(testStudent1.getDOB());
		assertNotNull(testStudent1.getModules());
		assertNotNull(testStudent1.getName());
		
		assertNotNull(testStudent2.getUsername());
		assertNotNull(testStudent2.getAge());
		assertNotNull(testStudent2.getCourses());
		assertNotNull(testStudent2.getDOB());
		assertNotNull(testStudent2.getModules());
		assertNotNull(testStudent2.getName());
		
		assertNotNull(testStudent3.getUsername());
		assertNotNull(testStudent3.getAge());
		assertNotNull(testStudent3.getCourses());
		assertNotNull(testStudent3.getDOB());
		assertNotNull(testStudent3.getModules());
		assertNotNull(testStudent3.getName());
		
		assertNotNull(testStudent4.getUsername());
		assertNotNull(testStudent4.getAge());
		assertNotNull(testStudent4.getCourses());
		assertNotNull(testStudent4.getDOB());
		assertNotNull(testStudent4.getModules());
		assertNotNull(testStudent4.getName());
		
		assertNotNull(testStudent5.getUsername());
		assertNotNull(testStudent5.getAge());
		assertNotNull(testStudent5.getCourses());
		assertNotNull(testStudent5.getDOB());
		assertNotNull(testStudent5.getModules());
		assertNotNull(testStudent5.getName());
	}
	
	@Test
	void testLecturer() {
		assertNotNull(testLecturer1.getUsername());
		assertNotNull(testLecturer1.getAge());
		assertNotNull(testLecturer1.getDOB());
		assertNotNull(testLecturer1.getModulesTought());
		assertNotNull(testLecturer1.getName());
		assertNotNull(testLecturer1.getRoomID());
	}
	
	@Test
	void testModule() {
		assertNotNull(testModule.getCourses());
		assertNotNull(testModule.getId());
		assertNotNull(testModule.getStudents());
		assertNotNull(testModule.getlecturer());
		assertNotNull(testModule.getName());
	}
	
	@Test
	void testCourses() {
		assertNotNull(testCourse.getEndDate());
		assertNotNull(testCourse.getStartDate());
		assertNotNull(testCourse.getStudents());
		assertNotNull(testCourse.getModules());
		assertNotNull(testCourse.getName());
	}

}
