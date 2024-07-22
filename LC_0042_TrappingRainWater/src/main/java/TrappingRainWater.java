public class TrappingRainWater {
    public int trap(int[] height) {
        int[] abc = new int[height.length];
        int max = 0;
        int res = 0;

        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            if (i == 0) {
                abc[i] = 0;
            } else {
                abc[i] = max - height[i];
            }
        }

        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            if (i != 0) {
                res += Math.min(max - height[i], abc[i]);
            }
        }

        return res;
    }
}
