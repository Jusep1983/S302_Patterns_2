package level1.builders;

import level1.model.Pizza;
import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;
import level1.model.enums.PizzaTopping;

public interface PizzaBuilder {
    void setSize(PizzaSize size);
    void setDough(PizzaDough dough);
    Pizza build();
}
