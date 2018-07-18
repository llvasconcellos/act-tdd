package exercise3;

import static exercise3.DateUtils.oneHourAgo;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {
  private static long minutesToMillis(int minutes) {
    return minutes * 60 * 1000;
  }
  
//  @Test
//  public void oneHourAgo_returnsOneHourAgoDate(){
//    Date now = new Date();
//    Date oneHourAgo = oneHourAgo();
//    long delta = now.getTime() - oneHourAgo.getTime();
//    assertThat(delta).isBetween(minutesToMillis(60), minutesToMillis(61));
//  }

}
