package pan.unit1;

import java.util.Scanner;

public class Quadratics {
	
	/** Learning to use math classes
	 * September 30, 2019 
	 * @authorLesley
	 */
	
	public static void main(String[] args) {
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//asks user for variables//
				System.out.println("Hi, we're learning quadractic formulas today. \n"
						+ "Please enter a number for variable a.");
				int a = sc.nextInt();
				System.out.println("b");
				int b = sc.nextInt();
				System.out.println("c"); 
				int c = sc.nextInt();
				System.out.println("and I will solve for the roots.");
				
		//calculates the quadratic formula//
				double squared = Math.pow(b, 2);
				double root = Math.sqrt(squared -4*a*c);
				double positiveRoot = (-b + root)/(2*a);
				double negativeRoot = (-b - root)/(2*a);
		
		//Tells user the result//		
				System.out.println();
				System.out.println("Your roots are " + positiveRoot + " and" + negativeRoot +".");
				

	}

}
