/*
 * Ricky Garretson
 */
package factory;

/*
 * Represents a Tricycle, a type of Bike.
 * This class extends the Bike class and provides specific attributes and assembly logic for Tricycle bikes.
 */
public class Tricycle extends Bike {

    /*
     * Initializes a new Tricycle bike with default values.
     * Default values include the name "Tricycle," a price of 100.0, three wheels, and pedals.
     */
    public Tricycle() {
        super();
        this.name = "Tricycle";
        this.price = 100.0;
        this.numWheels = 3;
        this.hasPedals = true;
        this.hasTrainingWheels = false;
    }

    /*
     * Assembles the Tricycle bike.
     * This method outlines the steps to assemble a Tricycle bike, including frame assembly, adding three wheels, and attaching pedals.
     * @return a String description of the assembly process.
     */
    @Override
    public String assembleBike() {
        StringBuilder assemblySteps = new StringBuilder();
        assemblySteps.append("Creating a ").append(name).append("\n");
        assemblySteps.append("- Assembling ").append(name).append(" frame\n");
        assemblySteps.append("- Adding 3 wheel(s)\n");
        assemblySteps.append("- Adding pedals\n");
        return assemblySteps.toString();
    }
}