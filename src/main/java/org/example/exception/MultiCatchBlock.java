package exception;

public class MultiCatchBlock {
	public static void main(String[] args) {
		
		try {
			
			//Arithmetic Exception
			//int data = 30/0;
			
			//NullPointer Exception
//			String name = null;
//			System.out.println(name.length());
			
			//Array IndexOutOfBound Exception
			int num[] = {5,8,2,9};
			System.out.println(num[4]);
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurred..");
		}
		
		catch (NullPointerException e) {
			System.out.println("Nullpointer Exception Occurred..");
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array ArrayIndexOutOfBoundsException Occurred..");
		}
		
		catch (Exception e) {
			System.out.println("Parent Exception Occurred..");
		}
	}
}
