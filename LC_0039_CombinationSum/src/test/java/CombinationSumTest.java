import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private final CombinationSum combinationSum = new CombinationSum();

    @Test
    public void test1() {
        List<List<Integer>> list = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        list.forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<List<Integer>> list = combinationSum.combinationSum(new int[]{2, 3, 5}, 8);
        list.forEach(System.out::println);
    }
}