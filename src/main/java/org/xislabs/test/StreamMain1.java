package org.xislabs.test;

import org.xislabs.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {

//         Api immutable lists
        List<Integer> list1 = List.of(2, 3, 4, 5, 12, 23, 24, 3);
        System.out.println("Original: " + list1);

//        Without Steam Filter all even number from list
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                evenNumber.add(i);
            }
        }
        System.out.println("Even Numbers: " + evenNumber);

//        Using Stream api
//            Stream<Integer> stream = list1.stream();
//            List<Integer> newList = stream.filter(j -> j % 2 == 0).collect(Collectors.toList());
//
//            // Print the final result
//            System.out.println("Even Numbers: " + newList);

        List<Integer> newList = list1.stream().filter(j -> j % 2 == 0).toList();
        System.out.println("Even Numbers: " + newList);


        List<Integer> newList2 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList2);
    }


}
