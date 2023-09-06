package strategy;

/**
 * PassBehavior implements OffenseBehavior and randomly selects throwing actions a quarterback can take
 */
public class PassBehavior implements OffenseBehavior{
    public String play()
    {
        String[] plays = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
        int random = (int) (Math.random() * 5);
        return "throws a " + plays[random];
    }
}