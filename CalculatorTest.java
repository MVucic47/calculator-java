import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        String result = Calculator.Run("2+3");
        assertEquals("5.0", result);
    }

    @Test
    public void testSubtraction() {
        String result = Calculator.Run("5-3");
        assertEquals("2.0", result);
    }

    @Test
    public void testMultiplication() {
        String result = Calculator.Run("2*3");
        assertEquals("6.0", result);
    }

    @Test
    public void testDivision() {
        String result = Calculator.Run("6/2");
        assertEquals("3.0", result);
    }

    @Test
    public void testComplexExpression() {
        String result = Calculator.Run("2*3+4/2-1");
        assertEquals("7.0", result);
    }

    @Test
    public void testInvalidExpression() {
        String result = Calculator.Run("2*3+4/0-1");
        assertEquals("ERROR", result);
    }

    @Test
    public void testExpressionStartingWithNegative() {
        String result = Calculator.Run("-2+3");
        assertEquals("1.0", result);
    }

    @Test
    public void testExpressionDivisionByNegative() {
        String result = Calculator.Run("2/-2");
        assertEquals("-1.0", result);
    }

}