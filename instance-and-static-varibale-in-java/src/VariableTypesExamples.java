public class VariableTypesExamples {
    // Class (static) variable
    public static int classVariable = 10;

    // Instance variables
    private String name;
    private int age;

    public VariableTypesExamples(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        // Accessing class (static) variable
        System.out.println("Class Variable: " + classVariable);

        // Accessing instance variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects of VariableTypesExample class
        VariableTypesExamples obj1 = new VariableTypesExamples("John", 25);
        VariableTypesExamples obj2 = new VariableTypesExamples("Alice", 30);

        // Calling printDetails() method on objects
        obj1.printDetails();
        obj2.printDetails();

        // Modifying class (static) variable
        classVariable = 40;


        // Calling printDetails() method on objects, the class variable is now 40 for all objects
        obj1.printDetails();
        obj2.printDetails();
    }
}
