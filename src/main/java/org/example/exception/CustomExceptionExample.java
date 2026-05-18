package exception;

class MyCustomException extends Exception {
	
	public MyCustomException(String msg) {
		super(msg);
	}
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		
		try {
			throw new MyCustomException("Custom Exception Thrown..");
		} catch (Exception e) {
			System.out.println("Exception Handled..");
			
			System.out.println(e.getMessage());
		}
	}
}
