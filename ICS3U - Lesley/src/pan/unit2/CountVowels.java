package pan.unit2;

import java.util.Scanner;

/** More For Loops
 * November 14, 2019
 * @authorLesley
 */
public class CountVowels {
	/** 
	 * This is where our program starts.
	 * @param args unused
	*/
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	// asks user to input a word
	System.out.println("Enter a word and I can tell you how many vowels are in it.");
	String userWord = sc.nextLine();
	
	//initializes variables
	int length = userWord.length();
	int vowelCounter = 0;
	
	//runs to check if character is a vowel or not 
	for (int counter = 0; counter < length; counter ++)
	{
		char singleCharacter = userWord.charAt(counter);
		String vowelCheck = String.valueOf(singleCharacter);
		
		if (vowelCheck.equalsIgnoreCase("A")||vowelCheck.equalsIgnoreCase("E")||vowelCheck.equalsIgnoreCase("I")
				||vowelCheck.equalsIgnoreCase("O")||vowelCheck.equalsIgnoreCase("U"))
		{
			vowelCounter ++;
		}
	}
	
	//informs user about how many vowels there are
	System.out.println("There are " + vowelCounter + " vowels in the word you entered.");
	
	}
}
