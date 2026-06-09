package dsa.arrays;

import java.util.Arrays;

class ArrayOperations {
    public int findLargestElement(int[] arr) {
        int LargestElementInArray = arr[0];
        for (int i : arr) {
            if (i >= LargestElementInArray) {
                LargestElementInArray = i;
            }
        }
        return LargestElementInArray;
    }

    public int[] findSecondLargestAndSecondSmallestElement(int[] arr) {
        int SecondSmallest = Integer.MAX_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        int FirstLargest = Integer.MIN_VALUE;
        int FirstSmallest = Integer.MAX_VALUE;
        if (arr.length <= 2) {
            return new int[] { -1, -1 };
        }
        for (int i : arr) {
            if (i > FirstLargest) {
                SecondLargest = FirstLargest;
                FirstLargest = i;
            } else if (i > SecondLargest && i != FirstLargest) {
                SecondLargest = i;
            }
            if (i < FirstSmallest) {
                SecondSmallest = FirstSmallest;
                FirstSmallest = i;
            } else if (i < SecondSmallest && i != FirstSmallest) {
                SecondSmallest = i;
            }
        }
        return new int[] { SecondSmallest, SecondLargest };
    }

    public boolean isArraySortedInAscendingArray(int[] arr) {
        boolean isArraySorted = true;
        int lengthOfArray = arr.length;
        if (lengthOfArray <= 1) {
            return isArraySorted;
        }
        for (int i = 0; i < lengthOfArray - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return isArraySorted;
    }
}

public class LargestElementInAnArray {
    public static void main(String[] args) {
        ArrayOperations arrop = new ArrayOperations();
        int[] arr = { 5, 4, 6, 7, 8 };
        boolean result = arrop.isArraySortedInAscendingArray(arr);
        System.out.println("Is array sorted in ascending order? " + result);
    }
}