package pattern;

public class Multiplication {

	public static void main(String[] args) {
		
		int row = 10;
		int col = 100;
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print("\t"+i*j);
			}
			System.out.println(" ");
		}
	}
}
