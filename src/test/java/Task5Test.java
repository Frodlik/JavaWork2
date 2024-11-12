import org.example.Task5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task5Test {
    @Test
    public void testAnalyzeArrayAllPositive() {
        double[] a = {1, 2, 3};
        assertEquals("Масив містить лише позитивні величини.", Task5.analyzeArray(a));
    }

    @Test
    public void testAnalyzeArrayAllNegative() {
        double[] a = {-1, -2, -3};
        assertEquals("Масив містить лише негативні величини.", Task5.analyzeArray(a));
    }

    @Test
    public void testAnalyzeArrayMixed() {
        double[] a = {-1, 2, -3, 4};
        assertEquals("Масив містить як позитивні, так і негативні величини.", Task5.analyzeArray(a));
    }
}
