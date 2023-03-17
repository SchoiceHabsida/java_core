import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_9_2_8Test {

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
    void testScannerInput() {
        String input = "0 1 2 3 4 5 6 7 8 9 10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_9_2_8.main(null);
        String str = outputStream.toString();
        assertEquals("9 7 5 3 1 ", str);
    }

    @Test
    void testScannerWithNoInput() {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_9_2_8.main(null);
        String str = outputStream.toString();
        assertEquals("", str);
    }

    @Test
    void testScannerInputWithNonIntegerValues() {
        String input = "a1 b2 c3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_9_2_8.main(null);
        String str = outputStream.toString();
        assertEquals("", str);
    }

    @Test
    void testScannerInputLargeInput() {
        String input = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_9_2_8.main(null);
        String str = outputStream.toString();
        assertEquals("20 18 16 14 12 10 8 6 4 2 ", str);
    }

    @Test
    void testScannerInputRandomInput() {
        String input = "17 12 13 14 15 48 29 35";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_9_2_8.main(null);
        String str = outputStream.toString();
        assertEquals("35 48 14 12 ", str);
    }
}
