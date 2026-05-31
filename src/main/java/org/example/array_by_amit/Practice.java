package org.example.array_by_amit;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        int arr[] = {6,9,2,5,12,5,6,2,3};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        System.out.println(map);
    }
}
