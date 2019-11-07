import java.util.Scanner;

public class StringThings {
	
	/** Learning to use string commands
	 * October 3, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) 
	{
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		
		Scanner sc = new Scanner(System.in);
	
		//asks user for a word pt 1
		System.out.println("Hello I am Bob. Please enter a word that has at least 7 characters.");
		String userWord = sc.nextLine();
		
		//dialog with the user pt 1
		System.out.println("The word you entered was " + userWord);
		System.out.println();
		System.out.println("If we were across a football field this is how I would tell you the word. " + userWord.toUpperCase() + "!!!");
		System.out.println("If we were in a library, this is how I would tell you the word. " + userWord.toLowerCase());
		System.out.println();
		System.out.println("Did you know your word is " + userWord.length() + " characters long?");
		
		//dialog with user asking for index pt 1
		System.out.println("I can tell you what character is in xth place. \nWould you like to give me a number?");
		int placement = sc.nextInt();
		System.out.println("The charcter in that spot is " + userWord.charAt(placement));
		
		//dialog with user pt 2
		System.out.println("Did you know I am also able to compare words. Let me show you, enter one word");
		String firstWord = sc.next();
		System.out.println("And another one");
		String secondWord = sc.next();
		
		//compares two words that user entered and returns dialog pt 2
		if (secondWord.equalsIgnoreCase(firstWord))
		{
			System.out.println("The words you entered were the same.");
		}
		else
		{
			System.out.println("The words you entered were not the same.");
		}
		
		
		//determines order of the two words that the user entered and returns dialog pt 2
		int order = firstWord.compareTo(secondWord);
		if (order < 0)
		{
			System.out.println("The second word come after the first word in java.");
		}
		else if (order == 0)
		{
			System.out.println("Because they are the same word, they are beside each other.");
		}
		else
		{
			System.out.println("The second word comes before the first word in java.");
		}
		
		//asks the user for a username and password  pt 3
		String username = "emanresU";
		String password = "drowssaP";
		System.out.println("By the way you know I never caught your name. What is it?");
		String name = sc.next();
		System.out.println("That's a beautiful name\n\n\nWhoops I forgot, to run this program you needed an account. Please enter your username and password."
				+ " \nMake sure to REFLECT on your answer. (p.s it's case sensitive) ");
		String userEnteredUsername = sc.next();
		String userEnteredPassword = sc.next();
		
		//checks if user is correct and allowed to proceed
		if (userEnteredUsername.equals(username))
		{
			if (userEnteredPassword.equals(password))
			{
				System.out.println("\nWelcome " + name + ". Good job, you are worthy.\n");
			}
			else
			{
				System.out.println("\nSorry " + name + " your password was wrong. \n");
			}
		}
		else
		{
			System.out.println("\nSorry " + name + ", you are wrong. \n");
		}
		
	}		
}