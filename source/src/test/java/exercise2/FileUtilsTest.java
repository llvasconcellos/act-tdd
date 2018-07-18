package exercise2;

import static org.assertj.core.api.Assertions.assertThat;
import static java.io.File.createTempFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import exercise2.FileUtils;

public class FileUtilsTest {
  
  @Test
  public void openResourceFile_existentFile_scannerValid() throws FileNotFoundException {
    try(Scanner sc = FileUtils.openFile("example2_input1.txt")) {
      assertThat(sc.hasNext()).isTrue();
    }
  }
  
  @Test(expected=FileNotFoundException.class)
  public void openResourceFile_inexistentFile_throwException() throws FileNotFoundException {
    FileUtils.openFile("inexistentFile");
  }
  
  @Test
  public void openResourceFile_createTempFileAndOpenIt_scannerValid() throws IOException {
    File tmpFile = createTempFile("testing", "tmp");
    try(Scanner sc = FileUtils.openFile(tmpFile.getAbsolutePath())) {
      assertThat(sc.hasNext()).isFalse(); // scanner is valid, but file is empty
    }
  }
}
