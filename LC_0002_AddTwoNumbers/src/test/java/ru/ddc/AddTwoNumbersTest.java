package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    public void Test1() {
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = l1_1.next = new ListNode(4);
        ListNode l1_3 = l1_2.next = new ListNode(3);

        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = l2_1.next = new ListNode(6);
        ListNode l2_3 = l2_2.next = new ListNode(4);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1_1, l2_1);

        assertEquals(7, result.val);
        result = result.next;
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(8, result.val);
    }

    @Test
    public void Test2() {
        ListNode l1_1 = new ListNode(0);

        ListNode l2_1 = new ListNode(0);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1_1, l2_1);

        assertEquals(0, result.val);
    }

    @Test
    public void Test3() {
        ListNode l1_1 = new ListNode(9);
        ListNode l1_2 = l1_1.next = new ListNode(9);
        ListNode l1_3 = l1_2.next = new ListNode(9);
        ListNode l1_4 = l1_3.next = new ListNode(9);
        ListNode l1_5 = l1_4.next = new ListNode(9);
        ListNode l1_6 = l1_5.next = new ListNode(9);
        ListNode l1_7 = l1_6.next = new ListNode(9);

        ListNode l2_1 = new ListNode(9);
        ListNode l2_2 = l2_1.next = new ListNode(9);
        ListNode l2_3 = l2_2.next = new ListNode(9);
        ListNode l2_4 = l2_3.next = new ListNode(9);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1_1, l2_1);

        assertEquals(8, result.val);
        result = result.next;
        assertEquals(9, result.val);
        result = result.next;
        assertEquals(9, result.val);
        result = result.next;
        assertEquals(9, result.val);
        result = result.next;
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(0, result.val);
        result = result.next;
        assertEquals(1, result.val);
    }
}