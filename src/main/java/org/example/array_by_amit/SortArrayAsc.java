package org.example.array_by_amit;

public class SortArrayAsc {
    public static void main(String[] args) {
        int[] arr = {4,3,6,5,11,4,7,9,3,11};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(temp);
                }
            }
        }

        System.out.println("Ascending Order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
