package org.example.array_by_amit;

public class PositiveAndNegative {
    public static void main(String[] args) {

        int[] arr = {4,3,-6,5,11,-8,7,9};
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                positive = arr[i];
                System.out.println("Positive: "+positive);
            } else if(arr[i]<0) {
                negative = arr[i];
                System.out.println("Negative: "+negative);
            }
        }

    }
}
