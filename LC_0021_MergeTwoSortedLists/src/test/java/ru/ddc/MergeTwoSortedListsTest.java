package ru.ddc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

    @Test
    public void test1() {
        // Arrange
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(3);
        ListNode node1_3 = new ListNode(5);
        node1_1.next = node1_2;
        node1_2.next = node1_3;

        ListNode node2_1 = new ListNode(2);
        ListNode node2_2 = new ListNode(4);
        ListNode node2_3 = new ListNode(6);
        node2_1.next = node2_2;
        node2_2.next = node2_3;

        // Act
        ListNode node = mergeTwoSortedLists.mergeTwoLists(node1_1, node2_1);

        // Assert
        int[] expected = new int[] {1, 2, 3, 4, 5, 6};
        int[] actual = new int[expected.length];
        int cnt = 0;
        while (node != null) {
            actual[cnt++] = node.val;
            node = node.next;
        }
        assertArrayEquals(expected, actual);
    }
    @Test
    public void test2() {
        // Arrange
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_3 = new ListNode(4);
        node1_1.next = node1_2;
        node1_2.next = node1_3;

        ListNode node2_1 = new ListNode(1);
        ListNode node2_2 = new ListNode(3);
        ListNode node2_3 = new ListNode(4);
        node2_1.next = node2_2;
        node2_2.next = node2_3;

        // Act
        ListNode node = mergeTwoSortedLists.mergeTwoLists(node1_1, node2_1);

        // Assert
        int[] expected = new int[] {1, 1, 2, 3, 4, 4};
        int[] actual = new int[expected.length];
        int cnt = 0;
        while (node != null) {
            actual[cnt++] = node.val;
            node = node.next;
        }
        assertArrayEquals(expected, actual);
    }
}