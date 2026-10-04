package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementFromArray {
	
	public static void main1(String[] args) {
		
		int num[] = {10,3,5,7,9,11,4,5,23,53,4,8,70,7,9};
		
		int uniqueElement[] = Arrays.stream(num).distinct().toArray();
		
		for (int i : uniqueElement) {
			System.out.println(i);
		}
	}









	public static void main(String[] args){
		int[] arr = {1,3,4,6,8,4,5,9,2,3};
 		Set<Integer> dup = new LinkedHashSet<>();
		 int[] uniqueEleStream = Arrays.stream(arr).distinct().toArray();
		 for(int i=0;i<arr.length;i++){
			 dup.add(arr[i]);
		 }
		 int[] uniqueElement = new int[dup.size()];
		 int index =0;
		 for(int setElement:dup){
			 uniqueElement[index++] = setElement;
		 }

		System.out.println(Arrays.toString(uniqueElement));
		System.out.println(Arrays.toString(uniqueEleStream));






	}
}
