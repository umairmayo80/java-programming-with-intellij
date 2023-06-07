public class ForLoops {
    public static void main(String[] args) {
        // For loop to iterate over a range
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ",");
        }
        System.out.println();

        // For loop to iterate over an array
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();

        // For-each loop to iterate over an iterable (collection) object
        for (int number : nums) {
            System.out.print(number + ",");
        }
        System.out.println();

        // For-each loop to iterate over a two-dimensional (2D) array and print its elements
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 2},
                {7, 8, 9}
        };
        matrix[0][1] = 4; // Modify an element in the 2D array
        matrix[1][2] = 2; // Modify another element in the 2D array

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Print Sum of two-dimensional (2D) array
        int sum = 0;
        for(int[] row: matrix){
            for(int element: row){
                sum=sum+element;
            }
        }
        System.out.println(sum);
    }
}
