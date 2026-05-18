package java_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindGreatesSalary {
	
	public static void main(String[] args) {
		List<Integer> salary = Arrays.asList(21000,33000,156000,30000,18000,40000);

		// Sorted list in ascending order
		List<Integer> sortedAsc = salary.stream().sorted().collect(Collectors.toList());

		// Sorted list in decending order
		List<Integer> sortedDesc = salary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("---------- Sorting ----------");
		System.out.println(sortedAsc);
		System.out.println(sortedDesc);
		
		Optional<Integer> secondLargestSalary = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		Optional<Integer> thirdLargestSalary = salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println("\n---------- Find Largest Salary ----------");
		System.out.println(secondLargestSalary);
		System.out.println(thirdLargestSalary);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		List<Integer> filteredStream = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> mappedStream = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
		List<Integer> flatMappedStream = numbers.stream().flatMap(n -> Stream.of(n, n * 2)).collect(Collectors.toList());
		List<Integer> distinctStream = Stream.of(1, 2, 2, 3, 4, 4).distinct().collect(Collectors.toList());
		List<Integer> sortedStream = numbers.stream().sorted().collect(Collectors.toList());
		List<Integer> limitedStream = numbers.stream().limit(2).collect(Collectors.toList());
		List<Integer> skippedStream = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println("\n\n");
		System.out.println(filteredStream);
		System.out.println(mappedStream);
		System.out.println(distinctStream);
		System.out.println(sortedStream);
		System.out.println(limitedStream);
		System.out.println(skippedStream);
		System.out.println("flat"+flatMappedStream);

	}
}
