package org.example.array_by_amit;

public class ReverseElement {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,7,9};

        int reverse = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            reverse = arr[i];
            System.out.println(reverse);
        }


    }
}
