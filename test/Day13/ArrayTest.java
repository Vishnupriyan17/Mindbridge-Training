
package Day13;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void alredySorted()
    {
        int[] input = {2,3,4,1,5,6};
        String expected = "[1, 2, 3, 4, 5, 6]";
        assertEquals(expected, Day13.Array.performSorting(input));
    }
    @Test
    public void duplicateArray()
    {
        int[] input = {2,3,4,1,5,5};
        String expected = "[1, 2, 3, 4, 5, 5]";
        assertEquals(expected, Day13.Array.performSorting(input));
    }
    @Test
    public void sortedArray()
    {
        assertEquals("[1, 2, 3, 4, 5, 6]", Day13.Array.performSorting(new int[]{1,2,3,4,5,6}));
    }
    @Test
    public void emptyArray()
    {
        int[] input = {};
        String expected = "[]";
        assertEquals(expected, Day13.Array.performSorting(input));
    }
    @Test
    public void negativeArray()
    {
        int[] input = {-2,-3,-4,-1,-5,-6};
        String expected = "[-6, -5, -4, -3, -2, -1]";
        assertEquals(expected, Day13.Array.performSorting(input));
    }
}