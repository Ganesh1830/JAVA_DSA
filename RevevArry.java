/**
 * 
 */
package ARRAYLISt;

/**
 * Onkar Swami
 */
public class RevevArry {
    public static void main(String[] args) {

        int[] arr = {61,31,89,26,34,23};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse the array
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}