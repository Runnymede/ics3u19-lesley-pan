package pan.unit1;

import java.util.Scanner;

public class Digits {

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
		
		//asks user for a number//
		System.out.print("Hi, we're learning base tens today. \n"
				+ "Please enter a number from 0 - 999 and I will show it to you in base tens.");

		//stores number and reminds user what they put//
		int num = sc.nextInt();
		System.out.println();
		System.out.println("The number you entered was " + num + ".");
		
		//calculate for the base tens//
		int hundreds = num / 100;
		int tens = (num - hundreds*100) / 10;
		int ones = (num - hundreds*100) - tens*10;
		
		//print final result//
		System.out.println();
		System.out.println("Hundreds: " + hundreds);
		System.out.println("Tens:     " + tens);
		System.out.println("Ones:     " + ones);
		
	}
}
