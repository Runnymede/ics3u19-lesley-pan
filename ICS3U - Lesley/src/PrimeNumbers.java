import java.util.Scanner;

public class PrimeNumbers {
	
	/** Using Math.random();
	 * October 22, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) 
	{
	
		/** 
		 * This is where our program starts.
		 * @param args unused
		 * ALSO DOESNT WORK 
		 */
		
		Scanner sc = new Scanner(System.in); 
		
		//asks user for a number
		System.out.println("I heard you were trying to learn prime numbers. Let me help you out, enter a number.");
		int number = sc.nextInt();
		
		int remainder;
		int divisor = 2;
		boolean leftovers = false;
		
	
		if (leftovers = false && divisor < number)
		{
			remainder = number % divisor;
			divisor = divisor + 1;
				if (remainder == 1)
				{
					leftovers = true;
				}
		else  if (leftovers = true || divisor >= number)
		{
				System.out.println("Did you enter ribs? Because that number was prime.");
		}
		else 
			System.out.println("The number you entered was not a prime number.");
		}
	}
			
	
	
}