package decorator;

import java.util.Scanner;

public class CarLotDriver {
	private Scanner scanner;

	public CarLotDriver() {
		scanner = new Scanner(System.in);
	}

	public void runDriver() {
		Vehicle car = new Car();
		System.out.println("\n******* Our new Car *******");
		System.out.println(car);

		Vehicle decoratedVehicle = new Smile(new Rims(new Paint(car, getColor())));
		System.out.println("\n******* We decorated our Car *******\n");
		System.out.println(decoratedVehicle);
	}

	private String getColor() {
		System.out.print(
				"What color would you like to paint your Vehicle (Enter either Red, Green, Purple, Blue, Yellow, Cyan, or None: ");
		return scanner.nextLine().toLowerCase();
	}

	public static void main(String[] args) {
		CarLotDriver carLot = new CarLotDriver();
		carLot.runDriver();
	}
}
