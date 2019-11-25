package pan.unit2;
import java.util.Scanner;

/** Common Problems;
 * October 22, 2019
 * @authorLesley
 */

public class PrimeNumber {
	
	/** 
	 * This is where our program starts.
	 * @param args unused
	 */
	

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in); 
		
		//asks user for a number
		System.out.println("I heard you were trying to learn prime numbers. Let me help you out, enter a number.");
		int number = sc.nextInt();
		
		//checks if the number is even or not
		if (number % 2 == 0)
		{
			System.out.println("The number you entered was not a prime number.");
		}
		else
			//checks if it can be divided by 3
			if (number % 3 == 0)
			{
				System.out.println("The number you entered was not a prime number.");
			}
		else
			//checks if it can be divided by 5
				if (number % 5 == 0)
				{
					System.out.println("The number you entered was not a prime number.");
				}
		else
			//checks if it can be divided by 7
				if (number % 7 == 0)
				{
					System.out.println("The number you entered was not a prime number.");		
				}
		//knows that the number is prime
		else
			System.out.println("Did you enter ribs? Because that number was prime.");
	}
		
}	

