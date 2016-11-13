/*
@author Cathy
@version 1.0
RunTime:32ms

题目：Valid Sudoku(Difficulty: Easy)
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

解题思路：
1、对行、列、九宫格分别进行判断。运用的数据类型为HashSet(HashSet里面不能存放重复值，主要用到其add(),contains(),clear()方法)。
2、行和列分别进行两次for循环就行。九宫格需要进行三次for循环。一个数独中有九个九宫格，分别编号0-8(i)，每个九宫格右上顶点坐标为（i / 3 * 3,i % 3 * 3），根据前面坐标取出每个九宫格中的数据。

注意事项：
1、每次set判断完。需要清空。
2、数独中每个九宫格的选取方法。
*/
public class Solution{
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> set = new HashSet<Character>();
		// 判断行；
		for (int i = 0; i < 9; i++) {
			set.clear();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					continue;
				} else {
					if (!set.contains(board[i][j])) {
						set.add(board[i][j]);
					} else {
						return false;
					}
				}
			}
		}
		// 判断列；
		for (int i = 0; i < 9; i++) {
			set.clear();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] == '.') {
					continue;
				} else {
					if (!set.contains(board[j][i])) {
						set.add(board[j][i]);
					} else {
						return false;
					}
				}
			}
		}
		// 判断九宫格
		for (int i = 0; i < 9; i++) {
			set.clear();
			for (int j = i / 3 * 3; j < i / 3 * 3 + 3; j++) {
				for (int k = i % 3 * 3; k < i % 3 * 3 + 3; k++) {
					if (board[j][k] == '.') {
						continue;
					} else {
						if (!set.contains(board[j][k])) {
							set.add(board[j][k]);
						} else {
							return false;
						}
					}
				}
			}
		}

		return true;

	}
}