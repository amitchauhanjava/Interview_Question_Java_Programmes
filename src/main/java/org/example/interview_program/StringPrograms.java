package interview_program;

public class StringPrograms {
	public static void main(String[] args) {

		String name = "I am Java Developer";
		String output = "";
		
		
		// Reverse the string
		String rev = "";
		for (int i = name.length()-1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println("Reverse:  "+ rev);
		
		// Reverse string of the each words
		String words[] = name.split(" ");
		
		for (String w : words) {
			String reverse = "";
			
			for (int i = w.length()-1; i >= 0; i--) {
				reverse += w.charAt(i);
			}
			
			output += reverse+" ";
			
		}
		System.out.println(output);
	}

}