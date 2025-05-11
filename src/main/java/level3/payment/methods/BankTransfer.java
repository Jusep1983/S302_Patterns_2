package level3.payment.methods;

import level3.payment.PaymentMethod;

/**
 * Concrete PaymentMethod for bank transfer transactions.
 */
public class BankTransfer implements PaymentMethod {

    @Override
    public String getName() {
        return "bank transfer";
    }

    @Override
    public void pay(double amount) {
        System.out.println("A payment of " + amount + "€ was made via bank transfer\n");
    }

}
