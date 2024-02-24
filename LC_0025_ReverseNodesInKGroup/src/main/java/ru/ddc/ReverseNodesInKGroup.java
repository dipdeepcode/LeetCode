package ru.ddc;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode startNode = dummy;
        while (startNode != null) {
            startNode = reverseKNodes(startNode, k);
        }
        return dummy.next;
    }
    public ListNode reverseKNodes(ListNode startNode, int k) {
        ListNode groupHeadNode = startNode.next;
        ListNode currentNode = startNode.next;
        ListNode previousNode = startNode.next;
        for (int i = 0; i < k; i++) {
            if (previousNode == null) {
                return null;
            } else {
                previousNode = previousNode.next;
            }
        }
        ListNode nextNode;

        for (int j = 0; j < k; j++) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        startNode.next = previousNode;

        return groupHeadNode;
    }
}
