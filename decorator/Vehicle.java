//Ricky Garretson

package decorator;

import java.util.ArrayList;
//Abstract class representing a vehicle.
public abstract class Vehicle {
    

    //Stores the lines of the vehicle.
    protected ArrayList<String> lines = new ArrayList<String>();
    //Constructor for the vehicle.
    //@param lines The lines depicting the vehicle.
    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }

    //Converts the vehicle to a string representation.
    //@return The vehicle as a string.
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (String line : lines) {
            output.append(line).append("\n");
        }
        return output.toString();
    }
}