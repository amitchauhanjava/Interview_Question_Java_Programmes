package array;

public class FirstAndSecondLargestElement {

	public static void main(String[] args) {

		int num[] = { 10, 3, 5, 7, 9, 11, 4, 5, 23, 53, 4, 8, 70, 7, 9 };

		// Initialize firstLargest and secondLargest to the smallest possible value
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Iterate through the array to find the first and second largest elements
		for (int i = 0; i < num.length; i++) {
			if (num[i] > firstLargest) {
				// Update secondLargest before changing firstLargest
				secondLargest = firstLargest;
				firstLargest = num[i];
			} else if (num[i] > secondLargest && num[i] != firstLargest) {
				// Update secondLargest if current element is less than firstLargest
				secondLargest = num[i];
			}
		}

		// Output the results
		System.out.println("First Largest Element: " + firstLargest);
		System.out.println("Second Largest Element: " + secondLargest);
	}
}
