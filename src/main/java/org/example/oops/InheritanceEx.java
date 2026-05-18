package oops;

class Employee {
	int x = 10;
}

class Salary extends Employee {
	int y = 20;
	
	void display() {
		System.out.println(x+y);
	}
}

public class InheritanceEx extends Salary {

	public static void main(String[] args) {
		
		InheritanceEx ex = new InheritanceEx();
		ex.display();
	}
}
