import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task_7_1_6Test {
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
    void testExceptionsIgnored() {
        assertDoesNotThrow(() -> Task_7_1_6.main(null));
    }

    @Test
    void testCarClassStructure() {
        assertTrue(AutoCloseable.class.isAssignableFrom(Task_7_1_6.Car.class));
    }

    @Test
    void testCarMethods() {
        String methodShouldExist = "[public void Task_7_1_6$Car.close(), public void Task_7_1_6$Car.drive()]";
        String actualMethods = Arrays.toString(Task_7_1_6.Car.class.getDeclaredMethods());
        assertEquals(methodShouldExist, actualMethods);
    }

    @Test
    void testMainMethodExecution() {
        Task_7_1_6.main(null);
        String str = outputStream.toString().trim();
        assertEquals("The car started driving." + System.getProperty("line.separator") + "Shutting down the car...", str);
    }

    @Test
    void testCarClass() throws Exception {
        Task_7_1_6.Car car = new Task_7_1_6.Car();
        car.drive();
        car.close();
        String result = outputStream.toString().trim();
        assertEquals("Shutting down the car...", result);
    }

    @Test
    void testDriveMethod() throws Exception {
        Task_7_1_6.Car car = new Task_7_1_6.Car();
        car.drive();
        String result = outputStream.toString().trim();
        assertEquals("", result);
    }

    @Test
    void testClosMethod() throws Exception {
        Task_7_1_6.Car car = new Task_7_1_6.Car();
        car.close();
        String result = outputStream.toString().trim();
        assertEquals("Shutting down the car...", result);
    }
}
