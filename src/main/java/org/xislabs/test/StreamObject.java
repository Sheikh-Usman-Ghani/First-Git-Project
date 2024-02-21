package org.xislabs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {


//        empty stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });


        String[] names = {"Usman", "Ali", "Usama", "Hadi"};
        Stream<String> Stream1 = Stream.of(names);
        Stream1.forEach(e -> {
            System.out.println(e);
        });

        IntStream intStream = Arrays.stream(new int[]{1, 3, 4, 5, 2, 32, 12, 4, 35});
        intStream.forEach(e -> {
            System.out.println(e);
        });

        IntStream intStreams = Arrays.stream(new int[]{1, 3, 4, 5, 2, 32, 12, 4, 35});
        List<Integer> resultList = intStreams.boxed()
                .collect(Collectors.toList());

        System.out.println(resultList);


        String[] Names = {"Usman", "Ali", "Usama", "Hadi"};
        List<String> result = Arrays.stream(Names).toList();
        System.out.println(result);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> product = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("Product of numbers: " + product);

        List<String> Name = Arrays.asList("Usman", "Ghani");
        Optional<String> fullName = Name.stream().reduce((e1, e2)->e1.concat(e2));
        System.out.println(fullName);
    }
}



