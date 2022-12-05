package shapes;

import utils.Validator;

public class Triangle implements Shape {

  // TODO: manage visibility (public for now)

  public double base;
  public double height;
  public Double area;

  @Override
  public void calcArea() {

    this.area = this.base * this.height / 2;
  }

  @Override
  public boolean isValidInput(String input) {
    
    return Validator.isValidInput(input);
  }
  
}
