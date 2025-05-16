package level1.builders;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;
import level1.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class VeganPizzaBuilder implements PizzaBuilder {
    private PizzaSize size;
    private PizzaDough dough;
    private final List<PizzaTopping> toppings = new ArrayList<>();

    public VeganPizzaBuilder() {
        this.toppings.add(PizzaTopping.VEGAN_CHEESE);
        this.toppings.add(PizzaTopping.TOMATO_SAUCE);
        this.toppings.add(PizzaTopping.MUSHROOMS);
        this.toppings.add(PizzaTopping.EGGPLANT);
        this.toppings.add(PizzaTopping.PINEAPPLE);
        this.toppings.add(PizzaTopping.GREEN_PESTO);
        this.toppings.add(PizzaTopping.TOFU_CRUMBLE);
        this.toppings.add(PizzaTopping.BLACK_OLIVES);
        this.toppings.add(PizzaTopping.ROASTED_RED_PEPPERS);

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
                "Vegan Pizza", this.size, this.dough, this.toppings.toArray(new PizzaTopping[0])
        );
    }

}
