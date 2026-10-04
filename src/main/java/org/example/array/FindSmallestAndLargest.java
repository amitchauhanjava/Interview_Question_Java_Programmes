package org.example.array;

public class FindSmallestAndLargest {

	public static void main(String[] args) {
		
		int num[] = {10,3,5,7,9,11,4,5,23,53,4,8,70,7,9};
		
		int max = num[0];
		int min = num[0];


		for(int i=0;i<num.length;i++){
			if(max<num[i]){
				max = num[i];
			}else if (min>num[i]){
				min = num[i];
			}
		}
		System.out.println("maximum number "+max+"\n minimum number "+min);

//		for (int i = 0; i < num.length; i++) {
//			if (max<num[i]) {
//				max = num[i];
//			} else if (min > num[i]) {
//				min = num[i];
//			}
//		}
//		System.out.println("Largest Number: "+max);
//		System.out.println("Smallest Number: "+min);
	}
}
