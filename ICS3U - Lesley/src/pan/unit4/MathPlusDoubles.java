package pan.unit4;
import java.util.Scanner;

/** Creating a math class for doubles;
 * January 6, 2020
 * @authorLesley
 */

public class MathPlusDoubles 
{

	public static void main (String [] args)
	{

		Scanner sc  = new Scanner(System.in);

		System.out.println("Please enter the length of your array.");
		int arrayLength = sc.nextInt();
		double [] num = new double [arrayLength];

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
	 * @param num
	 */
	

	public static double min (double [] num)
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

		return (double)count;
	}


	/**
	 * This method finds the index of the biggest number
	 * @param num
	 */
	public static double max (double [] num)
	{

		int count = 0;

		for (int counter = 1; counter<num.length; counter ++)
		{
			//checks to see if the number in the array is greater than the current max
			if(num[counter]>num[count])
			{
				//if true change the max value
				count = counter;
			}

		}

		return (double)count;
	}

	/**
	 * This method finds the sum of all the numbers in the array
	 * @param num
	 */
	
	public static double sum (double [] num)
	{

		double total = 0;
		//adds all the numbers together
		for (int counter = 0; counter<num.length; counter ++)
		{
			total += num[counter];
		}

		return total;
	}

	/**
	 * This method finds the average of all the numbers in the array
	 * @param num
	 */
	
	public static double average (double [] num)
	{
		int total = 0;
		//adds all the numbers together
		for (int counter = 0; counter<num.length; counter ++)
		{
			total += num[counter];
		}
		//divides the sum by the amount of numbers
		double aver = total/num.length;

		return aver;
	}


}