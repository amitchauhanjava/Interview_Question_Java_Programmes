package org.example.array_by_amit;

public class MinAndSecondMin {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,7,9};

        int firstMin = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }

        System.out.println("First Minimum Number: "+firstMin);
        System.out.println("Second Minimum Number: "+secondMin);
    }
}
