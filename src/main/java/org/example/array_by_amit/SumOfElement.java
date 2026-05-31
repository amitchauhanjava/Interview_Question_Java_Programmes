package org.example.array_by_amit;

public class SumOfElement {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,4,9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
