package java_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindDuplicateElement {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(8,7,2,1,3,6,8,6,9,3,4,7);
		
		List<Integer> odd = number.stream().filter(n->n%2 != 0).collect(Collectors.toList());
		
		long length = number.stream().filter(n->n%2 != 0).count();
		
		
		System.out.println(odd);
		System.out.println(length);
	}
	

}
