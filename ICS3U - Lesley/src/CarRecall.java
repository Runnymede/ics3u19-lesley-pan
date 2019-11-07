import java.util.Scanner;

public class CarRecall 
{

	/** Learning to use switch and if statements
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
		
		//asks user for car model number//
		System.out.println("Our company has found a defect in some of our car models. \n"
				+ "Please enter you model number to check if your car needs to be recalled");
		int modelNumber =sc.nextInt();
		
			//checks to see if their car model is defected// 
			switch (modelNumber) 
			{
			case 179: 
			case 189:
			case 190: 
			case 191: 
			case 192:
			case 193:
			case 194:
			case 195:
			case 199: 
			case 221:
			case 780: System.out.print("Sorry, your car is defected. It must be recalled for repair.");
			break;
			default: System.out.println("Don't worry your car is not defected. \n"
					+ "Have a nice day!");
		
					                                                                                                                                                                                                                                                                                                                                      
			
			}
	
	}
}
