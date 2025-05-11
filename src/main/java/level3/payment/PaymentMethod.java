package level3.payment;

/**
 * Interface representing a payment method callback.
 * Implementations perform the specific payment logic.
 */

public interface PaymentMethod {

    String getName();

    void pay(double amount);

}
