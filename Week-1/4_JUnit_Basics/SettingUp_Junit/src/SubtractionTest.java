import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class SubtractionTest {
	@Test
	public void testSubtrct() {

        Subtraction sub = new Subtraction();

        assertEquals(15, sub.subtrct(30, 15));
    }

}
