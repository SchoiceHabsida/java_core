import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Task_6_3_11Test {

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
    void test_methodStud() {
        Task_6_3_11.LazyStudent lazyStudent = new Task_6_3_11.LazyStudent();
        lazyStudent.study();
        String str = outputStream.toString().trim();
        assertEquals("I don't study today, I'm lazy.", str);
    }

    @Test
    void test_superclass() {
        Class lazyStudent = new Task_6_3_11.LazyStudent().getClass();

        assertEquals("[]", Arrays.toString(lazyStudent.getDeclaredFields()));
        assertEquals("Task_6_3_11$Student", lazyStudent.getSuperclass().getName());
        assertEquals("[public Task_6_3_11$LazyStudent()]", Arrays.toString(lazyStudent.getConstructors()));
        assertEquals("[public void Task_6_3_11$LazyStudent.study()]", Arrays.toString(lazyStudent.getDeclaredMethods()));

    }

}

