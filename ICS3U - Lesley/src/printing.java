import java.text.NumberFormat;
import java.util.Scanner;

public class printing {

	/** Learning to use switch and if statements
	 * October 4, 2019
	 * @authorLesley
	 */
	
	public static void main(String[] args) 
	{
		/** 
		 * This is where our program starts.
		 * @param args unused
		 */

		Scanner sc = new Scanner(System.in);
		
		// Asks users for the amount of prints//
		System.out.println("Welcome to Staples. How many copies would you like to be printed?");
		int copyAmount = sc.nextInt();
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		if (copyAmount <= 99)
		{
			//calculates price and informs user of the cost//
			double price = 0.30;
			double totalPrice = copyAmount * price;
			System.out.println("Price per copy is: " + money.format(price));
			System.out.println("Your total price is: " +  money.format(totalPrice));
		}
		else if (copyAmount <= 499)
		{
			//calculates price and informs user of the cost//
			double price = 0.28;
			double totalPrice = copyAmount * price;
			System.out.println("Price per copy is: " + money.format(price));
			System.out.println("Your total price is: " +  money.format(totalPrice));
		}
		else if (copyAmount <= 749)
		{
			//calculates price and informs user of the cost//
			double price = 0.27;
			double totalPrice = copyAmount * price;
			System.out.println("Price per copy is: " + money.format(price));
			System.out.println("Your total price is: " +  money.format(totalPrice));
		}
		else if (copyAmount <= 1000)
		{
			//calculates price and informs user of the cost//
			double price = 0.26;
			double totalPrice = copyAmount * price;
			System.out.println("Price per copy is: " + money.format(price));
			System.out.println("Your total price is: " +  money.format(totalPrice));
		}
		else if (copyAmount > 1000)
		{
			//calculates price and informs user of the cost//
			double price = 0.25;
			double totalPrice = copyAmount * price;
			System.out.println("Price per copy is: " + money.format(price));
			System.out.println("Your total price is: " +  money.format(totalPrice));
			
		}
		
		//informs the user that the code is over//
		System.out.println();
		System.out.println("Thank you for using Staples's printing servive. Please come again!");
		
				
	}


}

