package Day2.Loop.Assigment;
import java.util.Scanner;

public class que7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter role: ");
        String role = sc.next().toLowerCase();

        switch (role) {
            case "admin": System.out.println("Full Access"); break;
            case "user": System.out.println("Limited Access"); break;
            case "guest": System.out.println("View Only"); break;
            default: System.out.println("Invalid Role");
        }
    }
}
