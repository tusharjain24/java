package dsa.arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class MoveZeroes {

    /**
     * Approach 1: Brute Force
     * Intuition: Collect all non-zero elements in a temporary list, copy them back 
     * to the start of the array, and fill the remaining spots with zeroes.
     * Time Complexity: O(N) - Linear passes.
     * Space Complexity: O(N) - Extra storage for non-zero elements.
     */
    public static void bruteForce(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        ArrayList<Integer> temp = new ArrayList<>();
        // Step 1: Collect non-zero elements
        for (int num : arr) {
            if (num != 0) {
                temp.add(num);
            }
        }

        // Step 2: Write non-zero elements back to array
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        // Step 3: Fill the rest with zeroes
        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    /**
     * Approach 2: Optimal (Two Pointers / In-Place Swapping)
     * Intuition: Find the first occurrence of zero. Use that index as a target to 
     * swap in the next non-zero element discovered by the scanning pointer.
     * Time Complexity: O(N) - Single pass (actually at most two pointers traversing once).
     * Space Complexity: O(1) - Constant auxiliary space.
     */
    public static void optimal(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        // Find the first zero
        int zeroIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIdx = i;
                break;
            }
        }

        // If no zeroes exist, we are done
        if (zeroIdx == -1) return;

        // Swap non-zero elements into zeroIdx positions
        for (int j = zeroIdx + 1; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[zeroIdx];
                arr[zeroIdx] = temp;
                zeroIdx++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 0, 2, 3, 0, 4, 0, 5 };
        int[] arr2 = { 1, 0, 2, 3, 0, 4, 0, 5 };

        System.out.println("Original: " + Arrays.toString(arr1));
        
        bruteForce(arr1);
        System.out.println("Brute Force: " + Arrays.toString(arr1));

        optimal(arr2);
        System.out.println("Optimal:     " + Arrays.toString(arr2));
    }
}
