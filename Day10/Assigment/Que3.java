package Day10.Assigment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Que3 {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String targetWord = "Java";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Lines containing \"" + targetWord + "\":");
            
            while ((line = reader.readLine()) != null) {
                if (line.contains(targetWord)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

