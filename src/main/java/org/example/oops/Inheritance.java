package oops;

class Student {
	int rollNo = 101;
	String name = "Amit Chauhan";
}

class Class extends Student {
	String classRoom = "MCA Sem-III";
}

class Subject extends Class {
	String subject = "Java Programing";
}

public class Inheritance {

	public static void main(String[] args) {
		
		Subject s = new Subject();
		
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(s.classRoom);
		System.out.println(s.subject);
		
	}
}
