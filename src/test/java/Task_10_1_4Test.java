import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

public class Task_10_1_4Test {

    @Test
    void testTernaryOperator() {
        Task_10_1_4 ob = new Task_10_1_4();
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ob.ternaryOperator(condition, ifTrue, ifFalse);
        assertEquals(5,safeStringLength.apply("Value"));
        assertEquals(0,safeStringLength.apply(null));
    }

    @Test
    void testTernaryOperatorLessThan() {
        Task_10_1_4 ob = new Task_10_1_4();
        Predicate<Integer> condition = i -> (i < 18);
        Function<Object, Boolean> ifTrue = obj -> true;
        Function<Object, Boolean> ifFalse = obj -> false;
        Function<Integer, Boolean> safeStringLength = ob.ternaryOperator(condition, ifTrue, ifFalse);
        assertTrue(safeStringLength.apply(5));
        assertFalse(safeStringLength.apply(20));
    }

    @Test
    void testTernaryOperatorIfContains() {
        Task_10_1_4 ob = new Task_10_1_4();
        Predicate<String> condition = p -> p.contains("A");
        Function<Object, Boolean> ifTrue = obj -> true;
        Function<Object, Boolean> ifFalse = obj -> false;
        Function<String, Boolean> safeStringLength = ob.ternaryOperator(condition, ifTrue, ifFalse);
        assertTrue(safeStringLength.apply("MARVEL"));
        assertFalse(safeStringLength.apply("COMICS"));
    }

    @Test
    public void testTernaryOperator2() {
        Task_10_1_4 ob = new Task_10_1_4();
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;

        Function<String, Integer> safeStringLength = ob.ternaryOperator(condition, ifTrue, ifFalse);

        assertEquals(Integer.valueOf(0), safeStringLength.apply(null));
        assertEquals(Integer.valueOf(0), safeStringLength.apply(""));
        assertEquals(Integer.valueOf(3), safeStringLength.apply("abc"));
        assertEquals(Integer.valueOf(5), safeStringLength.apply("hello"));
    }
}
