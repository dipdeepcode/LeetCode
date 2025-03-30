import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    private final Permutations perm = new Permutations();

    @Test
    public void test1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 2, 3));
        expected.add(List.of(2, 1, 3));
        expected.add(List.of(3, 1, 2));
        expected.add(List.of(1, 3, 2));
        expected.add(List.of(2, 3, 1));
        expected.add(List.of(3, 2, 1));
        List<List<Integer>> actual = perm.permute(new int[]{1, 2, 3});
        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }
}