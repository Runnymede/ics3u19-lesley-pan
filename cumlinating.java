package isc3u;

import java.util.Scanner;

public class cumlinating {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int run = 0;
        int userStudentNumber = 333623866;

        do {
            //prompts the user to choose their path
            System.out.println("Welcome to the Exam Cram. Please enter your student number or 0 to practice mental math.");

            int signIn = sc.nextInt();
            //brings the user to the math tutor
            if (signIn == 0) {
                //informs the user how to break out of the math tutor loop
                System.out.println("If you would ever like to exit the math tutor, enter pi, 3.14.");
                int counter = 0;
                System.out
                .println("Hi, I am Pi, your personal math tutor. Today we will be practicing basic arthmetics");
                double userMathAnswer = 0;

                do {
                    //calls on mathTutor method to generate a question and send back the answer
                    int answer = mathTutor(signIn);

                    userMathAnswer = sc.nextDouble();
                    //checks to see if the user is correct
                    if (userMathAnswer == answer) {
                        counter++;
                        System.out.println("Good job, you've answered " + counter + " amount of questions correctly!");
                    } else {
                        counter = 0;
                        System.out.println("Sorry, the right answer was " + answer + ".");
                    }
                    //breaks out of the loop
                } while (userMathAnswer != 3.14);

            } else if (signIn == userStudentNumber) {
                System.out.println("Welcome back Lesley.");

                int course = 3;
                //print the courses the user has and prompts them to choose one
                subject(course);

                boolean homescreen = false;


                int userSubject = sc.nextInt();
                do {
                    //if they chose physics
                    int physicsPathway = 0;
                    if (userSubject == 1) {
                        do {
                            System.out.println(
                                    //prompts them for a following action
                                    "Would you like to 1.) review content, 2.) practice questions, 3.) final review test, 4.)exit");
                            physicsPathway = sc.nextInt();
                            //displays the content
                            if (physicsPathway == 1) {

                                physicsContent(physicsPathway);
                                //asks them if they want to break
                                System.out.println("Would you like to try something else? yes/no");
                                String userPhysicsChange = sc.nextLine();
                                if (userPhysicsChange.equalsIgnoreCase("yes"))
                                    break;
                                //runs the quizzing practice for the user
                            } else if (physicsPathway == 2) {
                                for (int i = 10; i < 100; i++) {
                                    int questionNumber = physicsQuestions(physicsPathway);
                                    int userPhysicsQuizAnswer = sc.nextInt();
                                    int physicsAnswer = physicsQuizAnswer(questionNumber);
                                    //checks to see if they are correct
                                    if (userPhysicsQuizAnswer == physicsAnswer)
                                        System.out.println("Good job, that's the right answer!");
                                    else
                                        System.out.println("Almost, the answer was " + physicsAnswer + ".");
                                    //asks them if they want to break
                                    System.out.println("Would you like to try something else? yes/no");
                                    String userPhysicsChange = sc.nextLine();
                                    if (userPhysicsChange.equalsIgnoreCase("yes"))
                                        break;
                                }
                                //runs the physics test
                            } else if (physicsPathway == 3) {
                                System.out.println("All these answers will be true or false, so respond with t or f.");
                                double physicsTestCounter = 0;
                                for (int i = 0; i < 9; i++) {
                                    physicsTest(i);
                                    String userPhysicsTestAnswer = sc.nextLine();
                                    String physicsTAnswer = "T"; 
                                    physicsTAnswer.equalsIgnoreCase(physicsTestAnswer(i));
                                    //if they get an answer correct their score increases
                                    if (userPhysicsTestAnswer.equalsIgnoreCase(physicsTAnswer))
                                        physicsTestCounter++;
                                }
                                //score is used to calculate percentage
                                double percentage = physicsTestCounter / 10 * 100;
                                System.out.println(
                                        "You got a " + percentage + "% on this test. The answers were "
                                                + physicsTestAnswer(100) + ".");
                                //asks them to break or not
                                System.out.println("Would you like to try something else? yes/no");
                                String userPhysicsChange = sc.nextLine();
                                if (userPhysicsChange.equalsIgnoreCase("yes"))
                                    break;
                            }

                        }

                        while (physicsPathway != 4);
                    }
                    //breaks out of physics
                    if (physicsPathway == 4)
                        homescreen = true;
                    int sapPathway = 0;

                    if (userSubject == 2) {
                        do {
                            System.out.println(
                                    "Would you like to 1.) review content, 2.) practice questions, 3.) final review test, 4.)exit");
                            sapPathway = sc.nextInt();
                            //displays content
                            if (sapPathway == 1) {

                                sapContent(sapPathway);
                                //asks user to break
                                System.out.println("Would you like to try something else? yes/no");
                                String userSAPChange = sc.nextLine();
                                if (userSAPChange.equalsIgnoreCase("yes"))
                                    break;
                                //runs the quizzing questions
                            } else if (sapPathway == 2) {
                                for (int i = 10; i < 100; i++) {
                                    int questionNumberSap = sapQuestions(sapPathway);
                                    int userSapQuizAnswer = sc.nextInt();
                                    int sapAnswer = sapQuizAnswer(questionNumberSap);
                                    //checks to see if user is correct
                                    if (userSapQuizAnswer == sapAnswer)
                                        System.out.println("Good job, that's the right answer!");
                                    else
                                        System.out.println("Almost, the answer was " + sapAnswer + ".");
                                    //prompts user to break
                                    System.out.println("Would you like to try something else? yes/no");
                                    String userSapChange = sc.nextLine();
                                    if (userSapChange.equalsIgnoreCase("yes"))
                                        break;
                                }
                                //runs the test for the user
                            } else if (sapPathway == 3) {
                                System.out.println("All these answers will be true or false, so respond with t or f.");
                                double sapTestCounter = 0;
                                for (int i = 0; i < 9; i++) {
                                    sapTest(i);
                                    String userSapTestAnswer = sc.nextLine();
                                    String sapTAnswer = "T";
                                    sapTAnswer.equalsIgnoreCase(sapTestAnswer(i));
                                    //keeps track of how many the user got correct
                                    if (userSapTestAnswer.equalsIgnoreCase(sapTAnswer))
                                        sapTestCounter++;
                                }
                                //informs users of their score and the answers
                                double percentage = sapTestCounter / 10 * 100;
                                System.out.println(
                                        "You got a " + percentage + "% on this test. The answers were "
                                                + sapTestAnswer(100) + ".");
                                //asks user to break
                                System.out.println("Would you like to try something else? yes/no");
                                String userSapChange = sc.nextLine();
                                if (userSapChange.equalsIgnoreCase("yes"))
                                    break;
                            }

                        }

                        while (sapPathway != 4);
                    }
                    //breaks out of sap
                    if (sapPathway == 4)
                        homescreen = true;
                    int csPathway = 0;
                    if (userSubject == 3) {

                        do {
                            System.out.println(
                                    "Would you like to 1.) review content, 2.) practice questions, 3.) final review test, 4.)exit");
                            csPathway = sc.nextInt();
                            //displays cs content
                            if (csPathway == 1) {

                                csContent(csPathway);
                                //prompts user to break
                                System.out.println("Would you like to try something else? yes/no");
                                String userCSChange = sc.nextLine();
                                if (userCSChange.equalsIgnoreCase("yes"))
                                    break;
                                else if (userCSChange.equalsIgnoreCase("no"));
                                System.out.println("Okay");
                                //runs the quizzing practice
                            } else if (csPathway == 2) {
                                for (int i = 10; i < 100; i++) {
                                    int questionNumberCs = csQuestions(csPathway);
                                    int userCSQuizAnswer = sc.nextInt();
                                    int csAnswer = csQuizAnswer(questionNumberCs);
                                    //checkcs if user is correct
                                    if (userCSQuizAnswer == csAnswer)
                                        System.out.println("Good job, that's the right answer!");
                                    else
                                        System.out.println("Almost, the answer was " + csAnswer + ".");
                                    //prompts user to break
                                    System.out.println("Would you like to try something else? yes/no");
                                    String userCSChange = sc.nextLine();
                                    if (userCSChange.equalsIgnoreCase("yes"))
                                        break;
                                }
                                //runs the test for the user
                            } else if (csPathway == 3) {
                                System.out.println("All these answers will be true or false, so respond with t or f.");
                                double csTestCounter = 0;
                                for (int i = 0; i < 9; i++) {
                                    csTest(i);
                                    String userCsTestAnswer = sc.nextLine();
                                    String csTAnswer = "T"; 
                                    csTAnswer.equalsIgnoreCase(csTestAnswer(i));
                                    //increases their score as they get one right
                                    if (userCsTestAnswer.equalsIgnoreCase(csTAnswer))
                                        csTestCounter++;
                                }
                                //calcuates percentage with score and displays the correct answer 
                                double percentage = csTestCounter / 10 * 100;
                                System.out.println(
                                        "You got a " + percentage + "% on this test. The answers were "
                                                + csTestAnswer(100) + ".");
                                //asks user to break
                                System.out.println("Would you like to try something else? yes/no");
                                String userCSChange = sc.nextLine();
                                if (userCSChange.equalsIgnoreCase("yes"))
                                    break;
                            }

                        }

                        while (csPathway != 4);
                    }
                    //breaks out of cs
                    if (csPathway == 4)
                        homescreen = true;

                } while (homescreen != true);
                //informs user that they must pick one of the two options
            } else {
                System.out.println("Sorry, that was neither your student number or 0. Try again :)");
            }
        } while (run == 0);
    }
    /** 
     * This method generates a random math question for the user to answer.
     * @param signIn
     * @return the answer to the question generated
     */
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
    /**
     * This method keeps track of the courses the user is taking. Can be changed easily from back end.
     * @param course
     */
    public static void subject(int course) {
        String subject1 = ("physics");
        String subject2 = ("sap");
        String subject3 = ("cs");
        //String subject4 = ("N/A");

        System.out.println(
                "Please enter a number to choose a subject to study for. 1.)" + subject1 + " 2.)" + subject2 + (" 3.)") + subject3
                + ".");
    }
    /**
     * This method contains physics "content".
     * @param physicsPathway
     */
    public static void physicsContent(int physicsPathway) {
        System.out.println("Random physics stuff. :D");
    }
    /** 
     * This method contains a switch that will generate a multiple choice question randomly for the user.
     * @param physicsPathway
     * @return
     */
    public static int physicsQuestions(int physicsPathway) {
        int questionNumber = (int) (Math.random() * 20) + 1;

        switch (questionNumber) {
        case 1:
            System.out.println(
                    "The term kinematics is best described as (1.1)\r\n" + "1.) A term used to quantify motion\r\n"
                            + "2.) The study of a position \r\n" + "3.) The study of how objects move\r\n"
                            + "4.) A term used to quantify inertia\r\n");
            break;
        case 2:
            System.out.println(
                    "For a straight line on a position-time graph, the rise refers to the change in quantity? (1.2)\r\n"
                            + "1.) Slope\r\n" + "2.) Time \r\n" + "3.) Velocity\r\n" + "4.) Position \r\n");
            break;
        case 3:
            System.out.println(
                    "A river has a current of 2.3 m/s. A man points his boat so that it is directed straight across the river. In still water, the boat can move with a speed of 3.2 m/s. What is the average speed of the boat while travelling across the river? (2.2)\r\n"
                            + "1.) 1.1 m/s\r\n" + "2.) 2.8 m/s\r\n" + "3.) 3.9 m/s\r\n" + "4.) 5.5 m/s\r\n");
            break;
        case 4:
            System.out.println(
                    "A basketball is shot with an initial velocity of 16 m/s at an angle of 55°. What is the approximate horizontal distance that the ball travels in 1.5 s? (2.2, 2.3)\r\n"
                            + "1.) 9.1 m\r\n" + "2.) 13 m\r\n" + "3.) 14 m\r\n" + "4.) 20 m\r\n");
            break;
        case 5:
            System.out.println(
                    "Which of the following forces is caused by the electric charges of particles? (3.1)\r\n"
                            + "1.) Electromagnetic\r\n" + "2.) Ravitational\r\n" + "3.) Weak nuclear\r\n"
                            + "4.) Strong nuclear\r\n");
            break;
        case 6:
            System.out.println(
                    "What is the net force experienced by a 20.0 kg object that accelerates at a rate of 4.0 m/s²? (3.3)\r\n"
                            + "1.) 80 N\r\n" + "2.) 60 N\r\n" + "3.) 800 N\r\n" + "4.) 5.0 N\r\n");
            break;
        case 7:
            System.out.println(
                    "Which of the following scenarios will result in the largest amount of frictional force from the air? (4.1)\r\n"
                            + "1.) A small surface area moving slowly \r\n"
                            + "2.) A small surface area moving rapidly\r\n"
                            + "3.) A large surface area moving slowly\r\n"
                            + "4.) A large surface area moving rapidly\r\n");
            break;
        case 8:
            System.out.println(
                    "Two blocks, at 4.0 kg and 5.0 kg, are suspended from the ceiling by a piece of string. What is the tension in the string? (3.5)\r\n"
                            + "1.) 9.0 N\r\n" + "2.) 88 kg\r\n" + "3.) 88 N\r\n" + "4.) 49 N\r\n");
            break;
        case 9:
            System.out.println(
                    "The type of energy possessed by moving objects is (5.2)\r\n" + "1.) Kinetic energy\r\n"
                            + "2.) Potential energy\r\n" + "3.) Chemical energy\r\n" + "4.) Work energy \r\n");
            break;
        case 10:
            System.out.println(
                    "What power input is needed for a 70.0 kg person to go up 5.00m of stairs in 2.00s? (5.5)\r\n"
                            + "1.) 3430 J\r\n" + "2.) 175 J\r\n" + "3.) 1720 J\r\n" + "4.) 340 J\r\n");
            break;
        case 11:
            System.out.println(
                    "The term used to describe the transfer of thermal energy that occurs when warmer objects are in physical contact with colder objects is (6.2)\r\n"
                            + "1.) Thermal convection\r\n" + "2.) Thermal induction\r\n" + "3.) Thermal radiation \r\n"
                            + "4.) Thermal conduction\r\n");
            break;
        case 12:
            System.out.println(
                    "An increase in the motion of the particles that make up a substance will have what effect? (6.1)\r\n"
                            + "1.) It will make the substance warmer\r\n" + "2.) It will make the substance colder\r\n"
                            + "3.) It will make the substance spin\r\n"
                            + "4.) It will not have any effect on the subject\r\n");
            break;
        case 13:
            System.out.println(
                    "Which of the following statements is true of amplitude? (9.4)\r\n"
                            + "1.) When the difference between the frequency of a wave and its natural frequency increases, the amplitude of a wave increases.\r\n"
                            + "2.) A decrease in wave energy decreases a wave’s amplitude.\r\n"
                            + "3.) When damping is increased, the amplitude of a wave increases\r\n"
                            + "4.) When a system vibrates close to a harmonic, resonance occurs and the amplitude of the observed vibration decreases.\r\n");
            break;
        case 14:
            System.out.println(
                    "If you know the linear density of a violin string and want to calculate the speed of a wave on the violin string, which additional information is needed? (8.4)\r\n"
                            + "1.) Tension on the string\r\n" + "2.) Temperature of the string\r\n"
                            + "3.) Time to complete a cycle\r\n" + "4.) Density of the violin’s sounding board\r\n");
            break;
        case 15:
            System.out.println(
                    "When two waves meet, one with amplitude of 4 cm and the other with amplitude 2 cm, what are the possible maximum and minimum amplitudes of the resulting wave? (9.1)\r\n"
                            + "1.) Maximum 6 cm, minimum 2 cm\r\n" + "2.) Maximum 4 cm, minimum 2 cm\r\n"
                            + "3.) Maximum 8 cm, minimum 0.5 cm\r\n" + "4.) Maximum 6 cm, minimum 6 cm\r\n");
            break;
        case 16:
            System.out.println(
                    "A truck is travelling at 30 m/s toward a stationary observer. If the truck sounds its horn at a frequency of 700 Hz, what frequency does the observer detect? (Use 340 m/s as the speed of sound.) (9.5)\r\n"
                            + "1.) 638 Hz\r\n" + "2.) 643 Hz\r\n" + "3.) 762 Hz\r\n" + "4.) 767 Hz\r\n");
            break;
        case 17:
            System.out.println(
                    "Which of the following is a unit of electrical energy? (11.1)\r\n" + "1.) Watt\r\n"
                            + "2.) Volt \r\n" + "3.) Joule\r\n" + "4.) Ohm\r\n");
            break;
        case 18:
            System.out.println(
                    "If an external magnetic field is pointing to the right and the current in a wire is pointing out of the page, in which direction is the force on the wire? (12.5)\r\n"
                            + "1.) Upward\r\n" + "2.) Downward\r\n" + "3.) Left\r\n" + "4.) Into the page\r\n");
            break;
        case 19:
            System.out.println(
                    "Magnetic field lines (12.1)\r\n" + "1.) Are stronger at the poles\r\n"
                            + "2.) Can cross one another\r\n" + "3.) Are affected by gravity\r\n"
                            + "4.) Exist in two dimensions only\r\n");
            break;
        case 20:
            System.out.println(
                    "Which device is used to measure the resistance of a load? (11.3, 11.5, 11.7)\r\n"
                            + "1.) Galvanometer\r\n" + "2.) Voltmeter\r\n" + "3.) Ohmmeter\r\n" + "4.) Ammeter\r\n");
            break;
        }

        return questionNumber;
    }
    /**
     * This method contains the answers to the question displayed
     * @param physicsQuestions
     * @return the answer to the question
     */
    public static int physicsQuizAnswer(int physicsQuestions) {
        int answer = 0;
        switch (physicsQuestions) {
        case 1:
            answer = 3;
            break;
        case 2:
            answer = 4;
            break;
        case 3:
            answer = 3;
            break;
        case 4:
            answer = 3;
            break;
        case 5:
            answer = 1;
            break;
        case 6:
            answer = 1;
            break;
        case 7:
            answer = 4;
            break;
        case 8:
            answer = 3;
            break;
        case 9:
            answer = 1;
            break;
        case 10:
            answer = 3;
            break;
        case 11:
            answer = 4;
            break;
        case 12:
            answer = 1;
            break;
        case 13:
            answer = 2;
            break;
        case 14:
            answer = 1;
            break;
        case 15:
            answer = 1;
            break;
        case 16:
            answer = 4;
            break;
        case 17:
            answer = 3;
            break;
        case 18:
            answer = 1;
            break;
        case 19:
            answer = 1;
            break;
        case 20:
            answer = 3;
            break;
        }
        return answer;
    }
    /**
     * This method contains the questions for the test that will be displayed
     * @param i
     */
    public static void physicsTest(int i) {
        String[] physicsTest = {"The right hand rule states your fingers point in the direction of the magentic fields.",
                "There are two types of current, AC and CD.",
                "Newton's First Law of Motion is f=m*a.",
                "Projectiles are object that move along a 2-D curved trajectory in response to gravity.",
                "Potential energy is a form of energy an object possesses because of its position in relation to forces in its environment.",
                "Power is equivalent to time/work done.",
                "The transverse wave is the only type of mechanical wave.",
                "Echolocation is used by bats anad whales to navigate and communicate with others of their species.",
                "Ohm's Law states resistance equals voltage/current",
        "AC generators use a split ring."};

        System.out.println(physicsTest[i]);

    }
    /**
     * This method contains the answers to the test questions displayed
     * @param i
     * @return answer
     */
    public static String physicsTestAnswer(int i) {
        String answer = "T";
        String[] physicsTestAnswer = {"T", "F", "F", "T", "T", "F", "F", "T","T","F" };
        if (i == 100) {
            for (int counter = 0; counter < 9; counter++) {
                System.out.println(physicsTestAnswer[counter]);
            }
        }

        answer = physicsTestAnswer[i];

        return answer;
    }
    /**
     * This method contains sap "content"
     * @param sapPathway
     */
    public static void sapContent(int sapPathway) {
        System.out.println("Random SAP stuff :D.");
    }
    /** 
     * This method contains a switch that will generate a multiple choice question randomly for the user.
     * @param physicsPathway
     * @return
     */

    public static int sapQuestions (int sapPathway)
    {
        int questionNumber = (int)(Math.random()*20)+1;

        switch (questionNumber)
        {
        case 1: System.out.println("Which of the following is not a social institution?\r\n" + 
                "1.) family\r\n" + 
                "2.) education\r\n" + 
                "3.) hidden Media\r\n" + 
                "4.) social Media\r\n");
        break;
        case 2: System.out.println("Stereotypes are maintained by _______\r\n" + 
                "1.) ignoring contradictory evidence\r\n" + 
                "2.) individualization \r\n" + 
                "3.) overcomplicating generalization that is applied to all members of a group\r\n" + 
                "4.) the ideology of “rescue”\r\n");
        break;
        case 3: System.out.println("Racism is about _____\r\n" + 
                "1.) effect not Intent\r\n" + 
                "2.) intent not effect\r\n" + 
                "3.) response not question\r\n" + 
                "4.) question not response\r\n");
        break;
        case 4: System.out.println("What is the definition of theory?\r\n" + 
                "1.) what’s important to you\r\n" + 
                "2.) best possible explanation based on available evidence\r\n" + 
                "3.) your experiences, what you think is real\r\n" + 
                "4.) determines how you interpret situations\r\n");
        break;
        case 5: System.out.println("Which of the following is not an obstacle to clear thinking?\r\n" + 
                "1.) drugs\r\n" + 
                "2.) close-minded\r\n" + 
                "3.) honesty\r\n" + 
                "4.) emotions\r\n");
        break;
        case 6: System.out.println("What does the IQ test asses?\r\n" + 
                "1.) literacy skills\r\n" + 
                "2.) survival skills\r\n" + 
                "3.) logical reasoning skills\r\n" + 
                "4.) 1 and 3\r\n");
        break;
        case 7: System.out.println("How many types of intelligence are there?\r\n" + 
                "1.) 27\r\n" + 
                "2.) 5\r\n" + 
                "3.) 3\r\n" + 
                "4.) 8\r\n");
        break;
        case 8: System.out.println("Emotions have 3 components\r\n" + 
                "1.) psychological, cognitive, behavioral\r\n" + 
                "2.) psychological, physical, social\r\n" + 
                "3.) intensity, range, exposure\r\n" + 
                "4.) range, duration, intensity\r\n");
        break;
        case 9: System.out.println("Which of the following is not a component of happiness?\r\n" + 
                "1.) diet and nutrition\r\n" + 
                "2.) time in nature\r\n" + 
                "3.) interventions\r\n" + 
                "4.) relationships\r\n");
        break;
        case 10: System.out.println("The brain compensates for damaged neurons by ______.\r\n" + 
                "1.) extending neural connections over the dead neurons\r\n" + 
                "2.) it doesn’t need too\r\n" + 
                "3.) grows new neurons\r\n" + 
                "4.) send neurons in from different places\r\n");
        break;
        case 11: System.out.println("Which of the following is true?\r\n" + 
                "1.) you continue to grow neurons until age 50\r\n" + 
                "2.) 90% of the brain is achieved by age 6\r\n" + 
                "3.) only 20% of the brain is actually being used \r\n" + 
                "4.) the size of your brain determines your intelligence\r\n");
        break;
        case 12: System.out.println("The feel-good chemical is properly known as?\r\n" + 
                "1.) acetycholine\r\n" + 
                "2.) endocrine\r\n" + 
                "3.) dopamine\r\n" + 
                "4.) doperdoodle\r\n");
        break;
        case 13: System.out.println("Who created the theory about ID, superego and ego?\r\n" + 
                "1.) Albert\r\n" + 
                "2.) Freud\r\n" + 
                "3.) Erikson\r\n" + 
                "4.) Olaf\r\n");
        break;
        case 14: System.out.println("Classic Conditioning is _______?\r\n" + 
                "1.) when an organism learns to associate two things that are normally unrelated\r\n" + 
                "2.) when an organism learns to disassociate two things that are normally related \r\n" + 
                "3.) when you teach an organism the survival style of another organism\r\n" + 
                "4.) when you train an organism without the use of modern technology\r\n");
        break;
        case 15: System.out.println("The cerebellum is responsible for what?\r\n" + 
                "1.) visual info processing\r\n" + 
                "2.) secrets hormones\r\n" + 
                "3.) balance and coordination\r\n" + 
                "4.) controls heartbeat\r\n");
        break;
        case 16: System.out.println("Transphobia is the fear of?\r\n" + 
                "1.) transgender individuals\r\n" + 
                "2.) homosexual individuals\r\n" + 
                "3.) women\r\n" + 
                "4.) transfats\r\n");
        break;
        case 17: System.out.println("What factors contribute to a positive IQ score in children?\r\n" + 
                "1.) early access to words\r\n" + 
                "2.) affectionate parents\r\n" + 
                "3.) spending time on activities\r\n" + 
                "4.) all of the above\r\n");
        break;
        case 18: System.out.println("Emotions can be ______.\r\n" + 
                "1.) a reaction\r\n" + 
                "2.) a goal\r\n" + 
                "3.) all of the above\r\n" + 
                "4.) none of the above\r\n");
        break;
        case 19: System.out.println("What is not a stage in increasing prejudice?\r\n" + 
                "1.) verbal rejection\r\n" + 
                "2.) extermination\r\n" + 
                "3.) avoidance\r\n" + 
                "4.) self agreement\r\n");
        break;
        case 20: System.out.println("What part of the brain is still developing in adolescents?\r\n" + 
                "1.) brain stem\r\n" + 
                "2.) pons\r\n" + 
                "3.) prefrontal cortex\r\n" + 
                "4.) occipital\r\n");
        break;
        }

        return questionNumber;
    }
    /**
     * This method will contain the answer to the question displayed.
     * @param sapQuestions
     * @return the answer to the question above
     */
    public static int sapQuizAnswer (int sapQuestions)
    {
        int answer = 0;

        switch(sapQuestions)
        {
        case 1: answer = 3;
        break;
        case 2: answer = 1;
        break;
        case 3: answer = 1;
        break;
        case 4: answer = 2;
        break;
        case 5: answer = 3;
        break;
        case 6: answer = 4;
        break;
        case 7: answer = 4;
        break;
        case 8: answer = 1;
        break;
        case 9: answer = 3;
        break;
        case 10: answer = 1;
        break;
        case 11: answer = 2;
        break;
        case 12: answer = 3;
        break;
        case 13: answer = 2;
        break;
        case 14: answer = 1;
        break;
        case 15: answer = 3;
        break;
        case 16: answer = 1;
        break;
        case 17: answer = 4;
        break;
        case 18: answer = 3;
        break;
        case 19: answer = 4;
        break;
        case 20: answer = 3;
        break;  
        }
        return answer;
    }
    /**
     * This method will display a question to the user from the array, in order
     * @param i
     */
    public static void sapTest(int i) {
        String[] sapTest = {"Cognitive Dissonance is when our emotions, actions and thoughts are not aligned about a particular situation.", 
                "Law, economics and geo are all types of social sciences.", 
                "A past problem with IQ testing is that the questions were tailored to eastern and catholic culture.",
                "There are 3 components to achieving emotional intelligence.",
                "Anger is the easiest emotion to control.",
                "You are born with all your brain parts",
                "Some neurons are as long as your leg",
                "Mental health is more to do with managing emotions and mental illness can be threatening to self/others.",
                "Defense mechanisms are a concious action.",
        "Conditioned stimulus is what you know naturally."};

        System.out.println(sapTest[i]);

    }
    /**
     * This method will return the answer to the appropriate question displayed.
     * @param i
     * @return answer to the question
     */
    public static String sapTestAnswer(int i) {
        String answer = "T";
        String[] sapTestAnswer = {"T", "T", "F", "T", "F", "T", "T", "T", "F", "F"};
        if (i == 100)
            for (int counter = 0; counter < 9; counter++) {
                System.out.println(sapTestAnswer[counter]);
            }
        else
            ;
        answer = sapTestAnswer[i];

        return answer;
    }
    /**
     * This method displays cs "content".
     * @param csPathway
     */
    public static void csContent(int csPathway) {
        System.out.println("Random CS stuff :D.");
    }
    /** 
     * This method contains a switch that will generate a multiple choice question randomly for the user.
     * @param physicsPathway
     * @return the question number
     */
    public static int csQuestions(int csPathway) {
        int questionNumber = (int) (Math.random() * 20) + 1;

        switch (questionNumber) {
        case 1:
            System.out.println(
                    "\r\n" + "Which of the following is not one of the 8 ethics of programming\r\n" + "1.) Self\r\n"
                            + "2.) Product\r\n" + "3.) Gracious Professionalism \r\n" + "4.) Public\r\n");
            break;
        case 2:
            System.out.println(
                    "What’s wrong with the following main method? Public static boolean main(String args[]) {\r\n"
                            + "1.) The main should be private\r\n" + "2.) The p in public should be lowercase\r\n"
                            + "3.) The arguments should be int\r\n"
                            + "4.) The p in public should be lowercase and boolean should be void\r\n");
            break;
        case 3:
            System.out.println(
                    "What are the primitive types?\r\n"
                            + "1.) byte, String, int, double, char, boolean, float, long\r\n"
                            + "2.) double, char, boolean, float\r\n"
                            + "3.) byte, short, int, long, float, double, char, boolean\r\n"
                            + "4.) double, class, boolean, float\r\n");
            break;
        case 4:
            System.out.println(
                    "The “less than or equal to” comparison operator in Java is _______.\r\n" + "1.) =<\r\n"
                            + "2.) !=\r\n" + "3.) <=\r\n" + "4.) <\r\n");
            break;
        case 5:
            System.out.println(
                    "What are the benefits of modular programming?\r\n"
                            + "1.) Methods are used to break code into manageable pieces\r\n"
                            + "2.) Make code more reusable\r\n" + "3.) Help to debug code\r\n"
                            + "4.) All of the above\r\n");
            break;
        case 6:
            System.out.println(
                    "The following code displays ______.\r\n" + "       double temp = 50;\r\n" + "       \r\n"
                            + "       if (temp >= 100)\r\n" + "           System.out.println(“too hot’);\r\n"
                            + "       else if (temp <=40)\r\n" + "           System.out.println(“too cold”);\r\n"
                            + "       else \r\n" + "           System.out.println(“just right”);\r\n"
                            + "1.) too hot too cold just right\r\n" + "2.) too hot\r\n" + "3.) too cold\r\n"
                            + "4.) just right\r\n");
            break;
        case 7:
            System.out.println(
                    "The order of precedence (from high to low) of the operators +,*, &&, ||, ! is\r\n"
                            + "1.) *, +, !, &&, ||\r\n" + "2.) *, +, &&, ||, !\r\n" + "3.) &&, ||, !, +, *\r\n"
                            + "4.)  *, +, !, ||, &&\r\n");
            break;
        case 8:
            System.out.println(
                    "What does the String Class, s.length() do?\r\n" + "1.) returns the character at index x\r\n"
                            + "2.) returns true/false if the string stored in s is the same as that in t ignoring the case\r\n"
                            + "3.) returns the number of characters in the string\r\n"
                            + "4.) returns the string in all lowercase\r\n");
            break;
        case 9:
            System.out.println(
                    "What does the Math Class, Math.random() do?\r\n"
                            + "1.) returns a double from 0.0 and less than 1.0\r\n"
                            + "2.) return a double of the square root of the value given\r\n"
                            + "3.) returns  the minimum of the two values given\r\n"
                            + "4.) returns a double of the base raised to the exponent\r\n");
            break;
        case 10:
            System.out.println(
                    "What does void in the following method, public static void main(String[] args), mean?\r\n"
                            + "1.) when called on, this method will not have a return value\r\n"
                            + "2.) void is the method name\r\n"
                            + "3.) when called on, this method will return a boolean\r\n"
                            + "4.) void represent that this method needs no parameters\r\n");
            break;
        case 11:
            System.out.println(
                    "What is wrong with the following line, System.out.println(“Hello World”)\r\n"
                            + "1.) System should be lowercase\r\n" + "2.) missing a semicolon at the end\r\n"
                            + "3.) Hello World needs to be in single quotations\r\n"
                            + "4.) missing a comma at the end\r\n");
            break;
        case 12:
            System.out.println(
                    "What is // used for?\r\n" + "1.) print a new line\r\n" + "2.) block comments\r\n"
                            + "3.) single line comments\r\n" + "4.) print double space\r\n");
            break;
        case 13:
            System.out.println(
                    "What does the String Class, s.equalsIgnoreCase(t) do?\r\n"
                            + "1.) returns the string in all lowercase\r\n" + "2.) returns the character at index x\r\n"
                            + "3.) returns true/false if the string stored in s is the same as that in t\r\n"
                            + "4.) returns true/false if the string stored in s is the same as that in t ignoring the case\r\n");
            break;
        case 14:
            System.out.println(
                    "If you run a program and it returns with ArrayIndexOutOfBoundsException. There’s a ______.\r\n"
                            + "1.) runtime error\r\n" + "2.) syntax error\r\n" + "3.) format error \r\n"
                            + "4.) logic error\r\n");
            break;
        case 15:
            System.out.println(
                    "What are two ways to make code more readable?\r\n" + "1.) comments and arrays\r\n"
                            + "2.)  descriptive names and randomized casing\r\n"
                            + "3.) descriptive names and comments\r\n" + "4.) indentation and return statements \r\n");
            break;
        case 16:
            System.out.println(
                    "A for statement is a _________.\r\n" + "1.) conditional loop\r\n" + "2.) counter loop \r\n"
                            + "3.) selection statement\r\n" + "4.) selection loop\r\n");
            break;
        case 17:
            System.out.println(
                    "// are used for what in Java?\r\n" + "1.) single line commenting \r\n"
                            + "2.) end of a java statement \r\n" + "3.) block comment\r\n"
                            + "4.) Java doc comment\r\n");
            break;
        case 18:
            System.out.println(
                    "Which of the following is the correct way to name a variable?\r\n" + "1.) StudentNumber\r\n"
                            + "2.) _student_number\r\n" + "3.) STUDENTNUMBER\r\n" + "4.) studentNumber\r\n");
            break;
        case 19:
            System.out.println(
                    "What will the following code execute?\r\n" + "       int x = 10;\r\n" + "       x += 5;\r\n"
                            + "       System.out.println(“X equals” + x);\r\n" + "1.) prints out “X equals x”\r\n"
                            + "2.) prints out “X equals 10”\r\n" + "3.) prints out “X equals 15”\r\n"
                            + "4.) prints out “X equals 5”\r\n");
            break;
        case 20:
            System.out.println(
                    "What does the Math Class, Math.pow(base, exp) do?\r\n"
                            + "1.) return a double of the square root of the value given\r\n"
                            + "2.) returns a double from 0.0 and less than 1.0\r\n"
                            + "3.)returns the maximum of the two values given\r\n"
                            + "4.) returns a double of the base raised to the exponent\r\n");
        }

        return questionNumber;
    }
    /**
     * This method contains the answers to the corresponding question displayed to the user
     * @param csQuestions
     * @return answer to the question
     */
    public static int csQuizAnswer(int csQuestions) {
        int answer = 0;

        switch (csQuestions) {
        case 1:
            answer = 3;
            break;
        case 2:
            answer = 4;
            break;
        case 3:
            answer = 3;
            break;
        case 4:
            answer = 3;
            break;
        case 5:
            answer = 4;
            break;
        case 6:
            answer = 4;
            break;
        case 7:
            answer = 1;
            break;
        case 8:
            answer = 3;
            break;
        case 9:
            answer = 1;
            break;
        case 10:
            answer = 1;
            break;
        case 11:
            answer = 2;
            break;
        case 12:
            answer = 3;
            break;
        case 13:
            answer = 4;
            break;
        case 14:
            answer = 1;
            break;
        case 15:
            answer = 3;
            break;
        case 16:
            answer = 2;
            break;
        case 17:
            answer = 1;
            break;
        case 18:
            answer = 4;
            break;
        case 19:
            answer = 3;
            break;
        case 20:
            answer = 4;
            break;
        }
        return answer;
    }
    /**
     * This method will display a question from the array for the user, in order.
     * @param i
     */
    public static void csTest(int i) {
        String[] csTest = {"When you call a method that returns a value you have to s a.)assign it a variable or b.) use it directly in your code.",
                "A parameter is used to pass one or more values from the calling method into the current method.",
                "Loops must can within themselves a way to terminate expect in special cases.",
                "\n will provide a new tab",
                "When declaring variables you need to give it a type and an purpose.",
                "The * is a multiplication operator.",
                "Casting reverts the variable to its original type.",
                "<= is the less than or equal to boolean expression.",
                "A switch only works with primitive data types.",
        "A String is a primitive data type"};

        System.out.println(csTest[i]);

    }
    /**
     * This method will return the answer to the appropriate question displayed.
     * @param i
     * @return answer to the question
     */
    public static String csTestAnswer(int i) {
        String answer = "T";
        String[] csTestAnswer = {"T","T","T", "F", "F", "T", "F", "T", "F", "F"};
        if (i == 100) {
            for (int counter = 0; counter < 9; counter++) {
                System.out.println(csTestAnswer[counter]);
            }
        }
        answer = csTestAnswer[i];

        return answer;
    }
}
