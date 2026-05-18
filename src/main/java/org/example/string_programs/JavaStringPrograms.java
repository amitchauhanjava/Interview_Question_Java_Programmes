package string_programs;

public class JavaStringPrograms {

	public static void main(String[] args) {
		
		String name = "Amit";
		name = name.concat(" Chauhan");
		
		System.out.println(name.charAt(1));
		
		String s = "I am ".concat(name);
		System.out.println(s);
		
		//Contains
		String str = "India is great country";
		System.out.println(str.contains("my"));
		System.out.println(str.contains("great country"));
		System.out.println(str.contains("India"));
		
		//StartWith & EndWith
		System.out.println(str.startsWith("In"));
		System.out.println(str.endsWith("try"));
		
		//lowerCase and UpperCase
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//equals()
		String n1 = "noida city is the big city";
		String n2 = "Noida";
		System.out.println(n1.equals(n2));
		
		//equalsIgnoreCase()
		System.out.println(n1.equalsIgnoreCase(n2));
		
		//lastIndexOf
		int index = n1.lastIndexOf('i');
		System.out.println(index);
		
		//length()
		System.out.println(n1.length());
		
		//replace
		String replaceCity = n1.replace("i", "p");
		System.out.println(replaceCity);
		
		//replaceAll
		String replaceAll = n1.replaceAll(" ", "-");
		System.out.println(replaceAll);
		
		//split()
		for (String str1 : n1.split("\\s",0)) {
			System.out.println(str1);
		}
		
		for (String str1 : n1.split("\\s",1)) {
			System.out.println(str1);
		}
		
		for (String str1 : n1.split("\\s",2)) {
			System.out.println(str1);
		}
		
		//toCharArray() - It will return char array from the string
		String s2 = "Java is great programming language";
		char ch[] = s2.toCharArray();
		System.out.println(ch.length);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
	}
}
