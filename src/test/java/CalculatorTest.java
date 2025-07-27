
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.CalculatorEngine;

public class CalculatorTest {
    @Test
    void testDevide() {
        CalculatorEngine calc = new CalculatorEngine();
        assertEquals(2.0, CalculatorEngine.solve(new double[]{4.0, 2.0}, "/"));
    }

    @Test
    void testSum() {
        CalculatorEngine calc = new CalculatorEngine();
        assertEquals(225, CalculatorEngine.solve(new double[]{223, 2.0}, "+"));
    }
}
