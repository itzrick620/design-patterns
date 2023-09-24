/*
 * Ricky Garretson
 */
package factory;

/**
 * Represents a Bike with common attributes and methods.
 *
 * This is an abstract class that serves as a blueprint for various types of bikes.
 * Subclasses should implement the assembleBike() method for specific assembly steps.
 *
 * @author Your Name
 * @version 1.0
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Initializes a new Bike with default values.
     *
     * The default values include an unknown name, a price of 0.0, and other attributes set to false or 0.
     */
    public Bike() {
        this.name = "Unknown";
        this.price = 0.0;
        this.numWheels = 0;
        this.hasPedals = false;
        this.hasTrainingWheels = false;
    }

    /**
     * Assembles the bike.
     *
     * Subclasses should provide specific implementations for this method to outline the assembly process.
     *
     * @return a String description of the assembly process.
     */
    public abstract String assembleBike();

    /**
     * Get the price of the bike.
     *
     * @return the price of the bike.
     */
    public double getPrice() {
        return price;
    }
}