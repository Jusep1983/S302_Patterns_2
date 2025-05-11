package level3.payment.methods;

import level3.payment.PaymentMethod;

/**
 * Concrete PaymentMethod for PayPal transactions.
 */
public class PaypalPayment implements PaymentMethod {

    @Override
    public String getName() {
        return "paypal";
    }

    @Override
    public void pay(double amount) {
        System.out.println("A payment of " + amount + "€ was made via paypal\n");

    }

}
