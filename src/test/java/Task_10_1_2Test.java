import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task_10_1_2Test {

    @Test
    void testUnaryOperator() {
        Task_10_1_2 uo = new Task_10_1_2();
        assertEquals(4,uo.sqrt().apply(2));
        assertEquals(36,uo.sqrt().apply(6));
        assertEquals(324,uo.sqrt().apply(18));
        assertEquals(625,uo.sqrt().apply(25));
    }

    @Test
    void testUnaryOperatorWrongInput() {
        Task_10_1_2 uo = new Task_10_1_2();
        assertNotEquals(110,uo.sqrt().apply(10));
        assertNotEquals(36,uo.sqrt().apply(5));
        assertNotEquals(154,uo.sqrt().apply(18));
        assertNotEquals(742,uo.sqrt().apply(54));
    }
}
