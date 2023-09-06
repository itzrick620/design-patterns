package strategy;

/**
 * OBlockBehavior implements OffenseBehavior and outputs the lineman blocking defenders
 */
public class OBlockBehavior implements OffenseBehavior{
    public String play()
    {
        return "block defenders";
    }
}