package org.example.stream_api_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProgramme{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 90, 20, 5, 8);
        fetchMaxFromList(numbers);
        sortLiatDescendingOrder(numbers);
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        countStringPrefix(names);
    }
    //fetch Max From List
    public static int fetchMaxFromList(List<Integer> number){

        int max = number.stream().max(Integer::compare).orElseThrow();
        System.out.println(max);
        return max;
    }
    //descending order

    public static List<Integer> sortLiatDescendingOrder(List<Integer> unsorted){
        List<Integer> sorted = unsorted.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorting List \n"+sorted);
        return sorted;
    }
    //Count strings starting with a specific prefix, e.g., “A”.
    public static long countStringPrefix(List<String> list){

        return list.stream().filter(n->n.startsWith("A")).count();
    }

}
