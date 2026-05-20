package org.example.array;

public class MaxElement {
    public static void main(String[] args) {

        /*Logic
        First element ko max maan lo
        Har element compare karo
        Agar bada mile → update max*/

        int[] arr = {3,5,2,7,3,9,6,21,4,7,8};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
            max = arr[i];
            }
        }
        System.out.println("Max Element: "+max);
    }
}
