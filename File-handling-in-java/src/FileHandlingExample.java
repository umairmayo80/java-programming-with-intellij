import java.io.FileWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


public class FileHandlingExample {
    public static void main(String[] args){

        try {

            String filePath = "File-handling-in-java\\src\\text.txt";

            String workingDir = System.getProperty("user.dir");
            System.out.println(workingDir);

            // Read from the file
            System.out.println("Reading from file");
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            System.out.println(lines);

            // Join the lines using a newline separator
            String fileContent = String.join("\n", lines);

            // Print or process the file content
            System.out.println(fileContent);

        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Trying File Writing using FileWriter");
        try {
            // Create a FileWriter object to write the file content to another file
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write("This is output file sample text.\n line1\nl2!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
