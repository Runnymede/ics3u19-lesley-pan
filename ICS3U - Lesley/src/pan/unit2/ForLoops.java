package pan.unit2;
import java.util.Scanner;

	/** Easy to Hard For Loops
	 * November 11, 2019
	 * @throws InterruptedException 
	 * @authorLesley
	 */
public class ForLoops{
/** 
 * This is where our program starts.
 * @param args unused
 */

	public static void main(String[] args) throws InterruptedException 
	{

		Scanner sc = new Scanner(System.in);
		
		// print hello ten times
		for (int greetings = 0; greetings < 10; greetings ++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("\nSorry, i'm realy excited! I just learned how to count by twos!");
		
		//print even numbers till 100
		for (int byTwos = 0; byTwos <= 100; byTwos+=2)
		{
			System.out.println(byTwos);
		}
			
		System.out.println("\nDid you know I can also count backwards from 10? Just like the rocketships!!!");
		
		//count down from ten and blast off
		for (int blastOff = 10; blastOff != 0; blastOff -= 1)
		{
			System.out.println(blastOff);
			Thread.sleep(100);
		}
		
		System.out.println("BLAST OFF!!!");
		
		
	}
}