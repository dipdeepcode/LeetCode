package ru.ddc;

import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {

    private final MergeKSortedLists mergekSortedLists = new MergeKSortedLists();

    @Test
    public void test1() {
        ListNode listNode1_3 = new ListNode(5);
        ListNode listNode1_2 = new ListNode(4, listNode1_3);
        ListNode listNode1_1 = new ListNode(1, listNode1_2);

        ListNode listNode2_3 = new ListNode(4);
        ListNode listNode2_2 = new ListNode(3, listNode2_3);
        ListNode listNode2_1 = new ListNode(1, listNode2_2);

        ListNode listNode3_2 = new ListNode(6);
        ListNode listNode3_1 = new ListNode(2, listNode3_2);

        ListNode[] lists = new ListNode[] {listNode1_1, listNode2_1, listNode3_1};

        ListNode node = mergekSortedLists.mergeKLists(lists);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test2() {
        ListNode node = mergekSortedLists.mergeKLists(null);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test3() {
        ListNode node = mergekSortedLists.mergeKLists(new ListNode[]{});
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    @Test
    public void test4() {
        ListNode node = mergekSortedLists.mergeKLists(new ListNode[]{null});
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


    @Test
    public void test5() {
        ListNode node = mergekSortedLists.mergeKLists(new ListNode[]{null, null});
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}