import java.awt.*;
import java.applet.*;



public class staafdiagram extends Applet {

	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.green);
  }

  
public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);
    g.drawString("0", 15, 550 );
    g.drawString("10", 15, 500 );
    g.drawString("20", 15, 450 );
    g.drawString("30", 15, 400 );
    g.drawString("40", 15, 350 );
    g.drawString("50", 15, 300 );
    g.drawString("60", 15, 250 );
    g.drawString("70", 15, 200 );
    g.drawString("80", 15, 150 );
    g.drawString("90", 15, 100 );
    g.drawString("100", 10, 50 );
    g.drawString("Valerie", 35, 565 );
    g.drawString("Jeroen", 85, 565 );
    g.drawString("Hans", 135, 565 );
    g.setColor(Color.red);
	    g.drawRect(29, 49, 0, 501);
	    g.drawRect(29, 549, 150, 1);
	    g.setColor(Color.yellow);
	    g.fillRect(80, 150, 50, 400);
	    g.fillRect(30, 350, 50, 200);
	    g.setColor(Color.green);
	    g.fillRect(80, 150, 50, 400);
	    g.setColor(Color.blue);
	    g.fillRect(130, 50, 50, 500);
  }
 
}