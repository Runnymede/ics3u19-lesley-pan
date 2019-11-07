import java.util.Scanner;

public class DigitsDisplay {
	
	/** More loops();
	 * October 30, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) {
	
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		
	Scanner sc = new Scanner(System.in);
	
	//asks user for an integer
	System.out.println("Watch this neat trick. Enter a non negative integer.");
	
	//finds length of string
	String response = sc.nextLine();
	int length = response.length();
	int value = 0;
	
	//prints out values of integer
	do {
		
		System.out.println(response.charAt(value));
		value = value + 1;
		
	}while (value < length);
	
	System.out.println("Tadaa :D");
	
	}
}