import org.example.Task20;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task20Test {
    @Test
    public void testCalculatePercentage() {
        int[] a = {1, 2, 3, 4, 5};
        double[] expected = {40.0, 20.0, 40.0}; // Less: 2/5, Equal: 1/5, Greater: 2/5
        assertArrayEquals(expected, Task20.calculatePercentage(a), 0.01);
    }
}
