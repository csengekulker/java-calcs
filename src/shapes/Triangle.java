package shapes;
import main.Validator;

public class Triangle implements Shape {

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
