//Ricky Garretson

package iterator;

import java.util.Stack;

/**
 * Represents a Document with change histories.
 */
public class Document {
    private String title;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Constructs a new Document with the given title.
     *
     * @param title The title of the Document.
     */
    public Document(String title) {
        this.title = title;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * Makes a change to the document.
     *
     * @param change The change to be made.
     * @return A string representing the change made.
     */
    public String makeChange(String change) {
        undoStack.push(change);
        redoStack.clear();
        return "Making Change: " + change;
    }

    /**
     * Undoes the last change.
     *
     * @return A string representing the change that was undone.
     */
    public String undoChange() {
        if (canUndo()) {
            String change = undoStack.pop();
            redoStack.push(change);
            return "Undoing: " + change;
        }
        return "No change to undo.";
    }

    public boolean canUndo() {
        return !undoStack.isEmpty();
    }

    /**
     * Redoes the last undone change.
     *
     * @return A string representing the change that was redone.
     */
    public String redoChange() {
        if (canRedo()) {
            String change = redoStack.pop();
            undoStack.push(change);
            return "Redoing: " + change;
        }
        return "No change to redo.";
    }

    public boolean canRedo() {
        return !redoStack.isEmpty();
    }

    public StackIterator getUndoIterator() {
        return new StackIterator((Stack<String>) undoStack.clone());
    }

    public StackIterator getRedoIterator() {
        return new StackIterator((Stack<String>) redoStack.clone());
    }
}
