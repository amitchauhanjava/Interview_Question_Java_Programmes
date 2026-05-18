package java_string_program;

public class ReverseWord {
	
	public static void main(String[] args) {

		String name = "I am Java Developer";

		String words[] = name.split(" ");
		String output = "";

		for (String w : words) {
			String reverse = "";

			for (int i = w.length()-1; i >= 0; i--) {
				reverse += w.charAt(i);
			}
			output = output+reverse+ " ";
		}
		System.out.println(output);
	}

}
