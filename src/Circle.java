public class Circle implements Shape {

  double radius;
  Double area;

  public void calcArea() {

    this.area = Math.pow(radius, 2) * Math.PI;
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
