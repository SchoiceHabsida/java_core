import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task_8_2_2Test {

    private Task_8_2_2 sum;

    @BeforeEach
    void setUp(){
        sum = new Task_8_2_2();

    }

    @Test
    void testSumOfStream() throws IOException {
        byte[] arr = {1,2,10};
        InputStream targetStream = new ByteArrayInputStream(arr);
        int result = sum.sumOfStream(targetStream);
        assertEquals(13, result);
    }

    @Test
    void testSumOfStreamTest2() throws IOException {
        byte[] arr = {21,03,15,04};
        InputStream targetStream = new ByteArrayInputStream(arr);
        int result = sum.sumOfStream(targetStream);
        assertEquals(43, result);
    }

    @Test
    void testSumOfStreamLargeInput() throws IOException {
        byte[] arr = {45,75,85,96,86,74,14,19,26,37,56,100,115,120,127};
        InputStream targetStream = new ByteArrayInputStream(arr);
        int result = sum.sumOfStream(targetStream);
        assertEquals(1075, result);

        arr = new byte[]{14,26,54,23,1,4,1,5,6,1,7,96,45,42,127,127,127,111};
        targetStream = new ByteArrayInputStream(arr);
        result = sum.sumOfStream(targetStream);
        assertEquals(817, result);

    }

    @Test
    void testSumOfStreamWithNegativeNumbers() throws IOException {
        byte[] arr = {-45,-75,-127,127,110};
        InputStream targetStream = new ByteArrayInputStream(arr);
        int result = sum.sumOfStream(targetStream);
        assertEquals(-10, result);

        arr = new byte[]{-1,-2,-3,-4,-5,-6};
        targetStream = new ByteArrayInputStream(arr);
        result = sum.sumOfStream(targetStream);
        assertEquals(-21, result);

    }

    @Test
    void testSumOfStreamWithFalseInput() throws IOException {
        byte[] arr = {4,5,66,74};
        InputStream targetStream = new ByteArrayInputStream(arr);
        int result = sum.sumOfStream(targetStream);
        assertNotEquals(151, result);

    }
}