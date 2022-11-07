package shapes;

import main.Validator;

public class Circle implements Shape {

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