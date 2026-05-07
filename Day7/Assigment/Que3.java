package Day7.Assigment;

import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        HashSet<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2); 

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        symmetricDiff.removeAll(intersection);
        System.out.println("Elements in either but not both: " + symmetricDiff);        
    }
}
