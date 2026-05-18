package org.example.object_class;

import java.util.Calendar;
import java.util.Date;

public class GetClass {

	public static void main(String[] args) {
		GetClass gc = new GetClass();
		System.out.println(gc.getClass().getName());
		
		Date date = new Date();
		
		
		System.out.println(date);
		System.out.println("hello "+gc);
	}

}