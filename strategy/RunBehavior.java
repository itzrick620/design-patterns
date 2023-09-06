package strategy;

/**
 * RunBehavior implements OffenseBehavior
 * Randombly selects running actions a wide receiver or quarterback can take
 */
public class RunBehavior implements OffenseBehavior{
    public String play()
    {
       String[] plays = {"drive", "draw", "pitch", "reverse"};
       int random = (int) (Math.random() * 4);
       return "runs a " + plays[random];
    }
}