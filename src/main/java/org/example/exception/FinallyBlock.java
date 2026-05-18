package exception;

public class FinallyBlock {
	public static void main(String[] args) {

		try {
			int data = 40/0;
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is executing...");
		}
		System.out.println("Rest of the code..");
	}

}
