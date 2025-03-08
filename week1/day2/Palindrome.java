package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int input=121, output=0;
		
		for (int i = input; i > 0; i = i / 10) {
			
			int rem = i%10;
			
			output = output*10+rem;
			
		}
			if (output==input) {
				System.out.println("Given number is palindrome");
				
			} else {
				System.out.println("Given number is not a palindrome");

			}
	}
				
	
}			
			
			
		
	
	

