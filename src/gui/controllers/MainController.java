package gui.controllers;

import main.Calculator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import gui.views.CalculatorFrame;
import gui.views.MainFrame;

public class MainController implements ActionListener {

  MainFrame mainFrame;
  Calculator calculator;
  CalculatorFrame calcFrame;

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
      calcFrame = new CalculatorFrame("Kör");
    } else if (source == mainFrame.rectangleButton) {
      calcFrame = new CalculatorFrame("Téglalap");
       // TODO: get input values from GUI instead of CLI 
       // TODO: refactor calculator methods to return results here
    } else if (source == mainFrame.triangleButton) {
      calcFrame = new CalculatorFrame("Háromszög");
    }
  }
}
