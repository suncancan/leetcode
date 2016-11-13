/*
@author Cathy
@version 1.0
RunTime:32ms

��Ŀ��Valid Sudoku(Difficulty: Easy)
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

����˼·��
1�����С��С��Ź���ֱ�����жϡ����õ���������ΪHashSet(HashSet���治�ܴ���ظ�ֵ����Ҫ�õ���add(),contains(),clear()����)��
2���к��зֱ��������forѭ�����С��Ź�����Ҫ��������forѭ����һ���������оŸ��Ź��񣬷ֱ���0-8(i)��ÿ���Ź������϶�������Ϊ��i / 3 * 3,i % 3 * 3��������ǰ������ȡ��ÿ���Ź����е����ݡ�

ע�����
1��ÿ��set�ж��ꡣ��Ҫ��ա�
2��������ÿ���Ź����ѡȡ������
*/
public class Solution{
	public boolean isValidSudoku(char[][] board) {
		HashSet<Character> set = new HashSet<Character>();
		// �ж��У�
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
		// �ж��У�
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
		// �жϾŹ���
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