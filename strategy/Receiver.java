package strategy;

/**
 * Receiver extends player
 * Grabs the first and last name as well as if the player is on offense from the player class
 * Sets offensive and defensive behaviors to a random possible option
 */
public class Receiver extends Player {
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * setOffensiveBehavior sets offenseBehavior to ReceiverBehavior as it is the only possible action a receiver can take
     */
    public void setOffenseBehavior()
    {
        offenseBehavior = new ReceiverBehavior();
    }

    /**
     * setDefensiveBehavior sets defenseBehavior to null as a receiver cannot play defense
     */
    public void setDefenseBehavior()
    {
        defenseBehavior = null;
    }

}