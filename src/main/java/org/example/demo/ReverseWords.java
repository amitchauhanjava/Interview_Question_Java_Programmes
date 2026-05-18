package demo;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String name = "Ahmedabad";
		char temp;
		char arr[] = name.toCharArray();
		
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
