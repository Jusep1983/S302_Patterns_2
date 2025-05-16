package level1;

import level1.builders.VeganPizzaBuilder;
import level1.builders.HawaiianPizzaBuilder;
import level1.director.PizzaMaster;
import level1.builders.PepperoniPizzaBuilder;
import level1.model.Pizza;
import level1.model.enums.PizzaDough;
import level1.model.enums.PizzaSize;

public class Main {

    public static void main(String[] args) {

        PizzaMaster pizzaiolo = new PizzaMaster();

        Pizza smallPepperoniPizza = pizzaiolo.makePizza(
                new PepperoniPizzaBuilder(), PizzaSize.SMALL, PizzaDough.THIN_DOUGH
        );
        
        Pizza mediumHawaiianPizza = pizzaiolo.makePizza(
                new HawaiianPizzaBuilder(), PizzaSize.MEDIUM, PizzaDough.CLASSIC_DOUGH
        );

        Pizza largeVeganPizza = pizzaiolo.makePizza(
                new VeganPizzaBuilder(), PizzaSize.LARGE, PizzaDough.THICK_DOUGH
        );

        System.out.println(smallPepperoniPizza);
        System.out.println(mediumHawaiianPizza);
        System.out.println(largeVeganPizza);

    }

}
