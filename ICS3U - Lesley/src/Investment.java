import java.util.Scanner;

public class Investment {
	
	/** Calculations();
	 * October 29, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) {
	
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		
	Scanner sc = new Scanner(System.in);
	
	//declares variables
	double investmentAmount = 2500;
	double compoundAmount = .075;
	int years = 0;
	
	System.out.println("Hi, I hope you are having a good day.");
	
	//initializes investment and runs until investmentsAmount => 5000
	while (investmentAmount < 5000)
	{ 
		investmentAmount = investmentAmount*compoundAmount + investmentAmount;
			 years = years + 1;
		
		System.out.println(years + " years have passed.");
	}
	
	//prints how many years it took
	System.out.println("\nWith an investment of $" + investmentAmount + ", it took "
			+ years + " years for your investment to be worth $" + investmentAmount + ".");
}
}