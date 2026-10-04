package org.example.array_by_amit;

public class CopyArrayToOther {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,4,7,9,3,11};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Copy Array");

        int[] copy = arr;
        for (int j = 0; j < copy.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
