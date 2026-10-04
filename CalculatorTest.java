import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, calc.add(5, -6), "5 + (-6) should equal -1");
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calc.multiply(5, 0), "5 * 0 should equal 0");
    }
}
