package views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

  private JPanel mainPanel = new JPanel();

  public CalculatorPanel calculatorPanel = new CalculatorPanel();

  private JPanel navPanel = new JPanel();
  private JPanel footPanel = new JPanel();

  public JButton circleButton = new JButton("Kör");
  public JButton rectangleButton = new JButton("Téglalap");
  public JButton triangleButton = new JButton("Háromszög");

  public JButton exitButton = new JButton("Kilépés");
  public JButton creditsButton = new JButton("Névjegy");
  
  public MainFrame() {
    setWindow();
    setMainPanel();
    setPanels();

  }

  private void setPanels() {
    navPanel.setLayout(new FlowLayout());
    navPanel.setSize(400, 100);
    navPanel.setBackground(Color.RED);

    navPanel.add(circleButton);
    navPanel.add(rectangleButton);
    navPanel.add(triangleButton);

    // ------------------------ //

    footPanel.setLayout(new BorderLayout());
    footPanel.setSize(400, 100);
    footPanel.setBackground(Color.RED);

    footPanel.add(exitButton, BorderLayout.EAST);
    footPanel.add(creditsButton, BorderLayout.WEST);

  }

  private void setMainPanel() {

    mainPanel.setLayout(new BorderLayout());

    mainPanel.setBackground(Color.BLUE);

    mainPanel.add(navPanel, BorderLayout.NORTH);
    mainPanel.add(calculatorPanel, BorderLayout.CENTER);
    mainPanel.add(footPanel, BorderLayout.SOUTH);

    this.add(mainPanel);
  }

  private void setWindow() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 400);
    this.setTitle("Java Calculator");
    this.setVisible(true);

    this.setLayout(new GridLayout(1, 1));
  }
}
