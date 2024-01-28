package ru.ddc;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        generateParenthesisAns(n, n);
        return list;
    }

    private void generateParenthesisAns(int open, int close) {
        if (open == 0 && close == 0) {
            list.add(sb.toString());
            return;
        }
        if (open != 0) {
            sb.append("(");
            generateParenthesisAns(open - 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close > open) {
            sb.append(")");
            generateParenthesisAns(open, close - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
