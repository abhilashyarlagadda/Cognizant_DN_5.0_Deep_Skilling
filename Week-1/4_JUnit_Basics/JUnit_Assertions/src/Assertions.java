import static org.junit.Assert.*;
import org.junit.Test;

public class Assertions {
@Test
    public void testAssertions() {
        assertEquals(10, 6 + 4);
        assertTrue(6 > 4);
        assertFalse(6 < 4);
        assertNull(null);
        assertNotNull(new Object());
    }
}