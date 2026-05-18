package exception;

public class TryCatch {

	public static void main(String[] args) {
		
		try {

//			int num = 50/0;
//			System.out.println(num);

			int data[] = {3,5,11};
			System.out.println(data[4]);

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	
	}
}
