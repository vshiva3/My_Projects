import java.util.Scanner;

public class TicTacToe {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		char[][] board = { { '_', '_', '_' },
				{ '_', '_', '_' },
				{ '_', '_', '_' } };
		System.out.println("How are you feeling must be feeling high!. \nLet's play TicTacToe");

		printBoard(board);

		System.out.println("Enter the place where you want to print. \n{0,0} ......{2,2}. \nSelect your choice");

		/**
		 * This loop gives turns to each user to play the game and checks for winner
		 * by calling the checkWin function and declares the X as winner if returned
		 * value is 3. O as winner if value is -3.
		 * If each turn until 9 is over and no one wins then returns It as a tie.
		 */

		for (int i = 0; i < 9; i++) {

			if (i % 2 == 0) {
				System.out.println("TURN: X");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'X';
			} else if (i % 2 != 0) {
				System.out.println("TURN: O");
				int[] spot = askUser(board);
				board[spot[0]][spot[1]] = 'O';
			}
			printBoard(board);

			int score = checkWin(board);
			if (score == 3) {
				System.out.println("X wins");
				break;
			} else if (score == -3) {
				System.out.println("O wins");
				break;
			} else if (i == 8) {
				System.out.println("It's a tie");
			}

		}

	}

	/**
	 * function Name: askUser
	 * 
	 * @return type(int[])
	 * @param board type(char[][])
	 *              asks user for a spot on TicTacToe board to choose his choice of
	 *              his spot
	 *              if the spot is already taken it will return a msg that it's
	 *              taken try again
	 */

	public static int[] askUser(char[][] board) {

		int column = sc.nextInt();
		int row = sc.nextInt();

		while (board[column][row] != '_') {
			System.out.println("The spot is not empty. Try again!");
			column = sc.nextInt();
			row = sc.nextInt();

		}

		return new int[] { column, row };

	}

	/**
	 * function Name: printBoard
	 * 
	 * @param board type(char[][])
	 *              This functions prints the board in format
	 */

	public static void printBoard(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("\t" + board[i][j] + " ");
			}
			System.out.print("\n");

		}
		System.out.print("\n");
	}

	/**
	 * Function Name: checkWin
	 * 
	 * @param board (char[][])
	 * @return type(int)
	 *         It calls the functions checkRow, checkColumn, checkRightDia and
	 *         checkLeftDia
	 *         Once any one of them meets the criteria to win the game them it will
	 *         return the value.
	 */

	public static int checkWin(char[][] board) {
		int checkRows = checkRow(board);
		if (Math.abs(checkRows) == 3) {
			return checkRows;
		}
		int checkColumns = checkColumn(board);
		if (Math.abs(checkColumns) == 3) {
			return checkColumns;
		}
		int checkRighttDiag = checkRighttDia(board);
		if (Math.abs(checkRighttDiag) == 3) {
			return checkRighttDiag;
		}
		int checkLeftDiag = checkLeftDia(board);
		if (Math.abs(checkLeftDiag) == 3) {
			return checkLeftDiag;
		}
		return -1;
	}

	/**
	 * funtion checkRow
	 * 
	 * @param board type(char[][])
	 * @return type (int)
	 *         This function checks the row if any row is filled with same value to
	 *         declare winner
	 *         if yes returns the value
	 */

	public static int checkRow(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					count++;
				} else if (board[i][j] == 'O') {
					count--;
				}
			}
			if (Math.abs(count) == 3) {
				return count;
			} else {
				count = 0;
			}
		}
		return count;
	}

	/**
	 * funtion checkColumn
	 * 
	 * @param board type(char[][])
	 * @return type (int)
	 *         This function checks the column if any column is filled with same
	 *         value to declare winner
	 *         if yes returns the value
	 */

	public static int checkColumn(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[j][i] == 'X') {
					count++;
				} else if (board[j][i] == 'O') {
					count--;
				}
			}
			if (Math.abs(count) == 3) {
				return count;
			} else {
				count = 0;
			}
		}
		return count;
	}

	/**
	 * funtion checkLeftDia
	 * 
	 * @param board type(char[][])
	 * @return type (int)
	 *         This function checks the left diagonal if left diagonal is filled
	 *         with same value to declare winner
	 *         if yes returns the value
	 */

	public static int checkLeftDia(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] == 'X') {
				count++;
			} else if (board[i][i] == 'O') {
				count--;
			}
		}
		return count;
	}

	/**
	 * funtion checkRightDia
	 * 
	 * @param board type(char[][])
	 * @return type (int)
	 *         This function checks the Right diagonal if Right diagonal is filled
	 *         with same value to declare winner
	 *         if yes returns the value
	 */

	public static int checkRighttDia(char[][] board) {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[2 - i][i] == 'X') {
				count++;
			} else if (board[2 - i][i] == 'O') {
				count--;
			}
		}
		return count;
	}

}