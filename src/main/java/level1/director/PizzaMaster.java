package level1.director;

import level1.builders.PizzaBuilder;
import level1.model.Pizza;
import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;

public class PizzaMaster {

    public PizzaMaster() {
    }

    public Pizza makeSmallHawaiianPizzaWithThinDough (PizzaBuilder HawaiianPizzaBuilder){
        HawaiianPizzaBuilder.setSize(PizzaSize.SMALL);
        HawaiianPizzaBuilder.setDough(PizzaDough.THIN_DOUGH);
        return HawaiianPizzaBuilder.build();
    }

    public Pizza makeMediumPepperoniPizzaWithThickDough(PizzaBuilder PepperoniPizzaBuilder ){
        PepperoniPizzaBuilder.setSize(PizzaSize.MEDIUM);
        PepperoniPizzaBuilder.setDough(PizzaDough.THICK_DOUGH);
        return PepperoniPizzaBuilder.build();
    }

    public Pizza makeLargeVeganPizzaWithClassicDough(PizzaBuilder VeganPizzaBuilder){
        VeganPizzaBuilder.setSize(PizzaSize.LARGE);
        VeganPizzaBuilder.setDough(PizzaDough.CLASSIC_DOUGH);
        return VeganPizzaBuilder.build();
    }

}
