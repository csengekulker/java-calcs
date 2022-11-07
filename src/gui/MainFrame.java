package gui;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MainFrame extends JFrame {
  
  public MainFrame() {
    setWindow();
  }

  private void setWindow() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 400);
    this.setTitle("Java Calculator");
    this.setVisible(true);

    this.setLayout(new FlowLayout());
  }
}
