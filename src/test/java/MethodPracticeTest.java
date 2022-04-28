import module11.MethodPractice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MethodPracticeTest {

    @Test
    public void shouldReturnDifferenceBetweenTwoInputsWhenTwoInputsAreGiven() {
        String failMessage = "Expected method to return difference of arguments";
        assertEquals(failMessage, 3, MethodPractice.subtract(7, 4));
        assertEquals(failMessage, -15, MethodPractice.subtract(2, 17));
        assertEquals(failMessage, 30, MethodPractice.subtract(60, 30));
    }
    @Test
    public void shouldReturnDifferenceBetweenTwoInputsOrZeroIfDifferenceIsNegativeWhenTwoInputsAreGiven() {
        String failMessage = "Expected method to return difference of arguments, or zero if the difference is negative";
        assertEquals(failMessage, 3, MethodPractice.subtractOrZero(7, 4));
        assertEquals(failMessage, 0, MethodPractice.subtractOrZero(2, 17));
        assertEquals(failMessage, 6, MethodPractice.subtractOrZero(25, 19));
        assertEquals(failMessage, 0, MethodPractice.subtractOrZero(1, 2));
    }

    @Test
    public void shouldReturnLargestOfThreeArgumentsWhenThreeArgumentsAreGiven() {
        String failMessage = "Expected method to return largest of three arguments";
        assertEquals(failMessage, 7, MethodPractice.max(7, 4, 5));
        assertEquals(failMessage, 104, MethodPractice.max(2, 17, 104));
        assertEquals(failMessage, 25, MethodPractice.max(25, 19, -3));
    }

    @Test
    public void shouldReturnSmallestOfThreeArgumentsWhenThreeArgumentsAreGiven() {
        String failMessage = "Expected method to return smallest of three arguments";
        assertEquals(failMessage, 4, MethodPractice.min(7, 4, 5));
        assertEquals(failMessage, 2, MethodPractice.min(2, 17, 104));
        assertEquals(failMessage, -3, MethodPractice.min(25, 19, -3));
    }

    @Test
    public void shouldReturnBooleanIfFirstArgumentIsLargerThanSecondWhenTwoArgumentsAreGiven() {
        String failMessage = "Expected method to return a boolean if the first argument is larger than the second";
        assertTrue(failMessage, MethodPractice.isLarger(4, 3));
        assertTrue(failMessage, !MethodPractice.isLarger(2, 30));
        assertTrue(failMessage, MethodPractice.isLarger(-5, -10));
    }

}
