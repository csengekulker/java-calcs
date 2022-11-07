package gui.controllers;

import java.awt.event.ActionListener;

import gui.views.CalculatorFrame;

import java.awt.event.ActionEvent;

public class CalculatorController implements ActionListener {
  CalculatorFrame calcFrame;
  
  public CalculatorController() {
    start();
    addActionEvents();
  }

  private void start() {
    calcFrame = new CalculatorFrame();
  }

  private void addActionEvents() {
    calcFrame.exitButton.addActionListener(this);

  }

  @Override
  public void actionPerformed(ActionEvent event) {
    Object source = event.getSource();

    if (source == calcFrame.exitButton) {
      // TODO: close calcFrame on exitButton click
    }
  }
}
