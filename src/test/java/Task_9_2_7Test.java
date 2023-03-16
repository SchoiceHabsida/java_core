import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Task_9_2_7Test {
    private Reader reader;
    private Map<String, Long> salesMap;

    @Test
    void testGetSalesMap() throws IOException {
        String initialString = "Alexey 3000\n"
                + "Dmitry 9000\n"
                + "Anton 3000\n"
                + "Alexey 7000\n"
                + "Anton 8000";
        reader = new StringReader(initialString);
        salesMap = new HashMap<>();
        salesMap.put("Alexey",(long) 10000);
        salesMap.put("Dmitry",(long)9000);
        salesMap.put("Anton",(long)11000);
        assertEquals(salesMap,Task_9_2_7.getSalesMap(reader));
    }

    @Test
    void testGetSalesMapCase2() throws IOException {
        String initialString = "Kate 7000\n"
                + "Vladi 2000\n"
                + "Kate 100\n"
                + "Yana 10000\n"
                + "Vladi 500";
        reader = new StringReader(initialString);
        salesMap = new HashMap<>();
        salesMap.put("Vladi",(long) 2500);
        salesMap.put("Kate",(long)7100);
        salesMap.put("Yana",(long)10000);
        assertEquals(salesMap,Task_9_2_7.getSalesMap(reader));
    }

    @Test
    void testGetSalesMapCase3() throws IOException {
        String initialString = "Harshit 14500\n"
                + "Harshit 15400\n"
                + "Kate 15456\n"
                + "Kate 14000";
        reader = new StringReader(initialString);
        salesMap = new HashMap<>();
        salesMap.put("Kate",(long) 29456);
        salesMap.put("Harshit",(long) 29900);
        assertEquals(salesMap,Task_9_2_7.getSalesMap(reader));
    }

    @Test
    void testGetSalesMapWithNullInput() throws IOException {
        String initialString = "";
        reader = new StringReader(initialString);
        salesMap = new HashMap<>();
        assertEquals(salesMap,Task_9_2_7.getSalesMap(reader));
    }
}
