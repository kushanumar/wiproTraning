package Day5.Assigment;


public class Que1{
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int b, int a) {
        return a - b;
    }
    
    public static void main(String[] args) {
    	Que1 math = new Que1();
        
        System.out.println("5 + 3 = " + math.add(5, 3));
        System.out.println("5 - 3 = " + math.subtract(3, 5));
    }
}
