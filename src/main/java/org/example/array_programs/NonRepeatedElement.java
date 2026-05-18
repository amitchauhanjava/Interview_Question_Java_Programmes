package array_programs;

public class NonRepeatedElement {

	public static void main(String[] args) {
		int num[] = {10,3,5,7,9,11,4,5,23,53,4,8,70,7,9};
		
		System.out.println("Non Repeated element");
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (i != j && num[i] != num[j]) {
				}
			}
			System.out.println(num[i]);
		}
	}
}
