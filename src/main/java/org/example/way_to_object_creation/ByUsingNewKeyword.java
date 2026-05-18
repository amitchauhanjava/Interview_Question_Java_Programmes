package way_to_object_creation;

class Student {
	long id = 1001;
	String name = "Amit Chauhan";
	String birth ="02/05/1997";
}

public class ByUsingNewKeyword {

	public static void main(String[] args) {
		Student std = new Student();
		System.out.println(std.id);
		System.out.println(std.name);
		System.out.println(std.birth);
	}
}
