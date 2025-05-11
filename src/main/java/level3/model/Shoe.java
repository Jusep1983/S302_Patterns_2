package level3.model;

import java.util.Objects;

/**
 * Represents a single shoe with an ID, brand, model, and price.
 */
public class Shoe {
    private int idShoe;
    private String brand;
    private String model;
    private double price;

    public Shoe(int idShoe, String brand, String model, double price) {
        this.idShoe = idShoe;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Shoe shoe = (Shoe) o;
        return Double.compare(price, shoe.price) == 0 && Objects.equals(idShoe, shoe.idShoe) && Objects.equals(brand, shoe.brand) && Objects.equals(model, shoe.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShoe, brand, model, price);
    }

    @Override
    public String toString() {
        return "idShoe:" + idShoe + " " + brand + " " + model + " " + price + "€";
    }

}
