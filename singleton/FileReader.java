package singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {

    /**
     * Reads in the file and creates a list of anagorams
     * 
     * @param Difficulty Easy, Medium, or Hard
     * @return A list of Anagorams
     */
    public static ArrayList<Anagram> getAnagrams(Difficulty difficulty) {
        ArrayList<Anagram> anagrams = new ArrayList<Anagram>();

        try {
            File file = new File(difficulty.fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split("-");
                String name = data[0].trim().toLowerCase();
                String[] answers = data[1].split(",");
                ArrayList<String> flexAnswers = new ArrayList<>();

                for (int i = 0; i < answers.length; i++) {
                    flexAnswers.add(answers[i].trim().toLowerCase());
                }

                anagrams.add(new Anagram(name, flexAnswers));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return anagrams;
    }
}
