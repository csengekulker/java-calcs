public class Rectangle implements Shape {

  double side_a;
  double side_b;
  Double area;

  public void calcArea() {

    this.area = side_a * side_b;
  }

  @Override
  public boolean isValidInput(String input) {

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
