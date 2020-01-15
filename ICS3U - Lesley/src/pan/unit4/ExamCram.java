package pan.unit4;

import java.util.Scanner;

public class ExamCram {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int run = 0;
		int userStudentNumber = 333623866;

		do {
			System.out.println(
					"Welcome to the Exam Cram. Please enter your student number or 0 to practice mental math.");

			int signIn = sc.nextInt();

			if (signIn == 0) {
				System.out.println("If you would ever like to exit the math tutor, enter pi, 3.14.");
				int counter = 0;
				System.out
						.println("Hi, I am Pi, your personal math tutor. Today we will be practicing basic arthmetics");
				double userMathAnswer = 0;

				do {

					int answer = mathTutor(signIn);

					userMathAnswer = sc.nextDouble();

					if (userMathAnswer == answer) {
						counter++;
						System.out.println("Good job, you've answered " + counter + " amount of questions correctly!");
					} else {
						counter = 0;
						System.out.println("Sorry, the right answer was " + answer + ".");
					}

				} while (userMathAnswer != 3.14);

			} else if (signIn == userStudentNumber) {
				System.out.println("Welcome back Lesley.");

				int course = 3;

				subject(course);

				String userSubject = sc.nextLine();

				boolean homescreen = false;
				int physicsPathway = 0;

				do {
					if (userSubject.equalsIgnoreCase("physics")) {
						do {
							System.out.println(
									"Would you like to 1.) review content, 2.) practice questions, 3.) final review test, 4.)change subjects");
							physicsPathway = sc.nextInt();

							if (physicsPathway == 1) {

								physicsContent(physicsPathway);

								System.out.println("Would you like to try something else? yes/no");
								String userPhysicsChange = sc.nextLine();
								if (userPhysicsChange.equalsIgnoreCase("yes"))
									break;
							} else if (physicsPathway == 2) {
								for (int i = 10; i < 1; i++) {
									physicsQuestions(physicsPathway);
									int userPhysicsQuizAnswer = sc.nextInt();
									physicsQuizAnswer(physicsQuestion);

									if (userPhysicsQuizAnswer == physicsQuizAnswer)
										System.out.println("Good job, that's the right answer!");
									else
										System.out.println("Almost, the answer was " + physicsQuizAnswer + ".");

									System.out.println("Would you like to try something else? yes/no");
									String userPhysicsChange = sc.nextLine();
									if (userPhysicsChange.equalsIgnoreCase("yes"))
										break;
								}
							} else if (physicsPathway == 3) {
								double physicsTestCounter = 0;
								for (int i = 0; i < physicsTestArray.length; i++) {
									physicsTest(i);
									int userPhysicsTestAnswer = sc.nextInt();
									physicsTestAnswer(i);

									if (userPhysicsTestAnswer == physicsTestAnswer)
										counter++;
								}
								double percentage = physicsTestCounter / physicsTestArray.length * 100;
								System.out.println("You got a " + percentage + "% on this test. The answers were "
										+ physicsTest(100) + ".");

								System.out.println("Would you like to try something else? yes/no");
								String userPhysicsChange = sc.nextLine();
								if (userPhysicsChange.equalsIgnoreCase("yes"))
									break;
							}

						}

						while (physicsPathway != 4);
					}

					if (physicsPathway == 4)
						homescreen = true;

					if (userSubject.equalsIgnoreCase("SAP")) {
						do {
							System.out.println(
									"Would you like to 1.) review content, 2.) practice questions, 3.) final review test, 4.)change subjects");
							SAPPathway = sc.nextInt();

							if (SAPPathway == 1) {

								SAPContent(SAPPathway);

								System.out.println("Would you like to try something else? yes/no");
								String userSAPChange = sc.nextLine();
								if (userSAPChange.equalsIgnoreCase("yes"))
									break;
							} else if (SAPPathway == 2) {
								for (int i = 10; i < 1; i++) {
									SAPQuestions(SAPPathway);
									int userSAPQuizAnswer = sc.nextInt();
									SAPQuizAnswer(SAPQuestion);

									if (userSAPQuizAnswer == SAPQuizAnswer)
										System.out.println("Good job, that's the right answer!");
									else
										System.out.println("Almost, the answer was " + SAPQuizAnswer + ".");

									System.out.println("Would you like to try something else? yes/no");
									String userSAPChange = sc.nextLine();
									if (userSAPChange.equalsIgnoreCase("yes"))
										break;
								}
							} else if (SAPPathway == 3) {
								double SAPTestCounter = 0;
								for (int i = 0; i < SAPTestArray.length; i++) {
									SAPTest(i);
									int userSAPTestAnswer = sc.nextInt();
									SAPTestAnswer(i);

									if (userSAPTestAnswer == SAPTestAnswer)
										counter++;
								}
								double percentage = SAPTestCounter / SAPTestArray.length * 100;
								System.out.println("You got a " + percentage + "% on this test. The answers were "
										+ SAPTest(100) + ".");

								System.out.println("Would you like to try something else? yes/no");
								String userSAPChange = sc.nextLine();
								if (userSAPChange.equalsIgnoreCase("yes"))
									break;
							}

						}

						while (SAPPathway != 4);
					}

					if (SAPPathway == 4)
						homescreen = true;
					if (userSubject.equalsIgnoreCase("CS")) {
						do {
							System.out.println(
									"Would you like to 1.) review content, 2.) practice questions, 3.) final review test, 4.)change subjects");
							CSPathway = sc.nextInt();

							if (CSPathway == 1) {

								CSContent(CSPathway);

								System.out.println("Would you like to try something else? yes/no");
								String userCSChange = sc.nextLine();
								if (userCSChange.equalsIgnoreCase("yes"))
									break;
							} else if (CSPathway == 2) {
								for (int i = 10; i < 1; i++) {
									CSQuestions(CSPathway);
									int userCSQuizAnswer = sc.nextInt();
									CSQuizAnswer(CSQuestion);

									if (userCSQuizAnswer == CSQuizAnswer)
										System.out.println("Good job, that's the right answer!");
									else
										System.out.println("Almost, the answer was " + CSQuizAnswer + ".");

									System.out.println("Would you like to try something else? yes/no");
									String userCSChange = sc.nextLine();
									if (userCSChange.equalsIgnoreCase("yes"))
										break;
								}
							} else if (CSPathway == 3) {
								double CSTestCounter = 0;
								for (int i = 0; i < CSTestArray.length; i++) {
									CSTest(i);
									int userCSTestAnswer = sc.nextInt();
									CSTestAnswer(i);

									if (userCSTestAnswer == CSTestAnswer)
										counter++;
								}
								double percentage = CSTestCounter / CSTestArray.length * 100;
								System.out.println("You got a " + percentage + "% on this test. The answers were " + CSTest(100) + ".");

								System.out.println("Would you like to try something else? yes/no");
								String userCSChange = sc.nextLine();
								if (userCSChange.equalsIgnoreCase("yes"))
									break;
							}

						}

						while (CSPathway != 4);
					}

					if (CSPathway == 4)
						homescreen = true;

				} while (homescreen != true);

			} else {
				System.out.println("Sorry, that was neither your student number or 0. Try again :)");
			}

		} while (run == 0);
	}

	public static int mathTutor(int signIn) {
		int firstDigit = (int) (Math.random() * 100) + 1;
		int secondDigit = (int) (Math.random() * 100) + 1;
		int operator = (int) (Math.random() * 4) + 1;
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

	public static void subject(int course) {
		String subject1 = ("Physics");
		String subject2 = ("SAP");
		String subject3 = ("CS");
		// String subject4 = ("N/A");

		System.out.println("Please choose a subject to study for. 1.)" + subject1 + " 2.)" + " " + subject2 + (" 3.)")
				+ subject3 + ".");
	}

	public static void physicsContent(int physicsPathway) {
		System.out.println("Random physics stuff.");
	}

	public static int physicsQuestions (int physicsPathway)
	{
		int questionNumber = (int)(Math.random()*20)+1;
		
		switch (questionNumber)
		{
		case 1: System.out.println(");
			break;
		case 2: System.out.println(");
			break;
		case 3: System.out.println(");
			break;
		case 4: System.out.println(");
			break;
		case 5: System.out.println(");
			break;
		case 6: System.out.println(");
			break;
		case 7: System.out.println(");
			break;
		case 8: System.out.println(");
			break;
		case 9: System.out.println(");
			break;
		case 10: System.out.println(");
			break;
		case 11: System.out.println(");
			break;
		case 12: System.out.println(");
			break;
		case 13: System.out.println(");
			break;
		case 14: System.out.println(");
			break;
		case 15: System.out.println(");
			break;
		case 16: System.out.println(");
			break;
		case 17: System.out.println(");
			break;
		case 18: System.out.println(");
			break;
		case 19: System.out.println(");
			break;
		case 20: System.out.println(");
			break;
		}
		
		return questionNumber;
	}

	public static int physicsQuizAnswer (int physicsQuestions)
	{
		int answer = 0;
		
		switch(physicsQuestions)
		{
		case 1: answer = ;
			break;
		case 2: answer = ;
			break;
		case 3: answer = ;
			break;
		case 4: answer = ;
			break;
		case 5: answer = ;
			break;
		case 6: answer = ;
			break;
		case 7: answer = ;
			break;
		case 8: answer = ;
			break;
		case 9: answer = ;
			break;
		case 10: answer = ;
			break;
		case 11: answer = ;
			break;
		case 12: answer = ;
			break;
		case 13: answer = ;
			break;
		case 14: answer = ;
			break;
		case 15: answer = ;
			break;
		case 16: answer = ;
			break;
		case 17: answer = ;
			break;
		case 18: answer = ;
			break;
		case 19: answer = ;
			break;
		case 20: answer = ;
			break;	
		}
		return answer;
	}

	public static void physicsTest (int i)
	{
//		MAKE AN ARRAY
		if (i== 100)
		{
//			PRINT THE ENTIRE ARRAY
		}
	}

	public static int physicsTestAnswer(int i) {
		int answer = 0;

		switch (i) {

		}

		return answer;
	}

	public static void SAPContent(int SAPPathway) {
		System.out.println("Random ŜAP stuff.");
	}

	public static int SAPQuestions (int SAPPathway)
	{
		int questionNumber = (int)(Math.random()*20)+1;
		
		switch (questionNumber)
		{
		case 1: System.out.println(");
			break;
		case 2: System.out.println(");
			break;
		case 3: System.out.println(");
			break;
		case 4: System.out.println(");
			break;
		case 5: System.out.println(");
			break;
		case 6: System.out.println(");
			break;
		case 7: System.out.println(");
			break;
		case 8: System.out.println(");
			break;
		case 9: System.out.println(");
			break;
		case 10: System.out.println(");
			break;
		case 11: System.out.println(");
			break;
		case 12: System.out.println(");
			break;
		case 13: System.out.println(");
			break;
		case 14: System.out.println(");
			break;
		case 15: System.out.println(");
			break;
		case 16: System.out.println(");
			break;
		case 17: System.out.println(");
			break;
		case 18: System.out.println(");
			break;
		case 19: System.out.println(");
			break;
		case 20: System.out.println(");
			break;
		}
		
		return questionNumber;
	}

	public static int SAPQuizAnswer (int SAPQuestions)
	{
		int answer = 0;
		
		switch(SAPQuestions)
		{
		case 1: answer = ;
			break;
		case 2: answer = ;
			break;
		case 3: answer = ;
			break;
		case 4: answer = ;
			break;
		case 5: answer = ;
			break;
		case 6: answer = ;
			break;
		case 7: answer = ;
			break;
		case 8: answer = ;
			break;
		case 9: answer = ;
			break;
		case 10: answer = ;
			break;
		case 11: answer = ;
			break;
		case 12: answer = ;
			break;
		case 13: answer = ;
			break;
		case 14: answer = ;
			break;
		case 15: answer = ;
			break;
		case 16: answer = ;
			break;
		case 17: answer = ;
			break;
		case 18: answer = ;
			break;
		case 19: answer = ;
			break;
		case 20: answer = ;
			break;	
		}
		return answer;
	}

	public static void SAPTest (int i)
	{
		MAKE AN ARRAY
		if (i= 100)
		{
			PRINT THE ENTIRE ARRAY
		}
	}

	public static int SAPTestAnswer(int i) {
		int answer = 0;

		switch (i) {

		}

		return answer;
	}

	public static void CSContent(int CSPathway) {
		System.out.println("Random CS stuff.");
	}

	public static int CSQuestions (int CSPathway)
	{
		int questionNumber = (int)(Math.random()*20)+1;
		
		switch (questionNumber)
		{
		case 1: System.out.println(");
			break;
		case 2: System.out.println(");
			break;
		case 3: System.out.println(");
			break;
		case 4: System.out.println(");
			break;
		case 5: System.out.println(");
			break;
		case 6: System.out.println(");
			break;
		case 7: System.out.println(");
			break;
		case 8: System.out.println(");
			break;
		case 9: System.out.println(");
			break;
		case 10: System.out.println(");
			break;
		case 11: System.out.println(");
			break;
		case 12: System.out.println(");
			break;
		case 13: System.out.println(");
			break;
		case 14: System.out.println(");
			break;
		case 15: System.out.println(");
			break;
		case 16: System.out.println(");
			break;
		case 17: System.out.println(");
			break;
		case 18: System.out.println(");
			break;
		case 19: System.out.println(");
			break;
		case 20: System.out.println(");
			break;
		}
		
		return questionNumber;
	}

	public static int CSQuizAnswer (int CSQuestions)
	{
		int answer = 0;
		
		switch(CSQuestions)
		{
		case 1: answer = ;
			break;
		case 2: answer = ;
			break;
		case 3: answer = ;
			break;
		case 4: answer = ;
			break;
		case 5: answer = ;
			break;
		case 6: answer = ;
			break;
		case 7: answer = ;
			break;
		case 8: answer = ;
			break;
		case 9: answer = ;
			break;
		case 10: answer = ;
			break;
		case 11: answer = ;
			break;
		case 12: answer = ;
			break;
		case 13: answer = ;
			break;
		case 14: answer = ;
			break;
		case 15: answer = ;
			break;
		case 16: answer = ;
			break;
		case 17: answer = ;
			break;
		case 18: answer = ;
			break;
		case 19: answer = ;
			break;
		case 20: answer = ;
			break;	
		}
		return answer;
	}

	public static void CSTest (int i)
	{
//		MAKE AN ARRAY
		if (i= 100)
		{
//			PRINT THE ENTIRE ARRAY
		}
	}

	public static int CSTestAnswer(int i) {
		int answer = 0;

		switch (i) {

		}

		return answer;
	}
}
