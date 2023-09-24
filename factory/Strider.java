/*
 * Ricky Garretson
 */
package factory;

/*
 * Represents a Strider, a type of Bike.
 * This class extends the Bike class and provides specific attributes and assembly logic
 * for Strider bikes.
 */
public class Strider extends Bike {

    /*
     * Initializes a new Strider bike.
     * Initializes the name, price, and other attributes specific to Strider bikes.
     */
    public Strider() {
        /*
         * Initializes Strider-specific attributes
         */
        super();
        this.name = "Strider";
        this.price = 80.0;
        this.numWheels = 2;
        this.hasPedals = false;
        this.hasTrainingWheels = false;
    }

    /*
     * Assembles the Strider bike.
     * This method outlines the steps to assemble a Strider bike, including frame assembly
     * and wheel addition.
     * @return a String description of the assembly process.
     */
    @Override
    public String assembleBike() {
        StringBuilder assemblySteps = new StringBuilder();
        assemblySteps.append("Creating a ").append(name).append("\n");
        assemblySteps.append("- Assembling ").append(name).append(" frame\n");
        assemblySteps.append("- Adding 2 wheel(s)\n");
        return assemblySteps.toString();
    }
}