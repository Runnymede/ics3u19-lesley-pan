package pan.unit2;
import java.util.Scanner;

/** More For Loops
 * November 12, 2019
 * @authorLesley
 */
public class DiceRolls {

	/** 
	 * This is where our program starts.
	 * @param args unused
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the random dice generator.");
		
		for (int counter = 1; counter <= 5; counter ++)
			{
			
			int firstRoll = (int)(Math.random()*6)+1;
			int secondRoll = (int)(Math.random()*6)+1;
			int rollTotal = firstRoll + secondRoll;
			
			System.out.format("%6s %5s %5s", firstRoll, secondRoll, rollTotal);
			System.out.println();
			
			
			
			}
	}

}
