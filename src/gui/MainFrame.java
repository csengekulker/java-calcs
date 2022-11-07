package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

  private JPanel mainPanel = new JPanel();
  private JPanel navPanel = new JPanel();

  public JButton circleButton = new JButton("Kör");
  public JButton rectangleButton = new JButton("Téglalap");
  public JButton triangleButton = new JButton("Háromszög");
  
  public MainFrame() {
    setWindow();
    setMainPanel();
    setPanels();

  }

  private void setPanels() {
    navPanel.setLayout(new BorderLayout());
    navPanel.setSize(400, 100);
    navPanel.setBackground(Color.RED);

    navPanel.add(circleButton, BorderLayout.EAST);
    navPanel.add(rectangleButton, BorderLayout.CENTER);
    navPanel.add(triangleButton, BorderLayout.WEST);

  }

  private void setMainPanel() {

    BorderLayout bl = new BorderLayout();
    mainPanel.setLayout(bl);

    mainPanel.setBackground(Color.BLUE);

    mainPanel.add(navPanel, BorderLayout.NORTH);

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
