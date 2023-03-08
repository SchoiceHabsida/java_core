import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task_8_2_3Test {
    private InputStream inputStream;
    private OutputStream outputStream;

    @Test
    void testPrintStream() throws IOException {
        byte[] arr = {3,10,4,5,7};
        inputStream = new ByteArrayInputStream(arr);
        outputStream = new ByteArrayOutputStream();
        Task_8_2_3.print(inputStream, outputStream);
        byte[] evenNumbers = {10,4};
        byte[] result = ((ByteArrayOutputStream) outputStream).toByteArray();
        assertArrayEquals(evenNumbers,result);

    }

    @Test
    void testPrintStreamWithAllEvenNumbers() throws IOException {
        byte[] arr = {2,4,8,10,16};
        inputStream = new ByteArrayInputStream(arr);
        outputStream = new ByteArrayOutputStream();
        Task_8_2_3.print(inputStream, outputStream);
        byte[] evenNumbers = {2,4,8,10,16};
        byte[] result = ((ByteArrayOutputStream) outputStream).toByteArray();
        assertArrayEquals(evenNumbers,result);

    }

    @Test
    void testPrintStreamWithAllOddNumbers() throws IOException {
        byte[] arr = {3,5,7,9,11,15};
        inputStream = new ByteArrayInputStream(arr);
        outputStream = new ByteArrayOutputStream();
        Task_8_2_3.print(inputStream, outputStream);
        byte[] evenNumbers = {};
        byte[] result = ((ByteArrayOutputStream) outputStream).toByteArray();
        assertArrayEquals(evenNumbers,result);

    }

    @Test
    void testPrintStreamWithLargeInput() throws IOException {
        byte[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,41,42,43,44,126,127};
        inputStream = new ByteArrayInputStream(arr);
        outputStream = new ByteArrayOutputStream();
        Task_8_2_3.print(inputStream, outputStream);
        byte[] evenNumbers = {2,4,6,8,10,12,14,16,18,20,42,44,126};
        byte[] result = ((ByteArrayOutputStream) outputStream).toByteArray();
        assertArrayEquals(evenNumbers,result);

    }

    @Test
    void testPrintStreamWithFalseOutput() throws IOException {
        byte[] arr = {5,4,84,18,22,45,49};
        inputStream = new ByteArrayInputStream(arr);
        outputStream = new ByteArrayOutputStream();
        Task_8_2_3.print(inputStream, outputStream);
        byte[] evenNumbers = {2,14,16};
        byte[] result = ((ByteArrayOutputStream) outputStream).toByteArray();
        assertTrue(!Arrays.equals(evenNumbers,result));

    }
}