package level3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer of the shoe store.
 * Each Customer has a unique ID, name, and can accumulate a list of purchases.
 */
public class Customer {
    private static int idCustomerCounter = 0;
    private final int idCustomer;
    private final String name;
    private final List<Purchase> purchases;

    public Customer(String name) {
        this.idCustomer = ++idCustomerCounter;
        this.name = name;
        this.purchases = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }

    @Override
    public String toString() {
        return "id Customer: " + idCustomer +
               " " + name + ' ' +
               "purchases: " + purchases;
    }

}
