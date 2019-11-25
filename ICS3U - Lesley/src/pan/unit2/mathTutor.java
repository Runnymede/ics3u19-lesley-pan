package pan.unit2;
import java.util.Scanner;
/** Using Math.random();
 * October 22, 2019
 * @authorLesley
 */

public class mathTutor {

	/** 
	 * This is where our program starts.
	 * @param args unused
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//welcomes user to the math tutor
		System.out.println("Hi, I am Pi, your personal math tutor. Today we will be practicing basic arthmetics");
		System.out.println("What is your name?");
		String name = sc.nextLine();

		//generates the numbers
		int firstDigit = (int)(Math.random()*10)+1;
		int secondDigit = (int)(Math.random()*10)+1;
		int operator = (int)(Math.random()*4)+1;
		double answer;

		//assigns operator
		switch (operator) 
		{ 
		case 1: System.out.println(name + " What is " + firstDigit + "+" + secondDigit + "?");
			double userAnswerA = sc.nextInt();
			double correctAnswerA = firstDigit + secondDigit;

		//checks the user's answer
		if (userAnswerA == correctAnswerA)
			System.out.println ("Good job! You got the right answer!");
		else	
			System.out.println("Sorry that's the wrong answer. You should have gotten " + correctAnswerA + ".");
		break;

		case 2: System.out.println(name + " What is " + firstDigit + "-" + secondDigit + "?"); 
			double userAnswerS = sc.nextInt();
			double correctAnswerS = firstDigit - secondDigit;

		//checks the user's answer
		if (userAnswerS == correctAnswerS)
			System.out.println ("Good job! You got the right answer!");
		else	
			System.out.println("Sorry that's the wrong answer. You should have gotten " + correctAnswerS + ".");
		break;

		case 3: System.out.println(name + " What is " + firstDigit + "/" + secondDigit + "?"); 
			double userAnswerD = sc.nextInt();
			double correctAnswerD = firstDigit / secondDigit;

		//checks the user's answer
		if (userAnswerD == correctAnswerD)
			System.out.println ("Good job! You got the right answer!");
		else	
			System.out.println("Sorry that's the wrong answer. You should have gotten " + correctAnswerD + ".");
		break;
		case 4: System.out.println(name + " What is " + firstDigit + "*" + secondDigit + "?");
			double userAnswerM = sc.nextInt();
			double correctAnswerM = firstDigit * secondDigit;

		//checks the user's answer
		if (userAnswerM == correctAnswerM)
			System.out.println ("Good job! You got the right answer!");
		else	
			System.out.println("Sorry that's the wrong answer. You should have gotten " + correctAnswerM + ".");
		break;
		}



	}
}