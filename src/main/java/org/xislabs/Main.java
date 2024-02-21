package org.xislabs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(1,"Usman", 20, Gender.MALE),
                new Person(2,"Ali", 18, Gender.MALE),
                new Person(3,"Umar", 22, Gender.MALE),
                new Person(4,"Hadi", 25, Gender.MALE)
        );

        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names: " + names);

        List<Person> MalesOver25 = people.stream()
                .filter(person -> person.getGender() == Gender.MALE && person.getAge() > 22)
                .collect(Collectors.toList());
        System.out.println("Males over 22: " + MalesOver25);

        int totalPerson = people.stream()
                .mapToInt(Person::getId)
                .sum();
        System.out.println("Total Persons: " + totalPerson);

        int productIds = people.stream()
                .map(Person::getId)
                .reduce(1, (a, b) -> a + b);
        System.out.println("Product Ids: " + productIds);
    }
}

class Person {
    private int id;
    private String name;
    private int age;
    private Gender gender;

    public Person(int id , String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

enum Gender {
    MALE,
    FEMALE
}