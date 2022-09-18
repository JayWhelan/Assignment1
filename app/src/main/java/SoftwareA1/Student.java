package SoftwareA1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
private String name;
private int age;
private String dob;
private int id;
private String username;
private List<String> courses = new ArrayList<>();
private List<String> modules = new ArrayList<>();
//private String[] courses;
//private String[] modules;



public static void main (String[] args)
{
	List<String> tmp = new ArrayList<String>();

	// add example
	tmp.add("A");
	tmp.add("B");
	tmp.add("C");
	Student st = new Student("Jay",14,"10/11/22",44,tmp,tmp);
	st.getUsername();
	
}
public Student(String name, int age, String dob, int id, List<String> courses, List<String> modules) {
   this.name = name;
   this.age = age;
   this.dob = dob;
   this.id = id;
   this.username = name+age;
   this.courses = courses;
   this.modules = modules;
	
	
    System.out.println(name +" - "+ id+" - "+ courses); // Print the value of x
  }


public String getUsername() {
	return this.username;
}

}
