package ru.ddc;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        if (result.length % 2 == 1) {
            return result[result.length / 2];
        } else {
            return  (result[result.length / 2 - 1] + result[result.length / 2]) / 2.0;
        }
    }
}
