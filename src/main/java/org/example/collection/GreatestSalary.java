package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GreatestSalary {
	
	public static void main(String[] args) {
		
		List<Integer> sal = Arrays.asList(32000,54990,20000,90000);

//		Collections.sort(sal);
//		System.out.println(sal);

		Optional<Integer> salary = sal.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println(salary);
		
	}

}
