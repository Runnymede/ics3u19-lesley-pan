package pan.unit4;
import java.util.Scanner;
public class ExamCram {
	
	public static void main (String args [])
	{
		Scanner sc  = new Scanner(System.in);
		
		int run = 0;
		int userStudentNumber = 333623866;
		
		do {
		System.out.println("Welcome to the Exam Cram. Please enter your student number or 0 to practice mental math.");
		
		int signIn = sc.nextInt();
		
		if(signIn == 0)
		{
			System.out.println("If you would ever like to exit the math tutor, enter pi, 3.14.");
			int counter = 0;
			System.out.println("Hi, I am Pi, your personal math tutor. Today we will be practicing basic arthmetics");
			double userMathAnswer = 0;
			
			do {
			
				int answer = mathTutor(signIn);
				
				userMathAnswer = sc.nextDouble();

				if(userMathAnswer == answer)
				{
					counter ++;
					System.out.println("Good job, you've answered " + counter + " amount of questions correctly!");
				}
				else
				{
					counter = 0;
					System.out.println("Sorry, the right answer was " + answer + ".");
				}
				

			}while (userMathAnswer != 3.14); 

		}
		else if (signIn == userStudentNumber)
		{
			System.out.println("Welcome back Lesley.");
			
			int course = 3;
			
			subject(course);
			
			String userSubject = sc.nextLine();
			
		
				
			{
				
			}
			
			
			
		}
		else
		{
			System.out.println("Sorry, that was neither your student number or 0. Try again :)");
		}
		
		}while (run == 0);
	}

	public static int mathTutor (int signIn)
	{
		int firstDigit = (int)(Math.random()*100)+1;
		int secondDigit = (int)(Math.random()*100)+1;
		int operator = (int)(Math.random()*4)+1;
		int answer = 0;

		switch (operator) {
		case 1:
			System.out.println(" What is " + firstDigit + "+" + secondDigit + "?");
			int correctAnswerA = firstDigit + secondDigit;
			answer = correctAnswerA;
			break;
		case 2:
			System.out.println(" What is " + firstDigit + "-" + secondDigit + "?");
			int correctAnswerS = firstDigit - secondDigit;
			answer = correctAnswerS;
			break;
		case 3:
			System.out.println(" What is " + firstDigit + "*" + secondDigit + "?");
			int correctAnswerM = firstDigit * secondDigit;
			answer = correctAnswerM;
			break;
		case 4:
			System.out.println(" What is " + firstDigit + "/" + secondDigit + "?");
			int correctAnswerD = firstDigit / secondDigit;
			answer = correctAnswerD;
			break;
		}

		return answer;
	}
	
	public static void subject (int course)
	{
		String subject1 = ("Physics");
		String subject2 = ("SAP");
		String subject3 = ("CS");
		//String subject4 = ("N/A");
		
		System.out.println("Please choose a subject to study for. 1.)" + subject1 + " 2.)"
				+ " " + subject2 + (" 3.)") + subject3 +".");
	}

}
