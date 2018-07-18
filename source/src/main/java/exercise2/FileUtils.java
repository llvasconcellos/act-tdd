package exercise2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class FileUtils {

  /**
   * Opens a file from Classpath or from Filesystem
   * 
   * @throws FileNotFoundException
   */
  public static Scanner openFile(String filepath) throws FileNotFoundException {
    InputStream stream = loadFromClassloader(filepath);
    if (stream == null) {
      stream = loadFromFilesystem(filepath, stream);
    }
    return new Scanner(stream);
  }

  private static InputStream loadFromClassloader(String filename) {
    return ClassLoader.getSystemResourceAsStream(filename);
  }

  private static InputStream loadFromFilesystem(String filename, InputStream stream) throws FileNotFoundException {
    return new FileInputStream(new File(filename));
  }
}
