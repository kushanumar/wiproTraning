package Day11.Assigment;

import java.util.*;

public class Que4 {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Zebra", 10);
        unsortedMap.put("Apple", 50);
        unsortedMap.put("Mango", 30);

        TreeMap<String, Integer> sortedMap = new TreeMap<>(unsortedMap);

        System.out.println(sortedMap);
    }
}
