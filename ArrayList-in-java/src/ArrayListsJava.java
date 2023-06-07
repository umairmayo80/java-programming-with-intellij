import java.util.ArrayList;
import java.util.Comparator; // Importing the Comparator class from java.util package

public class ArrayListsJava {
    public static void main(String[] args) {
        // ArrayList can change the size dynamically, unlike arrays
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Here, Integer is the Integer wrapper class

        // Adding numbers to the ArrayList
        numbers.add(1); // The numbers will be appended to the end of the list
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);

        // Iterating over the list using a for-each loop
        for (int num : numbers) {
            System.out.print(num + ",");
        }
        System.out.println();

        System.out.println(numbers);

        // Printing the ArrayList using toString() method
        System.out.println(numbers.toString());

        // Accessing an element based on index using ArrayList.get(index) method
        System.out.println(numbers.get(4));

        // Removing an element using ArrayList.remove(index)
        System.out.println(numbers.remove(0)); // Returns and removes the value at the specified index
        System.out.println(numbers.toString());

        // Removing an element using the value itself using ArrayList.remove(value)
        System.out.println(numbers.remove(Integer.valueOf(3))); // Returns and removes the first occurrence of the value
        System.out.println(numbers.toString());

        // Updating an element at a specific index using ArrayList.set(index, newValue)
        numbers.set(2, 20);
        System.out.println(numbers);

        // Removing all elements and clearing the ArrayList using ArrayList.clear()
        numbers.clear();
        System.out.println(numbers);

        // Sorting the ArrayList using ArrayList.sort(Comparator)
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.sort(Comparator.naturalOrder()); // Sort in ascending order
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder()); // Sort in descending order
        System.out.println(numbers);

        // Getting the size of the ArrayList using ArrayList.size()
        System.out.println(numbers.size());

        // Checking if the ArrayList contains a specific element using ArrayList.contains(value)
        numbers.add(20);
        System.out.println(numbers.contains(20));

        // Checking if the ArrayList is empty using ArrayList.isEmpty()
        numbers.remove(Integer.valueOf(20));
        System.out.println(numbers.isEmpty());

        // ArrayList.indexOf method to find the index of an element
        System.out.println(numbers.indexOf(8)); // output: 1

        // ArrayList.forEach() method to iterate over the list
        numbers.forEach(number -> {
            System.out.println(number*2);
        });

        System.out.println(numbers.toString());
    }
}
