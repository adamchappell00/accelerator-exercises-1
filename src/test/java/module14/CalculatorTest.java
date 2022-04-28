package module14;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testDivisionWithZero(){
        assertEquals(0, calculator.divide(0,12));
        assertEquals(0, calculator.divide(3, 0));
        assertEquals(0, calculator.divide(0,0));
    }

    @Test
    public void testDivisionWithPositiveIntegers(){
        assertEquals(4, calculator.divide(12,3));
        assertEquals(10, calculator.divide(40, 4));
        assertEquals(1, calculator.divide(1,1));
    }
}