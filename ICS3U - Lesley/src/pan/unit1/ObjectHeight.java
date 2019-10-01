package pan.unit1;

import java.util.Scanner;


/** Learning to use variables
 * September 23, 2019 
 * @authorLesley
 */

public class ObjectHeight {
	/** 
	 * This is where our program starts.
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Hi, I saw you drop that object. I was wondering when did you drop it?");
		System.out.println("I know that is was less than 4.5 seconds ago though. So when was it?");
		double time = sc.nextDouble();
		double h = 100 - 2.9* (time*time);
		System.out.println("Did you know that the height of your object was " + h + " m");
		
		
	}
}
																																													
																																										