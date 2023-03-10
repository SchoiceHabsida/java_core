import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task_9_1_6Test {

    @Test
    void testDynamicArrayInteger() {
        Task_9_1_6.DynamicArray<Integer> dynamicArray = new Task_9_1_6.DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        assertEquals("[1, 2, 3, 4, 5]", dynamicArray.toString());
        assertNotEquals("[1, 2, 3, 4, 6]", dynamicArray.toString());

        assertEquals(2, dynamicArray.get(1));
        Exception ex = assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            dynamicArray.get(5);
        });
        assertTrue(ex.getMessage().contains("Array index out of range: 5"));

        dynamicArray.remove(3);
        assertEquals("[1, 2, 3, 5]", dynamicArray.toString());

    }

    @Test
    void testDynamicArrayAddString() {
        Task_9_1_6.DynamicArray<String> dynamicArray = new Task_9_1_6.DynamicArray<>();
        dynamicArray.add("Hii");
        dynamicArray.add("Anneyong");
        dynamicArray.add("Hola");
        dynamicArray.add("Salut");
        dynamicArray.add("Czesc");
        assertEquals("[Hii, Anneyong, Hola, Salut, Czesc]", dynamicArray.toString());
        assertNotEquals("[Hii, Hola, Anneyong, Salut, Czesc]", dynamicArray.toString());

        assertEquals("Hola", dynamicArray.get(2));
        Exception ex = assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            dynamicArray.get(7);
        });
        assertTrue(ex.getMessage().contains("Array index out of range: 7"));

        dynamicArray.remove(2);
        assertEquals("[Hii, Anneyong, Salut, Czesc]", dynamicArray.toString());


    }

    @Test
    void testDynamicArrayAddCharacters() {
        Task_9_1_6.DynamicArray<Character> dynamicArray = new Task_9_1_6.DynamicArray<>();
        dynamicArray.add('M');
        dynamicArray.add('a');
        dynamicArray.add('r');
        dynamicArray.add('v');
        dynamicArray.add('e');
        dynamicArray.add('l');
        assertEquals("[M, a, r, v, e, l]", dynamicArray.toString());
        assertNotEquals("[M, a, r, f, e, l]", dynamicArray.toString());

        assertEquals('e', dynamicArray.get(4));
        Exception ex = assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            dynamicArray.get(7);
        });
        assertTrue(ex.getMessage().contains("Array index out of range: 7"));

        dynamicArray.remove(3);
        assertEquals("[M, a, r, e, l]", dynamicArray.toString());
    }

    @Test
    void testDynamicArrayAddCharacters2() {
        Task_9_1_6.DynamicArray<Character> dynamicArray = new Task_9_1_6.DynamicArray<>();
        dynamicArray.add('!');
        dynamicArray.add('@');
        dynamicArray.add('#');
        dynamicArray.add('$');
        dynamicArray.add('%');
        dynamicArray.add('^');
        dynamicArray.add('&');
        dynamicArray.add('*');
        dynamicArray.add('(');
        dynamicArray.add(')');
        dynamicArray.add('0');
        dynamicArray.add('1');
        dynamicArray.add('2');
        dynamicArray.add('3');
        dynamicArray.add('4');
        dynamicArray.add('5');
        dynamicArray.add('6');
        dynamicArray.add('7');
        dynamicArray.add('8');
        dynamicArray.add('9');
        assertEquals("[!, @, #, $, %, ^, &, *, (, ), 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]", dynamicArray.toString());

        assertEquals('%', dynamicArray.get(4));
        assertEquals(')', dynamicArray.get(9));
        assertEquals('3', dynamicArray.get(13));
        assertEquals('9', dynamicArray.get(19));
        Exception ex = assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            dynamicArray.get(20);
        });
        assertTrue(ex.getMessage().contains("Array index out of range: 20"));

        dynamicArray.remove(3);
        dynamicArray.remove(13);
        assertEquals("[!, @, #, %, ^, &, *, (, ), 0, 1, 2, 3, 5, 6, 7, 8, 9]", dynamicArray.toString());
    }
}