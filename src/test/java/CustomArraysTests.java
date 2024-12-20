import main.CustomArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArraysTests {
    @Test
    public void testBinarySearchByte() {
        assertEquals(0, CustomArrays.binarySearch(new byte[]{6}, (byte) 6));
        assertEquals(2, CustomArrays.binarySearch(new byte[]{1, 2, 3, 4, 5, 6}, (byte) 3));
        assertEquals(-1, CustomArrays.binarySearch(new byte[]{1, 2, 3, 4, 5, 6}, (byte) 7));
    }

    @Test
    public void testBinarySearchByteWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new byte[]{1, 2, 3, 4, 5, 6}, 1, 6, (byte) 6));
        assertEquals(-1, CustomArrays.binarySearch(new byte[]{1, 2, 3, 4, 5, 6}, 1, 6, (byte) 7));
    }

    @Test
    public void testBinarySearchChar() {
        assertEquals(0, CustomArrays.binarySearch(new char[]{6}, (char) 6));
        assertEquals(5, CustomArrays.binarySearch(new char[]{1, 2, 3, 4, 5, 6}, (char) 6));
        assertEquals(-1, CustomArrays.binarySearch(new char[]{1, 2, 3, 4, 5, 6}, (char) 7));
    }

    @Test
    public void testBinarySearchCharWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new char[]{1, 2, 3, 4, 5, 6}, 1, 6, (char) 6));
        assertEquals(-1, CustomArrays.binarySearch(new char[]{1, 2, 3, 4, 5, 6}, 1, 6, (char) 7));
    }

    @Test
    public void testBinarySearchDouble() {
        assertEquals(0, CustomArrays.binarySearch(new double[]{6.6}, 6.6));
        assertEquals(5, CustomArrays.binarySearch(new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6}, 6.6));
        assertEquals(-1, CustomArrays.binarySearch(new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6}, 7.6));
    }

    @Test
    public void testBinarySearchDoubleWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6}, 1, 6, 6.6));
        assertEquals(-1, CustomArrays.binarySearch(new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6}, 1, 6, 7.6));
    }

    @Test
    public void testBinarySearchFloat() {
        assertEquals(0, CustomArrays.binarySearch(new float[]{6.6f}, 6.6f));
        assertEquals(5, CustomArrays.binarySearch(new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f}, 6.6f));
        assertEquals(-1, CustomArrays.binarySearch(new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f}, 7.6f));
    }

    @Test
    public void testBinarySearchFloatWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f}, 1, 6, 6.6f));
        assertEquals(-1, CustomArrays.binarySearch(new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f}, 1, 6, 7.6f));
    }

    @Test
    public void testBinarySearchInt() {
        assertEquals(0, CustomArrays.binarySearch(new int[]{6}, 6));
        assertEquals(5, CustomArrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 6));
        assertEquals(-1, CustomArrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 7));
    }

    @Test
    public void testBinarySearchIntWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 1, 6, 6));
        assertEquals(-1, CustomArrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 1, 6, 7));
    }

    @Test
    public void testBinarySearchLong() {
        assertEquals(0, CustomArrays.binarySearch(new long[]{6}, 6));
        assertEquals(5, CustomArrays.binarySearch(new long[]{1, 2, 3, 4, 5, 6}, 6));
        assertEquals(-1, CustomArrays.binarySearch(new long[]{1, 2, 3, 4, 5, 6}, 7));
    }

    @Test
    public void testBinarySearchLongWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new long[]{1, 2, 3, 4, 5, 6}, 1, 6, 6));
        assertEquals(-1, CustomArrays.binarySearch(new long[]{1, 2, 3, 4, 5, 6}, 1, 6, 7));
    }

    @Test
    public void testBinarySearchShort() {
        assertEquals(0, CustomArrays.binarySearch(new short[]{6}, (short) 6));
        assertEquals(5, CustomArrays.binarySearch(new short[]{1, 2, 3, 4, 5, 6}, (short) 6));
        assertEquals(-1, CustomArrays.binarySearch(new short[]{1, 2, 3, 4, 5, 6}, (short) 7));
    }

    @Test
    public void testBinarySearchShortWithRange() {
        assertEquals(5, CustomArrays.binarySearch(new short[]{1, 2, 3, 4, 5, 6}, 1, 6, (short) 6));
        assertEquals(-1, CustomArrays.binarySearch(new short[]{1, 2, 3, 4, 5, 6}, 1, 6, (short) 7));
    }

    @Test
    public void testBinarySearchT() {
        String[] array = {"apple", "banana", "cherry", "date", "fig", "grape"};
        assertEquals(0, CustomArrays.binarySearch(array, "apple", String::compareTo));
        assertEquals(3, CustomArrays.binarySearch(array, "date", String::compareTo));
        assertEquals(-1, CustomArrays.binarySearch(array, "date1", String::compareTo));
    }

    @Test
    public void testBinarySearchTWithRange() {
        String[] array = {"apple", "banana", "cherry", "date", "fig", "grape"};
        assertEquals(3, CustomArrays.binarySearch(array, 1, 5, "date", String::compareTo));
        assertEquals(-1, CustomArrays.binarySearch(array, 1, 5, "apple", String::compareTo));
    }
}
