package pan.unit3;
import java.util.Scanner;

public class ArrayRolls {
	
	/** Learning Arrays;
	 * November 25, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) {
	
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the random dice generator.");
		
		int [] sumTotal = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		for (int counter = 0; counter <= 10000; counter ++)
			{
			int firstRoll = (int)(Math.random()*6)+1;
			int secondRoll = (int)(Math.random()*6)+1;
			int rollTotal = firstRoll + secondRoll;
			
				switch (rollTotal)
				{
				case 2: sumTotal [0] =+ 1;
				case 3:	sumTotal [CHANGE THESE] =+ 1;
				case 4: sumTotal [1] =+ 1;
				case 5: sumTotal [1] =+ 1;
				case 6: sumTotal [1] =+ 1;
				case 7: sumTotal [1] =+ 1;
				case 8: sumTotal [1] =+ 1;
				case 9: sumTotal [1] =+ 1;
				case 10: sumTotal [1] =+ 1;
				case 11: sumTotal [1] =+ 1;
				case 12: sumTotal [1] =+ 1;
				default: break;
				}
			}
		
	
	}
}