package core_java_concepts;

public class Loops {
	
	public static void main(String[] args) {

		// For Loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// While Loop
		int x=0;
		while (x<10) {
			x++;
			System.out.println(x);
		}
		
		// Do While Loop
		int y = 1;
		do {
			System.out.println("\n"+y);
			y++;
		} while (y<=10);
	}

}