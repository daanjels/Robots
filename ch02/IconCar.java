package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class IconCar extends Icon {
	/** Create a new icon for a robot. */
	public IconCar() {
		super();
	}
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		//	wheels
		g.setColor(Color.BLACK);
		g.fillOval(40, 25, 10, 10);
		g.fillOval(40, 65, 10, 10);
		//	body
		g.setColor(Color.BLUE);
		g.fillOval(45, 20, 15, 60);
		g.fillRect(45, 20, 7, 60);
		g.drawLine(59, 40, 69, 55);
		g.drawLine(69, 55, 70, 62);
		g.drawLine(70, 62, 56, 74);
	}

}
