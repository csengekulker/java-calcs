package views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class CalculatorFrame extends JFrame{
  String title;
  JPanel mainPanel;
  
  public JButton exitButton = new JButton("Kilép");

  public CalculatorFrame(String title) {
    this.title = title;

    display(title);
    setMainPanel();
  }

  public CalculatorFrame() {
    setMainPanel();
  }

  public void display(String title) {
    this.setBounds(500, 500, 200, 200);
    this.setTitle(title);
    this.setVisible(true);

  }

  private void setMainPanel() {
    mainPanel = new JPanel();

    mainPanel.setLayout(new BorderLayout());

    mainPanel.setBackground(Color.GREEN);

    // TODO: add a form here dynamically

    mainPanel.add(exitButton, BorderLayout.SOUTH);

    this.add(mainPanel);
  }

}
