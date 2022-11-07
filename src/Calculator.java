import java.util.Scanner;

public class Calculator {
  
  public void triangle() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Alap: ");
    String base = scanner.nextLine();

    System.out.print("Magasság: ");
    String height = scanner.nextLine();

    scanner.close();

    Triangle triangle = new Triangle();

    if (
      triangle.isValidInput(base) &&
      triangle.isValidInput(height)
    ) {
      triangle.base = Double.parseDouble(base);
      triangle.height = Double.parseDouble(height);

      triangle.calcArea();

      System.out.println("Terület: " + triangle.area);
    }
  }

  public void rectangle() {

  }

  public void circle() {

  }
}
