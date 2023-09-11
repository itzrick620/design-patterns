//Ricky Garretson

package observer;

import java.util.ArrayList;
//An interface for subjects in the observer pattern.
public interface Subject {
    /**
     * Register an observer to receive updates.
     *
     * @param observer The observer to register.
     */
    void registerObserver(Observer observer);

    /**
     * Remove an observer from the list of registered observers.
     *
     * @param observer The observer to remove.
     */
    void removeObserver(Observer observer);

    /**
     * Notify all registered observers with the latest data.
     *
     * @param strokes The number of strokes.
     * @param par     The par value for the hole.
     */
    void notifyObservers(int strokes, int par);
}