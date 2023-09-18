//Ricky Garretson

package decorator;

import java.util.ArrayList;

//Abstract class for vehicle decorators.
public abstract class VehicleDecorator extends Vehicle {

    
    //Constructor for the vehicle decorator.
    //@param lines The lines depicting the decorated vehicle.
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    //Integrates the decoration into the vehicle character by character.
    //@param decor The decoration to integrate.
        protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < decor.size(); i++) {
            String line = decor.get(i);
            String vehicleLine = lines.get(i);
            int offset = 5; // Use this offset to adjust the position of decorations.

            // Determine the offset based on the position of the decoration.
            if (line.contains("o")) {
                // Offset for the smile or rims (adjust as needed).
                offset = 5;
            }

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) != ' ') {
                    // Move the decoration to the desired position.
                    int newPos = j + offset;

                    // Check if the new position is within the vehicleLine boundaries.
                    if (newPos >= 0 && newPos < vehicleLine.length()) {
                        vehicleLine = vehicleLine.substring(0, newPos) + line.charAt(j) + vehicleLine.substring(newPos + 1);
                    }
                }
            }
            lines.set(i, vehicleLine);
        }
    }
}