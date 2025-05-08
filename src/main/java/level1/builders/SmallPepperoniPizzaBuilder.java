package level1.builders;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;
import level1.model.Pizza;

public class SmallPepperoniPizzaBuilder implements PizzaBuilder {

    public Pizza build() {
        return new Pizza(
                "Small Pepperoni Pizza",
                PizzaSize.SMALL,
                PizzaDough.THIN_DOUGH,
                PizzaTopping.MOZZARELLA, PizzaTopping.TOMATO_SAUCE, PizzaTopping.PEPPERONI
        );
    }

}
