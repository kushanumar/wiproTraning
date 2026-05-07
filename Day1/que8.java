package Day1;

public class que8 {
	public static void main(String[] args) {        
        int num = 11;

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by 5 and 11.");
        } else {
            System.out.println("Not divisible by both.");
        }
    }
}
