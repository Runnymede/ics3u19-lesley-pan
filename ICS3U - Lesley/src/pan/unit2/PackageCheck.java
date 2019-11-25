package pan.unit2;
import java.util.Scanner;

/** Learning && and ||
 * October 3, 2019
 * @authorLesley
 */

public class PackageCheck {
	
	/** 
	 * This is where our program starts.
	 * @param args unused
	 */
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		//Greets user to the program
		System.out.println("Welcome to Downs Shipment Service."
				+ " Our service does not deliever packages larger than 27kg or larger than 0.1 cubic meters. \n");
		
		//Asks user for all the variables of their package
		System.out.println("Please enter the weight of your package in kg.");
		int packageWeight = sc.nextInt();
		System.out.println("Please enter the length of your package in cm.");
		int packageLength = sc.nextInt();
		System.out.println("Please enter the width of your package in cm.");
		int packageWidth= sc.nextInt();
		System.out.println("Please enter the height of your package in cm.");
		int packageHeight = sc.nextInt();
		
		//Checks to see if weight and size fit the restrictions
		
		int dimensionArea = packageLength * packageWidth * packageHeight;
		
		if (packageWeight>27 && dimensionArea>100000) {
			System.out.println("Sorry, your package is too heavy and too large for us to ship. You must lighten the load before we can ship it");
		}
		else if  (packageWeight<27 && dimensionArea>100000){
				System.out.println("Sorry, your package is too large for us to ship.");	
		}
		else if (packageWeight>27 && dimensionArea<100000) {
			System.out.println("Sorry, your package is too heavy. You must lighten the load before we can ship it.");
		}
		else {
			System.out.println("Alright, it seems like your shipment meets the requirements. Happy Shipping!");
		}
	}
}
