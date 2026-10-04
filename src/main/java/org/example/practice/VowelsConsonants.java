package org.example.practice;

import java.util.Scanner;

public class VowelsConsonants {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String input = sc.next();
		
		if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
			System.out.println(input+" is vowel");
		} else {
			System.out.println(input+" is consonant");

		}
	}

}
