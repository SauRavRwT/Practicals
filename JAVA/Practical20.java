//Design a java program to write an applet that computes the payment of loan which is based on the amount of loan, interest rate and number of months. It takes one parameter from browser which is called Monthly Rate. If it is True then interest rate is per month else it is annual. (Use label, textfield, button, check box, checkbox group)

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code=prog20 width=150 height=150></applet>
<param name=N1 value=5>
*/
public class prog20 extends Applet implements ItemListener, ActionListener {

  String s1;
  Int n1;
  TextField tf1, tf2;
  Button result;
  Checkbox cb1, cb2;
  CheckboxGroup cbg;

  public void init() {
    Label f = new Label("ENTER AMOUNT OF LOAN", Label.RIGHT);
    Label s = new Label("ENTER INTEREST RATE", Label.RIGHT);
    tf1 = new TextField(4);
    tf2 = new TextField(4);
    add(f);
    add(tf1);
    add(s);
    add(tf2);
    cbg = new CheckboxGroup();
    cb1 = new Checkbox("MONTHLY RATE", cbg, true);
    cb2 = new Checkbox("YEARLY RATE", cbg, false);
    result = new Button("LOAN PAYMENT AMOUNT");
    add(cb1);
    add(cb2);
    add(result);
    cb1.addItemListener(this);
    cb2.addItemListener(this);
    result.addActionListener(this);
    s1 = getParameter("N1");
    if (s1 != null) {
      n1 = Integer.parseInt(s1);
    }
  }

  public void itemStateChanged(ItemEvent ie) {
    int n1 = Integer.parseInt(tf1.getText());
    int n2 = Integer.parseInt(tf2.getText());
    int res;
    if (cb1.getState() == true) {
      res = n1 + n2/12*100;
      String ans = "Result : " + res;
    }
    if (cb2.getState() == true) {
      res = n1 + n2/12*100;
      String ans = "Result : " + res;
    }
  }

  public void actionPerformed(ActionEvent ae) {
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(s1, 10, 150);
  }
}
