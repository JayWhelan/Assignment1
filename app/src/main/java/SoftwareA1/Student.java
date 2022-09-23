package SoftwareA1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
private String name;
private int age;
private String dob;
private int id;
private List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
private List<Module> modules = new ArrayList<Module>();


public Student(String name, int age, String dob, int id, List<CourseProgramme> courses, List<Module> modules) {
   this.name = name;
   this.age = age;
   this.dob = dob;
   this.id = id;
   this.courses = courses;
   this.modules = modules;
  }

public Student(String name, int age, String dob, int id) {
	   this.name = name;
	   this.age = age;
	   this.dob = dob;
	   this.id = id;
	  }


public String getUsername() {
	String username = name+age;
	return username;
}

public String getName() {
	return this.name;
}

public int getAge() {
	return this.age;
}

public String getDOB() {
	return this.dob;
}

public  List<Module> getModules(){
	return this.modules;
}

public  List<CourseProgramme> getCourses(){
	return this.courses;
}

public void addCourse(CourseProgramme course) {
	if(courses == null) courses = new ArrayList<CourseProgramme>();
	
	courses.add(course);
}

public void addModule(Module module) {
	if(modules == null) modules = new ArrayList<Module>();
	
	modules.add(module);
}

}
