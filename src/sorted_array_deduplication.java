import java.util.*;

/**
 * The {@code sorted_array_deduplication} class provides a solution for removing duplicates from a sorted array
 * by allowing at most two occurrences of the same element and returning the new length.
 */
public class sorted_array_deduplication {

    /**
     * Solves the problem of removing duplicates from a sorted array by allowing at most two
     * occurrences of the same element and returning the new length.
     *
     * @param inputArray The input array containing sorted integers.
     * @return The new length of the array after removing duplicates.
     */
    public static int determineSolution(int[] inputArray) {
        Arrays.sort(inputArray);
        int counter = 0;
        for (int num : inputArray) {
            if (counter < 2 || num != inputArray[counter - 2]) {
                inputArray[counter++] = num;
            }
        }
        return counter;
    }

    /**
     * The main method contains examples demonstrating the functionality of the
     * {@link #determineSolution(int[])} method.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        boolean success = true;

        // Example 1
        System.out.println("Example 1:");
        int[] inputArray1 = {1, 1, 1, 2, 2, 3};
        int answer = determineSolution(inputArray1);
        System.out.println("Answer #1: " + answer);
        System.out.println("Expected Result: " + 5);
        success = answer == 5 && success;
        // Answer #1: 5

        // Example 2
        System.out.println("Example 2:");
        int[] inputArray2 = {0, 1, 3, 3, 9, 9, 9, 9, 9};
        answer = determineSolution(inputArray2);
        System.out.println("Answer #2: " + answer);
        System.out.println("Expected Result: " + 6);
        success = answer == 6 && success;
        // Answer #2: 6

        // Example 3
        System.out.println("Example 3:");
        int[] inputArray3 = {};
        answer = determineSolution(inputArray3);
        System.out.println("Answer #3: " + answer);
        System.out.println("Expected Result: " + 0);
        success = answer == 0 && success;
        // Answer #3: 0

        // Example 4 with unsorted numbers in array
        System.out.println("Example 4");
        int[] inputArray4 = {1, 1, 1, 4, 4, 4, 4, 2, 2, 2, 2, 2, 5, 6, 7, 3, 3, 2, 1};
        answer = determineSolution(inputArray4);
        System.out.println("Answer #4: " + answer);
        System.out.println("Expected Result: " + 11);
        success = answer == 11 && success;
        // Answer #4: 11

        if (success) {
            System.out.println("\nSuccess!");
        } else {
            System.out.println("\nFail!");
        }
    }
}
