//Design a java program to handle keyboard events.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="ELClass1" width=400 height=200> </applet>*/
public class ELClass1 extends Applet implements KeyListener {

  String data = "";
  int x, y, px, py;

  public void init() {
    addKeyListener(this);
    px = 0;
    py = 0;
    x = px;
    y = py;
  }

  public void keyPressed(KeyEvent k) {
    int code = k.getKeyCode();
    if (code == KeyEvent.VK_LEFT) {
      x--;
    }
    if (code == KeyEvent.VK_RIGHT) {
      x++;
    }
    if (code == KeyEvent.VK_UP) {
      y--;
    }
    if (code == KeyEvent.VK_DOWN) {
      y++;
    }
    Graphics g = getGraphics();
    g.drawLine(px, py, x, y);
    px = x;
    py = y;
  }

  public void keyTyped(KeyEvent k) {}

  public void keyReleased(KeyEvent k) {}
}
