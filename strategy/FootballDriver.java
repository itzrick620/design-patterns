package strategy;

import java.util.Scanner;

public class FootballDriver {
	private Scanner scanner;
	private Team seaHawks;

	public FootballDriver() {
		scanner = new Scanner(System.in);
	}

	public void play() {
		seaHawks = initializeTeam();
		displayTeam();
		displayOffenseOrDefense();

		while (true) {
			int command = getCommand();

			if (command == 3) {
				break;
			} else if (command == 1) {
				System.out.println("\n******* Executing Play ******* ");
				seaHawks.executePlay();
			} else if (command == 2) {
				System.out.println("\n******* Turnover ******* ");
				seaHawks.turnover();
				displayOffenseOrDefense();
			}
		}

		System.out.println("Goodbye");
	}

	private Team initializeTeam() {
		Team seaHawks = new Team("Seahawks");
		seaHawks.addTeamMember("Gino", "Smith", PlayerType.QUARTER_BACK);
		seaHawks.addTeamMember("Tyler", "Locket", PlayerType.RECEIVER);
		seaHawks.addTeamMember("BJ", "Finney", PlayerType.LINEMAN);
		return seaHawks;
	}

	private void displayTeam() {
		System.out.println("\n******* " + seaHawks.getName() + "******* ");

		for (Player player : seaHawks.getPlayers()) {
			System.out.println(" - " + player);
		}
	}

	private void displayOffenseOrDefense() {
		if (seaHawks.onOffense()) {
			System.out.println("On Offense");
		} else {
			System.out.println("On Defense");
		}
	}

	private int getCommand() {
		while (true) {
			System.out.print("\n1. Execute Play, 2. Turnover, 3. Quit: ");
			try {
				int option = Integer.parseInt(scanner.nextLine().trim());

				if (option >= 1 && option <= 3) {
					return option;
				}
			} catch (Exception e) {
			}
			System.out.println("Please enter a valid number between 1 and 3.");
		}

	}

	public static void main(String[] args) {
		FootballDriver football = new FootballDriver();
		football.play();
	}

}
