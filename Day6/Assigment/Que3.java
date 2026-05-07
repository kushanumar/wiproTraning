package Day6.Assigment;

public class Que3 {
    public static void main(String[] args) {
        char ch = '5';
        
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is NOT a digit");
        }
        ch = 'A';
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is NOT a digit");
        }
    }
}
