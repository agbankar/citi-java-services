package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MostFrequentElement {
    public static void main(String[] args) {
        //1246189012
        //1112246.....
        List<Integer> l = Arrays.asList(1, 2, 2, 3, 3, 3, 3, 3, 3, 1, 1);
        List<Integer> sortedList = l.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        int count = 1;
        int maxCount = 1;
        int secondMaxCount = 1;
        int tmp = 0;
        for (int i = 0; i < sortedList.size() - 1; i++) {
            if (sortedList.get(i).equals(sortedList.get(i + 1))) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
            }
            if (secondMaxCount > count) {
                secondMaxCount = count;
            }
            if (secondMaxCount > maxCount) {
                tmp = maxCount;
                maxCount = secondMaxCount;
                secondMaxCount = tmp;
            }

        }
        System.out.println(maxCount);
        System.out.println(secondMaxCount);

    }
}
