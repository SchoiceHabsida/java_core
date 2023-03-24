import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_10_2_8Test {
    @Test
    public void testFactorialWithPositiveInput() {
        assertEquals(BigInteger.valueOf(1), Task_10_2_8.factorial(0));
        assertEquals(BigInteger.valueOf(1), Task_10_2_8.factorial(1));
        assertEquals(BigInteger.valueOf(2), Task_10_2_8.factorial(2));
        assertEquals(BigInteger.valueOf(6), Task_10_2_8.factorial(3));
        assertEquals(BigInteger.valueOf(24), Task_10_2_8.factorial(4));
        assertEquals(BigInteger.valueOf(120), Task_10_2_8.factorial(5));
    }
}
