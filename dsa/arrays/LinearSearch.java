package dsa.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 7, 9, 2 };
        int target = 7;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present in array");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
