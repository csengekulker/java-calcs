package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import lan.bcs.InputPanel;

public class CalculatorPanel extends JPanel {
  String title;

  InputPanel inputPanel = new InputPanel();

  public JButton submitButton = new JButton("Számítás");
  
  public CalculatorPanel(String title) {
    this.title = title;
    setMainPanel();
  }

  public CalculatorPanel() {
    setPanels();
    setMainPanel();
  }

  private void setPanels() {
    inputPanel.setText("sugár");
  }

  private void setMainPanel() {

    this.setSize(200, 200);
    this.setLayout(new BorderLayout());
    this.setBackground(Color.BLUE);

    this.add(submitButton, BorderLayout.SOUTH);
    this.add(inputPanel, BorderLayout.NORTH);

    // TODO: add a form here dynamically

  }

}
