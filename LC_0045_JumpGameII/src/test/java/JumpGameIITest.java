import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {
    private final JumpGameII jumpGameII = new JumpGameII();

    @Test
    public void tes1() {
        assertEquals(2, jumpGameII.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void tes2() {
        assertEquals(2, jumpGameII.jump(new int[]{2, 3, 0, 1, 4}));
    }
}