package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefrence {
	
	public void display(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		MethodRefrence mr = new MethodRefrence();

		List<String> students = Arrays.asList("Amit","Shreya","Aayansh","Gaurav","Ashok");

		//students.forEach(x->System.out.println(x));
		

		students.forEach(mr::display);
		
		// constructor refrence
		//Refer constructor using lambda
		//students.stream().map(x -> new Student(x)).collect(Collectors.toList());

		students.stream().map((Student::new)).collect(Collectors.toList());
	}
}
