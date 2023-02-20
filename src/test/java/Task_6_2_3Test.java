import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task_6_2_3Test {
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
    void catchCatTest() {
        Cat c = new Cat();
        Dog d = new Dog();
        d.catchCat(c);
        String str = outputStream.toString().trim();
        String[] lines = str.split("\\R");
        assertEquals("Cat caught", lines[0]);
        assertEquals("Woof!", lines[1]);
        assertEquals("Meow!", lines[2]);
    }

    @Test
    void sayHelloCatTest() {
        Cat c = new Cat();
        c.sayHello();
        String str = outputStream.toString().trim();
        assertEquals("Meow!", str);
    }

    @Test
    void sayHelloDogTest() {
        Dog d = new Dog();
        d.sayHello();
        String str = outputStream.toString().trim();
        assertEquals("Woof!", str);
    }

    @Test
    void catchCatTestForFalseValue() {
        Cat c = new Cat();
        Dog d = new Dog();
        d.catchCat(c);
        String str = outputStream.toString().trim();
        String[] lines = str.split("\\R");
        assertNotEquals("Dog caught", lines[0]);
        assertNotEquals("", lines[1]);
        assertNotEquals("Wof!", lines[2]);
    }

}
