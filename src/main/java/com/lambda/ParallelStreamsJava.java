package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamsJava {
    public static void main(String[] args) {
        String[] myArr = {"mni Bankar Xen", "Sam Data", "Joe"};

        List<String> list = Arrays.asList(myArr);

        List<String> c = list
                .parallelStream()
                .flatMap(num -> {
                    return Stream.of(num.split("\\s+"));
                })
                .collect(Collectors.toList());
        System.out.println("c = " + c);



    }
}
