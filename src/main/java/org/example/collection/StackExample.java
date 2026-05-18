package collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push("Amit");
		s.push("Ayansh");
		s.push("Shreya");
		s.push(200);
		s.push(201.54);

		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

		System.out.println(s.peek());
		System.out.println(s);

		System.out.println(s.search("Amit"));
		
		System.out.println(s.empty());

		
	}

}
