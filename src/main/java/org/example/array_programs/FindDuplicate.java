package array_programs;

public class FindDuplicate {
	public static void main(String[] args) {
		
		int num[] = {4,6,9,2,14,6,3,2,5,8,0};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
		
		}
	}