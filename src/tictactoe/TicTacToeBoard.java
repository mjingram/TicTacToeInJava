package tictactoe;

public class TicTacToeBoard {

	public char upperLeft = '*';
	public char upperCenter = '*';
	public char upperRight = '*';
	public char midRight = '*';
	public char midCenter = '*';
	public char midLeft = '*';
	public char bottomLeft = '*';
	public char bottomCenter = '*';
	public char bottomRight = '*';

	public int turn = 0;
	public String currentPlayer;

	public String player1;
	public String player2;
	public boolean continueGame = true;

	public void displayBoard() {
		System.out.print(upperLeft + " | " + upperCenter + " | " + upperRight + "\n");
		System.out.println("----------");
		System.out.print(midLeft + " | " + midCenter + " | " + midRight + "\n");
		System.out.println("----------");
		System.out.print(bottomLeft + " | " + bottomCenter + " | " + bottomRight + "\n");

	}

	public void playerOneTurn(int move1row, int move1col) {

		if (move1row == 0 && move1col == 0) {
			if (this.upperLeft != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.upperLeft = this.player1.charAt(0);
		} else if (move1row == 0 && move1col == 1) {
			if (this.upperCenter != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.upperCenter = this.player1.charAt(0);
		} else if (move1row == 0 && move1col == 2) {
			if (this.upperRight != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.upperRight = this.player1.charAt(0);
		} else if (move1row == 1 && move1col == 0) {
			if (this.midLeft != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.midLeft = this.player1.charAt(0);
		} else if (move1row == 1 && move1col == 1) {
			if (this.midCenter != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.midCenter = this.player1.charAt(0);
		} else if (move1row == 1 && move1col == 2) {
			if (this.midRight != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.midRight = this.player1.charAt(0);
		} else if (move1row == 2 && move1col == 0) {
			if (this.bottomLeft != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.bottomLeft = this.player1.charAt(0);
		} else if (move1row == 2 && move1col == 1) {
			if (this.bottomCenter != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.bottomCenter = this.player1.charAt(0);
		} else if (move1row == 2 && move1col == 2) {
			if (this.bottomRight != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.bottomRight = this.player1.charAt(0);
		}
		this.turn++;

	}// End Method

	public void playerTwoTurn(int move2row, int move2col) {
		if (move2row == 0 && move2col == 0) {
			if (this.upperLeft != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.upperLeft = this.player2.charAt(0);
		} else if (move2row == 0 && move2col == 1) {
			if (this.upperCenter != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.upperCenter = this.player2.charAt(0);
		} else if (move2row == 0 && move2col == 2) {
			if (this.upperRight != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.upperRight = this.player2.charAt(0);
		} else if (move2row == 1 && move2col == 0) {
			if (this.midLeft != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.midLeft = this.player2.charAt(0);
		} else if (move2row == 1 && move2col == 1) {
			if (this.midCenter != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.midCenter = this.player2.charAt(0);
		} else if (move2row == 1 && move2col == 2) {
			if (this.midRight != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.midRight = this.player2.charAt(0);
		} else if (move2row == 2 && move2col == 0) {
			if (this.bottomLeft != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.bottomLeft = this.player2.charAt(0);
		} else if (move2row == 2 && move2col == 1) {
			if (this.bottomCenter != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.bottomCenter = this.player2.charAt(0);
		} else if (move2row == 2 && move2col == 2) {
			if (this.bottomRight != '*') {
				System.out.println("That Space is filled. Lose your turn.");
				return;
			}
			this.bottomRight = this.player2.charAt(0);
		}
		this.turn++;
	}// End Method

	public boolean gameOverX(int turn) {
		boolean gameOver = false;
		if (turn == 9) {
			gameOver = true;
			return gameOver;
		}
		// Check if X Won:
		else if (this.upperLeft == 'X' && this.upperCenter == 'X' && this.upperRight == 'X') {
			gameOver = true;
			return gameOver;
		} else if (this.midLeft == 'X' && this.midCenter == 'X' && this.midRight == 'X') {
			gameOver = true;
			return gameOver;
		} else if (this.bottomLeft == 'X' && this.bottomCenter == 'X' && this.bottomRight == 'X') {
			gameOver = true;
			return gameOver;
		} else if (this.upperLeft == 'X' && this.midLeft == 'X' && this.bottomLeft == 'X') {
			gameOver = true;
			return gameOver;
		} else if (this.upperCenter == 'X' && this.midCenter == 'X' && this.bottomCenter == 'X') {
			gameOver = true;
			return gameOver;
		} else if (this.upperRight == 'X' && this.midRight == 'X' && this.bottomRight == 'X') {
			gameOver = true;
			return gameOver;
		}

		else if (this.upperLeft == 'X' && this.midCenter == 'X' && this.bottomRight == 'X') {
			gameOver = true;
			return gameOver;
		} else if (this.upperRight == 'X' && this.midCenter == 'X' && this.bottomLeft == 'X') {
			gameOver = true;
			return gameOver;
		} else {
			return gameOver;
		}
	}

	// Check if O won:

	public boolean gameOverO(int turn) {
		boolean gameOver = false;
		if (turn == 9) {
			gameOver = true;
			return gameOver;
		} else if (this.upperLeft == 'O' && this.upperCenter == 'O' && this.upperRight == 'O') {
			gameOver = true;
			return gameOver;
		} else if (this.midLeft == 'O' && this.midCenter == 'O' && this.midRight == 'O') {
			gameOver = true;
			return gameOver;
		} else if (this.bottomLeft == 'O' && this.bottomCenter == 'O' && this.bottomRight == 'O') {
			gameOver = true;
			return gameOver;
		} else if (this.upperLeft == 'O' && this.midLeft == 'O' && this.bottomLeft == 'O') {
			gameOver = true;
			return gameOver;
		} else if (this.upperCenter == 'O' && this.midCenter == 'O' && this.bottomCenter == 'O') {
			gameOver = true;
			return gameOver;
		} else if (this.upperRight == 'O' && this.midRight == 'O' && this.bottomRight == 'O') {
			gameOver = true;
			return gameOver;
		}

		else if (this.upperLeft == 'O' && this.midCenter == 'O' && this.bottomRight == 'O') {
			gameOver = true;
			return gameOver;
		} else if (this.upperRight == 'O' && this.midCenter == 'O' && this.bottomLeft == 'O') {
			gameOver = true;
			return gameOver;
		} else {
			return gameOver;
		}

	}
	public void clearBoard() {
		this.upperLeft = '*';
		this.upperCenter = '*';
		this.upperRight = '*';
		this.midRight = '*';
		this.midCenter = '*';
		this.midLeft = '*';
		this.bottomLeft = '*';
		this.bottomCenter = '*';
		this.bottomRight = '*';
	}
}
