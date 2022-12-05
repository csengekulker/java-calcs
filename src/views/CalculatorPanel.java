package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import lan.bcs.InputPanel;

public class CalculatorPanel extends JPanel {

  public JPanel circlePanel;
  public InputPanel radiusInput;

  public JPanel rectanglePanel;
  public InputPanel sideAInput;
  public InputPanel sideBInput;

  public JPanel trianglePanel;
  public InputPanel baseInput;
  public InputPanel heightInput;

  public JButton submitButton = new JButton("számít");

  public CalculatorPanel() {
    System.out.println("CALCPANEL CONSTRUCTING");
    setPanels();
  }

  private void setPanels() {
    setCirclePanel();
    setRectanglePanel();
    setTrianglePanel();
    
  }

  public JPanel setCirclePanel() {
    circlePanel = new JPanel();
    radiusInput = new InputPanel();
    radiusInput.setText("Sugár:");

    circlePanel.add(radiusInput);

    return circlePanel;

  }

  private JPanel setRectanglePanel() {
    rectanglePanel = new JPanel();

    rectanglePanel.setLayout(new GridLayout(2, 1));

    sideAInput = new InputPanel();
    sideAInput.setText("A oldal");

    sideBInput = new InputPanel();
    sideBInput.setText("B oldal");

    rectanglePanel.add(sideAInput);
    rectanglePanel.add(sideBInput);

    return rectanglePanel;
  }

  private JPanel setTrianglePanel() {
    trianglePanel = new JPanel();

    trianglePanel.setLayout(new GridLayout(2, 1));

    baseInput = new InputPanel();
    baseInput.setText("Alap:");

    heightInput = new InputPanel();
    heightInput.setText("Magasság:");

    trianglePanel.add(baseInput);
    trianglePanel.add(heightInput);

    return trianglePanel;
  }

  public void setSelectedPanel(JPanel selectedPanel) {

    this.setSize(200, 200);
    this.setLayout(new BorderLayout());
    this.setBackground(Color.BLUE);

    // TODO: add shapePanel on buttonclick --> controller
    System.out.println("fut  a setmainpanel");
    this.add(selectedPanel, BorderLayout.CENTER);
    this.add(submitButton, BorderLayout.SOUTH);

  }

}
