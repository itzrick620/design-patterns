package strategy;
import java.util.Random;

/**
 * QuarterBack extends player
 * Grabs the first and last name as well as if the player is on offense from the player class
 * Sets offensive and defensive behaviors to a random possible option
 */
public class QuarterBack extends Player {
    private Random random;
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.random = new Random();
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * setOffenseBehavior randomly selects from 2 possible options the quarterback can take
     */
    public void setOffenseBehavior()
    {
        int choice = random.nextInt(2);
        switch(choice)
        {
            case 0:
                offenseBehavior = new RunBehavior();
                break;
            case 1:
                offenseBehavior = new PassBehavior();
        }
    }

    /**
     * setDefenseBehavior sets defenseBehavior to null as a quarterback cannot play defense
     */
    public void setDefenseBehavior()
    {
        defenseBehavior = null;
    }
    
}