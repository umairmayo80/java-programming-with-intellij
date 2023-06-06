import java.util.Scanner;
import java.util.function.DoublePredicate;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = Integer.parseInt(scanner.nextLine());
        double result = 0;

        char operator = '\0';
        //close the scanner
        scanner.close();

        switch (choice) {
            case 1:
                result = num1 + num2;
                operator = '+';
                break;
            case 2:
                result = num1 - num2;
                operator = '-';
                break;
            case 3:
                result = num1 * num2;
                operator = '*';
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    operator = '/';
                } else {
                    System.out.println("Error: Division by zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.printf("%.2f %c %.2f = %.2f",num1,operator,num2,result);
    }
}
