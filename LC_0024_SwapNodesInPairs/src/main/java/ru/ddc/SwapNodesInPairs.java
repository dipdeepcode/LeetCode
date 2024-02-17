package ru.ddc;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = head.next;
        ListNode node = head;
        while (node != null && node.next != null) {
            ListNode node1 = node;
            ListNode node2 = node1.next;
            ListNode node3 = node2.next;
            node2.next = node1;
            if (node3 == null) {
                node1.next = null;
            } else if (node3.next == null) {
                node1.next = node3;
            } else {
                node1.next = node3.next;
            }
            node = node3;
        }
        return result;
    }
}
