package level1.builders;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;
import level1.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private PizzaSize size;
    private PizzaDough dough;
    private final List<PizzaTopping> toppings = new ArrayList<>();


    public HawaiianPizzaBuilder() {
        toppings.add(PizzaTopping.MOZZARELLA);
        toppings.add(PizzaTopping.TOMATO_SAUCE);
        toppings.add(PizzaTopping.PINEAPPLE);
        toppings.add(PizzaTopping.PROSCIUTTO);
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
                "Hawaiian Pizza", this.size, this.dough, this.toppings.toArray(new PizzaTopping[0])
        );
    }

}
