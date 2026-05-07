package Day8.Assigment;

import java.util.HashMap;

public class Que1 {
	public static char findFirstNonRepeating(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeating(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
   
}
