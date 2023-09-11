package observer;

import java.util.Scanner;

public class GolfDriver {
	private Scanner scanner;
	private Golfer golfer;
	private Observer holeScoreDisplay;
	private Observer roundScoreDisplay;

	public GolfDriver() {
		scanner = new Scanner(System.in);
	}

	public void run() {
		int[] pars = { 3, 4, 2, 2, 3, 4, 2, 3, 4 };
		clear();
		System.out.print("Enter Golfers Name: ");
		String golferName = scanner.nextLine().trim();

		golfer = new Golfer(golferName);
		holeScoreDisplay = new HoleScoreDisplay(golfer);
		roundScoreDisplay = new RoundScoreDisplay(golfer);

		System.out.println(golfer.getName() + " is playing golf");

		for (int i = 0; i < pars.length; i++) {
			System.out.println("\n*** Hole " + (i + 1) + " ***");
			System.out.print("Number of Strokes: ");
			int numStrokes = Integer.parseInt(scanner.nextLine().trim());
			golfer.enterScore(numStrokes, pars[i]);
			viewStats();
		}

		System.out.println("We hope you enjoyed your round of golf " + golfer.getName() + ", have a good day");
	}

	private void viewStats() {
		while (true) {
			System.out.print("1. View Hole Stats, 2. View Round Stats, 3. View Both Stats, 4. Continue: ");
			int command = Integer.parseInt(scanner.nextLine().trim());
			if (command == 4) {
				return;
			}
			if (command == 1) {
				System.out.println(holeScoreDisplay);
				break;
			} else if (command == 2) {
				System.out.println(roundScoreDisplay);
				break;
			} else if (command == 3) {
				System.out.println(holeScoreDisplay);
				System.out.println(roundScoreDisplay);
				break;
			} else {
				System.out.println("Sorry, that's not a valid input option.");
			}
		}
	}

	private void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String[] args) {
		GolfDriver driver = new GolfDriver();
		driver.run();
	}
}
