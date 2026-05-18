package exception;

public class ThrowKeyword {
	
	public static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("You are not eligible for vote..");
		}
		else {
			System.out.println("You are eligible for vote..");
		}
	}
	
	public static void main(String[] args) {
		
		validate(16);
		System.out.println("Rest of the code..");
	}
}
