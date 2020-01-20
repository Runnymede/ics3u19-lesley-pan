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
									"Would you like to 1.) review exam content, 2.) practice questions, 3.) final review test, 4.)change subjects");
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
										+ physicsTest(100) //doesnt work because you need to have a return value + ".");

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
									"Would you like to 1.) review exam content, 2.) practice questions, 3.) final review test, 4.)change subjects");
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
									"Would you like to 1.) review exam content, 2.) practice questions, 3.) final review test, 4.)change subjects");
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
		case 1: System.out.println("The term kinematics is best described as (1.1)\r\n" + 
				"1.) A term used to quantify motion\r\n" + 
				"2.) The study of a position \r\n" + 
				"3.) The study of how objects move\r\n" + 
				"4.) A term used to quantify inertia\r\n" 
				);
			break;
		case 2: System.out.println("For a straight line on a position-time graph, the rise refers to the change in quantity? (1.2)\r\n" + 
				"1.) Slope\r\n" + 
				"2.) Time \r\n" + 
				"3.) Velocity\r\n" + 
				"4.) Position \r\n");
			break;
		case 3: System.out.println("A river has a current of 2.3 m/s. A man points his boat so that it is directed straight across the river. In still water, the boat can move with a speed of 3.2 m/s. What is the average speed of the boat while travelling across the river? (2.2)\r\n" + 
				"1.) 1.1 m/s\r\n" + 
				"2.) 2.8 m/s\r\n" + 
				"3.) 3.9 m/s\r\n" + 
				"4.) 5.5 m/s\r\n");
			break;
		case 4: System.out.println("A basketball is shot with an initial velocity of 16 m/s at an angle of 55°. What is the approximate horizontal distance that the ball travels in 1.5 s? (2.2, 2.3)\r\n" + 
				"1.) 9.1 m\r\n" + 
				"2.) 13 m\r\n" + 
				"3.) 14 m\r\n" + 
				"4.) 20 m\r\n");
			break;
		case 5: System.out.println("Which of the following forces is caused by the electric charges of particles? (3.1)\r\n" + 
				"1.) Electromagnetic\r\n" + 
				"2.) Ravitational\r\n" + 
				"3.) Weak nuclear\r\n" + 
				"4.) Strong nuclear\r\n");
			break;
		case 6: System.out.println("What is the net force experienced by a 20.0 kg object that accelerates at a rate of 4.0 m/s²? (3.3)\r\n" + 
				"1.) 80 N\r\n" + 
				"2.) 60 N\r\n" + 
				"3.) 800 N\r\n" + 
				"4.) 5.0 N\r\n");
			break;
		case 7: System.out.println("Which of the following scenarios will result in the largest amount of frictional force from the air? (4.1)\r\n" + 
				"1.) A small surface area moving slowly \r\n" + 
				"2.) A small surface area moving rapidly\r\n" + 
				"3.) A large surface area moving slowly\r\n" + 
				"4.) A large surface area moving rapidly\r\n");
			break;
		case 8: System.out.println("Two blocks, at 4.0 kg and 5.0 kg, are suspended from the ceiling by a piece of string. What is the tension in the string? (3.5)\r\n" + 
				"1.) 9.0 N\r\n" + 
				"2.) 88 kg\r\n" + 
				"3.) 88 N\r\n" + 
				"4.) 49 N\r\n");
			break;
		case 9: System.out.println("The type of energy possessed by moving objects is (5.2)\r\n" + 
				"1.) Kinetic energy\r\n" + 
				"2.) Potential energy\r\n" + 
				"3.) Chemical energy\r\n" + 
				"4.) Work energy \r\n");
			break;
		case 10: System.out.println("What power input is needed for a 70.0 kg person to go up 5.00m of stairs in 2.00s? (5.5)\r\n" + 
				"1.) 3430 J\r\n" + 
				"2.) 175 J\r\n" + 
				"3.) 1720 J\r\n" + 
				"4.) 340 J\r\n");
			break;
		case 11: System.out.println("The term used to describe the transfer of thermal energy that occurs when warmer objects are in physical contact with colder objects is (6.2)\r\n" + 
				"1.) Thermal convection\r\n" + 
				"2.) Thermal induction\r\n" + 
				"3.) Thermal radiation \r\n" + 
				"4.) Thermal conduction\r\n");
			break;
		case 12: System.out.println("An increase in the motion of the particles that make up a substance will have what effect? (6.1)\r\n" + 
				"1.) It will make the substance warmer\r\n" + 
				"2.) It will make the substance colder\r\n" + 
				"3.) It will make the substance spin\r\n" + 
				"4.) It will not have any effect on the subject\r\n");
			break;
		case 13: System.out.println("Which of the following statements is true of amplitude? (9.4)\r\n" + 
				"1.) When the difference between the frequency of a wave and its natural frequency increases, the amplitude of a wave increases.\r\n" + 
				"2.) A decrease in wave energy decreases a wave’s amplitude.\r\n" + 
				"3.) When damping is increased, the amplitude of a wave increases\r\n" + 
				"4.) When a system vibrates close to a harmonic, resonance occurs and the amplitude of the observed vibration decreases.\r\n");
			break;
		case 14: System.out.println("If you know the linear density of a violin string and want to calculate the speed of a wave on the violin string, which additional information is needed? (8.4)\r\n" + 
				"1.) Tension on the string\r\n" + 
				"2.) Temperature of the string\r\n" + 
				"3.) Time to complete a cycle\r\n" + 
				"4.) Density of the violin’s sounding board\r\n");
			break;
		case 15: System.out.println("When two waves meet, one with amplitude of 4 cm and the other with amplitude 2 cm, what are the possible maximum and minimum amplitudes of the resulting wave? (9.1)\r\n" + 
				"1.) Maximum 6 cm, minimum 2 cm\r\n" + 
				"2.) Maximum 4 cm, minimum 2 cm\r\n" + 
				"3.) Maximum 8 cm, minimum 0.5 cm\r\n" + 
				"4.) Maximum 6 cm, minimum 6 cm\r\n");
			break;
		case 16: System.out.println("A truck is travelling at 30 m/s toward a stationary observer. If the truck sounds its horn at a frequency of 700 Hz, what frequency does the observer detect? (Use 340 m/s as the speed of sound.) (9.5)\r\n" + 
				"1.) 638 Hz\r\n" + 
				"2.) 643 Hz\r\n" + 
				"3.) 762 Hz\r\n" + 
				"4.) 767 Hz\r\n");
			break;
		case 17: System.out.println("Which of the following is a unit of electrical energy? (11.1)\r\n" + 
				"1.) Watt\r\n" + 
				"2.) Volt \r\n" + 
				"3.) Joule\r\n" + 
				"4.) Ohm\r\n");
			break;
		case 18: System.out.println("If an external magnetic field is pointing to the right and the current in a wire is pointing out of the page, in which direction is the force on the wire? (12.5)\r\n" + 
				"1.) Upward\r\n" + 
				"2.) Downward\r\n"+ 
				"3.) Left\r\n" + 
				"4.) Into the page\r\n");
			break;
		case 19: System.out.println("Magnetic field lines (12.1)\r\n" + 
				"1.) Are stronger at the poles\r\n" + 
				"2.) Can cross one another\r\n" + 
				"3.) Are affected by gravity\r\n" + 
				"4.) Exist in two dimensions only\r\n");
			break;
		case 20: System.out.println("Which device is used to measure the resistance of a load? (11.3, 11.5, 11.7)\r\n" + 
				"1.) Galvanometer\r\n" + 
				"2.) Voltmeter\r\n" + 
				"3.) Ohmmeter\r\n" + 
				"4.) Ammeter\r\n");
			break;
		}
		
		return questionNumber;
	}

	public static int physicsQuizAnswer (int physicsQuestions)
	{
		int answer = 0;
		
		switch(physicsQuestions)
		{
		case 1: answer = 3;
			break;
		case 2: answer = 4;
			break;
		case 3: answer = 3;
			break;
		case 4: answer = 3;
			break;
		case 5: answer = 1;
			break;
		case 6: answer = 1;
			break;
		case 7: answer = 4;
			break;
		case 8: answer = 3;
			break;
		case 9: answer = 1;
			break;
		case 10: answer = 3;
			break;
		case 11: answer = 4;
			break;
		case 12: answer = 1;
			break;
		case 13: answer = 2;
			break;
		case 14: answer = 1;
			break;
		case 15: answer = 1;
			break;
		case 16: answer = 4;
			break;
		case 17: answer = 3;
			break;
		case 18: answer = 1;
			break;
		case 19: answer = 1;
			break;
		case 20: answer = 3;
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
		case 1: System.out.println("\r\n" + 
				"Which of the following is not one of the 8 ethics of programming\r\n" + 
				"1.) Self\r\n" + 
				"2.) Product\r\n" + 
				"3.) Gracious Professionalism \r\n" + 
				"4.) Public\r\n");
			break;
		case 2: System.out.println("What’s wrong with the following main method? Public static boolean main(String args[]) {\r\n" + 
				"1.) The main should be private\r\n" + 
				"2.) The p in public should be lowercase\r\n" + 
				"3.) The arguments should be int\r\n" + 
				"4.) The p in public should be lowercase and boolean should be void\r\n");
			break;
		case 3: System.out.println("What are the primitive types?\r\n" + 
				"1.) byte, String, int, double, char, boolean, float, long\r\n" + 
				"2.) double, char, boolean, float\r\n" + 
				"3.) byte, short, int, long, float, double, char, boolean\r\n" + 
				"4.) double, class, boolean, float\r\n");
			break;
		case 4: System.out.println("The “less than or equal to” comparison operator in Java is _______.\r\n" + 
				"1.) =<\r\n" + 
				"2.) !=\r\n" + 
				"3.) <=\r\n" + 
				"4.) <\r\n");
			break;
		case 5: System.out.println("What are the benefits of modular programming?\r\n" + 
				"1.) Methods are used to break code into manageable pieces\r\n" + 
				"2.) Make code more reusable\r\n" + 
				"3.) Help to debug code\r\n" + 
				"4.) All of the above\r\n");
			break;
		case 6: System.out.println("The following code displays ______.\r\n" + 
				"		double temp = 50;\r\n" + 
				"		\r\n" + 
				"		if (temp >= 100)\r\n" + 
				"			System.out.println(“too hot’);\r\n" + 
				"		else if (temp <=40)\r\n" + 
				"			System.out.println(“too cold”);\r\n" + 
				"		else \r\n" + 
				"			System.out.println(“just right”);\r\n" + 
				"1.) too hot too cold just right\r\n" + 
				"2.) too hot\r\n" + 
				"3.) too cold\r\n" + 
				"4.) just right\r\n");
			break;
		case 7: System.out.println("The order of precedence (from high to low) of the operators +,*, &&, ||, ! is\r\n" + 
				"1.) *, +, !, &&, ||\r\n" + 
				"2.) *, +, &&, ||, !\r\n" + 
				"3.) &&, ||, !, +, *\r\n" + 
				"4.)  *, +, !, ||, &&\r\n");
			break;
		case 8: System.out.println("What does the String Class, s.length() do?\r\n" + 
				"1.) returns the character at index x\r\n" + 
				"2.) returns true/false if the string stored in s is the same as that in t ignoring the case\r\n" + 
				"3.) returns the number of characters in the string\r\n" + 
				"4.) returns the string in all lowercase\r\n");
			break;
		case 9: System.out.println("What does the Math Class, Math.random() do?\r\n" + 
				"1.) returns a double from 0.0 and less than 1.0\r\n" + 
				"2.) return a double of the square root of the value given\r\n" + 
				"3.) returns  the minimum of the two values given\r\n" + 
				"4.) returns a double of the base raised to the exponent\r\n");
			break;
		case 10: System.out.println("What does void in the following method, public static void main(String[] args), mean?\r\n" + 
				"1.) when called on, this method will not have a return value\r\n" + 
				"2.) void is the method name\r\n" + 
				"3.) when called on, this method will return a boolean\r\n" + 
				"4.) void represent that this method needs no parameters\r\n");
			break;
		case 11: System.out.println("What is wrong with the following line, System.out.println(“Hello World”)\r\n" + 
				"1.) System should be lowercase\r\n" + 
				"2.) missing a semicolon at the end\r\n" + 
				"3.) Hello World needs to be in single quotations\r\n" + 
				"4.) missing a comma at the end\r\n");
			break;
		case 12: System.out.println("What is // used for?\r\n" + 
				"1.) print a new line\r\n" + 
				"2.) block comments\r\n" + 
				"3.) single line comments\r\n" + 
				"4.) print double space\r\n");
			break;
		case 13: System.out.println("What does the String Class, s.equalsIgnoreCase(t) do?\r\n" + 
				"1.) returns the string in all lowercase\r\n" + 
				"2.) returns the character at index x\r\n" + 
				"3.) returns true/false if the string stored in s is the same as that in t\r\n" + 
				"4.) returns true/false if the string stored in s is the same as that in t ignoring the case\r\n");
			break;
		case 14: System.out.println("If you run a program and it returns with ArrayIndexOutOfBoundsException. There’s a ______.\r\n" + 
				"1.) runtime error\r\n" + 
				"2.) syntax error\r\n" + 
				"3.) format error \r\n" + 
				"4.) logic error\r\n");
			break;
		case 15: System.out.println("What are two ways to make code more readable?\r\n" + 
				"1.) comments and arrays\r\n" + 
				"2.)  descriptive names and randomized casing\r\n" + 
				"3.) descriptive names and comments\r\n" + 
				"4.) indentation and return statements \r\n");
			break;
		case 16: System.out.println("A for statement is a _________.\r\n" + 
				"1.) conditional loop\r\n" + 
				"2.) counter loop \r\n" + 
				"3.) selection statement\r\n" + 
				"4.) selection loop\r\n");
			break;
		case 17: System.out.println("// are used for what in Java?\r\n" + 
				"1.) single line commenting \r\n" + 
				"2.) end of a java statement \r\n" + 
				"3.) block comment\r\n" + 
				"4.) Java doc comment\r\n");
			break;
		case 18: System.out.println("Which of the following is the correct way to name a variable?\r\n" + 
				"1.) StudentNumber\r\n" + 
				"2.) _student_number\r\n" + 
				"3.) STUDENTNUMBER\r\n" + 
				"4.) studentNumber\r\n");
			break;
		case 19: System.out.println("What will the following code execute?\r\n" + 
				"		int x = 10;\r\n" + 
				"		x += 5;\r\n" + 
				"		System.out.println(“X equals” + x);\r\n" + 
				"1.) prints out “X equals x”\r\n" + 
				"2.) prints out “X equals 10”\r\n" + 
				"3.) prints out “X equals 15”\r\n" + 
				"4.) prints out “X equals 5”\r\n");
			break;
		case 20: System.out.println("What does the Math Class, Math.pow(base, exp) do?\r\n" + 
				"1.) return a double of the square root of the value given\r\n" + 
				"2.) returns a double from 0.0 and less than 1.0\r\n" + 
				"3.)returns the maximum of the two values given\r\n" + 
				"4.) returns a double of the base raised to the exponent\r\n");
			break;
		}
		
		return questionNumber;
	}

	public static int CSQuizAnswer (int CSQuestions)
	{
		int answer = 0;
		
		switch(CSQuestions)
		{
		case 1: answer = 3;
			break;
		case 2: answer = 4;
			break;
		case 3: answer = 3;
			break;
		case 4: answer = 3;
			break;
		case 5: answer = 4;
			break;
		case 6: answer = 4;
			break;
		case 7: answer = 1;
			break;
		case 8: answer = 3;
			break;
		case 9: answer = 1;
			break;
		case 10: answer = 1;
			break;
		case 11: answer = 2;
			break;
		case 12: answer = 3;
			break;
		case 13: answer = 4;
			break;
		case 14: answer = 1;
			break;
		case 15: answer = 3;
			break;
		case 16: answer = 2;
			break;
		case 17: answer = 1;
			break;
		case 18: answer = 4;
			break;
		case 19: answer = 3;
			break;
		case 20: answer = 4;
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
