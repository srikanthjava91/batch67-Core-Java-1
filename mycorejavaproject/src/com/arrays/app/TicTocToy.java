package com.arrays.app;

import java.util.Scanner;

public class TicTocToy {
	static char[][] c = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';
	static Scanner sc = new Scanner(System.in);

	static void printboard() {
		System.out.println("-------------");
		for (char[] c1 : c) {
			System.out.print("| ");
			for (char c2 : c1) {
				System.out.print(c2 + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}

	}

	public static void main(String[] args) {

		boolean b = true;
		while (b) {

			printboard();
			System.out.println("Enter a row value");
			int row = sc.nextInt();
			System.out.println("Enter a col value");
			int col = sc.nextInt();
			if (row < 0 || row > 2 || col < 0 || col > 2 || c[row][col] != ' ') {
				System.out.println("invalid move!!!!!!!!!!");
				System.out.println("continue again!!!!!!!!!");
				continue;
			}
			c[row][col] = player;
			if (iswin()) {

				System.out.println("you won the game!!!!!!!!!:" + player);
				break;

			}
			if (isdraw()) {
				System.out.println("draw the game!!!!!!!!");
				break;
			}

			player = player == 'X' ? 'O' : 'X';
		}
	}

	static boolean isdraw() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (c[i][j] == ' ') {
					return false;
				}
			}
		}

		return true;
	}

	static boolean iswin() {
		// for rows
		for (int i = 0; i <= 2; i++) {
			if (c[i][0] == player && c[i][1] == player && c[i][2] == player) {
				return true;
			}
		}
		// for coloumns
		for (int i = 0; i <= 2; i++) {
			if (c[0][i] == player && c[1][i] == player && c[2][i] == player) {
				return true;
			}
		}
		if (c[0][0] == player && c[1][1] == player && c[2][2] == player) {
			return true;
		}
		if (c[0][2] == player && c[1][1] == player && c[2][0] == player) {
			return true;
		}

		return false;
	}

}
