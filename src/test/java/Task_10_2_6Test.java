import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Task_10_2_6Test {

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
    void testStreams() {
        String input = "Мама мыла-мыла-мыла раму!";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_10_2_6.main(null);
        String str = outputStream.toString();
        assertEquals("мыла\n"
                + "мама\n"
                + "раму\n", str);
    }

    @Test
    void testStreamsLongInput() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                + "Sed sodales consectetur purus at faucibus. Donec mi quam, tempor"
                + " vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit"
                + " tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet"
                + " faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum"
                + " dolor sit amet, consectetur adipiscing elit. Integer vel odio nec "
                + "mi tempor dignissim.\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_10_2_6.main(null);
        String str = outputStream.toString();
        assertEquals("consectetur\n"
                + "faucibus\n"
                + "ipsum\n"
                + "lorem\n"
                + "adipiscing\n"
                + "amet\n"
                + "dolor\n"
                + "eget\n"
                + "elit\n"
                + "mi\n", str);
    }

    @Test
    void testStreamsWithNoInput() {
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Task_10_2_6.main(null);
        String str = outputStream.toString();
        assertNotEquals("Text", str);
        assertEquals("", str);
    }

    @Test
    public void testCountWords() {
        String input = "hello world! Hello world! 123 123 123 123.4";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        Task_10_2_6.main(null);
        String str = outputStream.toString();

        assertEquals("123\n" +
                "hello\n" +
                "world\n" +
                "4\n", str);
    }

    @Test
    public void testCountWordsWithLessThan10UniqueWords() {
        String input = "hello world! Hello world!";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        Task_10_2_6.main(null);
        String str = outputStream.toString();

        assertEquals("hello\n" +
                "world\n", str);
    }

    @Test
    public void testCountWordsWithSameFrequency() {
        String input = "apple banana banana cherry cherry cherry date date date date";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        Task_10_2_6.main(null);
        String str = outputStream.toString();

        assertEquals("date\n" +
                "cherry\n" +
                "banana\n" +
                "apple\n", str);
    }

    @Test
    public void testCountWordsWithSpecialCharacters() {
        String input = "This is a test string! It contains special characters $%#@*^";
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        System.setIn(stream);
        Task_10_2_6.main(null);
        String str = outputStream.toString();

        assertEquals("a\n" +
                "characters\n" +
                "contains\n" +
                "is\n" +
                "it\n" +
                "special\n" +
                "string\n" +
                "test\n" +
                "this\n", str);
    }
}
