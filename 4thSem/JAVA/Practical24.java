// Design a program to implement card layout in applets.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=MyELClass width=650 height=100></applet>*/
public class MyELClass extends Applet implements ItemListener, ActionListener {

  Panel main, P1, P2;
  CardLayout cl;
  String ans = "";
  Button plus, sub, mul, div;
  Checkbox cb1, cb2;
  CheckboxGroup cbg;
  TextField tf1, tf2;

  public void init() {
    cl = new CardLayout();
    main = new Panel();
    main.setLayout(cl);
    Label f = new Label("ENTER FIRST NUMBER");
    Label s = new Label("ENTER SECOND NUMBER");
    tf1 = new TextField(4);
    tf2 = new TextField(4);
    cbg = new CheckboxGroup();
    cb1 = new Checkbox("ADDITION/SUBTRACTION", cbg, false);
    cb2 = new Checkbox("MULTIPLICATION/DIVISION", cbg, false);
    add(f);
    add(tf1);
    add(s);
    add(tf2);
    add(cb1);
    add(cb2);
    plus = new Button("ADDITION");
    sub = new Button("SUBTRACTION");
    mul = new Button("MULTIPLICATION");
    div = new Button("DIVISION");
    P1 = new Panel();
    P1.add(plus);
    P1.add(sub);
    P2 = new Panel();
    P2.add(mul);
    P2.add(div);
    add(main);
    main.add(P1, "as");
    main.add(P2, "md");
    plus.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    cb1.addItemListener(this);
    cb2.addItemListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == add) { 
    msg = t1 + t2; 
    } 
    if (ae.getSource() == sub) { 
      msg = t1 - t2; 
    } 
    if (ae.getSource() == mul) { 
      msg = t1 * t2; 
    } 
    if (ae.getSource() == mul) { 
      msg = t1 / t2;
    }
  }

  public void itemStateChanged(ItemEvent ie) {
    if (cb1.getState() == true) {
      cl.show(main, "as");
    }
    if (cb2.getState() == true) {
      cl.show(main, "md");
    }
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(ans, 10, 100);
  }
}
