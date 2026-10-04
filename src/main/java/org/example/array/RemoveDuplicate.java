package org.example.array;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,4,7,9,3,11};


        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
            }
        }
            if (!isDuplicate) {
                System.out.println("Elements without duplicate: "+arr[i]);
            }
        }

    }
}
