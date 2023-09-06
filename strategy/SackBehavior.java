package strategy;

/**
 * SackBehavior implements DefenseBehavior
 * Outputs the result of a sack on the QB if the action is chosen
 */
public class SackBehavior implements DefenseBehavior{
    public String play()
    {
        return "Sack the quarterback";
    }
}