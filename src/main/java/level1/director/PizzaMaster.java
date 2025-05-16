package level1.director;

import level1.builders.PizzaBuilder;
import level1.model.Pizza;
import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;

public class PizzaMaster {

    public PizzaMaster() {
    }

    public Pizza makePizza(PizzaBuilder pizzaBuilder, PizzaSize size, PizzaDough dough) {
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDough(dough);
        return pizzaBuilder.build();
    }

}
