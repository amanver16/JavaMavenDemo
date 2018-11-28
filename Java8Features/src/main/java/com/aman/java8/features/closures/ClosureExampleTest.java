package com.aman.java8.features.closures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClosureExampleTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Function<Integer, Integer> closure = ClosureExample.closure();
        list.stream().map(closure).forEach(n -> System.out.print(n + " "));
    }

}