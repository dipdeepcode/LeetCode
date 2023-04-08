package ru.ddc;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Node[] arr = new Node[length];
        for (int i = 0; i < length; i++) {
            int key = target - nums[i];
            int index = Math.abs(key % length);
            if (arr[index] != null) {
                return new int[]{arr[index].value, i};
            }
            arr[Math.abs(nums[i] % length)] = new Node(nums[i], i);
        }
        return null;
    }

    private static class Node {
        public int key;
        public int value;

        public Node(int k, int v) {
            key = k;
            value = v;
        }
    }
}
