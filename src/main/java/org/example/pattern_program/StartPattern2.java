package pattern_program;

public class StartPattern2 {
	
	public static void main(String[] args) {
		
		// Write a program to print this star pattern

		//	* * * * *
		//	* * * *
		//	* * *
		//	* *
		//	*
		
//		int row = 5;
//		int col = 5;
		System.out.println("Start Pattern 1");
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
