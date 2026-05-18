package org.example.demo;

//import java.lang.foreign.Linker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
	
	public static void main(String[] args) {
		
		String str = "Java Developer";
		String reverse = "";

		for (int i = str.length()-1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		System.out.println(reverse);
		
	}

}
