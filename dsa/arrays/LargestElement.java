package dsa.arrays;

import java.util.Arrays;

public class LargestElement {

    /**
     * Approach 1: Brute Force (Sorting)
     * Intuition: Sort the array in ascending order; the last element will be the largest.
     * Time Complexity: O(N log N) - Due to standard sorting algorithms.
     * Space Complexity: O(1) - If sorted in place (ignoring recursion stack of sorting).
     */
    public static int bruteForce(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int[] temp = arr.clone(); // Clone to avoid modifying original array
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }

    /**
     * Approach 2: Optimal (Linear Scan)
     * Intuition: Keep track of the largest element seen so far while iterating through the array.
     * Time Complexity: O(N) - Single pass through the array.
     * Space Complexity: O(1) - Constant space.
     */
    public static int optimal(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Brute Force (Sorting): " + bruteForce(arr));
        System.out.println("Optimal (Linear Scan): " + optimal(arr));
    }
}
