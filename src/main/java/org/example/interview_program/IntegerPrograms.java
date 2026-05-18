package interview_program;

public class IntegerPrograms {

	public static void main(String[] args) {

		int num = 83273;

		System.out.println("Even numbers:");
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) { // Check if the number is even
				System.out.println(i);
			}
		}

		System.out.println("\nOdd numbers:");
		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) { // Check if the number is odd
				System.out.println(i);
			}
		}
	}

}
