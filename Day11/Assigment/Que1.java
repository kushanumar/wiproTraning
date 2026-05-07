package Day11.Assigment;
import java.util.*;

public class Que1 {
    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }
        
        return Character.MIN_VALUE; 
    }
    
    public static void main(String[] args) {
        String str = "swissmiss";
        char result = findFirstNonRepeating(str);
        System.out.println("First non-repeating: " + result);
    }
}
