package string_program;

public class CountLengthOfWord {
	
	public static void main(String[] args) {
		
		String input = "My Name is Amit";
		
		String[] words = input.split(" ");
				
		for (String word : words) {
			System.out.println(word+" "+word.length());
		}
	}

}
