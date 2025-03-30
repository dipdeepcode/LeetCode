import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        generate(nums.length, nums);
        return result;
    }

    private void generate(int n, int[] nums) {
        if (n == 1) {
            result.add(Arrays.stream(nums).boxed().toList());
        } else {
            for (int i = 0; i < n - 1; i++) {
                generate(n - 1, nums);
                if (n % 2 == 0) {
                    swap(nums, i, n - 1);
                } else {
                    swap(nums, 0, n - 1);
                }
            }
            generate(n - 1, nums);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
