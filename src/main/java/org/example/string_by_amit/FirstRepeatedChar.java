package org.example.string_by_amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedChar {
    public static void main(String[] args) {

        String str = "Java Program";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c ,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                System.out.println("Output: "+entry.getKey());
                System.out.println(entry.getValue());
                break;
            }
        }
//        System.out.println(map);
    }
}
