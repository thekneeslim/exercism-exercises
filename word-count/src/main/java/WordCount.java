import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> phrase(String sentence) {

        Map<String, Integer> wordCounts = new HashMap<String, Integer>();

        sentence = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");
        sentence = sentence.toLowerCase();

        String[] words = sentence.split("\\s+");

        for (String word: words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, (int) wordCounts.get(word)+1);
            } else {
                wordCounts.put(word, 1);
            }
        }
    return wordCounts;
    }
}
