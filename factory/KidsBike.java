/*
 * Ricky Garretson
 */
package factory;

/*
 * Represents a KidsBike, a type of Bike.
 * This class extends the Bike class and provides specific attributes and assembly logic for KidsBike bikes.
 */
public class KidsBike extends Bike {

    /*
     * Initializes a new KidsBike with default values.
     * Default values include the name "Kids Bike," a price of 120.0, two wheels, training wheels, and pedals.
     */
    public KidsBike() {
        super();
        this.name = "Kids Bike";
        this.price = 120.0;
        this.numWheels = 2;
        this.hasPedals = true;
        this.hasTrainingWheels = true;
    }

    /*
     * Assembles the KidsBike.
     * This method outlines the steps to assemble a KidsBike, including frame assembly,
     * adding two wheels, attaching training wheels, and adding pedals.
     * @return a String description of the assembly process.
     */
    @Override
    public String assembleBike() {
        StringBuilder assemblySteps = new StringBuilder();
        assemblySteps.append("Creating a ").append(name).append("\n");
        assemblySteps.append("- Assembling ").append(name).append(" frame\n");
        assemblySteps.append("- Adding 2 wheel(s)\n");
        assemblySteps.append("- Adding training wheels\n");
        assemblySteps.append("- Adding pedals\n");
        return assemblySteps.toString();
    }
}