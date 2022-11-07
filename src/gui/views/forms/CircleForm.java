package gui.views.forms;

import javax.swing.JTextField;

public class CircleForm {
  JTextField test = new JTextField("Teszt");

  public CircleForm() {
    
  }

  public JTextField displayForm() {

    return test;

  }

  // TODO: this class should return
  /*
   * 
   * JPanel to arrange
   *       with JTextField for radius
   *       with JButton to submit
   * 
   *       reach its own controller CircleFormController 
   *            to reach calculator method circle()
   * 
   *       with sth to display the result
   * 
   *       with JButton to exit the CalculatorFrame
   */
}
