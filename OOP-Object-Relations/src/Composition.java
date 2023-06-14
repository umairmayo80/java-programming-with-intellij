

/*
 * Composition is a strong form of association where the lifetime of one class is dependent on the other class. It means that one class is composed of one or more objects of another class, and if the main object is destroyed, all the composed objects are destroyed as well.
 */

class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    // other methods and attributes
}

class Engine {
    // engine implementation
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        // use the car object
    }
}
