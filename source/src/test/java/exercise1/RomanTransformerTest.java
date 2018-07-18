package exercise1;

import static exercise1.RomanTransformer.toRoman;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import exercise1.RomanTransformer;

/**
 * Tests for {@link RomanTransformer#toRoman(int)} method.
 * 
 * The method should receive an integer number and return its representation in
 * Roman number. All the roman numeral rules can be found on
 * https://en.wikipedia.org/wiki/Roman_numerals
 *
 */
public class RomanTransformerTest {

  @Test
  public void toRoman_one_returnsI() {
    assertThat(toRoman(1)).isEqualTo("I");
  }

  @Test
  public void toRoman_three_returnsIII() {
    assertThat(toRoman(3)).isEqualTo("III");
  }

  @Test
  public void toRoman_four_returnsIV() {
    assertThat(toRoman(4)).isEqualTo("IV");
  }
  @Test
  public void toRoman_five_returnsV() {
    assertThat(toRoman(5)).isEqualTo("V");
  }
}
