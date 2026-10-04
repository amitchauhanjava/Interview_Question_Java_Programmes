package org.example.stream_api_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFromList {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenNumber = arr.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
