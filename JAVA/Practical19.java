// Design an applet to do the following tasks:
// a) To output the question “WHO IS THE PRIME MINISTER OF INDIA?”
// b) To accept the answer and print “CORRECT” and then stop if the answer is correct.
// c) To print “TRY AGAIN” and if the answer is not correct.
// d) To display the correct answer, if the answer is wrong even after third attempt.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code=Practical19 width=600 height=600></applet> */
public class Practical19 extends Applet implements ActionListener {

  String ans = "";
  Button sub;
  TextField tf1;
  int count = 0;

  public void init() {
    Label f = new Label("ENTER PRIME MINISTER NAME", Label.RIGHT);
    tf1 = new TextField(10);
    add(f);
    add(tf1);
    sub = new Button("SUBMIT");
    add(sub);
    sub.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    String name = tf1.getText();
    if (ae.getSource() == sub) {
      if (name.equals("Narendra Modi")) {
        ans = "CORRECT";
        sub.setEnabled(false);
      } else {
        ans = "INCORRECT";
        count++;
        if (count == 3) {
          ans = "NAME OF PRIME MINISTER IS Sh. NARENDRA MODI";
        }
      }
    }
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(ans, 10, 100);
  }
}
