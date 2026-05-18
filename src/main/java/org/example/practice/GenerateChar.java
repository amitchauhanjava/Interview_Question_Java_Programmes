package practice;

public class GenerateChar {
	public static void main(String[] args) {
		
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(" "+i);
		}
		
		System.out.println("\n");
		
		for (char j = 'z'; j >= 'a'; j--) {
			System.out.print(" "+j);
		}
	}
}
