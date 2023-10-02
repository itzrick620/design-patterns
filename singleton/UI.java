package singleton;

import java.util.Scanner;

public class UI {
    private Scanner reader;
    private static final String YES = "y";
    private static final String NO = "n";

    public UI() {
        reader = new Scanner(System.in);
    }

    public void run() {
        Game game = Game.getInstance();
        clear();
        System.out.println("Welcome to our Anagram Game!");

        while (true) {
            System.out.print("Enter an Anagram of the following '" + game.getQuestion() + "': ");
            String userAnswer = reader.nextLine().trim().toLowerCase();

            if (game.isCorrect(userAnswer)) {
                System.out.println("Yay! You got it.");
            } else {
                System.out.println("Sorry, that is not a valid anagram");
            }

            if (!playAgain())
                break;
            clear();
        }

        System.out.println("Your final score is " + game.getScore());
        System.out.println("Have a nice day");
    }

    public boolean playAgain() {
        while (true) {
            System.out.println("Would you like to continue (Y)es or (N)o: ");

            String result = reader.nextLine().trim();

            if (result.equalsIgnoreCase(YES)) {
                return true;
            } else if (result.equalsIgnoreCase(NO)) {
                return false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.run();
    }
}
