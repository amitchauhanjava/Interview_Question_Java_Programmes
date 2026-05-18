package java_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLowerCase {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Amit","Ashok","Rahul","Ravi");

		List<Boolean> startWith = names.stream().map(s->s.startsWith("R")).collect(Collectors.toList());
		System.out.println(startWith);

		List<String> filtered = names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(filtered);
		
		List<String> filteredLower = names.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
		System.out.println(filteredLower);
	}
}
