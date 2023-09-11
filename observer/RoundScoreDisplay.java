//Ricky Garretson

package observer;

//Displays the round score for a golfer
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Create a RoundScoreDisplay instance for a golfer.
     *
     * @param golfer The golfer to track.
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
    }

    @Override
    public String toString() {
        int scoreDifference = strokesTotal - parTotal;
        String scoreStatus = scoreDifference == 0 ? "Even" : (scoreDifference > 0 ? scoreDifference + " over" : -scoreDifference + " under");
        return "Round Score: Par (" + parTotal + "), Strokes (" + strokesTotal + "), " + scoreStatus;
    }
}
