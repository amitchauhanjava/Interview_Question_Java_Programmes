package interview_string_program;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String name = "I am Java Programmer";
		String output = "";
		
		String words[] = name.split(" ");
		
		for (String w : words) {
			String reverse = "";
			
			for (int i = w.length()-1; i >= 0; i--) {
				reverse += w.charAt(i);
			}
			
			output = reverse+" ";
			System.out.print(output);
		}
	}

}
