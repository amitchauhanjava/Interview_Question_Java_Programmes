package org.example.string_by_amit;

public class FindDuplicateChar {
    public static void main(String[] args) {

        String str = "Java Program";

        char []arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;

                    arr[j] = '0';
                }
            }
            if (count>1 && arr[i] != '0') {
                System.out.println(arr[i]);
            }
        }
    }
}
