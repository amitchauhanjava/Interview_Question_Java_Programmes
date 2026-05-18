package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationEx {
	
	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add(101);
		v.add("Amit");
		v.add(45.77);
		
		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
