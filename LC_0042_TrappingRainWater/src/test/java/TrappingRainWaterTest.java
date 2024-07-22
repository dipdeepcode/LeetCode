import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    private final TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    public void test1() {
        assertEquals(6, trappingRainWater.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    public void test2() {
        assertEquals(9, trappingRainWater.trap(new int[] {4,2,0,3,2,5}));
    }
}