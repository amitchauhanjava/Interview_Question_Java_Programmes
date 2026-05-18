package conditional;

import java.util.Map;

public class TernaryOperator {
	public static void main(String[] args) {
		String name = "Amit";
		String reverse = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		System.out.println(reverse);
	}

}
