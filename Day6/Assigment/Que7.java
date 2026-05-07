package Day6.Assigment;

public class Que7 {
    public static void main(String[] args) {
        Boolean nullableBool = null;
        boolean safeValue = (nullableBool != null) ? nullableBool : false;

        System.out.println("Wrapper value: " + nullableBool); 
        System.out.println("Primitive value: " + safeValue);  
        
        boolean toggled = safeToggle(nullableBool);
        System.out.println("Toggled Value: " + toggled);
    }
    public static boolean safeToggle(Boolean input) {
        if (input == null) {
            return true; 
        }
        return !input;
    }
}
