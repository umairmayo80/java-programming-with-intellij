import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Print a table of a number using a while loop

        int number = 0;
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take input from the user

        System.out.println("Enter a number:");
        number = Integer.parseInt(scanner.nextLine()); // Read the input number from the user

        int itr = 1; // Initialize the iterator variable to 1

        while (itr <= 10) { // Execute the loop while the iterator is less than or equal to 10
            System.out.printf("%d * %d = %d\n", number, itr, number * itr); // Print the table entry for the current iteration
            itr++; // Increment the iterator by 1
        }
    }
}
