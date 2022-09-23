package SoftwareA1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;

public class CourseProgramme {

	private String name;
	private List<Module> modules = new ArrayList<Module>();
	private List<Student> students = new ArrayList<Student>();
	private DateTime startDate;
	private DateTime endDate;
	
	//DateTime dt3 = new DateTime("2004-12-13T21:39:45.618-08:00");
	
	public CourseProgramme(String name, List<Module> modules, List<Student> students, DateTime startDate,DateTime endDate) {
		   this.name = name;
		   this.modules = modules;
		   this.students = students;
		   this.startDate = startDate;
		   this.endDate = endDate;
		  }

public String getName() {
	return this.name;
}

public  List<Module> getModules() {
	return this.modules;
}

public List<Student> getStudents() {
	return this.students;
}

public  DateTime getStartDate(){
	return this.startDate;
}

public  DateTime getEndDate(){
	return this.endDate;
}

public void addStudent(Student student) {
	if(students == null) students = new ArrayList<Student>();
	
	students.add(student);
}

public void addModule(Module module) {
	if(modules == null) modules = new ArrayList<Module>();
	
	modules.add(module);
}

}
