package SoftwareA1;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private String name;
	private Lecturer lecturer;
	private String id;
	private List<Student> students = new ArrayList<Student>();
	private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
	private String room;
	

	public Module(String name, Lecturer lecturer, String id, List<Student> students, List<CourseProgramme> courses, String room) {
		   this.name = name;
		   this.lecturer = lecturer;
		   this.id = id;
		   this.students = students;
		   this.courses = courses;
		   this.room = room;
		  }
	
	public Module(String name, Lecturer lecturer, String id, String room) {
		   this.name = name;
		   this.lecturer = lecturer;
		   this.id = id;
		   this.room = room;
		   students.add(0, null);
		   this.courses = new ArrayList<CourseProgramme>();
		  }

public String getName() {
	return this.name;
}

public Lecturer getlecturer() {
	return this.lecturer;
}

public String getId() {
	return this.id;
}

public  List<Student> getStudents(){
	return this.students;
}

public  List<CourseProgramme> getCourses(){
	return this.courses;
}

public void changeLecturer(Lecturer lecturer) {
	this.lecturer = lecturer;
}

public void addStudent(Student student) {
	if(students == null) students = new ArrayList<Student>();
		
	students.add(student);
}

public void addCourses(CourseProgramme course) {
	if(courses == null) courses = new ArrayList<CourseProgramme>();
	
	courses.add(course);
}

}
