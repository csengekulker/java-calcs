public class Rectangle implements Shape {

  double side_a;
  double side_b;
  Double area;

  @Override
  public void calcArea() {

    this.area = side_a * side_b;
  }

  @Override
  public boolean isValidInput(String input) {

    return Validator.isValidInput(input);
  }
  
}
