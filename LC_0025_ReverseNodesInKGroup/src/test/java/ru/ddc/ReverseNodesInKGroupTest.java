package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesInKGroupTest {

    private final ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

    @Test
    public void test1() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = reverseNodesInKGroup.reverseKGroup(node1, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void test2() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = reverseNodesInKGroup.reverseKGroup(node1, 3);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void test3() {
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode result = reverseNodesInKGroup.reverseKGroup(node1, 3);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}