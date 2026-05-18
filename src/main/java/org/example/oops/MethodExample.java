package oops;

import java.util.Scanner;

public class MethodExample {
	
	static {
		System.out.println("This is static block");
	}
	
	static int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x =sc.nextInt();
		int y =sc.nextInt();
		
		System.out.println(add(x, y));
		
	}

}
