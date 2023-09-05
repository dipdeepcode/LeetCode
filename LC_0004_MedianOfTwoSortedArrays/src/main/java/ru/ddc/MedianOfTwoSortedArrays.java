package ru.ddc;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0, i2 = 0;
        int current = 0, previous = 0;
        while ((i1 + i2) <= (nums1.length + nums2.length) / 2) {
            int a1 = i1 < nums1.length ? nums1[i1] : Integer.MAX_VALUE;
            int a2 = i2 < nums2.length ? nums2[i2] : Integer.MAX_VALUE;
            previous = current;
            current = Math.min(a1, a2);
            i1 += a1 < a2 ? 1 : 0;
            i2 += a1 < a2 ? 0 : 1;
        }
        return (nums1.length + nums2.length) % 2 == 0 ? (current + previous) / 2.0 : current;
    }
}
