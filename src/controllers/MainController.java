package controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import views.CalculatorFrame;
import views.MainFrame;

public class MainController implements ActionListener {

  MainFrame mainFrame;
  CalculatorFrame calcFrame;

  public MainController() {

    start();
    addActionEvents();
  }

  private void start() {
    mainFrame = new MainFrame();

  }

  private void addActionEvents() {
    mainFrame.circleButton.addActionListener(this);
    mainFrame.rectangleButton.addActionListener(this);
    mainFrame.triangleButton.addActionListener(this);

    mainFrame.exitButton.addActionListener(this);
    mainFrame.creditsButton.addActionListener(this);

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

    // ----------------------//

    if (source == mainFrame.exitButton) {
      System.exit(0);
    } else if (source == mainFrame.creditsButton) {
      // TODO: credits in own window
    }
  }
}
