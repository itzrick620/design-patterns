//Ricky Garretson

package observer;

//An interface for observers in the observer pattern
public interface Observer {
    /**
     * Update the observer with new data.
     *
     * @param strokes The number of strokes.
     * @param par     The par value for the hole.
     */
    void update(int strokes, int par);

    /**
     * Get a string representation of the observer.
     *
     * @return A string representation.
     */
    String toString();
}