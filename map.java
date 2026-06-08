/**
 * 
 */
package collectionsFramework;

/**
 * Onkar Swami
 */
import java.util.HashMap;
public class map {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Add data
        map.put(101, "Onkar");
        map.put(102, "Rahul");
        map.put(103, "Priya");

        // Display map
        System.out.println(map);

        // Get value using key
        System.out.println("Student Name: " + map.get(102));

        // Check key exists
        System.out.println(map.containsKey(101));

        // Remove entry
        map.remove(103);

        System.out.println(map);

        // Size of map
        System.out.println("Size: " + map.size());
    }
}