package shapes;

import utils.Validator;

public class Rectangle implements Shape {

  // TODO: manage visibility (public for now)

  public double side_a;
  public double side_b;
  public Double area;

  @Override
  public void calcArea() {

    this.area = side_a * side_b;
  }

  @Override
  public boolean isValidInput(String input) {

    return Validator.isValidInput(input);
  }
  
}
