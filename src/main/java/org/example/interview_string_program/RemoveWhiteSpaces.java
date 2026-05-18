package interview_string_program;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String name = "I am Java Developer";
		
		String plainText = name.replaceAll(" ", "");
		System.out.println(plainText);
	}
}
