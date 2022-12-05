package controllers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

import views.CalculatorPanel;
import views.MainFrame;

public class MainController implements ActionListener {

  MainFrame mainFrame;
  CalculatorPanel calcPanel = new CalculatorPanel();
  JPanel circlePanel = calcPanel.setCirclePanel();

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
      calcPanel.setSelectedPanel(circlePanel);
      // calcPanel.add(new JLabel("Kör"));
      mainFrame.validate();

    }

    // ----------------------//

    if (source == mainFrame.exitButton) {
      System.exit(0);
    } else if (source == mainFrame.creditsButton) {
      // TODO: credits in own window (JFrame)
      System.out.println("Balogh Csenge 2022.12.05");
    }
  }
}
