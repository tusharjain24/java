package dsa.arrays;

import java.util.Arrays;

public class LinearSearch {

    /**
     * Approach 1: Linear Search
     * Intuition: Iterate through the array sequentially from start to end, 
     * checking if each element matches the target.
     * Time Complexity: O(N) - In the worst case, we check all N elements.
     * Space Complexity: O(1) - Constant auxiliary space.
     */
    public static int linearSearch(int[] arr, int target) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 7, 9, 2 };
        int target = 7;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Result: Element is present at index " + result);
        } else {
            System.out.println("Result: Element is not present in the array");
        }
    }
}

