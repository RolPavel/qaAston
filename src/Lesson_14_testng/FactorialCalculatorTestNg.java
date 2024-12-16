package Lesson_14_testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTestNg {

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(FactorialCalculatorNG.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(FactorialCalculatorNG.factorial(1), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(FactorialCalculatorNG.factorial(2), 2);      // 2! = 2
        Assert.assertEquals(FactorialCalculatorNG.factorial(3), 6);      // 3! = 6
        Assert.assertEquals(FactorialCalculatorNG.factorial(4), 24);     // 4! = 24
        Assert.assertEquals(FactorialCalculatorNG.factorial(5), 120);    // 5! = 120
    }

    @Test
    public void testFactorialForLargeNumbers() {
        Assert.assertEquals(FactorialCalculatorNG.factorial(10), 3628800); // 10! = 3628800
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculatorNG.factorial(-1);
    }
}
