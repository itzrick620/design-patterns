package iterator;

import java.util.Scanner;

public class DocumentDriver {
    private Scanner scanner;
    private Document document;

    public DocumentDriver() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Document Editor Opened");

        String documentName = getInput("Enter Document Name: ");
        document = new Document(documentName);

        // Loop through and make changes.
        while (executeUserChange())
            ;

        System.out.println("Goodbye :(");
    }

    private boolean executeUserChange() {
        // print menu based on what they can do.
        String command = getInput(getMenu());

        switch (command.toLowerCase()) {
            case "u":
                undo();
                return true;
            case "r":
                redo();
                return true;
            case "c":
                change();
                return true;
            case "l":
                showChangeList();
                return true;
            case "q":
                return false;
            default:
                System.out.println("Sorry, invalid input.");
                return true;
        }
    }

    private void showChangeList() {
        System.out.println("Undo Command List:");
        showList(document.getUndoIterator());
        System.out.println("Redo Command List:");
        showList(document.getRedoIterator());
    }

    private void showList(StackIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("  - " + iterator.next());
        }
    }

    private void change() {
        String change = getInput("Enter Change: ");
        System.out.println(document.makeChange(change));
    }

    private void undo() {
        if (document.canUndo()) {
            System.out.println(document.undoChange());
        } else {
            System.out.println("Sorry there is nothing to undo");
        }
    }

    private void redo() {
        if (document.canRedo()) {
            System.out.println(document.redoChange());
        } else {
            System.out.println("Sorry there is nothing to redo");
        }
    }

    private String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private String getMenu() {
        String menu = "Press 'C' for change";
        if (document.canUndo()) {
            menu += ", 'U' for undo";
        }
        if (document.canRedo()) {
            menu += ", 'R' for redo";
        }

        return menu + ", L for change list, or Q for quit: ";
    }

    public static final void main(String[] args) {
        DocumentDriver driver = new DocumentDriver();
        driver.run();
    }
}
