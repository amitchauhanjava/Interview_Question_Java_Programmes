package org.example.string_by_amit;

import java.util.HashMap;
import java.util.Map;

public class CountFirstNonRepeatedChar {
    public static void main(String[] args) {

        String str = "ProgrammiPng";
        Map<Character,Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

//        System.out.println(map);

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                System.out.println("Character is: "+entry.getKey());
                System.out.println(entry.getValue());
                break;
            }
        }
    }
}
