package dsa.arrays;

import java.util.Arrays;

public class SecondLargestAndSmallest {

    /**
     * Approach 1: Brute Force (Sorting)
     * Intuition: Sort the array. Find second distinct element from start for second smallest, 
     * and second distinct element from end for second largest.
     * Time Complexity: O(N log N) - Due to sorting.
     * Space Complexity: O(1) - Clone excluded.
     */
    public static int[] bruteForce(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1, -1};
        }
        int[] temp = arr.clone();
        Arrays.sort(temp);

        // Find second smallest
        int secondSmallest = -1;
        int smallest = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != smallest) {
                secondSmallest = temp[i];
                break;
            }
        }

        // Find second largest
        int secondLargest = -1;
        int largest = temp[temp.length - 1];
        for (int i = temp.length - 2; i >= 0; i--) {
            if (temp[i] != largest) {
                secondLargest = temp[i];
                break;
            }
        }

        return new int[]{secondSmallest, secondLargest};
    }

    /**
     * Approach 2: Better (Two Passes)
     * Intuition: Find first largest/smallest in 1st pass, then find second largest/smallest in 2nd pass.
     * Time Complexity: O(N) - Two linear passes.
     * Space Complexity: O(1) - Constant space.
     */
    public static int[] better(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1, -1};
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Pass 1: Find first smallest and largest
        for (int num : arr) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Pass 2: Find second smallest and largest
        for (int num : arr) {
            if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
            if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Check if second largest/smallest exist
        if (secondSmallest == Integer.MAX_VALUE) secondSmallest = -1;
        if (secondLargest == Integer.MIN_VALUE) secondLargest = -1;

        return new int[]{secondSmallest, secondLargest};
    }

    /**
     * Approach 3: Optimal (Single Pass)
     * Intuition: Update first and second largest/smallest dynamically in a single traversal.
     * Time Complexity: O(N) - Single linear scan.
     * Space Complexity: O(1) - Constant space.
     */
    public static int[] optimal(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1, -1};
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            // Find second largest
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }

            // Find second smallest
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) secondSmallest = -1;
        if (secondLargest == Integer.MIN_VALUE) secondLargest = -1;

        return new int[]{secondSmallest, secondLargest};
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println("Input Array: " + Arrays.toString(arr));
        
        int[] bf = bruteForce(arr);
        System.out.println("Brute Force -> Second Smallest: " + bf[0] + ", Second Largest: " + bf[1]);
        
        int[] bet = better(arr);
        System.out.println("Better      -> Second Smallest: " + bet[0] + ", Second Largest: " + bet[1]);
        
        int[] opt = optimal(arr);
        System.out.println("Optimal     -> Second Smallest: " + opt[0] + ", Second Largest: " + opt[1]);
    }
}
