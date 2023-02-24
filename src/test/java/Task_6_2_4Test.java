import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task_6_2_4Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void setStandardOut() {
        System.setOut(standardOut);
    }

    @Test
    void test_getKoreanName() {
        assertEquals("월요일", Task_6_2_4.Day.MONDAY.getKoreanName());
        assertEquals("화요일", Task_6_2_4.Day.TUESDAY.getKoreanName());
        assertEquals("수요일", Task_6_2_4.Day.WEDNESDAY.getKoreanName());
        assertEquals("목요일", Task_6_2_4.Day.THURSDAY.getKoreanName());
        assertEquals("금요일", Task_6_2_4.Day.FRIDAY.getKoreanName());
        assertEquals("토요일", Task_6_2_4.Day.SATURDAY.getKoreanName());
        assertEquals("일요일", Task_6_2_4.Day.SUNDAY.getKoreanName());
    }
    @Test
    void test_getIsWeekend() {
        assertEquals(false, Task_6_2_4.Day.MONDAY.isWeekend());
        assertEquals(false, Task_6_2_4.Day.TUESDAY.isWeekend());
        assertEquals(false, Task_6_2_4.Day.WEDNESDAY.isWeekend());
        assertEquals(false, Task_6_2_4.Day.THURSDAY.isWeekend());
        assertEquals(false, Task_6_2_4.Day.FRIDAY.isWeekend());
        assertEquals(true, Task_6_2_4.Day.SATURDAY.isWeekend());
        assertEquals(true, Task_6_2_4.Day.SUNDAY.isWeekend());
    }
}

