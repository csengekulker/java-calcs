public class Rectangle implements Shape {

  double side_a;
  double side_b;
  Double area;

  public void calcArea() {

    this.area = side_a * side_b;
  }

  public boolean isValidInput() {

    return false;
  }
  
}
