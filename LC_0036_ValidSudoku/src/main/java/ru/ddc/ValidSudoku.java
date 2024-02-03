package ru.ddc;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> x_characters = new HashSet<>();
            Set<Character> y_characters = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !x_characters.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !y_characters.add(board[j][i])) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Set<Character> characters = new HashSet<>();
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int l = j * 3; l < j * 3 + 3; l++) {
                        if (board[k][l] != '.' && !characters.add(board[k][l])) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
