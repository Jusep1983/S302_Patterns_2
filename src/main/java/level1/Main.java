package level1;

import level1.builders.LargeVeganPizzaBuilder;
import level1.builders.MediumHawaiianPizzaBuilder;
import level1.director.PizzaMaster;
import level1.builders.SmallPepperoniPizzaBuilder;
import level1.model.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaMaster pizzer = new PizzaMaster();

        Pizza pepperoniPizza = pizzer.makePizza(new SmallPepperoniPizzaBuilder());
        Pizza hawaiianPizza = pizzer.makePizza(new MediumHawaiianPizzaBuilder());
        Pizza veganPizza = pizzer.makePizza(new LargeVeganPizzaBuilder());

        System.out.println(pepperoniPizza);
        System.out.println(hawaiianPizza);
        System.out.println(veganPizza);

    }

}
