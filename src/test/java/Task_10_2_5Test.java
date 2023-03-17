import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Task_10_2_5Test {

    private Task_10_2_5 task_10_2_5 = new Task_10_2_5();
    @Test
    public void testFindMinMaxWithIntegers() {
        Stream<Integer> stream = Stream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        Comparator<Integer> order = Comparator.naturalOrder();
        BiConsumer<Integer, Integer> minMaxConsumer = (min, max) -> {
            assertEquals(Integer.valueOf(1), min);
            assertEquals(Integer.valueOf(9), max);
        };
        task_10_2_5.findMinMax(stream, order, minMaxConsumer);
    }

    @Test
    public void testFindMinMaxWithStrings() {
        Stream<String> stream = Stream.of("foo", "bar", "baz", "qux", "quux", "corge");
        Comparator<String> order = Comparator.reverseOrder();
        BiConsumer<String, String> minMaxConsumer = (min, max) -> {
            assertEquals("qux", min);
            assertEquals("bar", max);
        };
        task_10_2_5.findMinMax(stream, order, minMaxConsumer);
    }

    @Test
    public void testFindMinMaxWithEmptyStream() {
        Stream<Integer> stream = Stream.empty();
        Comparator<Integer> order = Comparator.naturalOrder();
        BiConsumer<Integer, Integer> minMaxConsumer = (min, max) -> {
            assertNull(min);
            assertNull(max);
        };
        task_10_2_5.findMinMax(stream, order, minMaxConsumer);

        Stream<String> stream2 = Stream.empty();
        Comparator<String> order2 = Comparator.naturalOrder();
        BiConsumer<String, String> minMaxConsumer2 = (min, max) -> {
            assertNull(min);
            assertNull(max);
        };
        task_10_2_5.findMinMax(stream2, order2, minMaxConsumer2);
    }

}
