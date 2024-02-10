package ru.ddc;

import java.util.Arrays;

class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null) {
            return null;
        }

        int listLength = lists.length;
        ListNode[] clearedList = Arrays.copyOf(lists, listLength);
        for (int i = 0, shift = 0; i < listLength; i++) {
            if (lists[i] == null) {
                clearedList = removeElement(clearedList, i - shift++);
            }
        }

        ListNode node = new ListNode();
        ListNode result = node;
        while (clearedList.length > 0) {
            int minIndex = getMinIndex(clearedList);
            node.next = clearedList[minIndex];
            node = node.next;
            if (clearedList[minIndex].next != null) {
                clearedList[minIndex] = clearedList[minIndex].next;
            } else {
                clearedList = removeElement(clearedList, minIndex);
            }
        }

        return result.next;
    }

    private ListNode[] removeElement(ListNode[] array, int index) {
        ListNode[] newArray = new ListNode[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    private int getMinIndex(ListNode[] lists) {
        int index = 0;
        int min = lists[index].val;
        for (int i = 1; i < lists.length; i++) {
            if (lists[i].val < min) {
                index = i;
                min = lists[i].val;
            }
        }
        return index;
    }
}
