package ru.ddc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    private final GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    public void test1() {
        List<String> strings = generateParentheses.generateParenthesis(4);
        System.out.println(strings);
        System.out.println(strings.size());
    }

}
