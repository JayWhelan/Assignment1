package SoftwareA1;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {

	private String name;
	private int age;
	private String dob;
	private int id;
	private String username;
	private List<Module> modulesTought = new ArrayList<Module>();
	private String roomID;
	
	
	public Lecturer(String name, int age, String dob, int id, List<Module> modulesTought, String roomID) {
		   this.name = name;
		   this.age = age;
		   this.dob = dob;
		   this.id = id;
		   this.modulesTought = modulesTought;
		   this.roomID = roomID;
		  }
	
	public Lecturer(String name, int age, String dob, int id, String roomID) {
		   this.name = name;
		   this.age = age;
		   this.dob = dob;
		   this.id = id;
		   this.roomID = roomID;
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

public  List<Module> getModulesTought(){
	return this.modulesTought;
}

public  void addModule(Module module){
	if(modulesTought == null) modulesTought = new ArrayList<Module>();
	
	modulesTought.add(module);
}

public  String getRoomID(){
	return this.roomID;
}

}
