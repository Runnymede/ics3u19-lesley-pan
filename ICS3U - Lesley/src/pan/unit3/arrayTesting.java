package pan.unit3;
import java.util.Scanner;

public class arrayTesting {
	
	/** Learning Arrays;
	 * November 22, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) {
	
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		
	Scanner sc = new Scanner(System.in);
	
	//asks user to initialize the length of the array
	System.out.println("How long is your list of names?");
	int lengthOfArray = sc.nextInt();
	
	//asks user to fill in boxes
	System.out.println("Please enter your names.");
	
	String [] nameList = new String[lengthOfArray];;
	
	for (int i = 0; i < lengthOfArray; i++)
	{	
		nameList[i] = sc.next();
	}
	
	System.out.println();
	
	//prints list forwards twice
	int counter = 0;
	
	while (counter != 2)
	{		
	for (int p = 0; p < lengthOfArray; p ++)
	{
	System.out.println(nameList [p]);
	}
	counter ++;
	}
	
	//prints list backwards
	System.out.println();
	for (int r = lengthOfArray-1; r >= 0; r --)
	{
	System.out.println(nameList [r]);
	}
	
	
	}
}