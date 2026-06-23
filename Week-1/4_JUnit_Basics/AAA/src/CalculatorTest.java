
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Method Executed");
    }
    @After
    public void tearDown() {

        System.out.println("Teardown Method Executed");
    }
    @Test
    public void testSubtract() {
        int a = 30;
        int b = 20;

        int result = calculator.subtrct(a, b);
        assertEquals(10, result);
    }
}