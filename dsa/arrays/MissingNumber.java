package dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    /**
     * Approach 1: Brute Force
     * Intuition: Search for every number from 1 to N in the array.
     * Time Complexity: O(N^2) - Linear scan for each number.
     * Space Complexity: O(1) - No extra space used.
     */
    public static int bruteForce(int[] arr) {
        int n = arr.length + 1;
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1;
    }

    /**
     * Approach 2: Better (Hashing)
     * Intuition: Store all elements in a hash set to allow O(1) lookups.
     * Time Complexity: O(N) - One pass to build set, another to find missing.
     * Space Complexity: O(N) - Storage for the hash set.
     */
    public static int better(int[] arr) {
        int n = arr.length + 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) return i;
        }
        return -1;
    }

    /**
     * Approach 3: Optimal (Math Sum Formula)
     * Intuition: Sum formula: Expected sum of 1..N and subtract actual sum.
     * Time Complexity: O(N) - Single loop.
     * Space Complexity: O(1) - Only constant extra space.
     */
    public static int optimal(int[] arr) {
        long n = arr.length + 1;
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }

    /**
     * Approach 4: Optimal (XOR Method - Avoids Integer Overflow)
     * Intuition: XOR of a number with itself is 0, and with 0 is the number. 
     * XORing 1..N and all array elements cancels everything except the missing number.
     * Time Complexity: O(N) - Single loop.
     * Space Complexity: O(1) - Only constant extra space.
     */
    public static int optimalXOR(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;
        
        for (int num : arr) {
            xor2 ^= num;
        }
        
        int n = arr.length + 1;
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }
        
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Brute Force: " + bruteForce(arr));
        System.out.println("Better (Hashing): " + better(arr));
        System.out.println("Optimal (Math Sum): " + optimal(arr));
        System.out.println("Optimal (XOR): " + optimalXOR(arr));
    }
}
