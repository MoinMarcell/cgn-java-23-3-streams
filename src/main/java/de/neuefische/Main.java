package de.neuefische;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*List<String> names = List.of("Anna", "Hans", "Peter", "Günther", "Lisa");
        //long count = names.stream().filter(name -> name.length() > 4).count();
        List<String> updatedNames = names.stream().filter(name -> name.length() > 4).map(name -> {
                    return name += "1";
                })
                .toList();
        for (String name : updatedNames) {
            System.out.println(name);
        }
        *//*int count2 = 0;
        for (String name : names) {
            if (name.length() > 4) {
                count2++;
            }
        }
        System.out.println(count);*//*

        List<String> emails = List.of("test@bla.de", "test2@test.de", "test3@test.de");
        List<String> updatedEmails = emails.stream().map((email) -> {
            if(email.contains("@bla.de")){
                return email.replace("@bla.de", "@tesa.org");
            } else {
                return email.replace("@test.de", "@tesa.org");
            }
        }).toList();
        for(String email : emails){
            System.out.println(email);
        }
        for(String email : updatedEmails){
            System.out.println(email);
        }

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().parallel().reduce(0, (a, b) -> a + b);
        System.out.println(sum);*/

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for(String name : upperCaseNames){
            System.out.println(name);
        }
    }
}