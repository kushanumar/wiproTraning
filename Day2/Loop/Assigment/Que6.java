package Day2.Loop.Assigment;
import java.util.Scanner;

public class Que6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("1.INR to USD\n2.INR to EUR");
	        int choice = sc.nextInt();
	        System.out.print("Enter amount in INR: ");
	        double amount = sc.nextDouble();

	        switch (choice) {
	            case 1:
	                System.out.println("USD: " + amount * 0.012);
	                break;
	            case 2:
	                System.out.println("EUR: " + amount * 0.011);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }
	    }
}