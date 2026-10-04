package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfElement {
    public static void main(String[] args) {

        int[] arr = {4,3,6,5,11,4,7,9,3,11};

        Map<Integer,Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}
