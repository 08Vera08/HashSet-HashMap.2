import java.util.Set;
import java.util.HashSet;
import java.util.List;

class WordsChecker {
    String text;
    Set<String> words;

    public WordsChecker(String text) {
        this.text = text;
        words = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return words.contains(word);
    }
}