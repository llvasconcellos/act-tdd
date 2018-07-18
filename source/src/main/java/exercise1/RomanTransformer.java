package exercise1;

public class RomanTransformer {

  public static String toRoman(int number) {
    if (number % 5 == 0) {
      return "V";
    } else if (number % 5 == 4)
      return "IV";
    else {
      String result = "";
      for (int i = 0; i< number % 5; i++) {
        result += "I";
      }
      return result;
    }
  }
}