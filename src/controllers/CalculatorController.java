package controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import views.CalculatorPanel;

public class CalculatorController implements ActionListener {
  CalculatorPanel calcPanel;
  
  public CalculatorController() {
    start();
    addActionEvents();
  }

  private void start() {
    calcPanel = new CalculatorPanel();
  }

  private void addActionEvents() {
    calcPanel.submitButton.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    // Object source = event.getSource();


  }
}
