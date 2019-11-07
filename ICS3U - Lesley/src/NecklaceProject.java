import java.util.Scanner;

public class NecklaceProject
{

	/** Common Problems pt 2
	 * November 6, 2019
	 * @authorLesley
	 */
	
	public static void main(String[] args) 
	{
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */

		Scanner sc = new Scanner(System.in);
		
		//Initialize variables
		int toFindACheater = 0;
		int c = 0;
		int b = 0;
		int d = 0;
		
		//asks user to enter two numbers to start the necklace
		System.out.println("Hi I can make you a necklace. Please enter a postive interger.");
		int origNum1 = sc.nextInt();
		System.out.println("And another one please.");
		int origNum2 = sc.nextInt();
		
		//adds onto the neckalce until it repeats the last two numbers
		if (origNum1 < toFindACheater || origNum2 < toFindACheater)
		{
		 System.out.println("Sorry, you can't have a necklace if you can't follow the rules.");	
		}
		else
			c = origNum1 + origNum2;
			b = origNum2;
			System.out.print(origNum1 + " " + origNum2 + " " + c + " ");
			
			do {
			d = (b+c) % 10;
			System.out.println(d + " ");
			b = c;
			c = d;
			}while (origNum1 != b && origNum2 != c || origNum1 == b && origNum2 != c || origNum1 != b && origNum2 == c );
			
		//ends program	
		System.out.println("I hope you like your necklace. Please feel free to try it again.");

	}
}