package com.yan.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = { ".87654321".toCharArray(), "2........".toCharArray(), "3........".toCharArray(), "4........".toCharArray(), "5........".toCharArray(), "6........".toCharArray(), "7........".toCharArray(), "8........".toCharArray(), "9........".toCharArray() };
		char[][] board2 = { "..5.....6".toCharArray(), "....14...".toCharArray(), ".........".toCharArray(), ".....92..".toCharArray(), "5....2...".toCharArray(), ".......3.".toCharArray(), "...54....".toCharArray(), "3.....42.".toCharArray(), "...27.6..".toCharArray() };
		char[][] board3 = { "....5..1.".toCharArray(), ".4.3.....".toCharArray(), ".....3..1".toCharArray(), "8......2.".toCharArray(), "..2.7....".toCharArray(), ".15......".toCharArray(), ".....2...".toCharArray(), ".2.9.....".toCharArray(), "..4......".toCharArray() };
		print(board3);
		System.out.println(isValidSudoku(board3));

	}

	private static boolean isValidSudoku(char[][] board) {
		Set<Character> rowSet = new HashSet<Character>();
		Set<Character> columnSet = new HashSet<Character>();
		for (int i = 0; i < board.length; i++) {
			// 行
			char[] row = board[i];

			// 列
			char[] column = new char[board.length];
			for (int j = 0; j < column.length; j++) {
				column[j] = board[j][i];
			}

			for (int k = 0; k < board.length; k++) {
				if (row[k] != '.') {
					if (rowSet.contains(row[k]))
						return false;
					else
						rowSet.add(row[k]);

				}
				if (column[k] != '.') {
					if (columnSet.contains(column[k]))
						return false;
					else
						columnSet.add(column[k]);
				}
			}
			rowSet.clear();
			columnSet.clear();
		}

		Set<Character> xSet = new HashSet<Character>();

		for (int i = 0; i < board.length / 3; i++) {
			for (int j = 0; j < board.length / 3; j++) {
				int x = 3 * i + 1, y = 3 * j + 1;
				if (board[x][y] != '.')
					xSet.add(board[x][y]);
				if (board[x - 1][y - 1] != '.') {
					if (xSet.contains(board[x - 1][y - 1]))
						return false;
					else
						xSet.add(board[x - 1][y - 1]);
				}
				if (board[x - 1][y] != '.') {
					if (xSet.contains(board[x - 1][y]))
						return false;
					else
						xSet.add(board[x - 1][y]);
				}
				if (board[x - 1][y + 1] != '.') {
					if (xSet.contains(board[x - 1][y + 1]))
						return false;
					else
						xSet.add(board[x - 1][y + 1]);
				}
				if (board[x][y - 1] != '.') {
					if (xSet.contains(board[x][y - 1]))
						return false;
					else
						xSet.add(board[x][y - 1]);
				}
				if (board[x][y + 1] != '.') {
					if (xSet.contains(board[x][y + 1]))
						return false;
					else
						xSet.add(board[x][y + 1]);
				}
				if (board[x + 1][y - 1] != '.') {
					if (xSet.contains(board[x + 1][y - 1]))
						return false;
					else
						xSet.add(board[x + 1][y - 1]);
				}
				if (board[x + 1][y] != '.') {
					if (xSet.contains(board[x + 1][y]))
						return false;
					else
						xSet.add(board[x + 1][y]);
				}
				if (board[x + 1][y + 1] != '.') {
					if (xSet.contains(board[x + 1][y + 1]))
						return false;
				}

				xSet.clear();
			}

		}

		return true;
	}

	private static boolean isValidSudok2(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < board[i].length; j++) {
				if (!isValid(set, board[i][j]))
					return false;
			}
		}
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < board[i].length; j++) {
				if (!isValid(set, board[j][i]))
					return false;
			}
		}
		for (int offset_y = 0; offset_y <= 6; offset_y += 3) {
			for (int offset_x = 0; offset_x <= 6; offset_x += 3) {
				HashSet<Character> set = new HashSet<Character>();
				for (int i = 0; i <= 2; i++) {
					for (int j = 0; j <= 2; j++) {
						if (!isValid(set, board[i + offset_x][j + offset_y]))
							return false;
					}
				}
			}
		}
		return true;
	}

	private static void print(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean isValid(HashSet<Character> set, char c) {
		if (c != '.' && !set.contains(c))
			set.add(c);
		else if (c != '.' && set.contains(c))
			return false;
		return true;
	}
}
