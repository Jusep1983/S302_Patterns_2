package level3;

import level3.model.Customer;
import level3.model.Purchase;
import level3.model.Shoe;
import level3.payment.methods.BankTransfer;
import level3.payment.methods.CreditCardPayment;
import level3.payment.methods.PaypalPayment;
import level3.model.ShoeStore;

/**
 * Demonstrates selling shoes and processing payments via various methods.
 */
public class Main {
    public static void main(String[] args) {

        ShoeStore shoeStore = new ShoeStore();

        Shoe adidasCopaMundial = new Shoe(1, "Adidas", "Copa mundial", 120.00);
        Shoe nikeTiempo = new Shoe(2, "Nike", "Tiempo", 90.00);
        Shoe mercata = new Shoe(3, "Niko", "Tiempu", 15.95);
        Shoe pumaFuture = new Shoe(4, "Puma", "Future Z 1.3", 110.00);
        Shoe newBalanceFuron = new Shoe(5, "New Balance", "Furon v7 Pro", 105.50);
        Shoe mizunoMorelia = new Shoe(6, "Mizuno", "Morelia Neo III", 130.75);

        Customer manolo = new Customer("Manolito");
        Customer nerea = new Customer("Nerea");

        Purchase firstPurchase = new Purchase(new CreditCardPayment());
        Purchase secondPurchase = new Purchase(new PaypalPayment());
        Purchase thirdPurchase = new Purchase(new BankTransfer());

        firstPurchase.addShoe(adidasCopaMundial, nikeTiempo);
        shoeStore.sellShoes(manolo, firstPurchase);

        secondPurchase.addShoe(mercata, pumaFuture);
        shoeStore.sellShoes(nerea, secondPurchase);

        thirdPurchase.addShoe(newBalanceFuron, mizunoMorelia);
        shoeStore.sellShoes(nerea, thirdPurchase);

        System.out.println(manolo);
        System.out.println(nerea);

    }

}
