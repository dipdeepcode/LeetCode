package ru.ddc;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveNthNodeFromEndOfList {
    private final Deque<ListNode> deque = new LinkedList<>();

    public ListNode removeNthFromEnd(ListNode head, int n) {
        initDeque(n);

        int listSize = 1;
        ListNode currNode = head;
        while (currNode.next != null) {
            addNode(currNode);
            currNode = currNode.next;
            listSize++;
        }

        if (listSize == n) {
            if (listSize == 1) {
                head = null;
            } else {
                addNode(null);
                head = deque.getFirst().next;
            }
        } else if (n == 1) {
            deque.getFirst().next = null;
        } else {
            deque.getFirst().next = deque.getFirst().next.next;
        }

        return head;
    }

    private void initDeque(int n) {
        for (int i = 0; i < n; i++) {
            deque.add(null);
        }
    }

    private void addNode(ListNode node) {
        deque.removeFirst();
        deque.addLast(node);
    }
}