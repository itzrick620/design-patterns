package singleton;

public enum Difficulty {
    EASY("singleton/txt/three.txt"), MEDIUM("singleton/txt/four.txt"), HARD("singleton/txt/five.txt");

    public final String fileName;

    private Difficulty(String fileName) {
        this.fileName = fileName;
    }
}
