package pan.unit2;
import java.util.Scanner;

/** More For Loops
 * November 12, 2019
 * @authorLesley
 */

public class powersTable {

	/** 
	 * This is where our program starts.
	 * @param args unused
	 */
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		//asks user to input both a base and the highest exponent number
		System.out.println("I can help you with your powers homework. What is your base number?");
		int base = sc.nextInt();
		System.out.println("And what is your highest exponent?");
		int highestExponent = sc.nextInt();
		
		//declaring variables for the For Loops
		int exponent = 1;
		int end =  highestExponent;
		
		//runs the calculations for the table
		System.out.format("%6s", "x^1");
		for (int xTotal = 2; xTotal <= highestExponent; xTotal ++)
		{
			System.out.format("%6s", "x^" + xTotal);
		}
		System.out.println();
		
		for (int baseNumber = base; baseNumber <= end; baseNumber ++ )
		{
			for (exponent = 1; exponent <= highestExponent; exponent ++)
			{
				int raised = (int) Math.pow(baseNumber, exponent);
					System.out.format("%6s", raised);
			}		
 
		}
		
		//informs the user that the table is complete
		System.out.println("\nTadaa!!! That's the table!");
	}
}