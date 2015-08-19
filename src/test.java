import java.awt.*;
import java.applet.*;



public class test extends Applet {

	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.pink);
  }

  
public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);
    g.drawRect(52, 190, 95, 150);
      int[] xPoints = {100,50,150};
      int[] yPoints = {100,200,200};
      g.drawPolygon(xPoints, yPoints, 3);
      g.drawRect(52, 100, 20, 90);
      g.drawRect(52, 300, 20, 40);
      g.drawRect(90, 210, 50, 40);
      g.drawRect(90, 297, 40, 40);
  }
 
}