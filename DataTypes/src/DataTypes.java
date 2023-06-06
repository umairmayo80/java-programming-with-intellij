public class DataTypes{
    public static void main(String[] args)
    {
        // integer types
        byte aSingleByte = 100;
        // short, int, long

        // float, double, by default it is double for decimal numbers

        // boolen
        // char
        char copyrightSymbol = '\u00A9';
        System.out.println(copyrightSymbol);

        // implicit converion
        double number1 = 5.8;
        // int number2 = number1; // it  will throw an error as no implicit conversation from double to int due to possible data loss

        // explicit
        int num3 = (int) number1;
        System.out.println(num3);

    }

}