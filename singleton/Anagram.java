package singleton;

import java.util.ArrayList;

/**
 * Represents an Anagram in the Anagram Game.
 */
public class Anagram {
    private String question;
    private ArrayList<String> answers;

    /**
     * Constructor for creating an Anagram.
     *
     * @param question The anagram question.
     * @param answers  A list of valid answers to the anagram.
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Gets the anagram question.
     *
     * @return The anagram question.
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Checks if the user's answer is correct for this anagram.
     *
     * @param userAnswer The user's answer.
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(String userAnswer) {
        return answers.contains(userAnswer.toLowerCase());
    }
}