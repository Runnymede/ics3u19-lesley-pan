package pan.unit3;
import java.util.Scanner;

public class HappyAndYouKnowIt {
	
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
		
		String [] actions = {"clap your hands!", "stomp your feet!", "and you really want to show it,", "snap your fingers!",
		"yell hooray!", "shout in glee!", "and you want the world to know it,", "scream yippe!", "jump around!", "skip about!", "and you think that they should know it,",
		"hop for me!"};
		
		for (int counter = 0; counter < 10; counter ++)
		{
			System.out.println("If you're happy and you know it " + actions [counter]);
		}
	}
}