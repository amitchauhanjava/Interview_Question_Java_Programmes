package org.example.array_by_amit;

public class MaxAndSecondMax {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,7,9};
        int firstMax = arr[0];
        int secondMax =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>firstMax){
                firstMax = arr[i];
            } else if (arr[i]>secondMax & arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("First Largest Number: "+firstMax);
        System.out.println("Second Largest Number: "+secondMax);
    }
}
