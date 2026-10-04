package org.example.stream_api_practice;

import java.util.Arrays;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String s="dabbcghabioefcdgh";
        s.chars()
                .distinct()
                .mapToObj(x->(char) x)
                .forEach(System.out::print);
        System.out.println();
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }


}
