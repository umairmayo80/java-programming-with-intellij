package objectRelations;
/*
 * Association:
Association represents a relationship between two classes, where one class is connected to the other class through a reference or method parameter. It can be a one-to-one, one-to-many, or many-to-many relationship.
 */

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    // other methods and attributes
}

class Engine {
    // engine implementation
}

public class Association {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        // use the car and engine objects
    }
}
