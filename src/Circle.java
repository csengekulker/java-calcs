public class Circle implements Shape {

  double radius;
  Double area;

  public void calcArea() {

    this.area = Math.pow(radius, 2) * Math.PI;
  }

  public boolean isValidInput() {

    return false;
  }
  
}
