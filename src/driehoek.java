import java.awt.*;
import java.applet.*;



public class driehoek extends Applet {

	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.pink);
  }

  
public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);

      int[] xPoints = {100,50,150};
      int[] yPoints = {100,200,200};
      g.drawPolygon(xPoints, yPoints, 3);
      
}}