package array_programs;

import java.util.Arrays;

public class SortTheArray {
	
	public static void main(String[] args) {
		
		int num[] = {4,6,9,2,14,6,3,2,5,8,0};
		int temp = 0;
		int[] numStream = Arrays.stream(Arrays.stream(num).toArray()).sorted().toArray();
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("sorted array \n"+ Arrays.toString(numStream));

	}

}