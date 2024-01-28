package ru.ddc;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generateParenthesisAns("", n, n);
        return list;
    }

    private void generateParenthesisAns(String p, int open, int close) {
        if (open == 0 && close == 0) {
            list.add(p);
            return;
        }
        if (open != 0) {
            generateParenthesisAns(p + "(", open - 1, close);
        }
        if (close > open) {
            generateParenthesisAns(p + ")", open, close - 1);
        }
    }
}
