package strategy;

/**
 * ReceiverBehavior implements OffenseBehavior
 * Randombly selects the possible routes a receiver can run
 */
public class ReceiverBehavior implements OffenseBehavior{
    public String play()
    {
        String[] plays = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
        int random = (int) (Math.random() * 5);
        return "runs a " + plays[random];
    }
}