package practice;

interface A {
	void display();
}

interface B {
	void data();
}

public class Demo implements A,B {

	@Override
	public void display() {
		System.out.println("Test");
	}
	
	@Override
	public void data() {
		System.out.println("Child interface");
		
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.data();
	}

}
