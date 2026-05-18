package oops;

public class ConstructorEx {

	int roll=101;
	String name ="Amit Chauhan";
	long mobile = 8417987626L;

	public ConstructorEx() {
		super();
		System.out.println("Default");
	}

	public ConstructorEx(int roll, String name, long mobile) {
		super();
		this.roll = roll;
		this.name = name;
		this.mobile = mobile;
	}

	void display() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(mobile);
	}

	public static void main(String[] args) {

		ConstructorEx ex = new ConstructorEx();
		ex.display();
	}
}