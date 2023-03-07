import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_7_1_4Test {

    @Test
    void testStackTrace() {
        String result = callerMethod();
        assertEquals("Task_7_1_4Test1#testStackTrace", result);
    }

    @Test
    void testCorrectMethodNameDisplayed() {
        String result = helperMethod();
        assertEquals("Task_7_1_4Test1#helperMethod", result);
    }

    @Test
    void testIncorrectMethodName() {
        String result = callerMethod();
        assertNotEquals("Task_7_1_4Test1#testCorrectMethodNameDisplayed", result);
        assertEquals("Task_7_1_4Test1#testIncorrectMethodName", result);
        assertNotEquals("jdk.internal.reflect.DirectMethodHandleAccessor#invoke", result);
    }

    @Test
    void testNestedMethod() {
        String result = helperMethod();
        assertNotEquals("Task_7_1_4Test1#testCorrectMethodNameDisplayed", result);
        assertEquals("Task_7_1_4Test1#helperMethod", result);
        assertNotEquals("jdk.internal.reflect.DirectMethodHandleAccessor#invoke", result);
    }

    @Test
    void testForNull() {
        String result = Task_7_1_4.getCallerClassAndMethodName();
        assertEquals("jdk.internal.reflect.DirectMethodHandleAccessor#invoke", result);
    }

    private String helperMethod() {
        return callerMethod();
    }

    private String callerMethod() {
        return Task_7_1_4.getCallerClassAndMethodName();
    }
}
