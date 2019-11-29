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
		
		System.out.println("You will have 9 turns together, make sure to last through all of them and beat your opponent!\n");
		
		String tttBoard [][] = { {" _ ", " _ ", " _ "}, {" _ ", " _ ", " _ "}, {" _ ", " _ ", " _ "} };
		int column = 0;
		int row = 0;
		int xWin = 0;
		int oWin = 0;

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
				
				if (tttBoard [row][column] == (" x ") || tttBoard [row][column] == (" o "))
					System.out.println("sorry no cheaters in this game");
				else
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
					
					if (tttBoard [row][column] == (" x ") || tttBoard [row][column] == (" o "))
							System.out.println("sorry no cheaters in this game");
					else
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
		
			System.out.println("Thank you for playing!");
			
			//defining win structures
			if 	//defining x will win with 3 in a row for rows
				(tttBoard[0][0].equals(" x ") && tttBoard[0][1].equals(" x ") && tttBoard[0][2].equals(" x ") ||
				tttBoard[1][0].equals(" x ") && tttBoard[1][1].equals(" x ") && tttBoard[1][2].equals(" x ") ||
				tttBoard[2][0].equals(" x ") && tttBoard[2][1].equals(" x ") && tttBoard[2][2].equals(" x ") ||
				//defining x will win with 3 in a row for columns
				tttBoard[0][0].equals(" x ") && tttBoard[1][0].equals(" x ") && tttBoard[2][0].equals(" x ") ||
				tttBoard[0][1].equals(" x ") && tttBoard[1][1].equals(" x ") && tttBoard[2][1].equals(" x ") ||
				tttBoard[0][2].equals(" x ") && tttBoard[1][2].equals(" x ") && tttBoard[2][2].equals(" x ") ||
				//defining X will win with 3 in a row for diagonal
				tttBoard[0][0].equals(" x ") && tttBoard[1][1].equals(" x ") && tttBoard[2][2].equals(" x ") ||
				tttBoard[0][2].equals(" x ") && tttBoard[1][1].equals(" x ") && tttBoard[0][2].equals(" x "))

			
				xWin = 1;
			
			if  //defining o will win with 3 in a row for rows
					(tttBoard[0][0].equals(" o ") && tttBoard[0][1].equals(" o ") && tttBoard[0][2].equals(" o ") ||
					tttBoard[1][0].equals(" o ") && tttBoard[1][1].equals(" o ") && tttBoard[1][2].equals(" o ") ||
					tttBoard[2][0].equals(" o ") && tttBoard[2][1].equals(" o ") && tttBoard[2][2].equals(" o ") ||
					//defining o will win with 3 in a row for columns
					tttBoard[0][0].equals(" o ") && tttBoard[1][0].equals(" o ") && tttBoard[2][0].equals(" o ") ||
					tttBoard[0][1].equals(" o ") && tttBoard[1][1].equals(" o ") && tttBoard[2][1].equals(" o ") ||
					tttBoard[0][2].equals(" o ") && tttBoard[1][2].equals(" o ") && tttBoard[2][2].equals(" o ")||
					//defining o will win with 3 in a row for diagonal
					tttBoard[0][0].equals(" o ") && tttBoard[1][1].equals(" o ") && tttBoard[2][2].equals(" o ") ||
					tttBoard[0][2].equals(" o ") && tttBoard[1][1].equals(" o ") && tttBoard[0][2].equals(" o "))
	
					
				oWin = 1;
			
			//informs user of results of the game
			if (oWin == 1 && xWin == 0)
			{
			System.out.println("o wins this game!");	
			}
			else if (xWin == 1 && oWin == 0)	
			{
				System.out.println("o wins this game!");	
			}
			else if (xWin == 1 && oWin == 1)
			{
				System.out.println("You both tied, maybe you should try again!");
			}
			
	}
}