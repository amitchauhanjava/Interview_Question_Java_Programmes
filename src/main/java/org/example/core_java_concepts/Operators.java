package core_java_concepts;

public class Operators {
	public static void main(String[] args) {
		
		// Arithmetic, Logical, Assignment, Bitwise, Ternary

		int x = 40;
		int y = 20;
		int z = 30;

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);

		// Logical
		if (x>y && z<x) {
			System.out.println(x+" is greater than "+y+" And "+z+" is less than "+x);
		}
		else if (x>y || z>x) {
			System.out.println("Second comdition is worked");
		}
	}

}
