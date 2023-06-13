import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","orange","kiwi","mango"));
        fruits.add("fruits_array_list");

        System.out.println(fruits.getClass().getName()+":"+fruits);

        // Create an ArrayList using an Array
        String[] fruitsArray = { "apple", "banana", "orange", "kiwi", "mango" };
        ArrayList<String> fruitList1 = new ArrayList<String>(Arrays.asList(fruitsArray));
        fruits.add("array_list_using_array");
        System.out.println(fruitList1.getClass().getName()+":"+fruitList1);


        //Create List using Arrays.asList()
        List<String> fruitList2 = Arrays.asList("apple", "banana", "orange", "kiwi", "mango" );
        // Here, the fruitList2 is immutable (not modifiable)
        // fruitList2.add("It will generate an error");

        // Filter the fruits that start with 'a' and convert them to uppercase
        List<String> filteredFruits = fruitList1.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .map(String::toUpperCase) // convert fruit to upper case
                .map(fruit -> (String)fruit.toLowerCase()) //convert fruit to lower case
                .collect(Collectors.toList());

        System.out.println(filteredFruits.getClass().getName()+":"+filteredFruits);

        // convert the fruits starting with 'a' to uppercase and the fruits starting with 'b' to lowercase,
//        List<String> filteredFruits1 = fruitList1.stream()
//                .filter(fruit -> { // filter function should return boolean true or false, it cannot be used for transformation
//                    if (fruit.startsWith("a"))
//                        return fruit.toUpperCase();
//                    else if (fruit.startsWith("b"))
//                        return fruit.toLowerCase();
//                })
//                .collect(Collectors.toList());

        List<String> filteredFruits1 = fruitList1.stream()
                .filter(fruit -> { // filter function should return boolean true or false, it cannot be used for transformation
                    if (fruit.startsWith("a") || fruit.startsWith("b"))
                        return true;
                    else
                        return false;
                })
                .collect(Collectors.toList());

        System.out.println(filteredFruits1);



        // convert the fruits starting with 'a' to uppercase and the fruits starting with 'b' to lowercase,
        // As it if transformation we will use map
        List<String> filteredAndTransformedFruits = fruitList1.stream()
                .map(fruit ->{
                    if (fruit.startsWith("a")) return fruit.toUpperCase();
                    else if(fruit.startsWith("b")) return fruit.toLowerCase();
                    else // map must return value for every entry
                        return fruit;
                })
                .collect(Collectors.toList());

        System.out.println(filteredAndTransformedFruits);



        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        List<Integer> squaredNumbers = nums.stream().map(num -> num*num).collect(Collectors.toList());
        System.out.println(squaredNumbers.getClass().getName()+":"+squaredNumbers);

        // List<Integer> squaredNumbers = nums.stream().map(num -> num*num).collect(Collectors.);
        Set<Integer> squaredNumbersSet = nums.stream().map(num -> num*num).collect(Collectors.toSet());
        System.out.println(squaredNumbersSet.getClass().getName()+":"+squaredNumbersSet);


        Map<Integer, Integer> numbers_and_their_square = nums.stream()
                .collect(Collectors.toMap(number -> number, number -> number * number));

        System.out.println(numbers_and_their_square.getClass().getName()+":"+numbers_and_their_square);



    }
}
