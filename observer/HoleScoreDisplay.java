//Ricky Garretson

package observer;

//Displays the score for a given hole
public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Create a HoleScoreDisplay instance for a golfer.
     *
     * @param golfer The golfer to track.
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
    }

    @Override
    public String toString() {
        return "Hole Score: Par (" + par + "), Strokes (" + strokes + "), " +
                (strokes - par > 0 ? strokes - par + " over" : "Even");
    }
}