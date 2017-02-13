package pizzaexample;

/**
 * Description of SmallPizza
 *
 * @author chetan
 */
class MediumPizza extends AbstractPizza {

    /**
     * Medium Pizza!
     *
     * @param AbstractTopping List of pizza toppings
     */
    public MediumPizza(AbstractTopping[] toppings) {
        super(toppings);
        this.sizeInches = 9;
        this.sizeString = "medium";
        this.basePrice = 7.5;
    }

}
