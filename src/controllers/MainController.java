package controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import views.CalculatorPanel;
import views.MainFrame;

public class MainController implements ActionListener {

  MainFrame mainFrame;
  CalculatorPanel calcPanel;

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
      System.out.println("render circle form");
    } else if (source == mainFrame.rectangleButton) {
      System.out.println("render rect form");
       // TODO: calculator methods return results here
    } else if (source == mainFrame.triangleButton) {
      System.out.println("render triangle form");
    }

    // ----------------------//

    if (source == mainFrame.exitButton) {
      System.exit(0);
    } else if (source == mainFrame.creditsButton) {
      // TODO: credits in own window (JFrame)
    }
  }
}
