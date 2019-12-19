package pan.unit4;
import java.util.Scanner;

/** Learning Returns;
 * December 18, 2019
 * @authorLesley
 */

public class TemperatureConverter {
	
	//method that prints and gets input from the user
	public static void main (String [] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		//asks which measurement they want to convert from
		System.out.println("Do you want to convert from Celsius or from Fahrenheit?");
		
		String response = sc.nextLine();
		
		//checks which conversion and receives the conversion from the corresponding method
		if (response.equalsIgnoreCase ("Celsius"))
		{
			System.out.println("What is the temperature in celsius?");
			double temperature = sc.nextDouble();
			
			System.out.println("The temperature in fahrenheit is " + celsiusToFahrenheit(temperature));
		}
		else if (response.equalsIgnoreCase ("Fahrenheit"))
		{
			System.out.println("What is the temperature in fahrenheit?");
			double temperature = sc.nextDouble();
			
			System.out.println("The temperature in celsius is " + fahrenheitToCelsius(temperature));
		}
		else
			System.out.println("Sorry I don't think this converter is for you.");
		
	}
	//converts from fahrenheit to celsius
	public static double fahrenheitToCelsius (double fahrenheit) {
		 
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}
	//converts from celsius to fahrenheit
	public static double celsiusToFahrenheit (double celsius) {
		
		double fahrenheit = celsius * 9 / 5 + 32;
		return fahrenheit;

	}
}
