package money;

/**
 * Created by Serkan.Tugrul on 09/07/2015.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}

