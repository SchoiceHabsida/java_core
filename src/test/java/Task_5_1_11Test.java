import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class Task_5_1_11Test {

    @Test
    void test_isWeekend() {
        String str = "Tuesday";
        assertFalse(Task_5_1_11.isWeekend(str));
        str = "Monday";
        assertFalse(Task_5_1_11.isWeekend(str));
        str = "Wednesday";
        assertFalse(Task_5_1_11.isWeekend(str));
        str = "Sunday";
        assertTrue(Task_5_1_11.isWeekend(str));
        str = "Thursday";
        assertFalse(Task_5_1_11.isWeekend(str));
        str = "Saturday";
        assertTrue(Task_5_1_11.isWeekend(str));
        str = "Friday";
        assertFalse(Task_5_1_11.isWeekend(str));
    }

    @Test
    void test_weekendCount() {
        String[] str = {"Tuesday", "Monday", "Friday"};
        assertEquals(0, Task_5_1_11.weekendCount(str));
    }
    @Test
    void test2_weekendCount() {
        String[] str = {"Tuesday", "Sunday", "Friday"};
        assertEquals(1, Task_5_1_11.weekendCount(str));
    }
    @Test
    void test3_weekendCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday"};
        assertEquals(1, Task_5_1_11.weekendCount(str));
    }
    @Test
    void test4_weekendCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday"};
        assertEquals(2, Task_5_1_11.weekendCount(str));
    }
    @Test
    void test5_weekendCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday"};
        assertEquals(2, Task_5_1_11.weekendCount(str));
    }
    @Test
    void test6_weekendCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday", "Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday"};
        assertEquals(4, Task_5_1_11.weekendCount(str));
    }

    @Test
    void test_weekdayCount() {
        String[] str = {"Tuesday", "Monday", "Friday"};
        assertEquals(3, Task_5_1_11.weekdayCount(str));
    }
    @Test
    void test2_weekdayCount() {
        String[] str = {"Tuesday", "Sunday", "Friday"};
        assertEquals(2, Task_5_1_11.weekdayCount(str));
    }
    @Test
    void test3_weekdayCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday"};
        assertEquals(4, Task_5_1_11.weekdayCount(str));
    }
    @Test
    void test4_weekdayCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday"};
        assertEquals(5, Task_5_1_11.weekdayCount(str));
    }
    @Test
    void test5_weekdayCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Tuesday", "Monday", "Friday"};
        assertEquals(5, Task_5_1_11.weekdayCount(str));
    }
    @Test
    void test6_weekdayCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday", "Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday"};
        assertEquals(10, Task_5_1_11.weekdayCount(str));
    }

    @Test
    void test_weekdayAndWeekendCount() {
        String[] str = {"Tuesday", "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday", "Tuesday",
                "Sunday", "Friday", "Monday", "Wednesday", "Saturday", "Thursday", "Tuesday", "Sunday", "Friday",
                "Tuesday", "Monday", "Friday"};
        assertEquals(15, Task_5_1_11.weekdayCount(str));
        assertEquals(5 , Task_5_1_11.weekendCount(str));
    }
}

