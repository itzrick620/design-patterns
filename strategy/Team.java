package strategy;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private boolean offense;
    private Random random;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<Player>();
        random = new Random();
        offense = random.nextBoolean();
    }

    public void addTeamMember(String firstName, String lastName, PlayerType type) {
        if (type.equals(PlayerType.QUARTER_BACK)) {
            players.add(new QuarterBack(firstName, lastName, offense));
        } else if (type.equals(PlayerType.RECEIVER)) {
            players.add(new Receiver(firstName, lastName, offense));
        } else if (type.equals(PlayerType.LINEMAN)) {
            players.add(new Lineman(firstName, lastName, offense));
        } else {
            System.out.println("Sorry, " + teamName + " wasn't added to the team.");
        }
    }

    public void turnover() {
        offense = !offense;
        for (Player player : players) {
            player.turnover();
        }
    }

    public void executePlay() {
        for (Player player : players) {
            System.out.println(player + " " + player.play());
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return teamName;
    }

    public boolean onOffense() {
        return offense;
    }
}
