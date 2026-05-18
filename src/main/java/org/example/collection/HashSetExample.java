package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("Amit");
		hs.add("Ayansh");
		hs.add("Shreya");
		hs.add(87);
		hs.add("Amit");
		hs.add(698);

		System.out.println(hs);

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
