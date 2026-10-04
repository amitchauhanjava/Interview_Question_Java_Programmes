package org.example.stream_api_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestStringAndLengthIntegerAndOccurrenceOfStringAndNoOfVowels {
    public static void main(String[] args) {
        String s="I am Learning stream API";

        String secondHighest = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(secondHighest);

        //2nd way fetch 2nd integer length;

        int secondHighestInt = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestInt);

        //3rd fetch Occurrence of String

        System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        //Without Function.identity() (using lambda directly — same effect)
        System.out.println(Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));

        //4th find the words with a specified number of vowels
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]]","").length()==2).forEach(System.out::println);
    }

}
