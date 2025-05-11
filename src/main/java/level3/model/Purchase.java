package level3.model;

import level3.payment.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a purchase order containing multiple shoes.
 * Each Purchase has a unique ID, a list of Shoe items, and a payment method.
 */
public class Purchase {
    private static int idPurchaseCounter = 0;
    private final int idPurchase;
    private List<Shoe> shoes;
    private double amount;
    private final PaymentMethod method;

    public Purchase(PaymentMethod method) {
        this.idPurchase = ++idPurchaseCounter;
        this.shoes = new ArrayList<>();
        this.amount = calculateAmount();
        this.method = method;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void addShoe(Shoe... shoesArgs) {
        for (Shoe shoe : shoesArgs) {
            this.shoes.add(shoe);

            System.out.println("id purchase: " + getIdPurchase() + "  "
                               + shoe.getBrand() + " " + shoe.getModel() + " added to the purchase priced at "
                               + shoe.getPrice() + "€"
            );
        }
        this.amount = calculateAmount();
    }

    public double getAmount() {
        return amount;
    }

    public double calculateAmount() {
        return shoes.stream()
                .mapToDouble(Shoe::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "\n\tid: " + idPurchase +
               ", shoes: " + shoes +
               ", amount: " + amount +
               ", method: " + method.getName();
    }

}
