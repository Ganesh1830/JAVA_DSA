package cakk;

import java.util.*;
import java.util.stream.Collectors;

public class Str1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("bye");
        list.add("hi");
        list.add("hello");
        list.add("nishant");
        list.add("cognizant");
        list.add("google");

        System.out.println("Original List : " + list);

        // Count strings length < 5
        long count = list.stream()
                .filter(x -> x.length() < 5)
                .count();

        System.out.println("\nCount Length < 5 : " + count);

        // Print strings length > 4
        System.out.println("\nLength > 4");
        list.stream()
                .filter(x -> x.length() > 4)
                .forEach(System.out::println);

        // Create list length > 3
        List<String> result = list.stream()
                .filter(x -> x.length() > 3)
                .collect(Collectors.toList());

        System.out.println("\nLength > 3 List : " + result);

        // Convert to Uppercase
        List<String> upper = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nUppercase : " + upper);

        // Distinct Elements
        List<String> distinct = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nDistinct : " + distinct);

        // Sorted Elements
        List<String> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nSorted : " + sorted);

        // Limit
        List<String> limit = list.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("\nFirst 3 Elements : " + limit);

        // Skip
        List<String> skip = list.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("\nAfter Skipping 2 : " + skip);

        // Any Match
        boolean anyMatch = list.stream()
                .anyMatch(x -> x.equals("google"));

        System.out.println("\nContains google : " + anyMatch);

        // All Match
        boolean allMatch = list.stream()
                .allMatch(x -> x.length() > 1);

        System.out.println("All Length > 1 : " + allMatch);

        // None Match
        boolean noneMatch = list.stream()
                .noneMatch(x -> x.equals("java"));

        System.out.println("No java Present : " + noneMatch);

        // Find First
        Optional<String> first = list.stream().findFirst();
        first.ifPresent(x -> System.out.println("\nFirst Element : " + x));

        // Find Any
        Optional<String> any = list.stream().findAny();
        any.ifPresent(x -> System.out.println("Any Element : " + x));

        // Max Length String
        Optional<String> max = list.stream()
                .max(Comparator.comparing(String::length));
        max.ifPresent(x -> System.out.println("\nMax Length String : " + x));

        // Min Length String
        Optional<String> min = list.stream()
                .min(Comparator.comparing(String::length));
        min.ifPresent(x -> System.out.println("Min Length String : " + x));

        // Group By Length
        Map<Integer, List<String>> groupByLength =
                list.stream()
                        .collect(Collectors.groupingBy(String::length));

        System.out.println("\nGroup By Length : ");
        System.out.println(groupByLength);

        // Total Characters
        int totalChars = list.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println("\nTotal Characters : " + totalChars);
    }
}