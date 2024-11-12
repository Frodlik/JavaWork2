import org.example.Task25;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task25Test {
    @Test
    public void testFindDateNonLeapYear() {
        assertEquals("День: 31, Місяць: 1", Task25.findDate(31, false));
        assertEquals("День: 1, Місяць: 3", Task25.findDate(60, false));
    }

    @Test
    public void testFindDateLeapYear() {
        assertEquals("День: 1, Місяць: 3", Task25.findDate(61, true));
    }
}
