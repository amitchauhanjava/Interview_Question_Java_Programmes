package org.example.stream_api_practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIPractice {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(
				1, 2, 3, 4, 5, 6, 7, 8, 21, 3, 54, 23, 65
		);

		// 1. Find even numbers
		System.out.println("Even Numbers: " + findEvenNumbers(list));

		// 2. Divide even numbers by 2 and sort
		System.out.println("Even Numbers / 2: " + divideEvenNumbersByTwo(list));

		// 3. FlatMap
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("a", "b", "c"),
				Arrays.asList("d", "e", "f"),
				Arrays.asList("g", "h", "i")
		);

		System.out.println("FlatMap: " + flattenList(listOfLists));

		// 4. Remove duplicate elements and sort descending
		List<Integer> removeElement =
				Arrays.asList(2, 5, 3, 2, 6, 3, 7, 8, 5, 9, 10, 6, 7);

		System.out.println(
				"Remove Duplicate: " + removeDuplicateElement(removeElement)
		);

		// 5. Find odd numbers and their square
		System.out.println(
				"Odd Numbers Square: " + findOddAndSquare(removeElement)
		);

		// 6. Get 2nd and 3rd elements
		System.out.println(
				"2nd and 3rd Elements: " + findSecondAndThird(removeElement)
		);

		// 7. Find 2nd highest number
		System.out.println(
				"Second Highest: " + findSecondHighestNumber(list)
		);

		// 8. Divide numbers into even and odd
		System.out.println(
				"Even and Odd: " + divideNumberOddAndEven(removeElement)
		);

		// 9. Find longest String
		List<String> listValues = Arrays.asList(
				"Yash",
				"Yogesh",
				"Palindrom",
				"factorial",
				null,
				"Chaturved"
		);

		System.out.println(
				"Longest String: " + findLongestStringFromAList(listValues)
		);

		// find the first Employee whose salary is greater than 50000
		List<Employee> empList = new ArrayList<> (Arrays.asList(
				new Employee(101,"Yash","IT",90000),
				new Employee(102,"Swati","Non IT",80000),
				new Employee(103,"Prachi","CS",140000),
				new Employee(104,"Nikhil","ESC",20000),
				new Employee(105,"Shubham","SSC",10000),
				new Employee(106,"Ritik","MED",9000)));

//		System.out.println(getEmpData(empList));
	}

//	private static List<Employee> getEmpData(List<Employee> empList) {
//		return
//				empList.stream()
//						.filter(n -> n.getSalary()>50000)
//						.findFirst()
//						.toList();
//
////						.collect(Collectors.groupingBy()
//	}


	// 1. Find all even numbers
	private static List<Integer> findEvenNumbers(List<Integer> numbers) {

		return numbers.stream()
				.filter(n -> n % 2 == 0)
				.toList();
	}


	// 2. Find even numbers, divide by 2 and sort
	private static List<Integer> divideEvenNumbersByTwo(List<Integer> numbers) {

		return numbers.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n / 2)
				.sorted()
				.toList();
	}


	// 3. Convert List<List<String>> into List<String>
	private static List<String> flattenList(List<List<String>> listOfLists) {

		return listOfLists.stream()
				.flatMap(List::stream)
				.toList();
	}


	// 4. Remove duplicate elements and sort descending
	private static List<Integer> removeDuplicateElement(
			List<Integer> numbers) {

		return numbers.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.toList();
	}


	// 5. Find odd numbers and return their squares
	private static List<Integer> findOddAndSquare(
			List<Integer> numbers) {

		return numbers.stream()
				.filter(n -> n % 2 != 0)
				.map(n -> n * n)
				.toList();
	}


	// 6. Get 2nd and 3rd elements
	private static List<Integer> findSecondAndThird(
			List<Integer> numbers) {

		return numbers.stream()
				.skip(1)
				.limit(2)
				.toList();
	}


	// 7. Find second highest number
	private static Optional<Integer> findSecondHighestNumber(
			List<Integer> numbers) {

		return numbers.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
	}


	// 8. Divide numbers into even and odd
	private static Map<Boolean, List<Integer>> divideNumberOddAndEven(
			List<Integer> numbers) {

		return numbers.stream()
				.distinct()
				.collect(
						Collectors.partitioningBy(n -> n % 2 == 0)
				);
	}


	// 9. Find all longest Strings
	private static List<String> findLongestStringFromAList(
			List<String> listValues) {

		int maxLength = listValues.stream()
				.filter(Objects::nonNull)
				.mapToInt(String::length)
				.max()
				.orElse(0);

		return listValues.stream()
				.filter(Objects::nonNull)
				.filter(s -> s.length() == maxLength)
				.toList();
	}
}