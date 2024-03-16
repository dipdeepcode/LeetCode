package ru.ddc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {

        int wordsLength = words[0].length();
        String[] strings = s.split("(?<=\\G.{" + wordsLength + "})");
        System.out.println(s);
        System.out.println(Arrays.toString(strings));

        Cell[][] dp = new Cell[words.length][strings.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < strings.length; j++) {
                if (i == 0) {
                    dp[i][j] = new Cell(words, -1);
                    if (dp[i][j].removeElement(strings[j])) {
                        dp[i][j].setIndex(j);
                    }
                } else {
                    if (dp[i - 1][j - 1] != null && dp[i - 1][j - 1].removeElement(strings[j])) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return Arrays.stream(dp[words.length - 1])
                .filter(cell -> cell != null && cell.getIndex() >= 0)
                .map(cell -> cell.getIndex() * wordsLength)
                .toList();
    }

    private static class Cell {
        List<String> elements;
        int index;

        public Cell(String[] words, int index) {
            this.elements = new ArrayList<>(Arrays.asList(words));
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public boolean removeElement(String element) {
            return elements.remove(element);
        }

        @Override
        public String toString() {
            return elements.toString() + index;
        }
    }
}
