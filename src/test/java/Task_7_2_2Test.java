import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task_7_2_2Test {

    private CustomStreamHandler customLogHandler;
    private static OutputStream logCapturingStream;
    private static Logger log = Logger.getLogger(Task_7_2_2.class.getName());

    @BeforeEach
    public void setLogCapturingStream() {
        Task_7_2_2.logging();
        logCapturingStream = new ByteArrayOutputStream();
        customLogHandler = new CustomStreamHandler();
        customLogHandler.setOutputStream(logCapturingStream);
        log.addHandler(customLogHandler);
    }

    public String getTestCapturedLog() throws IOException {
        customLogHandler.flush();
        return logCapturingStream.toString();
    }

    @Test
    void testSample() throws IOException {
        Task_7_2_2.logging();
        String capturedLog = getTestCapturedLog();
        assertTrue(capturedLog.contains("Everything is fine"));
        assertTrue(capturedLog.contains("INFO"));
    }

    @Test
    @DisplayName("Testing the Logging Statements")
    void testLogging() throws IOException {
        Task_7_2_2.logging();
        String capturedLog = getTestCapturedLog();
        assertTrue(capturedLog.contains("Everything is fine"));
        assertTrue(capturedLog.contains("INFO"));
        assertTrue(capturedLog.contains("There was an error"));
        assertTrue(capturedLog.contains("WARNING"));
    }

    @Test
    void testMsgLogging() throws IOException {
        Task_7_2_2.logging();
        String capturedLog = getTestCapturedLog();
        Map<String, String> map = new HashMap<>();
        for (String s : capturedLog.split("\n")) {

            if (s.contains("INFO: Everything is fine")) {
                map.put("INFO", s.replaceFirst("INFO: ", ""));
            }
            if (s.contains("WARNING: There was an error")) {
                map.put("WARNING", s.replaceFirst("WARNING: ", ""));
            }
        }

        assertEquals("Everything is fine", map.get("INFO"));
        assertEquals("There was an error", map.get("WARNING"));
    }

}
