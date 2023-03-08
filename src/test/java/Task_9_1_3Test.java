import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task_9_1_3Test {
    private Box<String> box;
    private Field[] fields;

    @BeforeEach
    void setUp() throws Exception {
        box = new Box<>();
        fields = box.getClass().getDeclaredFields();
    }

    @Test
    void testFieldObject() throws Exception {
        String field = fields[0].getName();
        assertEquals("object", field);
        fields[0].setAccessible(true);
        fields[0].set(box, "LET'S CODE");
        assertEquals("LET'S CODE" , fields[0].get(box));
        fields[0].set(box, "Habsida");
        assertNotEquals("LET'S CODE", fields[0].get(box));
    }
}