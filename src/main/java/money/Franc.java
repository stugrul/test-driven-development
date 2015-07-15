package money;

/**
 * Created by Serkan.Tugrul on 15/07/2015.
 */
public class Franc extends Money {

    public Franc(int amount) {
        super(amount);
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
