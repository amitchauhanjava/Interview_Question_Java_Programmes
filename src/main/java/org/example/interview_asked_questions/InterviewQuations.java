package interview_asked_questions;

public class InterviewQuations {
	
	public static int data(int a, int b) {
		return a+b;
	}
	
	public static void data() {
		System.out.println("This is static method");
	}
	
	public static void main(String[] args) {
		
		System.out.println(data(10,20));
		data();
	}
	

}
