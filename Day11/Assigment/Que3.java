package Day11.Assigment;
import java.util.HashMap;
import java.util.Map;

public class Que3 {
	public static int findMaxFrequency(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        int maxFreq = 0;
        int maxElement = -1;

        for (int num : arr) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            if (count > maxFreq) {
                maxFreq = count;
                maxElement = num;
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 2, 2, 2};
        
        int result = findMaxFrequency(arr);
        System.out.println("Element with max frequency: " + result);
    }

    
}
