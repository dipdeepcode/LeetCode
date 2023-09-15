package ru.ddc;

import java.util.*;

public class TreeSum {
    private List<List<Integer>> res;

    public List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList<>() {
            @Override
            public int size() {
                init();
                return res.size();
            }

            @Override
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }

            private void init() {
                if (res != null) {
                    return;
                }

                Set<List<Integer>> result = new HashSet<>();
                Arrays.sort(nums);
                for (int i = 0; i < nums.length - 2; i++) {
                    if (i == 0 || nums[i] != nums[i - 1]) {
                        int l = i + 1;
                        int r = nums.length - 1;
                        while (l < r) {
                            if (nums[i] + nums[l] + nums[r] > 0) {
                                r = decreaseR(l, r);
                            } else if (nums[i] + nums[l] + nums[r] < 0) {
                                l = increaseL(l, r);
                            } else {
                                result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                                r = decreaseR(l, r);
                                l = increaseL(l, r);
                            }
                        }
                    }
                }
                res = result.stream().toList();
            }

            private int increaseL(int l, int r) {
                l++;
                while (nums[l] == nums[l - 1] && l < r) {
                    l++;
                }
                return l;
            }

            private int decreaseR(int l, int r) {
                r--;
                while (nums[r] == nums[r + 1] && l < r) {
                    r--;
                }
                return r;
            }
        };
    }
}
