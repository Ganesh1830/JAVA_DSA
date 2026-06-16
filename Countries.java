/**
 * 
 */
package Streamapi;

/**
 * Onkar Swami
 */
import java.util.ArrayList;

public class Countries {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.add("India");
        countries.add("Indonesia");
        countries.add("Australia");
        countries.add("Italy");
        countries.add("Japan");
        countries.add("Iran");

        countries.stream()
                 .filter(country -> country.startsWith("I"))
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}