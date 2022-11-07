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

      System.out.println("Háromszög terület: " + triangle.area);
    }
  }

  public void rectangle() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("A oldal: ");
    String side_a = scanner.nextLine();

    System.out.print("B oldal: ");
    String side_b = scanner.nextLine();

    scanner.close();

    Rectangle rectangle = new Rectangle();

    if (
      rectangle.isValidInput(side_a) &&
      rectangle.isValidInput(side_b)
    ) {
      rectangle.side_a = Double.parseDouble(side_a);
      rectangle.side_b = Double.parseDouble(side_b);

      rectangle.calcArea();

      System.out.println("Téglalap terület: " + rectangle.area);
    }
  }

  public void circle() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Sugár: ");
    String radius = scanner.nextLine();

    scanner.close();

    Circle circle = new Circle();

    if (
      circle.isValidInput(radius)
    ) {
      circle.radius = Double.parseDouble(radius);

      circle.calcArea();

      System.out.println("Kör terület: " + circle.area);
    }
  }
}
