package Day11.Assigment;
import java.util.*;

public class Que2 {
    public static String removeDuplicates(String str) {
        if (str == null) return null;
        
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (seen.add(c)) { 
                result.append(c);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); 
        System.out.println(removeDuplicates("swissmiss"));    
        System.out.println(removeDuplicates("aabbcc"));       
        System.out.println(removeDuplicates("abc"));          
        System.out.println(removeDuplicates(""));             
    }
}
