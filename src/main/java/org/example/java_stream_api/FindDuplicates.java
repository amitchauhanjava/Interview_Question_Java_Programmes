package java_stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {

		// List with duplicate elements
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 8, 3, 7, 8, 1);

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = list.stream().filter(n -> !seen.add(n)) // Add returns false if n was already present,
				.collect(Collectors.toSet());
		System.out.println("Duplicates: " + duplicates);
		
		List<Integer> uniqueElement = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueElement);
	}

}
