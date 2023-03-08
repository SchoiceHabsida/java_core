import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class Task_8_3_3Test {

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
        String input = "1 2 3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(null);
        String str = outputStream.toString();
        assertEquals("6.000000", str);
    }

    @Test
    void testScannerInputWithNonDoubleValues() {
        String input = "a1 b2 c3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(null);
        String str = outputStream.toString();
        assertEquals("0.000000", str);
    }

    @Test
    void testScannerInputLargeInput() {
        String input = "-1e3 18 .111 11bbb";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(null);
        String str = outputStream.toString();
        assertEquals("-981.889000", str);
    }

    @Test
    void testScannerWithNoInput() {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(null);
        String str = outputStream.toString();
        assertEquals("0.000000", str);
    }

    @Test
    void testScannerDoubleAddition() {
        String input = "60.2 70.9 88.88";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(null);
        String str = outputStream.toString();
        assertEquals("219.980000", str);
    }

    @Test
    void testScannerMoreThan6DigitInput() {
        String input = "6.66666666 7.77777777";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(null);
        String str = outputStream.toString();
        assertEquals("14.444444", str);
    }

}