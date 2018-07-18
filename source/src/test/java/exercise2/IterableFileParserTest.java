package exercise2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import exercise2.IterableFileParser;

/**
 * This test uses both the state and the behavior testing approach.
 * 
 * Also, note on how mocks are used on each style of the testing - as a mock and
 * as 'stub'.
 */
public class IterableFileParserTest {

  private Iterator<String> reader;
  private IterableFileParser parser;

  @Before
  @SuppressWarnings("unchecked")
  public void setUp() {
    this.reader = mock(Iterator.class);
    this.parser = new IterableFileParser(this.reader);
  }

  @Test
  public void hasNext_callsScannerHasNext() {
    this.parser.hasNext();

    verify(this.reader).hasNext();
  }

  @Test
  public void hasNext_callsScannerHasNext_mockReturnsTrue() {
    when(this.reader.hasNext()).thenReturn(true);
    boolean result = this.parser.hasNext();

    assertThat(result).isTrue();
  }

  public void hasNext_callsScannerHasNext_mockReturnsFalse() {
    when(this.reader.hasNext()).thenReturn(false);
    boolean result = this.parser.hasNext();

    assertThat(result).isFalse();
  }
  
  @Test
  public void hasNext_callsScannerHasNext_returnItsResult_andCallMock() {
    when(this.reader.hasNext()).thenReturn(true);
    boolean result = this.parser.hasNext();

    assertThat(result).isTrue();
    verify(this.reader).hasNext();
  }
}
