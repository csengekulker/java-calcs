package gui.views;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

  private JPanel mainPanel = new JPanel();
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
    navPanel.setLayout(new BorderLayout());
    navPanel.setSize(400, 100);
    navPanel.setBackground(Color.RED);

    navPanel.add(circleButton, BorderLayout.EAST);
    navPanel.add(rectangleButton, BorderLayout.CENTER);
    navPanel.add(triangleButton, BorderLayout.WEST);

    // ------------------------ //

    footPanel.setLayout(new BorderLayout());
    footPanel.setSize(400, 100);
    footPanel.setBackground(Color.RED);

    footPanel.add(exitButton, BorderLayout.EAST);
    footPanel.add(creditsButton, BorderLayout.WEST);

  }

  private void setMainPanel() {

    BorderLayout bl = new BorderLayout();
    mainPanel.setLayout(bl);

    mainPanel.setBackground(Color.BLUE);

    mainPanel.add(navPanel, BorderLayout.NORTH);
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
