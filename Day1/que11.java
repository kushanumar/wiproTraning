package Day1;

public class que11 {
	public static void main(String[] args) {
        int a = 22;
        int b = 55;
        int c = 666;

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}
