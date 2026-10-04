package org.example.array_by_amit;

public class OddEven {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,8,7,9};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
