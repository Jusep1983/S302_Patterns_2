package level1.model;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza {
    String name;
    PizzaSize size;
    PizzaDough dough;
    List<PizzaTopping> toppings;

    public Pizza(String name, PizzaSize size, PizzaDough dough, PizzaTopping... toppings) {
        this.name = name;
        this.size = size;
        this.dough = dough;
        this.toppings = new ArrayList<>(Arrays.asList(toppings));
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
               "Size: " + this.size.getSize() + "\n" +
               "Dough: " + this.dough.getDescription() + "\n" +
               "Toppings: " + this.toppings + "\n";
    }

}
