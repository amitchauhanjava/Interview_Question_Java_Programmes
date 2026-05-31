package org.example.array_by_amit;

public class FindDuplicateElement {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,4,7,9,3,11};

        int duplicate = 0;

        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    System.out.println("Duplicate Records: " + duplicate);
                }
            }
        }

    }
}
