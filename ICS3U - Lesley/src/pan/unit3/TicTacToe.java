package pan.unit3;
import java.util.Scanner;

public class TicTacToe {

	/** Learning Arrays;
	 * November 27, 2019
	 * @throws InterruptedException 
	 * @authorLesley
	 */

	public static void main(String[] args) throws InterruptedException {

		/** 
		 * This is where our program starts.
		 * @param args unused
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Tic Tac Toe Simulator! "
				+ "(apparently we're too advanced to use a pen and paper anymore.. -.-\")\n");
		
		String tttBoard [][] = { {" _ ", " _ ", " _ "}, {" _ ", " _ ", " _ "}, {" _ ", " _ ", " _ "} };
		int column = 0;
		int row = 0;

		System.out.format("%4s %3s %3s\n",  "0", "1", "2");
		for (int rows = 0; rows < tttBoard.length; rows ++ ) 
		{
			System.out.print(rows);
			for (int col = 0; col < tttBoard[0].length; col ++)
			{
				System.out.print("|" + tttBoard[rows][col] + "");
			}

			System.out.println("|");
		}
		
		System.out.println();
		
		
		for (int counter = 0; counter<9; counter ++)
		{
			
			if (counter % 2 != 0)
			{
				
				System.out.println("Which column would you like to place your x?");
				column = sc.nextInt();
				System.out.println("Which row would you like to place your x?");
				row = sc.nextInt();
				
				tttBoard [row][column] = " x ";
				
				System.out.format("%4s %3s %3s\n",  "0", "1", "2");
				for (int rows = 0; rows < tttBoard.length; rows ++ ) 
				{
					System.out.print(rows);
					for (int col = 0; col < tttBoard[0].length; col ++)
					{
						System.out.print("|" + tttBoard[rows][col] + "");
					}

					System.out.println("|");
				}
		
			}
				else if (counter % 2 == 0)
				{
					System.out.println("Which column would you like to place your o?");
					column = sc.nextInt();
					System.out.println("Which row would you like to place your o?");
					row = sc.nextInt();

					tttBoard [row][column] = " o ";

					System.out.format("%4s %3s %3s\n",  "0", "1", "2");
					for (int rows = 0; rows < tttBoard.length; rows ++ ) 
					{
						System.out.print(rows);
						for (int col = 0; col < tttBoard[0].length; col ++) 
						{
							System.out.print("|" + tttBoard[rows][col] + "");
						}

						System.out.println("|");
					}

				}
			}

			if ()
			System.out.println("Thank you for playing!");


		
	}
}