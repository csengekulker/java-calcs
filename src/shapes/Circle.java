package shapes;

import utils.Validator;

public class Circle implements Shape {

  // TODO: manage visibility (public for now)

  public double radius;
  public Double area;

  @Override
  public void calcArea() {

    this.area = Math.pow(radius, 2) * Math.PI;
  }

  @Override
  public boolean isValidInput(String input) {

    return Validator.isValidInput(input);
  }
  
}
