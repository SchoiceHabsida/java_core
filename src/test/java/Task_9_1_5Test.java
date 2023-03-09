import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_9_1_5Test {

    @Test
    void testPair() {
        Task_9_1_5.Pair<Integer, String> pair = Task_9_1_5.Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();
        assertEquals(1,i);
        assertEquals("hello",s);
    }

    @Test
    void testPairEqualsMethod() {
        Task_9_1_5.Pair<Integer, String> pair1 = Task_9_1_5.Pair.of(1, "hello");
        assertTrue(pair1 instanceof Task_9_1_5.Pair<Integer, String>);

        Task_9_1_5.Pair<Integer, String> pair2 = Task_9_1_5.Pair.of(1, "hello");
        assertTrue(pair1.equals(pair2));

        assertEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    void testPairConstructor() {
        Class<? extends Task_9_1_5.Pair> pairClass = Task_9_1_5.Pair.of(1, "hello").getClass();

        assertEquals("[]", Arrays.toString(pairClass.getConstructors()));
    }
}