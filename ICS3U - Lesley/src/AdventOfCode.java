import java.util.Scanner;

public class AdventOfCode {

	/** Robotics;
	 * December 2, 2019
	 * @authorLesley
	 */

	public static void main(String[] args) {

		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		Scanner sc = new Scanner(System.in);

		int fuelRequirements = 0; 
		int fuel = 0; 
		int negativeFuel = 1;
		int singleFuel = 0;

		System.out.println("Please enter the amount of fuel you need");

		while (fuel != 138295)
		{	
			fuel = sc.nextInt();
			
			negativeFuel = fuel;
			
			while (negativeFuel > 0)
			{	
				negativeFuel = (negativeFuel/3) - 2; 
				
				if (negativeFuel > 0)
				{
					singleFuel += negativeFuel;
				}
			}

			fuelRequirements += singleFuel;
		}
			
		System.out.println(fuelRequirements);
		
	}

}