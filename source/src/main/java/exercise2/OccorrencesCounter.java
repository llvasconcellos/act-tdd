package exercise2;

import java.util.HashMap;
import java.util.Map;

public class OccorrencesCounter {

  private FileParser scanner;

  public OccorrencesCounter(FileParser iterableFileParser) {
    this.scanner = iterableFileParser;
  }

  public Map<String, Integer> count() {
    Map<String, Integer> words = new HashMap<>();
    while (scanner.hasNext()) {
      String word = scanner.next();
      if (words.containsKey(word)) {
        words.put(word, words.get(word) + 1);
      } else {
        words.put(word, 1);
      }
    }
    return words;
  }
}
