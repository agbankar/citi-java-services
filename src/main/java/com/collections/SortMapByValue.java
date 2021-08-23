package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("1", 0);
        map.put("2", -20);
        map.put("3", 150);
        map.put("4", 7);
        map.put("5", 8);
        map.put("6", 90);
        map.entrySet().stream().forEach(e -> System.out.println("e.getValue() = " + e.getValue()));
        map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        )
                );

    }
}
