package factory;

import java.util.Scanner;

public class BikeStoreDriver {
	private Scanner scanner;

	public BikeStoreDriver() {
		scanner = new Scanner(System.in);
	}

	public void runBikeStore() {
		System.out.println("Welcome to our Bike Store.");
		BikeStore bikeStore = new BikeStore();
		Bike bike;

		switch (getBikeType()) {
			case 0:
				bike = bikeStore.createBike("tricycle");
				break;
			case 1:
				bike = bikeStore.createBike("strider");
				break;
			case 2:
				bike = bikeStore.createBike("kids bike");
				break;
			default:
				System.out.println("We are sorry to hear you do not want a bike.");
				System.out.println("Goodbye");
				return;
		}
		System.out.println(bike.assembleBike());
	}

	private int getBikeType() {
		while (true) {
			System.out.println("\nEnter Bike Type: ");
			System.out.println("1. Tricycle\n2. Strider\n3. Kids Bike\n4. None");

			try {
				String line = scanner.nextLine();
				int num = Integer.parseInt(line) - 1;
				if (num >= 0 && num <= 3) {
					return num;
				}
			} catch (NumberFormatException e) {
			}
			System.out.println("Please enter a valid whole number between 1 and 4.");
		}
	}

	public static void main(String[] args) {
		BikeStoreDriver driver = new BikeStoreDriver();
		driver.runBikeStore();
	}

}
