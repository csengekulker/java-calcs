package gui;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame{
 
  public CalculatorFrame() {

  }

  public void display(String title) {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(200, 100);
    this.setTitle(title);
    this.setVisible(true);
  }


}
