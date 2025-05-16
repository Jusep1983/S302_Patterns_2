package level1.builders;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;
import level1.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizzaBuilder implements PizzaBuilder {
    private PizzaSize size;
    private PizzaDough dough;
    private final List<PizzaTopping> toppings = new ArrayList<>();

    public PepperoniPizzaBuilder() {
        this.toppings.add(PizzaTopping.MOZZARELLA);
        this.toppings.add(PizzaTopping.TOMATO_SAUCE);
        this.toppings.add(PizzaTopping.PEPPERONI);
    }

    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public void setDough(PizzaDough dough) {
        this.dough = dough;
    }

    @Override
    public Pizza build() {
        return new Pizza(
                "Pepperoni Pizza", this.size, this.dough, this.toppings.toArray(new PizzaTopping[0])
        );
    }

}
