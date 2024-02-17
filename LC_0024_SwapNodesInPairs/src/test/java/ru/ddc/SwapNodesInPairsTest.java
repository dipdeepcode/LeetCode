package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    private final SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();

    @Test
    public void test1() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node = swapNodesInPairs.swapPairs(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test2() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node = swapNodesInPairs.swapPairs(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test3() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);

        ListNode node = swapNodesInPairs.swapPairs(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test4() {
        ListNode node1 = new ListNode(1);

        ListNode node = swapNodesInPairs.swapPairs(node1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test5() {
        ListNode node = swapNodesInPairs.swapPairs(null);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}