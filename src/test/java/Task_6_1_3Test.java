import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_6_1_3Test {
    Class human = new Human("Secret", "News", "Experience", "Gossip").getClass();

    @Test
    void test_methods() {
        for (Method method : human.getDeclaredMethods()) {

            if (method.getName().equals("getExperience")) {
                assertEquals(4, method.getModifiers());
            }
            if (method.getName().equals("getSecret")) {
                assertEquals(2, method.getModifiers());
            }
            if (method.getName().equals("getNews")) {
                assertEquals(1, method.getModifiers());
            }
            if (method.getName().equals("getGossip")) {
                assertEquals(0, method.getModifiers());
            }
        }
    }

}

