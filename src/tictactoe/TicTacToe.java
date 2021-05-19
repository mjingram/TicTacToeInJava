package tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		TicTacToeBoard board = new TicTacToeBoard();
		Scanner input = new Scanner(System.in);

		System.out.println("Would you like to be Xs or Os? ");
		board.player1 = input.next().toUpperCase();
		input.nextLine();

		if (!(board.player1.equals("X") || board.player1.equals("O"))) {
			System.out.println("Invalid Input. Exiting...");
			System.exit(1);
		}

		if (board.player1.equals("X")) {
			board.player2 = "O";
		}
		if (board.player1.equals("O")) {
			board.player2 = "X";
		}
		while (board.continueGame) {
			// Player 1 Choose a Place to Play
			board.currentPlayer = "Player 1";
			System.out.printf("Turn %d: \n", (board.turn + 1));
			System.out.println();
			System.out.println("Player 1 pick a row and column (between 1 and 3): ");

			// Get Row and Check Range
			System.out.println("Row: ");
			int move1row = input.nextInt();
			input.nextLine();
			move1row = checkRange(move1row, input);
			move1row -= 1; // reindex to 0

			// Get Column and Check Range
			System.out.println("Col: ");
			int move1col = input.nextInt();
			input.nextLine();
			move1col = checkRange(move1col, input);
			move1col -= 1; // reindex to 0

			// Player One take a turn then display the board:
			board.playerOneTurn(move1row, move1col);
			board.displayBoard();
			System.out.println();

			// Check if draw
			if (board.turn == 9) {
				System.out.println("Max turns reached. Its a Draw!!!");
				System.exit(0);
			}
			// Check if X Won
			if (board.gameOverX(board.turn)) {
				System.out.println(board.currentPlayer + " has Won on turn #" + board.turn + "!!!");
				System.out.println("Would you like to play again? ");
				String continueAnswer = input.next();
				input.nextLine();
				if (continueAnswer.equalsIgnoreCase("no")) {
					board.continueGame = false;
					break;
				} else if (continueAnswer.equalsIgnoreCase("yes")) {
					board.turn = 0;
					board.clearBoard();
					continue;
				} else {
					System.out.println("Invalid Input. Exiting...");
					System.exit(1);
				}

			}

			// Check if O Won
			if (board.gameOverO(board.turn)) {
				System.out.println(board.currentPlayer + " has Won on turn #" + board.turn + "!!!");
				System.out.println("Would you like to play again? ");
				String continueAnswer = input.next();
				input.nextLine();
				if (continueAnswer.equalsIgnoreCase("no")) {
					board.continueGame = false;
					break;
				}else if (continueAnswer.equalsIgnoreCase("yes")) {
					board.turn = 0;
					board.clearBoard();
					continue;
				} else {
					System.out.println("Invalid Input. Exiting...");
					System.exit(1);
				}
			}

			// Player 2 Choose a place to play
			board.currentPlayer = "Player 2";
			System.out.printf("Turn %d: \n", (board.turn + 1));
			System.out.println();
			System.out.println("Player 2 pick a row and column (between 1 and 3): ");
			System.out.println("Row: ");

			// Get Row and Check Range
			int move2row = input.nextInt();
			input.nextLine();
			move2row = checkRange(move2row, input);
			move2row -= 1;

			// Get Column and check Range:
			System.out.println("Col: ");
			int move2col = input.nextInt();
			input.nextLine();
			move2col = checkRange(move2col, input);
			move2col -= 1;

			// Player 2 Turn
			board.playerTwoTurn(move2row, move2col);
			board.displayBoard();
			System.out.println();

			// Check if draw
			if (board.turn == 9) {
				System.out.println("Max turns reached. Its a Draw!!!");
				System.exit(0);
			}

			// Check if X Won
			if (board.gameOverX(board.turn)) {
				System.out.println(board.currentPlayer + " has Won on turn #" + board.turn + "!!!");
				System.out.println("Would you like to play again? ");
				String continueAnswer = input.next();
				input.nextLine();
				if (continueAnswer.equalsIgnoreCase("no")) {
					board.continueGame = false;
					break;
				}else if (continueAnswer.equalsIgnoreCase("yes")) {
					board.turn = 0;
					board.clearBoard();
					continue;
				} else {
					System.out.println("Invalid Input. Exiting...");
					System.exit(1);
				}
			}

			// Check if O Won
			if (board.gameOverO(board.turn)) {
				System.out.println(board.currentPlayer + " has Won on turn #" + board.turn + "!!!");
				System.out.println("Would you like to play again? ");
				String continueAnswer = input.next();
				input.nextLine();
				if (continueAnswer.equalsIgnoreCase("no")) {
					board.continueGame = false;
					break;
				}else if (continueAnswer.equalsIgnoreCase("yes")) {
					board.turn = 0;
					board.clearBoard();
					continue;
				} else {
					System.out.println("Invalid Input. Exiting...");
					System.exit(1);
				}
			}


		}
		System.out.println("Thanks for playing!");
		input.close();
		System.exit(0);
	}

	// Method to change range of row and columns;
	public static int checkRange(int moveRow, Scanner scan) {
		int row = moveRow;
		if (row > 3 || row < 1) {
			System.out.println("Invalid Number! Try Again:");
			int moveNewRow = scan.nextInt();
			scan.nextLine();
			// Recursive Call to Check Range again
			moveNewRow = checkRange(moveNewRow, scan);
			return moveNewRow;
		} else {
			return row;
		}
	}

}
