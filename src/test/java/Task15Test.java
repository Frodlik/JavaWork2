import org.example.Task15;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task15Test {

    @Test
    public void testFindCommonElements() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        int[] expectedOutput = {3, 4, 5};
        assertArrayEquals(expectedOutput, Task15.findCommonElements(a, b));
    }
}
