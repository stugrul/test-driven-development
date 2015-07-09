import money.Dollar;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Serkan.Tugrul on 08/07/2015.
 */

public class TestMultiCurrency {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
