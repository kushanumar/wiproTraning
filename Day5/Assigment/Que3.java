package Day5.Assigment;

interface Calculator {
    int divide(int a, int b);
}
class SimpleCalculator implements Calculator {
    
    @Override
    public int divide(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero!");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
public class Que3{
    
    public static void main(String[] args) {
        Calculator calc = new SimpleCalculator();
        
        System.out.println("10 / 2 = " + calc.divide(10, 2));
        System.out.println("10 / 0 = " + calc.divide(10, 0));
        System.out.println("5 / 2 = " + calc.divide(5, 2));
    }
}
