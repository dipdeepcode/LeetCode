package ru.ddc;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    private final Map<String, List<String>> map = new HashMap<>();
    private final Map<String, Integer> map2 = new HashMap<>();

    {
        map.put("2", new ArrayList<>(Arrays.asList("a", "b", "c")));
        map.put("3", new ArrayList<>(Arrays.asList("d", "e", "f")));
        map.put("4", new ArrayList<>(Arrays.asList("g", "h", "i")));
        map.put("5", new ArrayList<>(Arrays.asList("j", "k", "l")));
        map.put("6", new ArrayList<>(Arrays.asList("m", "n", "o")));
        map.put("7", new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
        map.put("8", new ArrayList<>(Arrays.asList("t", "u", "v")));
        map.put("9", new ArrayList<>(Arrays.asList("w", "x", "y", "z")));

        map2.put("2", 3);
        map2.put("3", 3);
        map2.put("4", 3);
        map2.put("5", 3);
        map2.put("6", 3);
        map2.put("7", 4);
        map2.put("8", 3);
        map2.put("9", 4);
    }

    public List<String> letterCombinations(String digits) {

        List<Integer> list1 = new ArrayList<>();

        if (digits.isBlank()) {
            return new ArrayList<>();
        }

        int resultLength = 1;
        for (int i = 0; i < digits.length(); i++) {
            int length = map2.get(Character.toString(digits.charAt(i)));
            list1.add(length);
            resultLength *= length;
        }

        int[][] ints = new int[list1.size()][2];
        for (int i = list1.size() - 1; i >= 0; i--) {
            if (i != (list1.size() - 1)) {
                ints[i][0] = ints[i + 1][0] * ints[i + 1][1];
            } else {
                ints[list1.size() - 1][0] = 1;
            }
            ints[i][1] = list1.get(i);
        }

        StringBuilder[] stringBuilders = new StringBuilder[resultLength];
        for (int i = 0; i < resultLength; i++) {
            stringBuilders[i] = new StringBuilder();
        }

        for (int i = 0; i < resultLength; i++) {
            for (int j = 0; j < ints.length; j++) {
                stringBuilders[i].append(map.get(Character.toString(digits.charAt(j))).get(i / ints[j][0] % ints[j][1]));
            }
        }

        List<String> result = new ArrayList<>();
        for (StringBuilder sb : stringBuilders) {
            result.add(sb.toString());
        }

        return result;
    }
}
