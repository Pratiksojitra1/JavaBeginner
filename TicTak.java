package testing;

import java.util.Scanner;

public class TicTak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter player1 name");
		String p1 = sc.nextLine();
		System.out.println("enter player2 name");
		String p2 = sc.nextLine();
		System.out.println("start");

		char[][] board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}

		}
		boolean isplayer1 = true;

		boolean gameend = false;
		while (!gameend) {
			drawBoard(board);
			char symbol = ' ';
			if (isplayer1) {
				symbol = 'x';
			} else {
				symbol = '0';
			}
			if (isplayer1) {
				System.out.println(p1);
			} else {
				System.out.println(p2);
			}
			int col, row = 0;
			while (true) {
				System.out.println("enter a row number(0,1 or2)");
				row = sc.nextInt();
				System.out.println("enter a col number(0,1 or2)");
				col = sc.nextInt();
				if (row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("enter valid row and col number");
				} else if (board[row][col] != '-') {
					System.out.println(" someone already made a move");
				} else {
					break;
				}
			}
			board[row][col] = symbol;
			drawBoard(board);
			if (won(board) == 'x') {
				System.out.println(p1 + "won");
				gameend = true;
			} else if (won(board) == '0') {
				System.out.println(p2 + "won");
				gameend = true;
			} else {
				if (tie(board)) {
					System.out.println("it's a tie");
					gameend = true;
				} else {
					isplayer1 = !isplayer1;
				}
			}
		}
	}

	public static void drawBoard(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
	}

	public static char won(char[][] board) {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
			for (int j = 0; j < 3; j++) {
				if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
					return board[0][j];
				}
				if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
					return board[0][0];
				}
				if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
					return board[2][0];
				}
			}
		}
		return '-';
	}

	public static boolean tie(char[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}