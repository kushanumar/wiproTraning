package Day2.Loop.Assigment;
import java.util.Scanner;
public class que12 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(), temp = n, rev = 0;

	        while (n != 0) {
	            rev = rev * 10 + n % 10;
	            n /= 10;
	        }

	        if (temp == rev)
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
}
