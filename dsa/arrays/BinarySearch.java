package dsa.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Found the target element at " + result + "index.");
        } else {
            System.out.println("Did not find the target in the array");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int midPoint = end - ((start + end) / 2);
            if (target == arr[midPoint])
                return midPoint;
            else if (target >= arr[midPoint])
                start = midPoint;
            else
                end = midPoint;
        }
        return -1;
    }
}
