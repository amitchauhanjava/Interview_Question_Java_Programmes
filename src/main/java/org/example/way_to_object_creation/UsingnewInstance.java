package way_to_object_creation;

import java.lang.reflect.InvocationTargetException;

class Students {
	long id;
	String name;
	String birth;
	
	public Students(long id) {
		super();
		this.id = id;
	}
	
}

public class UsingnewInstance {

	public static void main(String[] args) throws Exception {
		Class<Students> std = Students.class;
		Students student = std.getDeclaredConstructor(String.class).newInstance(101);
		System.out.println(student.id);
	}
}
