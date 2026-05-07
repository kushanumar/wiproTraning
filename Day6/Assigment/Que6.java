package Day6.Assigment;

public class Que6 {
    public static void main(String[] args) {
        
        Boolean isActive = true;
        boolean fromString = Boolean.parseBoolean("True"); 
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        
        if (b1.equals(b2)) {
            System.out.println("The values match.");
        }
        Boolean result = getStatus(); 
        if (result != null) {
            System.out.println("Result is: " + result);
        } else {
            System.out.println("Result was never set (null).");
        }
    }

    private static Boolean getStatus() {
        return null;
    }
}