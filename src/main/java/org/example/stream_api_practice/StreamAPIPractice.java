package stream_api_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIPractice {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,21,3,54,23,65);
	
		List<Integer> filtered = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());

		//System.out.println(filtered);
		
		filtered.forEach(x -> System.out.println(x));
	
		List<Integer> mapList = filtered
				.stream()
				.map(x -> x/2)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(mapList);
		mapList.forEach(x-> System.out.println(x));
		
		
		// flat map
		
		List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("a", "b", "c"),
	            Arrays.asList("d", "e", "f"),
	            Arrays.asList("g", "h", "i")
	        );
		
		System.out.println(listOfLists);
		
		List<String> filterFlatMap = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(filterFlatMap);
	}
}
