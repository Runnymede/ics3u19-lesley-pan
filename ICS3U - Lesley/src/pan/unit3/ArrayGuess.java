package pan.unit3;
import java.util.Scanner;

public class ArrayGuess {

	/** Learning Arrays;
	 * November 26, 2019
	 * @throws InterruptedException 
	 * @authorLesley
	 */

	public static void main(String[] args) throws InterruptedException {

		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		Scanner sc = new Scanner(System.in);

		//set guesses
		String [] fruitGuesses = {"apple", "orange", "banana", "watermelon", "strawberry", 
				"grapes", "mango", "peach", "cherry", "kiwi", 
				"melon", "plum", "pineapple", "lychee", "starfruit",
				"dragonfruit", "pear", "blueberries", "pomegranate", "coconut"};
		int value = 0; 
		System.out.println("Hi, let's play a guessing game. Think of a fruit and i'll try to guess it.");
		Thread.sleep(1000);

		//generates a random guess 
		value = (int)(Math.random() * 20);
		System.out.println("Is it " + fruitGuesses[value] + "?");

		String response = sc.nextLine();

		//checks that guess hasn't been asked yet
		for (int counter = 0; counter<fruitGuesses.length-1; counter++)
		{
			if (response.equalsIgnoreCase("yes")) {
				System.out.println("I win!!! :)");
			break;
			}
			
			else if (response.equalsIgnoreCase("no"))
			{
				fruitGuesses[value] = "try again";
				do {
					value = (int)(Math.random() * 20);
				}while (fruitGuesses[value].equals("try again"));

				System.out.println("Is it " + fruitGuesses[value] + "?");
				response = sc.nextLine();

			}

		//in case the program can't guess it
		}
		if (response.equalsIgnoreCase("no"))
			System.out.println("Aww I couldn't guess it. Maybe next time.");
	}
}