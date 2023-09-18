//Ricky Garretson
package decorator;

import java.util.ArrayList;

//Class representing the rims decoration for a vehicle.
public class Rims extends VehicleDecorator {
    //Constructor for the rims decoration.
    //@param vehicle The vehicle to add the rims to.
    public Rims(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("design-patterns/decorator/txt/rims.txt"));
    }
}