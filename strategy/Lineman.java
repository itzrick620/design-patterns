package strategy;
import java.util.Random;

/**
 * Lineman extends player
 * Grabs the first and last name as well as if the player is on offense from the player class
 * Sets offensive and defensive behaviors to a random possible option
 */
public class Lineman extends Player { 
    private Random random;
    public Lineman(String firstName, String lastName, boolean offense){
        super(firstName, lastName, offense);
        this.random = new Random();
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * setDefenseBehavior randomly selects an action for the defensive lineman to take
     */
    public void setDefenseBehavior()
    {
        int choice = random.nextInt(3);
        switch(choice)
        {
            case 0:
                defenseBehavior = new BlockBehavior();
                break;
            case 1:
                defenseBehavior = new StripBehavior();
                break;
            case 2:
                defenseBehavior = new SackBehavior();
        }
    }

    /**
     * setOffensiveBehavior sets the offensive lineman to block
     */
    public void setOffenseBehavior()
    {
        offenseBehavior = new OBlockBehavior();
    }
}