package pattern_program;

import java.util.Iterator;

public class PatternProgram {

	public static void main(String[] args) {

		// 1. Write a program to print this star pattern
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *

		System.out.println("Star Pattern 1");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		// 2. Write a program to print this star pattern

		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		System.out.println("\nStar Pattern 2");
		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		// 3. Write program to print the below patter

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		System.out.println("\nStar Pattern 3");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 4. Write a program to print the below pattern

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		System.out.println("\nStar Pattern 4");
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5. Write a program to print the below pattern

		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		System.out.println("\nStar Pattern 5");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 6. Write program to print the below pattern

		// *
		// **
		// ***
		// ****
		// *****
		// *****
		// ****
		// ***
		// **
		// *

		System.out.println("\nStar Pattern 6");
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 7. Write a program to print the below pattern
		
		
	}

}
