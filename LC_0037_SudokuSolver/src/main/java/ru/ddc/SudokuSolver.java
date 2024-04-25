package ru.ddc;

import java.util.*;

public class SudokuSolver {
    private char[][] board;

    public void solveSudoku(char[][] board) {
        List<Set<Character>> sets = new ArrayList<>();
        this.board = board;
//        Set<Character>[][] arrOfSet = (HashSet<Character>[][]) new HashSet<?>[9][9];
//        fillArrOfSet(arrOfSet, board);
        fillSets(sets);
        showSets(sets);
        solve(new ArrayList<>(sets), 0);
//        showBoard(board);
//        showSet(arrOfSet);

//        solve(arrOfSet, board, 0);
    }

    private void solve(List<Set<Character>> sets, int i) {
        for (; i < 1; i++) {
            Set<Character> set = sets.get(i);
            if (set != null) {
                for (Character ch : set) {
                    if (checkForRemove(new ArrayList<>(sets), i, ch)) {
//                        solve(new ArrayList<>(sets), i);
                    }
                }
            }
        }
    }

    private boolean checkForRemove(List<Set<Character>> sets, int i, char ch) {
        System.out.println("checkForRemove i=" + i + " :: ch=" + ch);
        // remove from row
//        int y = i / 9, x = i % 9;
        for (int x = 0; x < 9; x++) {
            int i2 = i / 9 * 9 + x;
            if (i2 != i && sets.get(i2) != null) {
                System.out.println("remove " + i2 / 9 + ":" + i2 % 9);
                sets.get(i2).remove(ch);
                if (sets.get(i2).isEmpty()) {
                    return false;
                }
            }
        }
        // remove from column
        for (int y = 0; y < 9; y++) {
            int i2 = i % 9 + y * 9;
            if (i2 != i && sets.get(i2) != null) {
                System.out.println("remove " + i2 / 9 + ":" + i2 % 9);
                sets.get(i2).remove(ch);
                if (sets.get(i2).isEmpty()) {
                    return false;
                }
            }
        }
        // remove from sector
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                int i2 = i / 27 * 27 + (i % 9 / 3) * 3 + x + y * 9;
                if (i2 != i && sets.get(i2) != null) {
                    System.out.println("remove " + i2 / 9 + ":" + i2 % 9);
                    sets.get(i2).remove(ch);
                    if (sets.get(i2).isEmpty()) {
                        return false;
                    }
                }
            }
        }
        showSets(sets);
        return true;
    }

    private void showSets(List<Set<Character>> sets) {
        for (int i = 0; i < 81; i++) {
            System.out.print(sets.get(i));
            if ((i + 1) % 9 == 0) {
                System.out.println();
            }
        }
    }

    private void fillSets(List<Set<Character>> sets) {
        for (int i = 0; i < 81; i++) {
            int y = i / 9, x = i % 9;
            if (board[y][x] == '.') {
                Set<Character> set = new HashSet<>() {{
                    add('1');
                    add('2');
                    add('3');
                    add('4');
                    add('5');
                    add('6');
                    add('7');
                    add('8');
                    add('9');
                }};
                // minus row
                for (int l = 0; l < 9; l++) {
                    if (l != x) {
                        set.remove(board[y][l]);
                    }
                }
                // minus column
                for (int k = 0; k < 9; k++) {
                    if (k != y) {
                        set.remove(board[k][x]);
                    }
                }
                // minus sector
                for (int k = (y / 3) * 3; k < (y / 3 + 1) * 3; k++) {
                    for (int l = (x / 3) * 3; l < (x / 3 + 1) * 3; l++) {
                        if (k != y && l != x) {
                            set.remove(board[k][l]);
                        }
                    }
                }
                sets.add(set);
            } else {
                sets.add(null);
            }
        }
    }

//    private void solve(Set<Character>[][] arrOfSet, char[][] board, int x) {
//
//        for (; x < 81; x++) {
//            if (board[x / 9][x % 9] == '.') {
//                for (Character character : new HashSet<>(arrOfSet[x / 9][x % 9])) {
//                    if (removeFromSets(arrOfSet, x / 9, x % 9, character)) {
//                        addToBoard(board, x / 9, x % 9, character);
//                        solve(arrOfSet, board, ++x);
//                    }
//                }
//                board[x / 9][x % 9] = '.';
//                return;
//            }
//        }
//    }

    private void showSet(Set<Character>[][] arrOfSet) {
        for (int j = 0; j < 9; j++) {
            for (Set<Character> set : arrOfSet[j]) {
                set.forEach(System.out::print);
                System.out.print(",");
            }
            System.out.println();

        }
    }


    private void showBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println("-----------------");
    }

    private void fillArrOfSet(Set<Character>[][] arrOfSet, char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    Set<Character> set = getSet();
                    // minus chars from row
                    for (int k = 0; k < 9; k++) {
                        if (board[i][k] != '.') {
                            set.remove(board[i][k]);
//                            System.out.println("row :: point " + i + ":" + j + " -> minus " + i + ":" + k + " = " + board[i][k]);
                        }
                    }
                    // minus chars from column
                    for (int k = 0; k < 9; k++) {
                        if (board[k][j] != '.') {
                            set.remove(board[k][j]);
//                            System.out.println("col :: point " + i + ":" + j + " -> minus " + k + ":" + j + " = " + board[k][j]);
                        }
                    }
                    // minus chars from sub-box
                    for (int y = (i / 3) * 3; y < (i / 3 + 1) * 3; y++) {
                        for (int x = (j / 3) * 3; x < (j / 3 + 1) * 3; x++) {
                            if (y != i && x != j && board[y][x] != '.') {
                                set.remove(board[y][x]);
//                                System.out.println("sec :: point " + i + ":" + j + " -> minus " + y + ":" + x + " = " + board[y][x]);
                            }
                        }
                    }
                    arrOfSet[i][j] = set;
//                    System.out.println(set);
                } else {
                    arrOfSet[i][j] = new HashSet<>();
                }
            }
        }
    }


    private Set<Character> getSet() {
        return new HashSet<>() {{
            add('1');
            add('2');
            add('3');
            add('4');
            add('5');
            add('6');
            add('7');
            add('8');
            add('9');
        }};
    }

    private void showRow(Set<Character>[][] arrOfSet, int i) {
        for (Set<Character> set : arrOfSet[i]) {
            set.forEach(System.out::print);
            System.out.print(",");
        }
        System.out.println();
    }

    private void addToBoard(char[][] board, int i, int j, char ch) {
        board[i][j] = ch;
    }

    private boolean removeFromSets(Set<Character>[][] arrOfSet, int i, int j, char ch) {
        // remove from row
        for (int k = 0; k < 9; k++) {
            if (k != j && removeFromSet(arrOfSet, i, k, ch)) {
                return false;
            }
        }
        // remove from column
        for (int k = 0; k < 9; k++) {
            if (k != i && removeFromSet(arrOfSet, k, j, ch)) {
                return false;
            }
        }
        // remove from sub-box
        for (int y = (i / 3) * 3; y < (i / 3 + 1) * 3; y++) {
            for (int x = (j / 3) * 3; x < (j / 3 + 1) * 3; x++) {
                if (y != i && x != j && removeFromSet(arrOfSet, y, x, ch)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean removeFromSet(Set<Character>[][] arrOfSet, int i, int j, char ch) {
        if (!arrOfSet[i][j].isEmpty()) {
            arrOfSet[i][j].remove(ch);
            return arrOfSet[i][j].isEmpty();
        } else {
            return false;
        }
    }
}
