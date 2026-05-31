package org.example.array_by_amit;

public class MaxAndMinElement {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,4,9};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            } else if(arr[i]<min) {
                min = arr[i];
            }
        }

         System.out.println("Max Element: "+max);
        System.out.println("Min Element: "+min);
    }
}
