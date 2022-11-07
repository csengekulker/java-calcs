public class Triangle implements Shape {

  double base;
  double height;
  Double area;

  @Override
  public void calcArea() {

    this.area = this.base * this.height / 2;
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
