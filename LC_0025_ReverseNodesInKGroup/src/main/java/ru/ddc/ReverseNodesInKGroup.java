package ru.ddc;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode result = null;
        ListNode oldGroupHead = null;

        ListNode previousNode = null;
        ListNode currentNode = null;
        ListNode nextNode = null;

        ListNode startNodeInGroup = head;
        for (int group = 0; hasFullGroupFromStartNode(startNodeInGroup, k); group++) {


            previousNode = null;
            currentNode = startNodeInGroup;
            nextNode = currentNode.next;
            for (int i = 0; i < k; i++) {
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
                nextNode = currentNode == null ? null : currentNode.next;
            }
            if (group == 0) {
                result = previousNode;
            }

            if (oldGroupHead != null) {
                oldGroupHead.next = previousNode;
            }

            oldGroupHead = startNodeInGroup;
            startNodeInGroup = currentNode;

        }
        if (oldGroupHead != null) {
            oldGroupHead.next = currentNode;
        }

        return result;
    }

    private boolean hasFullGroupFromStartNode(ListNode node, int k) {
        if (node != null && k > 1) {
            return hasFullGroupFromStartNode(node.next, k - 1);
        } else {
            return node != null;
        }
    }
}
