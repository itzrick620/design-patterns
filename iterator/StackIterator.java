//Ricky Garretson

package iterator;

import java.util.Stack;

/**
 * Provides an iterator over a stack.
 */
public class StackIterator {
    private Stack<String> items;
    private int position;

    /**
     * Constructs a StackIterator over the given stack.
     *
     * @param items The stack of items.
     */
    public StackIterator(Stack<String> items) {
        this.items = items;
        this.position = 0;
    }

    /**
     * Checks if there are more items in the stack.
     *
     * @return True if there are more items, false otherwise.
     */
    public boolean hasNext() {
        return position < items.size();
    }

    /**
     * Returns the next item from the stack.
     *
     * @return The next item.
     */
    public String next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
