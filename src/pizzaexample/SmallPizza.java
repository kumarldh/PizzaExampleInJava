package pizzaexample;

/**
 * Description of SmallPizza
 *
 * @author chetan
 */
class SmallPizza extends AbstractPizza {

    /**
     * Small Pizza!
     *
     * @param AbstractTopping List of pizza toppings
     */
    public SmallPizza(AbstractTopping[] toppings) {
        super(toppings);
        this.sizeInches = 6;
        this.sizeString = "small";
        this.basePrice = 5;
    }

}
