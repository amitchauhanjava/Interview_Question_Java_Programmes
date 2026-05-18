package string_program;

import java.util.Scanner;

public class ReverseStringProgram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		
		String reverse = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
