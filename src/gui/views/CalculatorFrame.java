package gui.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class CalculatorFrame extends JFrame{
  String title;
  JPanel mainPanel;
 
  public CalculatorFrame(String title) {
    this.title = title;

    display(title);
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

    this.add(mainPanel);
  }

}
