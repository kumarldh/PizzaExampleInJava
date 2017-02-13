package pizzaexample;

/**
 * Description of AbstractTopping
 *
 * @author chetan
 */
class AbstractTopping {

    /**
     * Price for topping.
     *
     * @var double
     */
    protected double price = 0;

    /**
     * Name for the topping.
     *
     * @var type
     */
    protected String name = "";

    /**
     * Returns price for the topping
     *
     * @return double
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * Returns name of the topping
     *
     * @return string
     */
    public String getName() {
        return this.name;
    }

}
