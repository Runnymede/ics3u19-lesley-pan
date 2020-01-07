package pan.unit4;
import java.util.Scanner;

/** Creating a math class;
 * December 19, 2019
 * @authorLesley
 */

public class MathPlus 
{

	public static void main (String [] args)
	{

		Scanner sc  = new Scanner(System.in);

		System.out.println("Please enter the length of your array.");
		int arrayLength = sc.nextInt();
		int [] num = new int [arrayLength];

		System.out.println("Please enter your numbers.");
		for (int i = 0; i<arrayLength; i++)
		{
			num[i] = sc.nextInt();
		}

			System.out.println("The min index is " + min (num));
			System.out.println("The max index is " + max (num));
			System.out.println("The average is " + average (num));
			System.out.println("The sum is " + sum (num));
	
	}
	
	/**
	 * This method finds the index of the smallest number
	 * @param stars
	 */
	
	public static int min (int [] num)
	{
		
		int count = 0;

		for (int counter = 1; counter<num.length; counter ++)
		{
			//checks to see if the next number in the array is smaller than the current min
			if(num[counter]<num[count])
			{
				//if true change the min value
				count = counter;
			}

		}

		return count;
	}

	/**
	 * This method finds the index of the biggest number
	 * @param stars
	 */
	
	public static int max (int [] num)
	{

		int count = 0;
		//checks to see if the number in the array is greater than the current max
		for (int counter = 1; counter<num.length; counter ++)
		{
			if(num[counter]>num[count])
			{
				count = counter;
			}

		}

		return count;
	}

	/**
	 * This method finds the sum of all the numbers in the array
	 * @param stars
	 */
	
	public static int sum (int [] num)
	{

		int total = 0;
		//adds all the nu
		for (int counter = 0; counter<num.length; counter ++)
		{
			total += num[counter];
		}

		return total;
	}

	
	/**
	 * This method finds the average of all the numbers in the array
	 * @param stars
	 */
	
	public static int average (int [] num)
	{
		int total = 0;

		for (int counter = 0; counter<num.length; counter ++)
		{
			total += num[counter];
		}

		int aver = total/num.length;

		return aver;
	}


}
