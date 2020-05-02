import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculation = new Calculate();
        int sum = calculation.add(2, 5);
        int expected = 7;
        System.out.println("@Test sum(): " + sum + " = " + sum);
        assertEquals(sum, expected);
    }

    @Test
    public void testDifference() {
        Calculate calculation = new Calculate();
        int difference = calculation.substract(2, 5);
        int expected = -3;
        System.out.println("@Test difference(): " + difference + " = " + difference);
        assertEquals(difference, expected);
    }

    @Test
    public void testProduct() {
        Calculate calculation = new Calculate();
        int product = calculation.multiply(2, 5);
        int expected = 10;
        System.out.println("@Test product(): " + product + " = " + product);
        assertEquals(product, expected);
    }

    @Test
    public void testQuotient() {
        Calculate calculation = new Calculate();
        int sum = calculation.divide(2, 5);
        int expected = 0;
        System.out.println("@Test quotient(): " + sum + " = " + sum);
        assertEquals(sum, expected);
    }
}
