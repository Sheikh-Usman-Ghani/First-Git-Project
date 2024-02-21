package org.xislabs.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Method {

    public static void main(String[] args) {

        List<String> names = List.of("usman", "ali", "usama", "hadi");
        List<String> newNames = names.stream().filter(e -> e.startsWith("u")).collect(Collectors.toList());
        System.out.println(newNames);


        List<Integer> number = List.of(1, 2, 45, 6, 54, 332, 34, 65);
        List<Integer> newNumber = number.stream().map(i -> i + i).collect(Collectors.toList());
        System.out.println(newNumber);


        names.stream().forEach(e ->
                System.out.println(e));


        newNames.stream().forEach(System.out::println);

        
        number.stream().sorted().forEach(System.out::println);

        Integer integers = number.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(integers);

        Integer maxNumber = number.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxNumber);
    }
}