package ru.ddc;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        solve(board, 0);
    }

    private boolean solve(char[][] board, int s) {
        if (s == 81) {
            return true;
        }

        int i = s / 9;
        int j = s % 9;

        if (board[i][j] == '.') {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(board, i, j, ch)) {
                    board[i][j] = ch;
                    if (solve(board, s + 1)) {
                        return true;
                    }
                    board[i][j] = '.';
                }
            }
        } else {
            return solve(board, s + 1);
        }

        return false;
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; ++i) {
            if (board[i][col] == c || board[row][i] == c || board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false;
            }
        }
        return true;
    }
}
