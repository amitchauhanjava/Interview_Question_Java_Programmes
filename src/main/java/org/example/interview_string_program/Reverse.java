package interview_string_program;

public class Reverse {
	
	public static void main(String[] args) {
		
		String name = "I am Java Programmer";
		String reverse = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
