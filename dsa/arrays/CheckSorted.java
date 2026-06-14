package dsa.arrays;

import java.util.Arrays;

public class CheckSorted {

    /**
     * Approach 1: Iterative (Optimal)
     * Intuition: Iterate from 0 to N-2 and verify if all adjacent pairs satisfy arr[i] <= arr[i+1].
     * Time Complexity: O(N) - Single pass.
     * Space Complexity: O(1) - Constant auxiliary space.
     */
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Approach 2: Recursive
     * Intuition: Base case is size <= 1. Check if first element is smaller than or equal to second, 
     * then recurse for the rest of the array.
     * Time Complexity: O(N) - N recursive calls.
     * Space Complexity: O(N) - Stack space.
     */
    public static boolean isSortedRecursive(int[] arr, int index) {
        if (arr == null || index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSortedRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 3, 2, 4, 5 };

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Iterative: Is Sorted? " + isSorted(arr1));
        System.out.println("Recursive: Is Sorted? " + isSortedRecursive(arr1, 0));

        System.out.println("\nArray 2: " + Arrays.toString(arr2));
        System.out.println("Iterative: Is Sorted? " + isSorted(arr2));
        System.out.println("Recursive: Is Sorted? " + isSortedRecursive(arr2, 0));
    }
}
