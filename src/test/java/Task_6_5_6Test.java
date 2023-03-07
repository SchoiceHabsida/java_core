import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task_6_5_6Test {
    private Task_6_5_6.AsciiCharSequence array;

    @BeforeEach
    void setUp() {
        array = new Task_6_5_6.AsciiCharSequence(new byte[]{'H','a','b','s','i','d','a'});
    }

    @Test
    void testArrayToString() {
        assertEquals("Habsida", array.toString());
        assertNotEquals("K-pop", array.toString());
    }

    @Test
    void testArrayLength() {
        assertEquals(7, array.length());
        assertNotEquals(8, array.length());
        assertNotEquals(3, array.length());


    }

    @Test
    void testCharAtIndex() {
        assertEquals('s', array.charAt(3));
        assertEquals('a', array.charAt(6));
        assertEquals('H', array.charAt(0));
        assertNotEquals('k', array.charAt(0));

    }

    @Test
    void testSubsequence() {

        assertEquals("sid", (array.subSequence(3,6)).toString());
        assertEquals("Hab", (array.subSequence(0,3)).toString());
        assertNotEquals("Kpop", (array.subSequence(3,7)).toString());

    }
}