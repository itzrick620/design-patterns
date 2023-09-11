//Ricky Garretson

package observer;

import java.util.ArrayList;

//Represents a golf player
public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Create a new Golfer instance.
     *
     * @param name The name of the golfer.
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    /**
     * Get the name of the golfer.
     *
     * @return The name of the golfer.
     */
    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int strokes, int par) {
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * Record the golfer's score for a hole.
     *
     * @param strokes The number of strokes taken.
     * @param par     The par value for the hole.
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }
}