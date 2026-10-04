package org.example.stream_api_practice;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValue {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("Yash",28);
        map.put("Yogesh",27);
        map.put("Shubham",30);
        map.put("Prateek",34);
        map.put("Devrat",18);
        map.put("Ritesh",29);

//       LinkedHashMap<String,Integer>sortedValueMap =  map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(s1,s2)->s1, LinkedHashMap::new);
//
//        sortedValueMap.forEach(key,value)->
//        System.out.print;
    }
}
