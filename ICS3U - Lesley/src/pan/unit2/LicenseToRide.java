package pan.unit2;
	/** More For Loops
	 * November 14, 2019
	 * @authorLesley
	 */
public class LicenseToRide {
	

	/** 
		 * This is where our program starts.
		 * @param args unused
		*/
	public static void main(String[] args) {
		
		int counter = 0;
		
		for (int highestLicense = 9999; highestLicense >= 0; highestLicense --)
		{

			int thousands = highestLicense / 1000;
			int hundreds = highestLicense / 100 % 10;
			int tens = highestLicense / 10 % 10;
			int ones = highestLicense % 10;
			int sum = thousands + hundreds + tens + ones;

			if (sum >= 34)
			{
				counter ++;
			}
		}
	
		double probability = (double)(counter / 9999.0) * 100;
		
		System.out.print("The probability of the license plate numbers having a sum of 34 or higher is ");
		System.out.printf("%.2f", probability);
		System.out.print("%");
		
		
	}

}
