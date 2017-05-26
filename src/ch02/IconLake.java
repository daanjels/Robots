package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class IconLake extends Icon {
	/** Create a new icon for a robot. */
	public IconLake() {
		super();
	}
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(0, 0, 100, 100);
		g.fillOval(0, 0, 35, 35);
		g.fillOval(0, 65, 35, 35);
		g.fillOval(65, 0, 35, 35);
		g.fillOval(65, 65, 35, 35);
	}

}
