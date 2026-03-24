package arrays;

public class MultiDimensionalArray {

    public void threeDimensionalArray() {
        int nums[][][] = new int[3][2][2];

        // Print the Array
        for (int rows[][] : nums) {
            for (int columns[] : rows) {
                for (int j : columns) {
                    System.out.println(j + "");
                }
            }
        }
    }

    public void printJaggedArray() {
        int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];

        /*
         * Cannot use enhances for-each loop like we used for printing as variable is
         * just a temporary local copy of the value inside the array. To assign the
         * values we have to use index to access the actual elements
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // Print the Array
        for (int rows[] : nums) {
            for (int columns : rows) {
                System.out.println(columns + "");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(matrix[1][2]);
        /*
         * Here the array is initialized with all the elements as '0' and the size of
         * the array will be 2x4. 2 rows and 4 columns.
         */
        int rows = 2;
        int columns = 4;
        int nums[][] = new int[rows][columns];
        // Simple for loop to print the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // Enhanced for loop to print the array
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
