import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {
    private final FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

    @Test
    public void test1() {
        assertEquals(2, firstMissingPositive.firstMissingPositive(new int[] {3, 4, -1, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, firstMissingPositive.firstMissingPositive(new int[] {1,2,0}));
    }

    @Test
    public void test3() {
        assertEquals(1, firstMissingPositive.firstMissingPositive(new int[] {7,8,9,11,12}));
    }
}