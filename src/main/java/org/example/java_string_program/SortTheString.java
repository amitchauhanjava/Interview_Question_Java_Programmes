package java_string_program;

public class SortTheString {
	public static void main(String[] args) {
		
		String name ="gjaweop";
		char arr[] = name.toCharArray();
		char temp = 0;

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
	}
}