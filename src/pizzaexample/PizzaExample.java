package pizzaexample;

/**
 *
 * @author chetan
 */
public class PizzaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToppingCheese toppingCheese = new ToppingCheese();
        ToppingCapsicum toppingCapsicum = new ToppingCapsicum();
        ToppingMushroom toppingMushroom = new ToppingMushroom();
        ToppingOlive toppingOlive = new ToppingOlive();
        ToppingOnion toppingOnion = new ToppingOnion();
        ToppingTomato toppingTomato = new ToppingTomato();
        AbstractTopping[] toppings = {toppingCapsicum, toppingCheese, toppingMushroom, toppingOlive, toppingOnion, toppingTomato};
        SmallPizza smallPizza = new SmallPizza(toppings);
        smallPizza.describePizza();
    }

}
