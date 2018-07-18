package exercise3;

import java.util.Date;

public class DateUtils {
  
  private static final int ONE_HOUR_IN_MILLIS = 60*60*1000;

  public static Date oneHourAgo(){
    long now = new Date().getTime();
    return new Date(now-ONE_HOUR_IN_MILLIS);
  }
}
