import java.util.Arrays; //Arrays class for useful Arrays functions like searching and sorting in Arrays

public class ArraysExample {
    public static void main(String[] args){
        // Declare an Array of size 5. It can only contain 5 characters
        char vowels[] = new char[5]; // Another possible way for declaring an array; char[] vowels

        vowels[0] = 'a';
        vowels[1] = 'b';
        vowels[2] = 'c';
        vowels[3] = 'd';
        vowels[4] = 'e';

        // Print the content of the array as a string
        System.out.println(Arrays.toString(vowels));

        // Use a for loop to print the array
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }

        // Another way to declare an array with initialization, similar to C/C++
        int nums[] = {4, 1, 9, 4, 5, 6};
        System.out.println(Arrays.toString(nums));

        // Sort the array
        Arrays.sort(nums); // It sorts the array in-place, modifying the original array
        System.out.println(Arrays.toString(nums));

        // Sort a specific range within the array
        Arrays.sort(nums, 2, 4);

        // Search in the array using Arrays.binarySearch. Ensure that the array is sorted before using it.
        System.out.println(Arrays.binarySearch(nums, 4));
        // If the key is not found in the array, it returns a negative value
        System.out.println(Arrays.binarySearch(nums, 99));

        // Fill the array with the same value using Arrays.fill() method. It is an in-place method that does not return anything.
        Arrays.fill(nums, 0);
        System.out.println(Arrays.toString(nums));

        // Cloning or copying an array.
        // Note that arrays are reference types, so a simple assignment copies the reference (shallow copy).
        int nums_array_copy_shallow[] = nums;
        Arrays.fill(nums, 2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums_array_copy_shallow));

        // To create a deep copy or true copy, use Arrays.copyOf() method
        int nums_array_copy_deep[] = Arrays.copyOf(nums, nums.length);
        nums[0] = -1;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums_array_copy_deep));

        // Arrays.copyOfRange can be used to copy a specific part of the array. If the ending index is greater than the original array size, the remaining values are filled with zeros.
        int[] nums_copy_of_range = Arrays.copyOfRange(nums, 1, 8);
        System.out.println(Arrays.toString(nums_copy_of_range));

        // Comparing arrays. Use Arrays.equals() method to compare two arrays in Java.
        System.out.println(Arrays.equals(nums, nums_array_copy_deep));

        // Arrays have a fixed size. Trying to access an element outside of its memory bounds will generate an "Index out of range" error.
        // System.out.println(vowels[5]);

        // Two-dimensional arrays
        // Declaration and initialization with default values (0)
        int[][] matrix = new int[3][4]; // 3 rows and 4 columns

        // Assigning values to elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][2] = 3;

        // Accessing elements
        int element = matrix[1][2]; // Retrieves the value at row 1, column 2

        // Iterating through the matrix
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
