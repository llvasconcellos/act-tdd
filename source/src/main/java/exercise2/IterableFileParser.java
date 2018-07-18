package exercise2;

import java.util.Iterator;

public class IterableFileParser implements FileParser {

  private final Iterator<String> reader;

  public IterableFileParser(Iterable<String> iterable) {
    this(iterable.iterator());
  }
  
  public IterableFileParser(Iterator<String> reader) {
    this.reader = reader;
  }

  @Override
  public String next() {
    return this.reader.next();
  }

  public boolean hasNext() {
    return this.reader.hasNext();
  }
}
