package collection_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CollectionSortProgram {
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Mukesh");
		name.add("Ravi");
		name.add("Amit");
		name.add("Vijay");
		
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
	}
	


}
