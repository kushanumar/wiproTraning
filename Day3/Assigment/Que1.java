package Day3.Assigment;

public class Que1 {
public static void main(String[] arg) {
	int[] arr = {4, 2, 6, 5, 1};
	//Acceding
	for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {
	        
	        if (arr[i] > arr[j]) { 
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);}
	
	//  Descending
	for (int i = 0; i < arr.length / 2; i++) {
	    int temp = arr[i];
	    arr[i] = arr[arr.length - 1 - i];
	    arr[arr.length - 1 - i] = temp;
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
}
}
