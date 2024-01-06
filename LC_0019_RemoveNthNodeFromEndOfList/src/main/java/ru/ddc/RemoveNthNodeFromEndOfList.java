package ru.ddc;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        temp = head;
        int currp = 1;
        while (currp != size - n) {
            temp = temp.next;
            currp++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
