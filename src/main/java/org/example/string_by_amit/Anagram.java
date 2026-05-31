package org.example.string_by_amit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listgen";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            System.out.println("Anagram.");
        } else {
            System.out.println("Not Anagram.");
        }
    }
}
