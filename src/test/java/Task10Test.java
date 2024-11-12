import org.example.Task10;
import org.example.Task5;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Task10Test {

    @Test
    public void testFormNumArrayB() {
        Task10 task = new Task10();
        double[] a = {1, 2, 2, 3, 1, 1};
        int[] expectedB = {3, 2, 2, 1, 3, 3};
        assertArrayEquals(expectedB, task.numArrayB(a));
    }

    @Test
    public void testFormCharArrayB() {
        Task10 task = new Task10();
        char[] a = {'1', '2', '2', '3', '1', '1'};
        int[] expectedB = {3, 2, 2, 1, 3, 3};
        assertArrayEquals(expectedB, task.charArrayB(a));
    }

    @Test
    public void testFormArrayB() {
        Task10 task = new Task10();
        double[] a = {1, 1, 1, 1, 1, 1};
        int[] expectedB = {a.length, a.length, a.length, a.length, a.length, a.length};
        assertArrayEquals(expectedB, task.numArrayB(a));
    }
}
