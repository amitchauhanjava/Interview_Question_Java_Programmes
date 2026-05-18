package conditional;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter Second Number: ");
		int num2 = input2.nextInt();
		
		Scanner inp = new Scanner(System.in);
		System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Subtraction");
		int operation = inp.nextInt();
		
		double result;
		
		switch (operation) {
		case 1:
			 result = num1+num2;
			 System.out.println("Addition is: "+result);
			break;
		case 3:
			result = num1*num2;
			 System.out.println("Multiplication is: "+result);
			break;
		default:
			System.out.println("Invalid Input....");
			break;
		}
	}

}
