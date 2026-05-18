package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLowerCase {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Shreya","Ayansh","Amit","Vijay");

		List<String> sortedName = name.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedName);

		List<String> upperCase = name.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		List<String> lowerCase = name.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}

}
