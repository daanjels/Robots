package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class IconBuilding extends Icon {
	/** Create a new icon for a robot. */
	public IconBuilding() {
		super();
	}
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		//	wheels
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(20, 0, 80, 20);
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 20, 40);
		g.fillOval(35, 00, 30, 30);
		g.fillRect(70, 10, 30, 30);
	}

}
