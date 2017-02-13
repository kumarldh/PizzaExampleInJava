package pizzaexample;

/**
 * Abstract Pizza Class
 *
 * @author chetan
 */
abstract class AbstractPizza {

    /**
     * Base price of a pizza with cheese.
     *
     * @var double
     */
    protected double basePrice = 0;

    /**
     * Total price of a pizza with toppings etc.
     *
     * @var float
     */
    protected double totalPrice = 0;

    /**
     * Size, small, large or medium
     *
     * @var string
     */
    protected String sizeString = "";

    /**
     * Size in Inches
     *
     * @var double
     */
    protected int sizeInches;

    /**
     * List of toppings.
     *
     * @var AbstractTopping list
     */
    protected AbstractTopping[] toppings;

    /**
     * Create the pizza!
     *
     * @param AbstractTopping $toppings
     */
    public AbstractPizza(AbstractTopping[] toppings) {
        if (toppings.length > 0) {
            this.toppings = toppings;
        }
    }

    /**
     * Get the size.
     *
     * @return string
     */
    public String getSize() {
        return this.sizeString + "(" + this.sizeInches + "\")";
    }

    /**
     * Get base price.
     *
     * @return double
     */
    public double getBasePrice() {
        return this.basePrice;
    }

    /**
     * Get total price.
     *
     * @return float
     */
    public double getTotalPrice() {
        this.totalPrice = this.totalPrice + this.basePrice;
        //this.toppings.
        for (AbstractTopping topping : toppings) {
            this.totalPrice += topping.getPrice();
        }
        return this.totalPrice;
    }

    /**
     * Describe the pizza, may be for billing.
     */
    public void describePizza() {
        System.out.println("This Pizza is a " + this.sizeString + "(" + this.sizeInches + " inches) pizza. ");
        System.out.println("Base price(w/out any topping): " + this.getBasePrice() + " ₹ ");
        System.out.println("This Pizza has following items ");
        System.out.println(" - Cheese ");
        for (AbstractTopping topping : toppings) {
            System.out.println(" - " + topping.getName() + " (" + topping.getPrice() + " ₹)");
        }
        System.out.println("Total price(with topping): " + this.getTotalPrice() + " ₹");

    }

}
