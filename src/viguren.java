import java.awt.*;
import java.applet.*;



public class viguren extends Applet {

	private static final long serialVersionUID = -6513971802368604190L;


public void init() {
    setBackground(Color.green);
  }

  
public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);
    g.drawString("Lijn", 120, 30 );
    g.drawString("Rechthoek", 110, 220 );
    
    g.drawString("Gevulde rechthoek met ovaal", 300, 220 );
    g.drawString("Taartpunt met ovaal eromheen", 620, 220 );
    
    g.drawString("Afgeronde rechthoek", 100, 420 );
    
    g.drawString("Gevulde ovaal", 350, 420 );
    g.drawString("Cirkel", 620, 450 );
    
    
    
    
    g.drawOval(280, 50, 250, 150);
	    g.setColor(Color.black);
	    g.drawRect(1, 10, 250, 1);
	    g.drawRect(1, 50, 250, 150);
	    g.setColor(Color.magenta);
	    g.fillRect(280, 50, 250, 150);
	    g.setColor(Color.black);
	    g.drawOval(280, 50, 250, 150);
	    g.drawOval(580, 50, 250, 150);
	    g.setColor(Color.magenta);
	    g.fillArc(580, 50, 250, 150, 360, 45);
	    g.setColor(Color.black);
	    g.drawOval(580, 250, 150, 150); // as long as WIDTH and HEIGHT are equal the oval should look like a circle
	    g.drawRoundRect(1, 250, 250, 150, 50, 50);
	    g.setColor(Color.magenta);
	    g.fillOval(280, 250, 250, 150);
	    
  }
 
}