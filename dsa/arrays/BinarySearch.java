package dsa.arrays;

import java.util.Arrays;

public class BinarySearch {

    /**
     * Approach 1: Iterative Binary Search
     * Intuition: Repeatedly divide the search space in half. Compare target with the middle element.
     * Time Complexity: O(log N) - Search space is halved each step.
     * Space Complexity: O(1) - Iterative search requires no extra space.
     */
    public static int binarySearch(int[] arr, int target) {
        if (arr == null) return -1;
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2; // Prevents overflow compared to (start + end) / 2
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Approach 2: Recursive Binary Search
     * Intuition: Base cases are target found or invalid range. Recurse into lower or upper half.
     * Time Complexity: O(log N) - Search space halved on each call.
     * Space Complexity: O(log N) - Due to recursive call stack.
     */
    public static int recursiveSearch(int[] arr, int target, int start, int end) {
        if (arr == null || start > end) {
            return -1;
        }
        
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return recursiveSearch(arr, target, mid + 1, end);
        } else {
            return recursiveSearch(arr, target, start, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        
        int iterResult = binarySearch(arr, target);
        System.out.println("Iterative Result: Found target at index " + iterResult);
        
        int recurResult = recursiveSearch(arr, target, 0, arr.length - 1);
        System.out.println("Recursive Result: Found target at index " + recurResult);
    }
}

