package string_program;

public class ReverseString {
	
	public static void main(String[] args) {
	
		String city = "Ahmedabad";
		String reverse = "";
		
		for (int i = city.length()-1; i >= 0; i--) {
			reverse += city.charAt(i);
		}
		System.out.println(reverse);
	
	}

}
