package Day3.Assigment;

public class Que2 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 6, 6};

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
