package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class CalculatorPanel extends JPanel {
  String title;
  JPanel mainPanel;
  public JButton submitButton = new JButton("Számítás");
  
  public CalculatorPanel(String title) {
    this.title = title;
    setMainPanel();
  }

  public CalculatorPanel() {
    setMainPanel();
  }

  private void setMainPanel() {

    this.setSize(200, 200);
    this.setLayout(new BorderLayout());
    this.setBackground(Color.BLUE);

    this.add(submitButton, BorderLayout.SOUTH);

    // TODO: add a form here dynamically

  }

}
