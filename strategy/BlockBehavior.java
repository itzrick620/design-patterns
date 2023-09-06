package strategy;

/**
 * BlockBehavior implements DefenseBehavior
 * Gives player different blocking actions
 */
public class BlockBehavior implements DefenseBehavior{
    public String play() 
    {
        String[] plays = {"kick", "punt", "pass", "catch"};
        int random = (int) (Math.random() * 4);
        return "blocks a " + plays[random];
    }
}