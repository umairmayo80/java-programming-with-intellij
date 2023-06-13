import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
    public static void main(String[] args) {
        // Serialize an object
        try {
            // Create an ObjectOutputStream
            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new FileOutputStream("object.ser"));

            // Create an object to serialize
            Person person = new Person("John Doe", 25);

            // Write the object to the stream
            outputStream.writeObject(person);

            // Close the stream
            outputStream.close();

            System.out.println("Serialization completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize an object
        try {
            // Create an ObjectInputStream
            ObjectInputStream inputStream = new ObjectInputStream(
                    new FileInputStream("object.ser"));

            // Read the object from the stream
            Person deserializedPerson = (Person) inputStream.readObject();

            // Close the stream
            inputStream.close();

            // Display the deserialized object
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
