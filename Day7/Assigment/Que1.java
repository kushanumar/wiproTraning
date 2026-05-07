package Day7.Assigment;
import java.util.*;

public class Que1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 1, 9, 7);

        if (list == null || list.size() < 2) {
        	System.out.println("emply");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : list) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println(second);
    }
}
