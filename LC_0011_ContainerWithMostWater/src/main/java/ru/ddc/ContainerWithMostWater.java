package ru.ddc;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int leftPos = 0;
        int rightPos = height.length - 1;
        int maxArea = 0;
        while (leftPos < rightPos) {
            int minHeight = Math.min(height[leftPos], height[rightPos]);
            maxArea = Math.max(maxArea, minHeight * (rightPos - leftPos));
            while (leftPos < rightPos && height[leftPos] <= minHeight) {
                leftPos++;
            }
            while (leftPos < rightPos && height[rightPos] <= minHeight) {
                rightPos--;
            }
        }
        System.gc();
        return maxArea;
    }
}
