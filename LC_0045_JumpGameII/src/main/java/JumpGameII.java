public class JumpGameII {
    private int minCnt = Integer.MAX_VALUE;

    public int jump(int[] nums) {
        jump1(nums, 0, 0);
        return minCnt;
    }

    private void jump1(int[] nums, int i, int cnt) {
        if (i >= nums.length - 1) {
            minCnt = Math.min(minCnt, cnt);
        } else {
            for (int j = 1; j <= nums[i]; j++) {
                jump1(nums, i + j, cnt + 1);
            }
        }
    }
}
