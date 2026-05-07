package Day1;

public class que4 {
	public static void main(String[] args) {
	int a = 5, b = 10, c = 102 ;

    
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
   
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;

    System.out.println("Largest: " + max);
    System.out.println("Smallest: " + min);
}
}
