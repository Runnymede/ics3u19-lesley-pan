import java.util.Scanner;

public class DigitsSum {
	
	/** Even more loops();
	 * October 30, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) {
	
		/** 
		 * This is where our program starts.
		 * @param args unused
		 * NOT DONEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
		 */
		
	Scanner sc = new Scanner(System.in);
	
	//asks user for an integer
		System.out.println("Watch this neat trick. Enter a non negative integer between 1 and 100.");
		
		//initialize variables
		int userInt = sc.nextInt();

		int hundreds;
		int tens;
		int ones;
		int sum;
		
		// sees if user follows instructions
		if (userInt > 100)
			System.out.println("Sorry I said between 1 and 100.");
		else
		// does the math for the digit sum	
		if (userInt <= 9)
		{
			System.out.println("The sum of your integer is " + userInt);
		}
		else if (userInt >= 10 && userInt <= 99)
		{
			tens = userInt / 10 % 10 ;
			ones = userInt % 10;
			sum = tens + ones;
			System.out.println("The sum of your integer is " + sum);
		}
		else
			System.out.println("The sum of your integer is 1.");
	}
}