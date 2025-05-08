package level1.director;

import level1.builders.PizzaBuilder;
import level1.model.Pizza;

public class PizzaMaster {

    public PizzaMaster() {
    }

    public Pizza makePizza(PizzaBuilder builder) {

        return builder.build();

    }

}
