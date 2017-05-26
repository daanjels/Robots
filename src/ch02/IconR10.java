package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class IconR10 extends Icon {
	/** Create a new icon for a robot. */
	public IconR10() {
		super();
	}
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		//	wheels
		g.setColor(Color.GRAY);
	    g.fillRect(30, 35, 20, 10);
	    g.fillRect(30, 55, 20, 10);
	    g.fillRect(50, 40, 30, 20);
	    g.fillRect(55, 30, 25, 5);
	    g.fillRect(55, 65, 25, 5);
	    g.fillRect(75, 30, 5, 40);
	    g.fillOval(80, 45, 15, 10);

	    g.setColor(Color.BLACK);
	    g.drawString("R 10", 55, 55);
	}

}
