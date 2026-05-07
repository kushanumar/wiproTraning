package Day10.Assigment;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        String filePath = "data.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to append to the file:");
        String userInput = scanner.nextLine();

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(userInput + System.lineSeparator());
            System.out.println("Data successfully appended!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

