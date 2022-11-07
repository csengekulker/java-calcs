package gui;

import main.Calculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainController implements ActionListener {

  MainFrame mainFrame;
  Calculator calculator;

  public MainController() {

    start();
    addActionEvents();
  }

  private void start() {
    mainFrame = new MainFrame();
    calculator = new Calculator();

  }

  private void addActionEvents() {
    mainFrame.circleButton.addActionListener(this);
    mainFrame.rectangleButton.addActionListener(this);
    mainFrame.triangleButton.addActionListener(this);

  }

  @Override
  public void actionPerformed(ActionEvent event) {
    Object source = event.getSource();

    if (source == mainFrame.circleButton) {
      calculator.circle();
    } else if (source == mainFrame.rectangleButton) {
      /*
       * TODO: 
       * Exception in thread
       *  "AWT-EventQueue-0"
       * java.util.NoSuchElementException
       */
      calculator.rectangle();
    } else if (source == mainFrame.triangleButton) {
      calculator.triangle();
    }
  }
}
