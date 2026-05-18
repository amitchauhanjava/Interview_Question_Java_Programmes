package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> salary = Arrays.asList(9658,4782,33596,45000,8975);
		
		System.out.println(salary);
		
		List<Integer> sortedList = salary.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		Optional<Integer> maxSalary = salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println(sortedList);
		System.out.println(maxSalary);
	}
}
