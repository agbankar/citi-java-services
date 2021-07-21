package com.collections.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
    private Consumer<String> c = (s) -> System.out.println("s.length() = " + s.length());

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 9, 2, 3, 4);
        list
                .sort(Comparator.comparing(Integer::intValue)
                        .thenComparing(Comparator.comparing(Integer::intValue)));

        List<String> stingList = list
                .stream().filter(i -> i > 1)
                .map(e -> e.toString())
                .collect(Collectors.toList());
        System.out.println("stingList = " + stingList);

        Supplier<Double> randomValue = () -> Math.random();
        Double aDouble = randomValue.get();
        System.out.println("aDouble = " + aDouble);
        Function<String, Integer> objectFunction = (s) -> new Integer(s);
        Integer apply = objectFunction.apply("3");
        System.out.println("apply = " + apply);
        BiFunction<Integer, Integer, Integer> integerIntegerStringBiFunction = (i1, i2) -> new Integer(i1 + i2);
        Test cl = new Test();
        cl.setC(stingList);
        AshishComoparator<Object> stringAshishComoparator = (t) -> System.out.println(t.getClass());
        stringAshishComoparator.apply(stingList);
    }

    public void setC(List<String> l) {
        l.forEach(s -> c.accept(s));

    }
}

@FunctionalInterface
interface AshishComoparator<T> {
    void apply(T t);

}
