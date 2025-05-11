package level3.model;

import level3.payment.gateway.PaymentGateway;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the shoe store which processes purchases for customers.
 * Delegates payment processing to a PaymentGateway.
 */
public class ShoeStore {
    private final PaymentGateway paymentGateway = new PaymentGateway();
    private List<Customer> customers;
    private List<Shoe> stockShoes;

    public ShoeStore() {
        this.customers = new ArrayList<>();
    }

    public void sellShoes(Customer customer, Purchase purchase) {
        System.out.print("Selling purchase " + purchase.getIdPurchase()
                         + " for " + purchase.getAmount() + "€ via " + purchase.getMethod().getName()
                         + "bought by " + customer.getName() + "... "
        );
        this.paymentGateway.processPayment(purchase.getMethod(), purchase.getAmount());
        customer.addPurchase(purchase);
    }

}
