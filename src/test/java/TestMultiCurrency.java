import money.Dollar;
import money.Franc;
import money.Money;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Serkan.Tugrul on 08/07/2015.
 */

public class TestMultiCurrency {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(new Dollar(5)));
        assertFalse(Money.dollar(5).equals(new Dollar(6)));
        assertTrue(Money.franc(5).equals(new Franc(5)));
        assertFalse(Money.franc(5).equals(new Franc(6)));
        assertFalse(Money.franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}