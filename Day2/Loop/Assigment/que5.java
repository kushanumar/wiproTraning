package Day2.Loop.Assigment;
import java.util.Scanner;

public class que5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Pizza\n2.Burger\n3.Pasta");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Pizza - ₹200"); break;
            case 2: System.out.println("Burger - ₹100"); break;
            case 3: System.out.println("Pasta - ₹150"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
