package level1.builders;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;
import level1.model.Pizza;

public class LargeVeganPizzaBuilder implements PizzaBuilder {

    public Pizza build() {
        return new Pizza(
                "Large Vegetal Pizza",
                PizzaSize.LARGE,
                PizzaDough.THICK_DOUGH,
                PizzaTopping.VEGAN_CHEESE, PizzaTopping.TOMATO_SAUCE, PizzaTopping.MUSHROOMS, PizzaTopping.EGGPLANT
        );
    }

}
