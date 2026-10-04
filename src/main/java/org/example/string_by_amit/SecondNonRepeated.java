package org.example.string_by_amit;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeated {
    public static void main(String[] args) {

        String str = "india";
        int n=2;

        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
//        System.out.println(map);

        int count =0;
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            if (entry.getValue()==1) {
                count++;
            }

            if (n==count) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
