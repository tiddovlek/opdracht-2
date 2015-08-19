import java.awt.*;
import java.applet.*;



public class stoplicht extends Applet {

	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.green);
  }

  
public void paint(Graphics g) {
    setBackground(Color.green);
    g.setColor(Color.black);
    g.fillRect(168, 175, 15, 100);
    g.fillRoundRect(150, 50, 50, 150, 10, 10);
    g.setColor(Color.red);
    g.fillOval(161, 60, 30, 30); // as long as WIDTH and HEIGHT are equal the oval should look like a circle
    g.setColor(Color.orange);
    g.fillOval(161, 110, 30, 30); // as long as WIDTH and HEIGHT are equal the oval should look like a circle
    g.setColor(Color.green);
    g.fillOval(161, 160, 30, 30); // as long as WIDTH and HEIGHT are equal the oval should look like a circle
  }
 
}