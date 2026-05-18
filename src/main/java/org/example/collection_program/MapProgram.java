package collection_program;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String>names = new HashMap<Integer, String>();

		names.put(100, "Amit Chauhan");
		names.put(101, "Arun Chauhan");
		names.put(102, "Ashok Chauhan");
		names.put(103, "Ayansh Chauhan");
		names.put(104, "Shreya Chauhan");

		System.out.println(names);
	}
}