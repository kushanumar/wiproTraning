package Day10.Assigment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Que4 {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String targetWord = "Java";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                
                for (String word : words) {
                    String cleanWord = word.replaceAll("[^a-zA-Z0-String]", "");
                    
                    if (cleanWord.equals(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
