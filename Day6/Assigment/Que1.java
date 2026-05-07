package Day6.Assigment;


public class Que1 {
    public static void changeValue(int num) {
        System.out.println("Before change: " + num);
        System.out.println("After change: " + num);
    }
    
    public static void main(String[] args) {
        int value = 50;
        
        System.out.println(" Before method call: " + value);
        changeValue(value);
        System.out.println("After method call: " + value);
    }
}
