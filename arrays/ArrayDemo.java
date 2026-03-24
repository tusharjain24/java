package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 7, 9 }; // In an array, the data is stored sequencially
        System.out.println(nums[2]);
        nums[1] = 65;
        /*
         * Here the array is initialized with all the elements as '0' and the size of
         * the array will be 4.
         */
        int num2[] = new int[4];
        System.out.println(num2[2]);
        num2[2] = 45;
        System.out.println(num2[2]);
    }

}
