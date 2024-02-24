//Design a java program to write an applet with following AWT components : textarea and button.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=MyELClass width=300 height=300> </applet>*/
public class MyELClass extends Applet implements ActionListener {

  String msg = "";
  String data = "";
  Button select;
  TextArea ta;

  public void init() {
    data =
      "COUNTRY NAME: INDIA\n" + "CAPITAL NAME: DELHI\n" + "STATE NAME: DELHI";
    ta = new TextArea(data, 5, 30);
    add(ta);
    select = new Button("SELECT");
    add(select);
    select.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == select) {
      msg = ta.getSelectedText();
    }
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(msg, 10, 150);
  }
}
