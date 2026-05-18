package java_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(8,9,3,6,5,11,21,34,7);
		
		List<Integer> odd = num.stream().filter(n->n%2 != 0).collect(Collectors.toList());
		List<Integer> even = num.stream().filter(n->n%2 == 0).collect(Collectors.toList());
		
		System.out.println("Original List is:"+num);
		System.out.println("Odd Number is: "+odd);
		System.out.println("Even Number is: "+even);
	}

}
