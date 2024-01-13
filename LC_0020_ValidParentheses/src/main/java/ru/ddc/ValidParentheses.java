package ru.ddc;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Integer> list1 = new ArrayDeque<>();
        Deque<Integer> list2 = new ArrayDeque<>();
        Deque<Integer> list3 = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> list1.add(i);
                case '{' -> list2.add(i);
                case '[' -> list3.add(i);
                case ')' -> {
                    if (!list1.isEmpty()
                            && ((list2.isEmpty()) || list2.getLast() < list1.getLast())
                            && ((list3.isEmpty()) || list3.getLast() < list1.getLast())) {
                        list1.removeLast();
                    } else return false;
                }
                case '}' -> {
                    if (!list2.isEmpty()
                            && ((list1.isEmpty()) || list1.getLast() < list2.getLast())
                            && ((list3.isEmpty()) || list3.getLast() < list2.getLast())) {
                        list2.removeLast();
                    } else return false;
                }
                case ']' -> {
                    if (!list3.isEmpty()
                            && ((list1.isEmpty()) || list1.getLast() < list3.getLast())
                            && ((list2.isEmpty()) || list2.getLast() < list3.getLast())) {
                        list3.removeLast();
                    } else return false;
                }
            }
        }
        return list1.isEmpty() && list2.isEmpty() && list3.isEmpty();
    }
}
