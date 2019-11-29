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
		
		//create space to tally the sums
		int [] possibleSum = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int [] sumTotal = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//rolls two dice 10000 times
		for (int counter = 0; counter <= 10000; counter ++)
			{
			int firstRoll = (int)(Math.random()*6)+1;
			int secondRoll = (int)(Math.random()*6)+1;
			int rollTotal = firstRoll + secondRoll;
			
				switch (rollTotal)
				{
				case 2: sumTotal [0] += 1;
				break;
				case 3:	sumTotal [1] += 1;
				break;
				case 4: sumTotal [2] += 1;
				break;
				case 5: sumTotal [3] += 1;
				break;
				case 6: sumTotal [4] += 1;
				break;
				case 7: sumTotal [5] += 1;
				break;
				case 8: sumTotal [6] += 1;
				break;
				case 9: sumTotal [7] += 1;
				break;
				case 10: sumTotal [8] += 1;
				break;
				case 11: sumTotal [9] += 1;
				break;
				case 12: sumTotal [10] += 1;
				break;
				default: break;
				}
				
			}
		//prints out tally
				System.out.format("%-30s %-20s\n",  "Total", "Number of Rolls");
				
				for(int c = 0; c < possibleSum.length; c++)
				{
				System.out.format("%-30s %-20s\n",  possibleSum [c], sumTotal[c]);	
				}
		
	
	}
}