package interview_string_program;

public class RemoveSpecialCharacter {
	
	public static void main(String[] args) {
		
		String name = "My&*$Name%@is$%Amit";
		
		String plainText = name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainText);
	}
}
