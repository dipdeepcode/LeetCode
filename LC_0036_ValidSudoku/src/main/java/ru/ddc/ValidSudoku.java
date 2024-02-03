package ru.ddc;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                for (int z = i / 3 * 3; z < i / 3 * 3 + 3; z++) {
                    for (int y = j / 3 * 3; y < j / 3 * 3 + 3; y++) {
                        if (board[z][y] == board[i][j] && z != i && y != j) return false;
                    }
                }

                for (int k = j + 1; k < 9; k++) {
                    if (board[i][j] == board[i][k]) return false;
                }

                for (int k = i + 1; k < 9; k++) {
                    if (board[i][j] == board[k][j]) return false;
                }
            }
        }
        return true;
    }
}
