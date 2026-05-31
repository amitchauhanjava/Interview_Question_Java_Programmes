package org.example.array_by_amit;

public class AverageOfElements {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,4,9};
        int sum = 0;
        double average = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        average = (double)sum/arr.length;
        System.out.println("Sum is: "+sum);
        System.out.println("Average of element: "+average);
    }
}
