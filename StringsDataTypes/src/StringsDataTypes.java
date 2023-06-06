public class StringsDataTypes {
    public static void main(String[] args) {
        char c = '%';
        System.out.println(c);

        // Literal string, stored in string pool in JavaVM
        String s = "I Love Allah";
        System.out.println(s);
        // Object string, the background benefit of this is that if a string already
        // exists in String pool then javaVm does not create new string literal and use
        // the refernce to previous string, but if we create an object like this then a
        // new string object is created separatly in memory
        String s1 = new String("I Love Allah");
        System.out.println(s1);

        int age = 20; // %d
        String name = "Umair"; // %s
        double gpa = 3.5; // %f
        char grade = 'A'; // %c
        boolean pass = true; // %b
        // String Concatenation
        String concat = "I love Allah. My age is " + age + ". I am " + name;
        System.out.println(concat);
        // String formatting
        System.out.println(
                String.format("I love Allah. My age is %d. I am %s. My GPA is %.2f. I have passed %b. My grade is %c",
                        age, name, gpa, pass, grade));
        System.out.println("String length:" + name.length());
        ;
        System.out.println("String.isEmpty()" + name.isEmpty());

        String str1 = "  "; // blank string with spaces
        String str2 = "\t"; // blank string with a tab

        // Using regular expression to check for a blank string
        System.out.println(str1.isBlank()); // true
        //same as below
        System.out.println(str2.matches("\\s*")); // true

    }
}
