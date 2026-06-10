package dsa.arrays;

public class DsaProblem {
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

    public void removeDuplicatesFromSortedArray(int[] arr) {
        int i = 0;
        if (arr.length < 2) {
            return;
        }
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int element : arr) {
            System.out.print(element);
        }
    }

    public void MoveZerosToEnd(int[] arr) {
        int i = 0;
        int arrayLength = arr.length;
        for (int j = i + 1; j < arrayLength; j++) {
            if (arr[i] != 0) {
                i++;
            }
            if (arr[i] == 0 && arr[j] != 0) {
                arr[i] = arr[j];
                i++;
                arr[j] = 0;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }
}
