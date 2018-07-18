package exercise2;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class OccurrencesCounterTest {

  private static final List<String> input = Arrays.asList("fizz", "buzz", "fizz", "buzz");
  

  @Test
  public void count_twoWordsSpaceDelimited() throws FileNotFoundException{
    OccorrencesCounter counter = new OccorrencesCounter(new IterableFileParser(input));
    Map<String, Integer> result = counter.count();
    assertThat(result.get("fizz")).isEqualTo(2);
  }

  @Test
  public void count_twoWordsCommaDelimited() throws FileNotFoundException{
    OccorrencesCounter counter = new OccorrencesCounter(new IterableFileParser(input));
    Map<String, Integer> result = counter.count();
    assertThat(result.get("buzz")).isEqualTo(2);
  }
}
