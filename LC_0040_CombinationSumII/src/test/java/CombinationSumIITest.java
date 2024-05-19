import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIITest {
    private final CombinationSumII combinationSumII = new CombinationSumII();

    @Test
    public void test1() {
        List<List<Integer>> result = combinationSumII.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        result.forEach(System.out::println);
    }

}