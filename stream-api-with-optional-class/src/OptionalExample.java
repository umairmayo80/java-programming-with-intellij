import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Find the first even number using Optional
        Optional<Integer> firstEven = numbers.stream()
                .filter(num -> num % 2 == 0)
                .findFirst();

        // Check if a value is present and perform an action
        if (firstEven.isPresent()) {
            System.out.println("First even number: " + firstEven.get());
        } else {
            System.out.println("No even number found.");
        }

        // Perform an action if a value is present using ifPresent()
        // we can use function call in the Optional.ifPresent
        firstEven.ifPresent(num -> System.out.println("Found an even number: " + num));

        // Perform a default action if a value is absent using orElse()
        Integer defaultValue = 0;
        Integer result = firstEven.orElse(defaultValue);
        System.out.println("Result: " + result);

        // Perform a custom action if a value is absent using orElseGet()
        Integer customResult = firstEven.orElseGet(() -> {
            // Some custom logic to generate a default value
            return generateDefaultValue();
        });
        System.out.println("Custom Result: " + customResult);

        // Perform an action if a value is absent using orElseThrow()
        try {
            Integer value = firstEven.orElseThrow(() -> new RuntimeException("No even number found."));
            System.out.println("Value: " + value);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Integer generateDefaultValue() {
        // Custom logic to generate a default value
        return -1;
    }
}
