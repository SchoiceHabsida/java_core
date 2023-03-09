import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_9_1_4Test {
    private Task_9_1_4.Box<Integer> box;
    private Method[] methods;
    private Field[] fields;

    @BeforeEach
    void setUp() {
        box = new Task_9_1_4.Box<>();
        fields = box.getClass().getDeclaredFields();
        methods = box.getClass().getDeclaredMethods();
    }

    @Test
    void testFieldName() {
        assertEquals("object", fields[0].getName());
    }

    @Test
    void testMethodName() {
        String field = methods[0].getName();
        assertEquals("getBox", field);
    }

    @Test
    void testGetBoxMethod() {
        Object box1 = Task_9_1_4.Box.getBox();
        assertTrue(box1 instanceof Task_9_1_4.Box);
    }
}