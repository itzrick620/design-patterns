package strategy;

import java.util.Scanner;

/**
 * Instantiates the FootballDriver class, creating a scanner and a team
 */
public class FootballDriver {
	private Scanner scanner;
	private Team seaHawks;

	public FootballDriver() {
		scanner = new Scanner(System.in);
	}

	/**
	 * Runs the play method which displays the team, whether they are offense or defense and outputs
	 * whether a play or turnover occurs, after which it again displays if the team is on offense or defense
	 */
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

	/**
	 * initializeTeam adds the 3 players used in the program to the team and assigns them their respective roles
	 */
	private Team initializeTeam() {
		Team seaHawks = new Team("Seahawks");
		seaHawks.addTeamMember("Gino", "Smith", PlayerType.QUARTER_BACK);
		seaHawks.addTeamMember("Tyler", "Locket", PlayerType.RECEIVER);
		seaHawks.addTeamMember("BJ", "Finney", PlayerType.LINEMAN);
		return seaHawks;
	}
	
	/**
	 * displayTeam grabs the name of the team as well as the players and displays them when the program is run
	 */
	private void displayTeam() {
		System.out.println("\n******* " + seaHawks.getName() + "******* ");

		for (Player player : seaHawks.getPlayers()) {
			System.out.println(" - " + player);
		}
	}

	/**
	 * displayOffenseOrDefense simply outputs whether the team is on offense or defense according to the boolean 
	 * created above
	 */
	private void displayOffenseOrDefense() {
		if (seaHawks.onOffense()) {
			System.out.println("On Offense");
		} else {
			System.out.println("On Defense");
		}
	}

	/**
	 * getCommand reads the users input and runs the related action, outputting an error if an invalid
	 * key is pressed
	 */
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

	/**
	 * The main method runs the program as a whole
	 */
	public static void main(String[] args) {
		FootballDriver football = new FootballDriver();
		football.play();
	}
}