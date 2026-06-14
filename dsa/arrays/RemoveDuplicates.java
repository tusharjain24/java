package dsa.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    /**
     * Approach 1: Brute Force (Using Hashing)
     * Intuition: Insert all elements into a LinkedHashSet (preserves order) to filter duplicates, 
     * then copy them back to the array.
     * Time Complexity: O(N) - Traversing and inserting into Set.
     * Space Complexity: O(N) - To store unique elements in Set.
     */
    public static int bruteForce(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int k = 0;
        for (int num : set) {
            arr[k++] = num;
        }
        return k;
    }

    /**
     * Approach 2: Optimal (Two Pointers)
     * Intuition: Use two pointers. Slow pointer 'i' stays on the last unique element, 
     * while fast pointer 'j' scans for new values.
     * Time Complexity: O(N) - Single pass.
     * Space Complexity: O(1) - In-place modification.
     */
    public static int optimal(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // Return count of unique elements
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 2, 2, 3, 3, 4, 4 };
        int[] arr2 = { 1, 1, 2, 2, 2, 3, 3, 4, 4 };

        System.out.println("Input Array: " + Arrays.toString(arr1));

        int k1 = bruteForce(arr1);
        System.out.print("Brute Force -> Unique Count: " + k1 + ", Array: ");
        for (int i = 0; i < k1; i++) System.out.print(arr1[i] + " ");
        System.out.println();

        int k2 = optimal(arr2);
        System.out.print("Optimal     -> Unique Count: " + k2 + ", Array: ");
        for (int i = 0; i < k2; i++) System.out.print(arr2[i] + " ");
        System.out.println();
    }
}
