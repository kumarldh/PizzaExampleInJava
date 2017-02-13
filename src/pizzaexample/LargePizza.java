package pizzaexample;

/**
 * Description of SmallPizza
 *
 * @author chetan
 */
class LargePizza extends AbstractPizza {

    /**
     * Medium Pizza!
     *
     * @param AbstractTopping List of pizza toppings
     */
    public LargePizza(AbstractTopping[] toppings) {
        super(toppings);
        this.sizeInches = 12;
        this.sizeString = "large";
        this.basePrice = 10;
    }

}
