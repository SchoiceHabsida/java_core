import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Task_6_3_10Test {

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
        Task_6_3_10.JavaStudent stud = new Task_6_3_10.JavaStudent();
        stud.study();
        String str = outputStream.toString().trim();
        assertEquals("I'm very busy. I'm taking a Java course.", str);

    }

    @Test
    void test_superclass() {
        Class javaStudent = new Task_6_3_10.JavaStudent().getClass();

        assertEquals("[]", Arrays.toString(javaStudent.getDeclaredFields()));
        assertEquals("Task_6_3_10$Student", javaStudent.getSuperclass().getName());
        assertEquals("[public Task_6_3_10$JavaStudent()]", Arrays.toString(javaStudent.getConstructors()));
        assertEquals("[]", Arrays.toString(javaStudent.getDeclaredMethods()));

    }

}

