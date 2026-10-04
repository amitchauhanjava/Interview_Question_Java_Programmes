package org.example.stream_api_practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveAllZeroElement {
    public static void main(String[] args) {
        List<Integer> arr =List.of(1,0,-1,2,-1,0,7,4,-2,0,5,0,7);

        System.out.println(Stream.concat(
                        arr.stream().filter(n->n!=0),
                        arr.stream().filter(n->n==0))
                .collect(Collectors.toList()));
    }
}
