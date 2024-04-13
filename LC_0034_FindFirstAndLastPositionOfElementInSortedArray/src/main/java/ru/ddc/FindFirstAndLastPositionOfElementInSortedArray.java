package ru.ddc;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums.length == 0) {
            return result;
        }

        int left = 0;
        int right = nums.length - 1;
        while (true) {
            int mid = left + (right - left) / 2;
            if (nums[left] == target) {
                result[0] = left;
                break;
            } else if (left == right) {
                return result;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        right = nums.length - 1;
        while (true) {
            int mid = left + (right - left) / 2 + (right - left) % 2;
            if (nums[right] == target) {
                result[1] = right;
                return result;
            } else if (left == right) {
                return result;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
    }
}
