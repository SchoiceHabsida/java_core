import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;


public class Task_8_3_2Test {

    private InputStream inputStream;
    private Charset charset = StandardCharsets.UTF_8;

    @Test
    void testSample() throws IOException {
        byte[] arr = {48,49,50,51};
        inputStream = new ByteArrayInputStream(arr);
        String str = Task_8_3_2.readAsString(inputStream, charset);
        assertEquals("0123",str);
    }

    @Test
    void testReadAsStringWithCharacters() throws IOException {
        byte[] arr = {45,51,63,62,64,79};
        inputStream = new ByteArrayInputStream(arr);
        String str = Task_8_3_2.readAsString(inputStream, charset);
        assertEquals("-3?>@O",str);
    }

    @Test
    void testReadAsStringEmptyArray() throws IOException {
        byte[] arr = {};
        inputStream = new ByteArrayInputStream(arr);
        String str = Task_8_3_2.readAsString(inputStream, charset);
        assertEquals("",str);
    }

    @Test
    void testReadAsStringWithAlphabets() throws IOException {
        byte[] arr = {72,69,82};
        inputStream = new ByteArrayInputStream(arr);
        String ans = Task_8_3_2.readAsString(inputStream, charset);
        assertEquals("HER",ans);
    }

    @Test
    void testReadAsStringWithNames() throws IOException {
        byte[] arr = {72,65,66,83,73,68,65};
        inputStream = new ByteArrayInputStream(arr);
        String ans = Task_8_3_2.readAsString(inputStream, charset);
        assertEquals("HABSIDA",ans);

        arr = new byte[]{75,65,84,69};
        inputStream = new ByteArrayInputStream(arr);
        ans = Task_8_3_2.readAsString(inputStream, charset);
        assertEquals("KATE",ans);
    }

    @Test
    void testCharset() throws IOException {
        byte[] arr = {48,49,50,51};
        inputStream = new ByteArrayInputStream(arr);
        Charset charset1 = StandardCharsets.US_ASCII;

        String res1 = Task_8_3_2.readAsString(inputStream, charset1);
        assertTrue(res1.equals("0123"));

        byte[] arr2 = {45,51,63,62,64,79};
        inputStream = new ByteArrayInputStream(arr2);

        String res4 = Task_8_3_2.readAsString(inputStream, charset1);
        assertTrue(res4.equals("-3?>@O"));

        byte[] arr3 = {72,69,82};
        inputStream = new ByteArrayInputStream(arr3);

        String res7 = Task_8_3_2.readAsString(inputStream, charset1);
        assertTrue(res7.equals("HER"));

        byte[] arr4 = {72,65,66,83,73,68,65};
        inputStream = new ByteArrayInputStream(arr4);

        String res10 = Task_8_3_2.readAsString(inputStream, charset1);
        assertTrue(res10.equals("HABSIDA"));

        byte[] arr5 = new byte[]{75,65,84,69};
        inputStream = new ByteArrayInputStream(arr5);

        String res13 = Task_8_3_2.readAsString(inputStream, charset1);
        assertTrue(res13.equals("KATE"));
    }
}