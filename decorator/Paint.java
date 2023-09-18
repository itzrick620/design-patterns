//Ricky Garretson
package decorator;

import java.util.ArrayList;

//Class representing the paint decoration for a vehicle.
public class Paint extends VehicleDecorator {
     //Constructor for the paint decoration.
     //@param vehicle The vehicle to add the paint to.
     //@param color   The color of the paint.
    public Paint(Vehicle vehicle, String color) {
        super(vehicle.lines);
        switch (color) {
            case "red":
                for (int i = 0; i < lines.size(); i++) {
                    lines.set(i, "\u001B[31m" + lines.get(i) + "\u001B[0m");
                }
                break;
            case "green":
                for (int i = 0; i < lines.size(); i++) {
                    lines.set(i, "\u001B[32m" + lines.get(i) + "\u001B[0m");
                }
                break;
            case "yellow":
                for (int i = 0; i < lines.size(); i++) {
                    lines.set(i, "\u001B[33m" + lines.get(i) + "\u001B[0m");
                }
                break;
            case "blue":
                for (int i = 0; i < lines.size(); i++) {
                    lines.set(i, "\u001B[34m" + lines.get(i) + "\u001B[0m");
                }
                break;
            case "purple":
                for (int i = 0; i < lines.size(); i++) {
                    lines.set(i, "\u001B[35m" + lines.get(i) + "\u001B[0m");
                }
                break;
            case "cyan":
                for (int i = 0; i < lines.size(); i++) {
                    lines.set(i, "\u001B[36m" + lines.get(i) + "\u001B[0m");
                }
                break;
            case "none":
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}