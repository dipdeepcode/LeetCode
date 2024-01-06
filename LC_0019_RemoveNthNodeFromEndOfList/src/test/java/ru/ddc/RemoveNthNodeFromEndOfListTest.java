package ru.ddc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    public void test1() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        node4.next = node5;
        ListNode node3 = new ListNode(3);
        node3.next = node4;
        ListNode node2 = new ListNode(2);
        node2.next = node3;
        ListNode node1 = new ListNode(1);
        node1.next = node2;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(node1, 2);

        System.out.println(head);
        while (head.next != null) {
            head = head.next;
            System.out.println(head);
        }
    }

    @Test
    public void test3() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node1.next = node2;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(node1, 1);

        System.out.println(head);
        while (head.next != null) {
            head = head.next;
            System.out.println(head);
        }
    }

    @Test
    public void test2() {
        ListNode node1 = new ListNode(1);

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(node1, 1);

        System.out.println(head);
        while (head.next != null) {
            head = head.next;
            System.out.println(head);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 2, 1})
    public void test4(int n) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node2.next = node3;
        ListNode node1 = new ListNode(1);
        node1.next = node2;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(node1, n);

        System.out.println(head);
        while (head != null && head.next != null) {
            head = head.next;
            System.out.println(head);
        }
        System.out.println();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 1})
    public void test5(int n) {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        node1.next = node2;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(node1, n);

        System.out.println(head);
        while (head != null && head.next != null) {
            head = head.next;
            System.out.println(head);
        }
        System.out.println();
    }


    @ParameterizedTest
    @ValueSource(ints = {5, 4, 3, 2, 1})
    public void test6(int n) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4);
        node4.next = node5;
        ListNode node3 = new ListNode(3);
        node3.next = node4;
        ListNode node2 = new ListNode(2);
        node2.next = node3;
        ListNode node1 = new ListNode(1);
        node1.next = node2;

        ListNode head = removeNthNodeFromEndOfList.removeNthFromEnd(node1, n);

        System.out.println(head);
        while (head != null && head.next != null) {
            head = head.next;
            System.out.println(head);
        }
        System.out.println();
    }
}