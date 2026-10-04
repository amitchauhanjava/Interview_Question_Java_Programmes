package org.example.stream_api_practice;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {

    public static void main(String[] args) {
        String mergeValue="I am a Senior Software Developer";
    String highestString = Arrays.stream(mergeValue.split(" "))
                            .max(Comparator.comparing(String::length)).get();
        System.out.println("Highest String "+highestString);
    }
}
