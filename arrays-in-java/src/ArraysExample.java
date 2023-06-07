import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args){
        // Declare an Array of size 5. It can only contain 5 characters
        char vowels[] = new char[5]; //or char[] vowels


        vowels[0] = 'a';
        vowels[1] = 'b';
        vowels[2] = 'c';
        vowels[3] = 'd';
        vowels[4] = 'e';

        // Print the content of Arrays as string
        System.out.println(Arrays.toString(vowels));

        // for loop to print an Array
        for(int i = 0; i<5; i++ ){
            System.out.println(vowels[i]);
        }

        // Another way to declare with initialization, just like in c/c++
        int nums[] = {4,1,9,4,5,6};
        System.out.println(Arrays.toString(nums));

        // Sort Array
        Arrays.sort(nums); //it sorts inplace, means modify the original array and does not return anything
        System.out.println(Arrays.toString(nums));

        // sorting within a specific range
        Arrays.sort(nums,2,4);


        // Search in array using Arrays.binarySearch, before using ensure that the array is sorted
        System.out.println(Arrays.binarySearch(nums,4));
        // If the key is not found in the Array then it return a negative value
        System.out.println(Arrays.binarySearch(nums,99));

        // Fill an Array with a same value using the Arrays.fill function, it also inplace method and does not return anything
        Arrays.fill(nums,0);
        System.out.println(Arrays.toString(nums));


        // Cloning or Copying an Array.
        // Note, Arrays identifier are reference and when one simply type:
        int nums_array_copy_shallow[] = nums; // the reference is copied, resulting in shallow copy
        Arrays.fill(nums,2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums_array_copy_shallow));

        // To create deep copy or true copy use Arrays.copyOf() method
         int nums_array_copy_deep[] = Arrays.copyOf(nums,nums.length);
        nums[0] = -1;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums_array_copy_deep));

        // Arrays.CopyOfRange can also be used to copy certain part of array. If the ending index is greater than the original array index then the last values are filled with zeros 0
        int[] nums_copy_of_range = Arrays.copyOfRange(nums,1,8);
        System.out.println(Arrays.toString(nums_copy_of_range));


        // Comparing arrays. Just as String, we cannot simply compare two arrays using equal operator
        // Use Arrays.equals() method to compare two Arrays in Java
        System.out.println(Arrays.equals(nums,nums_array_copy_deep));

        // Arrays are fixed size. Trying to access an element outside of its memory (bound) will generate an Index out of range Error
        // System.out.println(vowels[5]);

        // Two Dimensional Arrays
        // Declaration and initialization by 0
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
