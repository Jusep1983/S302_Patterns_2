package level3.payment.methods;

import level3.payment.PaymentMethod;

/**
 * Concrete PaymentMethod for credit card transactions.
 */
public class CreditCardPayment implements PaymentMethod {

    @Override
    public String getName() {
        return "credit card";
    }

    @Override
    public void pay(double amount) {
        System.out.println("A payment of " + amount + "€ was made via credit card\n");
    }

}
