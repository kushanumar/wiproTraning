package Day6.Assigment;

public class Que4 {
	public static void main(String[] arg) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");

		System.out.println(s1 == s2);    
		System.out.println(s1.equals(s2));   
		System.out.println(s1 == s3);        
		System.out.println(s1.equals(s3));
	}
}
