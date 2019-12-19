package pan.unit4;
import java.util.Scanner;

/** Creating a math class;
 * December 19, 2019
 * @authorLesley
 */

public class MathPlus {

public static void main (String [] args)
{
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("What method would you like to run? /n Please choose from: min, max, sum and average.");
	
	String response = sc.nextLine();
	
	if (response.equalsIgnoreCase("min"))
	{
		/**
		System.out.println("How many numbers in your array?");
		int lengthOfArray = sc.nextInt();
		
		int [] min = new int[lengthOfArray];;
		
		System.out.println("Please enter your numbers.");
		
		for (int i = 0; i < lengthOfArray; i++)
		{	
			min[i] = sc.nextInt();
		}
		
		
		System.out.println("The smallest number is " + min [i])
		**/
	}
	else if (response.equalsIgnoreCase("max"))
	{
		System.out.println("Please enter your numbers.");
		
	}
	else if (response.equalsIgnoreCase("sum"))
	{
		System.out.println("Please enter your numbers.");
		
	}
	else if (response.equalsIgnoreCase("average"))
	{
		System.out.println("Please enter your numbers.");
		
	}
	else
		System.out.println("Sorry, that method does not exist.");
}

public static int min (int [] min)
{

	int smallestValue = min [0];
	
	for (int counter = 1; counter != min.length; counter ++ )
	{
		
		if (smallestValue > min [counter])
		{
		 smallestValue = min [counter];
		}
		
	}
	
	return smallestValue;
	
}


}
