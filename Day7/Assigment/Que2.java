package Day7.Assigment;

import java.util.*;
import java.util.stream.Collectors;

public class Que2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        HashSet<Integer> intersectRetain = new HashSet<>(set1);
        intersectRetain.retainAll(set2);
        System.out.println("Intersection (retainAll): " + intersectRetain);

        Set<Integer> intersectStream = set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
        System.out.println("Intersection (Streams): " + intersectStream);
    }
}