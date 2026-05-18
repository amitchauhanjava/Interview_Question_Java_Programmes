package interview_program;

import java.util.Iterator;

public class PrintNumbers1To100 {

	public static void main(String[] args) {

		//Print only even numbers
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		
		// Print the Odd numbers
		for (int i = 1; i <= 100; i++) {
			if (i%2 != 0) {
				System.out.print(i+ " ");
			}
		}
		
		//Print sum of the even numbers
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				sum += i;
			}
		}
		System.out.println("\n Sum of the even number is: "+sum);
		
		System.out.println(" ");
		
		//Print sum of the even numbers
		for (int i = 1; i <= 100; i++) {
			if (i%2!=0) {
				sum += i;
			}
		}
		System.out.println("\n Sum of the even number is: "+sum);
		
		System.out.println(" ");
	}
}