package string_program;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String input = "My Name is Amit";
		
        StringBuilder result = new StringBuilder();
        
        for (int start = 0, end = 0; end <= input.length(); end++) {
            if (end == input.length() || input.charAt(end) == ' ') {
                for (int i = end - 1; i >= start; i--) {
                    result.append(input.charAt(i));
                }
                if (end < input.length()) result.append(' ');
                start = end + 1;
            }
        }
        
        System.out.println(result.toString());
	}

}
