package collection_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicationList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
		
		Set<String> duplicate = new LinkedHashSet<>(list);
		
		System.out.println(duplicate);
	}
}
