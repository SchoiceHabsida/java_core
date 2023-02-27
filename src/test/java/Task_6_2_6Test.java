import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class Task_6_2_6Test {

    @Test
    void testGetReAndIm() {
        Task_6_2_6.ComplexNumber complexNumber = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        assertEquals(2.321, complexNumber.getRe());
        assertEquals(5.612, complexNumber.getIm());

        complexNumber = new Task_6_2_6.ComplexNumber(5.415, 9.612);
        assertEquals(5.415, complexNumber.getRe());
        assertEquals(9.612, complexNumber.getIm());
    }

    @Test
    void testGetReAndImFalseCase() {
        Task_6_2_6.ComplexNumber complexNumber = new Task_6_2_6.ComplexNumber(6.124, 2.154);
        assertNotEquals(2.321, complexNumber.getRe());
        assertNotEquals(5.612, complexNumber.getIm());

    }

    @Test
    void testComplexNumberIsEqual() {
        Task_6_2_6.ComplexNumber actual = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        Task_6_2_6.ComplexNumber compareTo = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        assertTrue(actual.equals(compareTo));

        actual = new Task_6_2_6.ComplexNumber(10.451, 42.154);
        compareTo = new Task_6_2_6.ComplexNumber(10.451, 42.154);
        assertTrue(actual.equals(compareTo));

    }

    @Test
    void testComplexNumberIsNotEqual() {
        Task_6_2_6.ComplexNumber actual = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        Task_6_2_6.ComplexNumber compareTo = new Task_6_2_6.ComplexNumber(2.32, 5.611);
        assertFalse(actual.equals(compareTo));

        actual = new Task_6_2_6.ComplexNumber(6.51, 7.42);
        compareTo = new Task_6_2_6.ComplexNumber(5.16, 4.15);
        assertFalse(actual.equals(compareTo));
    }

    @Test
    void testHashCodeIsEqual() {
        Task_6_2_6.ComplexNumber actual = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        Task_6_2_6.ComplexNumber compareTo = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        assertEquals(actual.hashCode(), compareTo.hashCode());
    }

    @Test
    void testHashCodeIsNotUseConstantEqual() {
        Task_6_2_6.ComplexNumber actual = new Task_6_2_6.ComplexNumber(2.32, 5.612);
        Task_6_2_6.ComplexNumber compareTo = new Task_6_2_6.ComplexNumber(2.321, 5.612);

        assertFalse(actual.equals(compareTo));
        assertNotEquals(actual.hashCode(), compareTo.hashCode());
    }

    @Test
    void testHashCodeIsNotCreatedWithIDE() {
        Task_6_2_6.ComplexNumber complexNumber = new Task_6_2_6.ComplexNumber(2.321, 5.612);
        int hashcode = Objects.hash(complexNumber);
        assertNotEquals(hashcode, complexNumber.hashCode());
    }

}

