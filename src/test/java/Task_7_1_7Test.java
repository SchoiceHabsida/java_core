import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task_7_1_7Test {
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

    @RepeatedTest(3)
    void testConnection() {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManagerImpl(3);
        assertDoesNotThrow(() -> Task_7_1_7.moveRobot(robotConnectionManager, 1, 1));
    }

    @Test
    void testRobotMovement() {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManagerImpl(2);
        assertDoesNotThrow(() -> Task_7_1_7.moveRobot(robotConnectionManager, 1, 1));
        String result = outputStream.toString().trim();
        assertEquals("Robot was successfully moved" + System.getProperty("line.separator") + "Closing", result);
    }

    @Test
    void testRobotFailedConnection() {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManagerImpl(4);
        assertThrows(RobotConnectionException.class, () -> {
            Task_7_1_7.moveRobot(robotConnectionManager, 1, 1);
        });
    }
}
