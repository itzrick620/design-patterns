package strategy;

/**
 * Creates the basic variables for the player 
 */
public class Player {
    protected String firstName;
    protected String lastName;
    protected boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    /**
     * Initializes the first name, last name, and offense for the player
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Player(String firstName, String lastName, boolean offense){
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    /**
     * sets the defense behavior of the player to void, fully implemented by other classes
     */
    public void setDefenseBehavior(){
    }

    /**
     * sets the offense behavior of the player to void, fully implemented by other classes
     */
    public void setOffenseBehavior(){
    }

    /**
     * Method which returns the actions the player takes depending on if they are playing on offense or defense
     * If the player is on defense, it returns "not playing" for the offensive players as they cannot play defense
     */
    public String play(){
        if(offense) {
            setOffenseBehavior();
            return offenseBehavior.play();
        }
        else {
            setDefenseBehavior();
            return (defenseBehavior != null ? defenseBehavior.play() : "not playing");
        }
    }

    /**
     * Method that sets offense to defense during a turnover and resets the offensive and defensive behaviors of the player
     */
    public void turnover() {
        offense = !offense;
        setDefenseBehavior();
        setOffenseBehavior();
    }

    /**
     * Method that returns the first and last name of the player in the terminal
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
}