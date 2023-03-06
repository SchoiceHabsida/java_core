import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task_7_1_3Test {
    private final Task_7_1_3 task = new Task_7_1_3();

    @RepeatedTest(5)
    void testException() {
        assertThrows(MyNewException.class, () -> task.testExp());
    }
}
