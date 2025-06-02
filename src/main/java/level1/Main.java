package level1;

import level1.builders.VeganPizzaBuilder;
import level1.builders.HawaiianPizzaBuilder;
import level1.director.PizzaMaster;
import level1.builders.PepperoniPizzaBuilder;
import level1.model.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaMaster pizzaiolo = new PizzaMaster();
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PepperoniPizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        VeganPizzaBuilder veganPizzaBuilder = new VeganPizzaBuilder();

        Pizza smallHawaiianPizzaWithThinDough = pizzaiolo.makeSmallHawaiianPizzaWithThinDough(hawaiianPizzaBuilder);
        Pizza mediumPepperoniPizzaWithThickDough = pizzaiolo.makeMediumPepperoniPizzaWithThickDough(pepperoniPizzaBuilder);
        Pizza largeVeganPizzaWithClassicDough = pizzaiolo.makeLargeVeganPizzaWithClassicDough(veganPizzaBuilder);
        
        System.out.println(smallHawaiianPizzaWithThinDough);
        System.out.println(mediumPepperoniPizzaWithThickDough);
        System.out.println(largeVeganPizzaWithClassicDough);

    }

}
