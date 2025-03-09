import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    @Test
    public void test1() {
        String num1 = "438";
        String num2 = "597";
        String result = new MultiplyStrings().multiply(num1, num2);
        assertEquals(result, "261486");
    }

    @Test
    public void test2() {
        String result = new MultiplyStrings().multiply("38", "597");
        assertEquals(result, "22686");
    }

    @Test
    public void test3() {
        String result = new MultiplyStrings().multiply("438", "97");
        assertEquals(result, "42486");
    }

    @Test
    public void test4() {
        String result = new MultiplyStrings().multiply("2", "3");
        assertEquals(result, "6");
    }

    @Test
    public void test5() {
        String result = new MultiplyStrings().multiply("123", "456");
        assertEquals(result, "56088");
    }

    @Test
    public void test6() {
        String result = new MultiplyStrings().multiply("9133", "0");
        assertEquals(result, "0");
    }
}