//Ricky Garretson

package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Represents the Anagram Game using the Singleton Design Pattern.
 */
public class Game {
    private static Game instance;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;
    private ArrayList<Anagram> usedAnagrams = new ArrayList<>();

    /**
     * Private constructor to enforce the Singleton pattern.
     */
    private Game() {
        rand = new Random();
        level = Difficulty.EASY; // Default difficulty level
        anagrams = new HashMap<>();
        score = 0;
        loadAnagrams();
        generateRandomAnagram();
    }

    /**
     * Gets the instance of the Game class.
     *
     * @return The Game instance.
     */
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    /**
     * Loads anagrams for all difficulty levels.
     */
    private void loadAnagrams() {
        for (Difficulty difficulty : Difficulty.values()) {
            ArrayList<Anagram> difficultyAnagrams = FileReader.getAnagrams(difficulty);
            if (difficultyAnagrams != null && !difficultyAnagrams.isEmpty()) {
                anagrams.put(difficulty, difficultyAnagrams);
            }
        }
    }

    /**
     * Generates a random anagram for the current difficulty level, avoiding repetition.
     */
    private void generateRandomAnagram() {
        ArrayList<Anagram> currentDifficultyAnagrams = anagrams.get(level);
        if (currentDifficultyAnagrams != null && !currentDifficultyAnagrams.isEmpty()) {
            // Remove used anagrams from the list
            currentDifficultyAnagrams.removeAll(usedAnagrams);
            if (currentDifficultyAnagrams.isEmpty()) {
                // If all anagrams are used, clear the used list
                usedAnagrams.clear();
                currentDifficultyAnagrams.addAll(anagrams.get(level));
            }
            // Randomly select an anagram from the remaining list
            int randomIndex = rand.nextInt(currentDifficultyAnagrams.size());
            currentAnagram = currentDifficultyAnagrams.get(randomIndex);
            // Add the used anagram to the list
            usedAnagrams.add(currentAnagram);
        } else {
            // Handle the case where no anagrams are available for the current difficulty.
            currentAnagram = new Anagram("No Anagrams Available", new ArrayList<>());
        }
    }

    /**
     * Gets the current anagram question.
     *
     * @return The anagram question.
     */
    public String getQuestion() {
        return currentAnagram.getQuestion();
    }

    /**
     * Checks if the user's answer is correct for this anagram and updates the score.
     *
     * @param userAnswer The user's answer.
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(String userAnswer) {
        if (currentAnagram.isCorrect(userAnswer)) {
            score++;
            if (score >= 5) { // Adjust the score threshold as needed
                // Increase difficulty level
                level = Difficulty.MEDIUM;
            }
            generateRandomAnagram();
            return true;
        }
        return false;
    }

    /**
     * Gets the current score.
     *
     * @return The current score.
     */
    public int getScore() {
        return score;
    }
}