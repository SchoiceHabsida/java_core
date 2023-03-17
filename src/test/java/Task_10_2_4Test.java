import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class Task_10_2_4Test {

    @Test
    void testPseudoRandomStream() {
        int seed = 0;

        IntStream pseudoRandomStream = Task_10_2_4.pseudoRandomStream(seed);

        assertNotNull(pseudoRandomStream);

        int[] actualArray = pseudoRandomStream.limit(10).toArray();
        int[] expectedArray = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        assertArrayEquals(expectedArray, actualArray);

        seed = 5;
        pseudoRandomStream = Task_10_2_4.pseudoRandomStream(seed);

        assertNotNull(pseudoRandomStream);

        actualArray = pseudoRandomStream.limit(5).toArray();
        expectedArray = new int[]{5, 2, 0, 0, 0};

        assertArrayEquals(expectedArray, actualArray);

        seed = 8;
        pseudoRandomStream = Task_10_2_4.pseudoRandomStream(seed);

        assertNotNull(pseudoRandomStream);

        actualArray = pseudoRandomStream.limit(7).toArray();
        expectedArray = new int[]{8, 6, 3, 0, 0, 0, 0};

        assertArrayEquals(expectedArray, actualArray);

        seed = 14;
        pseudoRandomStream = Task_10_2_4.pseudoRandomStream(seed);

        assertNotNull(pseudoRandomStream);

        actualArray = pseudoRandomStream.limit(20).toArray();
        expectedArray = new int[]{14, 19, 36, 129, 664, 89, 792, 726, 707, 984, 825, 62, 384, 745, 502, 200, 0, 0, 0, 0};

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testPseudoRandomStream2() {
        int seed = 13;
        int expectedCount = 10;

        IntStream pseudoRandomStream = Task_10_2_4.pseudoRandomStream(seed);

        assertNotNull(pseudoRandomStream);

        int[] actualArray = pseudoRandomStream.limit(expectedCount).toArray();

        int[] expectedArray = new int[]{13, 16, 25, 62, 384, 745, 502, 200, 0, 0};

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testPseudoRandomStreamWithNegativeSeed() {
        int seed = -13;
        int expectedCount = 5;

        IntStream pseudoRandomStream = Task_10_2_4.pseudoRandomStream(seed);

        assertNotNull(pseudoRandomStream);

        int[] actualArray = pseudoRandomStream.limit(expectedCount).toArray();

        int[] expectedArray = new int[]{-13, 16, 25, 62, 384};

        assertArrayEquals(expectedArray, actualArray);
    }

}
