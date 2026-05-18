package oops;

import java.util.Scanner;

public class MethodOverloading {
	
	int sum(int x, int y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		Scanner s = new Scanner(System.in);
		
		mo.sum(0, 0);
		mo.sum(0, 0, 0);
	}
}
