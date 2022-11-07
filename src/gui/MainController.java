package gui;

import main.Calculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainController implements ActionListener {

  MainFrame mainFrame;
  Calculator calculator;
  CalculatorFrame calc = new CalculatorFrame();


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
      calc.display("Kör");
    } else if (source == mainFrame.rectangleButton) {
      calc.display("Téglalap");
       // TODO: get input values from GUI instead of CLI 
       // TODO: refactor calculator methods to return results here
    } else if (source == mainFrame.triangleButton) {
      calc.display("Háromszög");
    }
  }
}
