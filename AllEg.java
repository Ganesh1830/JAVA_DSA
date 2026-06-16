/**
 * 
 */
package Streamapi;

/**
 * Onkar Swami
 */

	import java.util.*;
	import java.util.stream.*;

	@SuppressWarnings("unused")
	public class AllEg {
	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(10, 25, 40, 55, 60, 75, 80, 95, 100, 40, 60);

	        // 1. Print all numbers
	        numbers.stream()
	                .forEach(System.out::println);

	        // 2. Print even numbers
	        numbers.stream()
	                .filter(n -> n % 2 == 0)
	                .forEach(System.out::println);

	        // 3. Print odd numbers
	        numbers.stream()
	                .filter(n -> n % 2 != 0)
	                .forEach(System.out::println);

	        // 4. Numbers greater than 50
	        numbers.stream()
	                .filter(n -> n > 50)
	                .forEach(System.out::println);

	        // 5. Numbers less than 50
	        numbers.stream()
	                .filter(n -> n < 50)
	                .forEach(System.out::println);

	        // 6. Remove duplicates
	        numbers.stream()
	                .distinct()
	                .forEach(System.out::println);

	        // 7. Sort ascending
	        numbers.stream()
	                .sorted()
	                .forEach(System.out::println);

	        // 8. Sort descending
	        numbers.stream()
	                .sorted(Collections.reverseOrder())
	                .forEach(System.out::println);

	        // 9. Count elements
	        long count = numbers.stream().count();
	        System.out.println("Count = " + count);

	        // 10. Maximum number
	        int max = numbers.stream()
	                .max(Integer::compare)
	                .get();
	        System.out.println("Max = " + max);

	        // 11. Minimum number
	        int min = numbers.stream()
	                .min(Integer::compare)
	                .get();
	        System.out.println("Min = " + min);

	        // 12. Sum of numbers
	        int sum = numbers.stream()
	                .reduce(0, Integer::sum);
	        System.out.println("Sum = " + sum);

	        // 13. Average
	        double avg = numbers.stream()
	                .mapToInt(Integer::intValue)
	                .average()
	                .getAsDouble();
	        System.out.println("Average = " + avg);

	        // 14. First element
	        numbers.stream()
	                .findFirst()
	                .ifPresent(System.out::println);

	        // 15. Any element
	        numbers.stream()
	                .findAny()
	                .ifPresent(System.out::println);

	        // 16. Second highest number
	        int secondHighest = numbers.stream()
	                .distinct()
	                .sorted(Collections.reverseOrder())
	                .skip(1)
	                .findFirst()
	                .get();

	        System.out.println("Second Highest = " + secondHighest);

	        // 17. Second smallest number
	        int secondSmallest = numbers.stream()
	                .distinct()
	                .sorted()
	                .skip(1)
	                .findFirst()
	                .get();

	        System.out.println("Second Smallest = " + secondSmallest);

	        // 18. Top 3 highest numbers
	        numbers.stream()
	                .distinct()
	                .sorted(Collections.reverseOrder())
	                .limit(3)
	                .forEach(System.out::println);

	        // 19. Skip first 3 elements
	        numbers.stream()
	                .skip(3)
	                .forEach(System.out::println);

	        // 20. Square of numbers
	        numbers.stream()
	                .map(n -> n * n)
	                .forEach(System.out::println);
	    }
	}


