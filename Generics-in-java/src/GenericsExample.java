public class GenericsExample<T> {
    private T value;

    public GenericsExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Creating an instance of GenericsExample with Integer type
        GenericsExample<Integer> intExample = new GenericsExample<>(10);
        int intValue = intExample.getValue();
        System.out.println("Integer value: " + intValue);

        // Creating an instance of GenericsExample with String type
        GenericsExample<String> stringExample = new GenericsExample<>("Hello, Generics!");
        String stringValue = stringExample.getValue();
        System.out.println("String value: " + stringValue);

        // Creating an instance of GenericsExample with Double type
        GenericsExample<Double> doubleExample = new GenericsExample<>(3.14);
        Double doubleValue = doubleExample.getValue();
        System.out.println("Double value: " + doubleValue);
    }
}
