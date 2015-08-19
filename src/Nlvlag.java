import java.awt.*;
import java.applet.*;



public class Nlvlag extends Applet {

	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.green);
  }

  
public void paint(Graphics g) {
    setBackground(Color.green);
    g.setColor(Color.red);
    g.fillRect(20, 20, 100, 30);
    g.setColor(Color.white);
    g.fillRect(20, 50, 100, 30);
    g.setColor(Color.blue);
    g.fillRect(20, 80, 100, 30);
    g.setColor(Color.black);
    g.fillRect(10, 20, 10, 250);
  }
 
}