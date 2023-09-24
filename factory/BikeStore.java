/*
 * Ricky Garretson
 */
package factory;

/**
 * Represents a Bike Store that can create different types of bikes.
 * This class acts as a factory for creating various types of bikes, such as Tricycle, Strider, and KidsBike.
 * It provides a createBike() method to create a specific type of bike based on the input.
 */
public class BikeStore {    
    /*
     * Create a bike of the specified type.
     * @param type the type of bike to create (e.g., "tricycle", "strider", "kids bike").
     * @return a Bike object representing the created bike.
     * @throws IllegalArgumentException if an invalid bike type is provided.
     */
    public Bike createBike(String type) {
        switch (type.toLowerCase()) {
            case "tricycle":
                return new Tricycle();
            case "strider":
                return new Strider();
            case "kids bike":
                return new KidsBike();
            default:
                throw new IllegalArgumentException("Invalid bike type: " + type);
        }
    }
}