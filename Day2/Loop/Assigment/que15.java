package Day2.Loop.Assigment;
import java.util.Scanner;
public class que15 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 2;
        boolean isPrime = true;

        while (i <= n / 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (isPrime && n > 1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
