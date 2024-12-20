import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.CustomCollections;

public class CustomCollectionsTests {
    @Test
    public void testBinarySearchComparable() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(4, CustomCollections.binarySearch(list, 5));
        assertEquals(-1, CustomCollections.binarySearch(list, 11));
    }

    @Test
    public void testBinarySearchComparator() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
        assertEquals(2, CustomCollections.binarySearch(list, "cherry", String::compareTo));
        assertEquals(-1, CustomCollections.binarySearch(list, "fig", String::compareTo));
    }
}
