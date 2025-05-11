package level3.payment.gateway;

import level3.payment.PaymentMethod;

/**
 * Simulates a payment gateway that processes payments via different methods.
 */
public class PaymentGateway {

    public void processPayment(PaymentMethod method, double amount) {

        method.pay(amount);

    }

}
