package org.example.array;

public class MinimumElement {
    public static void main(String[] args) {
        /*Logic
        First element ko max maan lo
        Har element compare karo
        Agar bada mile → update max*/

        int[] arr = {3,5,2,7,3,9,6,21,4,7,8};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
            min = arr[i];
            }
        }

        System.out.println("Minimum Element is: "+min);
    }
}
