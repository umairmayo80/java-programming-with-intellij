public class OperatorsExample {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int addition = a + b; // Addition operator
        int subtraction = a - b; // Subtraction operator
        int multiplication = a * b; // Multiplication operator
        int division = a / b; // Division operator
        int modulus = a % b; // Modulus operator

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Assignment Operators
        int x = 10;
        x += 5; // Compound assignment: x = x + 5
        System.out.println("Assignment: " + x);

        // Comparison Operators
        int num1 = 10;
        int num2 = 20;
        boolean isEqual = num1 == num2; // Equality operator
        boolean isNotEqual = num1 != num2; // Not equal operator
        boolean isGreaterThan = num1 > num2; // Greater than operator
        boolean isLessThan = num1 < num2; // Less than operator
        boolean isGreaterThanOrEqual = num1 >= num2; // Greater than or equal to operator
        boolean isLessThanOrEqual = num1 <= num2; // Less than or equal to operator

        System.out.println("Equality: " + isEqual);
        System.out.println("Not Equality: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater Than or Equal To: " + isGreaterThanOrEqual);
        System.out.println("Less Than or Equal To: " + isLessThanOrEqual);

        // Logical Operators
        boolean bool1 = true;
        boolean bool2 = false;
        boolean logicalAnd = bool1 && bool2; // Logical AND operator
        boolean logicalOr = bool1 || bool2; // Logical OR operator
        boolean logicalNot = !bool1; // Logical NOT operator

        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Increment and Decrement Operators
        int count = 5;
        count++; // Post-increment operator
        int postIncrement = count; // Value after increment
        count--; // Post-decrement operator
        int postDecrement = count; // Value after decrement

        ++count; // Pre-increment operator
        int preIncrement = count; // Value after increment
        --count; // Pre-decrement operator
        int preDecrement = count; // Value after decrement

        System.out.println("Post Increment: " + postIncrement);
        System.out.println("Post Decrement: " + postDecrement);
        System.out.println("Pre Increment: " + preIncrement);
        System.out.println("Pre Decrement: " + preDecrement);

        // Bitwise Operators
        int num3 = 5; // Binary: 00000101
        int num4 = 3; // Binary: 00000011

        int bitwiseAnd = num3 & num4; // Bitwise AND operator
        int bitwiseOr = num3 | num4; // Bitwise OR operator
        int bitwiseXor = num3 ^ num4; // Bitwise XOR operator
        int bitwiseNot = ~num3; // Bitwise NOT operator

        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT: " + bitwiseNot);

        // Shift Operators
        int num5 = 10; // Binary: 00001010

        int leftShift = num5 << 2; // Left shift operator
        int rightShift = num5 >> 2; // Right shift operator

        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);

        x >>= 3; // right shift
        /*
         * Here's the step-by-step explanation of the code:
         *
         * The value of x is initially 5, which is represented in binary as 00000101.
         * The expression x >>= 3 performs the right shift assignment operation on x by
         * 3 positions.
         * The binary representation of x after the right shift operation would be
         * 00000000.
         * The value of x is updated to 0 after the right shift operation (x = 0).
         * Finally, System.out.println(x) prints the value of x, which is 0, to the
         * console.
         *
         * In summary, the code performs a right shift operation on the variable x by 3
         * positions, effectively dividing x by 2^3 (which is equivalent to dividing x
         * by 8), resulting in the value 0.
         */
        System.out.println(x);

        x = 10;
        int[] numbers = { 1, 2, 3, 4, 5 };
        int y = (sum(numbers) > 0) ? x + 10 : -10; // ? is the conditional operator
        System.out.println(y);

        // Instance of Operator
        Object obj = "Hello";

        // Check if obj is a String
        if (obj instanceof String) {
            String str = (String) obj; // Type casting
            System.out.println("Length of the string: " + str.length());
        } else {
            System.out.println("Object is not a String");
        }

        // shift operator
        int number = 10; // Binary: 00001010

        // Left shift by 2 positions
        int leftShifted = number << 2; // Binary: 00101000, Decimal: 40
        System.out.println("Left Shifted: " + leftShifted);

        // Right shift by 2 positions
        int rightShifted = number >> 2; // Binary: 00000010, Decimal: 2
        System.out.println("Right Shifted: " + rightShifted);

        // Unsigned right shift by 2 positions
        int unsignedRightShifted = number >>> 2; // Binary: 00000010, Decimal: 2
        System.out.println("Unsigned Right Shifted: " + unsignedRightShifted);

    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}

/*
 * Operator precedence
 * Postfix operators: expression++, expression--
 * Unary operators: ++expression, --expression, +expression, -expression,
 * !expression, ~expression
 * Multiplicative operators: *, /, %
 * Additive operators: +, -
 * Shift operators: <<, >>, >>>
 * Relational operators: <, <=, >, >=, instanceof
 * Equality operators: ==, !=
 * Bitwise AND operator: &
 * Bitwise exclusive OR operator: ^
 * Bitwise inclusive OR operator: |
 * Logical AND operator: &&
 * Logical OR operator: ||
 * Conditional operator: ? :
 * Assignment operators: =, +=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, |=
 * Comma operator: ,
 * Note that parentheses () can be used to override the default precedence and
 * explicitly define the order of evaluation.
 */