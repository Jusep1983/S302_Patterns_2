package level1;

import level1.builders.LargeVeganPizzaBuilder;
import level1.builders.MediumHawaiianPizzaBuilder;
import level1.director.PizzaMaster;
import level1.builders.SmallPepperoniPizzaBuilder;
import level1.model.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaMaster pizzaiolo = new PizzaMaster();

        Pizza pepperoniPizza = pizzaiolo.makePizza(new SmallPepperoniPizzaBuilder());
        Pizza hawaiianPizza = pizzaiolo.makePizza(new MediumHawaiianPizzaBuilder());
        Pizza veganPizza = pizzaiolo.makePizza(new LargeVeganPizzaBuilder());

        System.out.println(pepperoniPizza);
        System.out.println(hawaiianPizza);
        System.out.println(veganPizza);

    }

}
