import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_10_1_3Test {
    @Test
    void testNumberGenerator() {

        assertTrue(Task_10_1_3.getGenerator().cond(1));
        assertTrue(Task_10_1_3.getGenerator().cond(18));
        assertTrue(Task_10_1_3.getGenerator().cond(154));
        assertTrue(Task_10_1_3.getGenerator().cond(8465));
        assertTrue(Task_10_1_3.getGenerator().cond(15400));
    }

    @Test
    void testNumberGeneratorWithNegativeValue() {
        assertFalse(Task_10_1_3.getGenerator().cond(0));
        assertFalse(Task_10_1_3.getGenerator().cond(-6));
        assertFalse(Task_10_1_3.getGenerator().cond(-24));
        assertFalse(Task_10_1_3.getGenerator().cond(-562));
        assertFalse(Task_10_1_3.getGenerator().cond(-4561));
    }

    @Test
    public void testGetGenerator() {
        Task_10_1_3.NumberGenerator<? super Number> generator = Task_10_1_3.getGenerator();
        assertNotNull(generator);
    }

    @Test
    public void testCondPositive() {
        Task_10_1_3.NumberGenerator<? super Number> generator = Task_10_1_3.getGenerator();
        assertTrue(generator.cond(1));
    }

    @Test
    public void testCondZero() {
        Task_10_1_3.NumberGenerator<? super Number> generator = Task_10_1_3.getGenerator();
        assertFalse(generator.cond(0));
    }

    @Test
    public void testCondNegative() {
        Task_10_1_3.NumberGenerator<? super Number> generator = Task_10_1_3.getGenerator();
        assertFalse(generator.cond(-1));
    }
}
