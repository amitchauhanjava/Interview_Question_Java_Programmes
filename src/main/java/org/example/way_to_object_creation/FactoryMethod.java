package way_to_object_creation;

class Stud1 {
	long id;
	String name;
	String birth;

	public Stud1(long id, String name, String birth) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
	}

//Factory Method
	public static Stud1 createStudent(long id, String name, String birth) {
		return new Stud1(id, name, birth);
	}

public class FactoryMethod {

	public static void main(String[] args) {
		Stud1 s = Stud1.createStudent(1001, "Amit Chauhan", "02/05/1997");

		System.out.println(s.id);
	}
}
}