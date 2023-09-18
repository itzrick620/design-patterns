//Ricky Garretson

package decorator;

//Class representing a car
public class Car extends Vehicle {

     //Constructor for the car.
    public Car() {
        super(FileReader.getLines("design-patterns/decorator/txt/car.txt"));
    }
}