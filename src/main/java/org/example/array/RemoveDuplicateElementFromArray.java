package array;

import java.util.Arrays;

public class RemoveDuplicateElementFromArray {
	
	public static void main(String[] args) {
		
		int num[] = {10,3,5,7,9,11,4,5,23,53,4,8,70,7,9};
		
		int uniqueElement[] = Arrays.stream(num).distinct().toArray();
		
		for (int i : uniqueElement) {
			System.out.println(i);
		}
	}
}
