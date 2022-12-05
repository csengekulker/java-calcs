package utils;
public class Validator {

  public static boolean isValidInput(String input) {

    String sample = "[0-9]+";

    boolean isValid = true;

    if (input.matches(sample)) {
      double doubleInput = Double.parseDouble(input);

      if (doubleInput <= 0) {
        isValid = false;
      }
    } else {
      isValid = false;
    }

    return isValid;
  }
}
