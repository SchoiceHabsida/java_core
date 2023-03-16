import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class Task_9_2_6Test {

    @Test
    void testSymmetricDifferenceInteger() {
        Integer arr1[] = {1,2,3,4,5,6,7,8};
        Integer arr2[] = {1,3,5,6,7,8,9};
        Set<Integer> set1 = Arrays.stream(arr1).collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).collect(Collectors.toSet());

        Set<Integer> set3 = Task_9_2_6.symmetricDifference(set1, set2);
        Integer[] ans = {2,4,9};
        Set<Integer> result  = Arrays.stream(ans).collect(Collectors.toSet());
        assertEquals(result, set3);
    }

    @Test
    void testSymmetricDifferenceInteger2() {
        Integer arr1[] = {4,5,6,7,8,1,3};
        Integer arr2[] = {5,6,7,8,9,0,3};
        Set<Integer> set1 = Arrays.stream(arr1).collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).collect(Collectors.toSet());

        Set<Integer> set3 = Task_9_2_6.symmetricDifference(set1, set2);
        Integer[] ans = {4,9,0,1};
        Set<Integer> result  = Arrays.stream(ans).collect(Collectors.toSet());
        assertEquals(result, set3);
    }


    @Test
    void testSymmetricDifferenceString() {
        String arr1[] = {"Hello", "Hii", "Hola"};
        String arr2[] = {"Hii", "Czesz"};
        Set<String> set1 = Arrays.stream(arr1).collect(Collectors.toSet());
        Set<String> set2 = Arrays.stream(arr2).collect(Collectors.toSet());

        Set<String> set3 = Task_9_2_6.symmetricDifference(set1, set2);
        String[] ans = {"Hello", "Hola", "Czesz"};
        Set<String> result  = Arrays.stream(ans).collect(Collectors.toSet());
        assertEquals(result, set3);

    }

}
