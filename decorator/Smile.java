//Ricky Garretson

package decorator;

import java.util.ArrayList;
//Class representing the smile decoration for a vehicle.
public class Smile extends VehicleDecorator {
    //Constructor for the smile decoration.
    //@param vehicle The vehicle to add the smile to.
    public Smile(Vehicle vehicle) {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("design-patterns/decorator/txt/smile.txt"));
    }
}