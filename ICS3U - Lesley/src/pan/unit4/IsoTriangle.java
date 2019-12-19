package pan.unit4;
import java.util.Scanner;

/** Learning Arguments;
 * December 17, 2019
 * @authorLesley
 */

public class IsoTriangle {

	public static void main (String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number of levels for your Isotriangle.");

		int n = sc.nextInt();
		int constant = n;
		
		// somehow need to count down in middle for loops so that it does both spaces and stars on the line
		//wait u need to use n in the variable here
		for (int counter = n; n != 0; n --)
		{
			for (int spaceCounter = n; n != 0; n --)
			{
				drawSpaces(constant);
				
				do { 
					constant = constant - 1;
				}
				while (spaceCounter != 0);
			}
			
			for (int starCounter = n; n!= 0; n--)
			{
				int x = 1 + (2*constant);
				drawStars(x);
			}

		}

	}

	public static void drawSpaces(int n) 
	{

		System.out.print(" ");                         

	}

	public static void drawStars(int  n) 
	{

		System.out.print("*");    
	}



}
