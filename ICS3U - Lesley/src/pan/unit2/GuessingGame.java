package pan.unit2;
import java.util.Scanner;

/** Using Math.random();
 * October 22, 2019
 * @authorLesley
 */
public class GuessingGame {
	
	/** 
	 * This is where our program starts.
	 * @param args unused
	 */
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//asks user to guess a number
	int secretNumber = (int)(Math.random()*20)+1;
	System.out.println("Hi, please enter a number between 1 and 20.");
	int userNumber = sc.nextInt();
	
	//generate number and checks response
	if (userNumber == secretNumber) {
		System.out.println("The safety password was: " + secretNumber + ".");
		System.out.println("You guessed: " + userNumber + ".");
		System.out.println("Congratulations, you won! Since you guessed the safety number, "
				+ "a virus won't be downloaded on your computer.");}
	else {
		
		System.out.println("The safety password was:" + secretNumber + ".");
		System.out.println("You guessed:" + userNumber + ".");
		System.out.println("Sorry, that's the wrong number. A virus has been downloaded on to your computer. "
				+ "Have a nice day!");}
	
	
	}
}