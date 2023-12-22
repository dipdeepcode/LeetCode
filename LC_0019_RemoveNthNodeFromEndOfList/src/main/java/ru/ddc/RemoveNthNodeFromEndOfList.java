package ru.ddc;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        return null;
    }

    private void findNext(ListNode node, int index) {
        System.out.println(node);
        if (node.next != null) {
            findNext(node.next, ++index);
        }
    }
}