package array_programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main1(String[] args) {
		
		int num[] = {4,6,9,2,14,6,3,2,5,8,0};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
		}
	public static void main(String[] args) {

		int num[] = {4, 6, 9, 2, 14, 6, 3, 2, 5, 8, 0};
		Set<Integer> uniqueEle = new LinkedHashSet<>();
		Set<Integer> duplicates = Arrays.stream(num).filter(n->!uniqueEle.add(n)).boxed().collect(Collectors.toSet());
		for (int i=0;i<num.length;i++){
			for (int j=i+1;j<num.length;j++){
				if(num[i]==num[j]){
					System.out.println("Duplicate Element "+num[i]);
				}
			}
		}
		System.out.println("find duplicate Element "+duplicates);
	}
	}