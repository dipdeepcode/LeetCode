package ru.ddc;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode resultHead, currentNode1, currentNode2, node;
        if (list1.val < list2.val) {
            resultHead = list1;
            currentNode1 = list1.next;
            currentNode2 = list2;
        } else {
            resultHead = list2;
            currentNode1 = list1;
            currentNode2 = list2.next;
        }
        node = resultHead;

        while (true) {
            if (currentNode1 == null) {
                node.next = currentNode2;
                break;
            } else if (currentNode2 == null) {
                node.next = currentNode1;
                break;
            }
            if (currentNode1.val < currentNode2.val) {
                node.next = currentNode1;
                currentNode1 = currentNode1.next;
            } else {
                node.next = currentNode2;
                currentNode2 = currentNode2.next;
            }
            node = node.next;
        }
        return resultHead;
    }
}
