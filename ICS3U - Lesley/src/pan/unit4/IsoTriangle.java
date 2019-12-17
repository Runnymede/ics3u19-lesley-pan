package pan.unit4;
import java.util.Scanner;

/** Learning Arguments;
 * December 17, 2019
 * @authorLesley
 */

public class IsoTriangle {
	
	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of levels for your Isotriangle.");
		
	int n = sc.nextInt();
	
	for (int counter = 1; counter <= n; counter ++)
	{
		int insideCounter = n;
		
		for (int spacesCounter = insideCounter; spacesCounter != 0; spacesCounter --)		
			drawSpaces(n);
		
		insideCounter --;
		
		//for (int starsCounter = 1; starsCounter != 1 + n*2; starsCounter += 2)
		//drawStars(n);
		
	System.out.println("up");
	} 
	

	
	}
	
	public static void drawSpaces(int n) {
		
			System.out.print(" ");                         
		
	}

	public static void drawStars(int  n) {

			System.out.print("*");    
		 }
		 	

	
}
