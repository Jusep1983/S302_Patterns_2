package level1.builders;

import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;
import level1.model.Pizza;

public class MediumHawaiianPizzaBuilder implements PizzaBuilder {

    public Pizza build() {
        return new Pizza(
                "Medium Hawaiian Pizza",
                PizzaSize.MEDIUM,
                PizzaDough.CLASSIC_DOUGH,
                PizzaTopping.MOZZARELLA, PizzaTopping.TOMATO_SAUCE, PizzaTopping.PINEAPPLE, PizzaTopping.PROSCIUTTO
        );
    }

}
