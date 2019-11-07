package pan.unit2;

import java.util.Scanner;

public class NumberCheck {
	
	/** Learning to use if statements
	 * October 1, 2019
	 * @authorLesley
	 */
	
	public static void main(String[] args) {
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//asks user for a number//
		System.out.println("Please enter a whole number.");
		int num = sc.nextInt();
		
		//if number is positive//
		if (num>= 0)
		{
			//checks if number is divisble by 7//
			int divisbleNum = num % 7;
				if (divisbleNum == 0) 
				{ 
					//informs user of outcome - positive and true//
					System.out.println("The number you entered was positive and can also be divisble by 7.");
					System.out.println("You may run the program again to try a new number.");
				}
				else
				{
					//informs user of outcome - positive and false//
					System.out.println("Your number was positive but not divisble by 7.");
					System.out.println("You may run the program again to try a new number.");
				}
		}
			//if the number is negative//
		else
		{
			//checks if number is divisble by 7//
			int divisbleNum = num % 7;
			if (divisbleNum == 0) 
			{ 
				//informs user of outcome - negative and true//
				System.out.println("The number you entered was negative and can also be divisble by 7.");
				System.out.println("You may run the program again to try a new number.");
			}
			else
			{
				//informs user of outcome - negative and false//
				System.out.println("Your number was negative but not divisble by 7.");
				System.out.println("You may run the program again to try a new number.");	
			}
		
		}
	}	
		
}
