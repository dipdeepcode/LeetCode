package ru.ddc;

import java.util.*;

public class SubstringWithConcatenationOfAllWords {

    public List<Integer> findSubstring(String s, String[] words) {

        HashMap<String, Integer> counts = new HashMap<>() {{
            for (String word : words) merge(word, 1, Integer::sum);
        }};

        List<Integer> result = new ArrayList<>();
        int numOfWords = words.length;
        int wordLength = words[0].length();
        for (int i = 0; i <= s.length() - numOfWords * wordLength; i++)
            abc:{
                Map<String, Integer> countsCopy = (Map<String, Integer>) counts.clone();
                for (int j = 0; j < numOfWords; j++) {
                    String word = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                    if (countsCopy.merge(word, -1, Integer::sum) < 0) {
                        break abc;
                    }
                }
                result.add(i);
            }
        return result;
    }
}
