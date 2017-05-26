package ch02;
import becker.robots.icons.*;
import java.awt.*;

/** Create a robot icon that has arms
 * 
 * @author arq
 *
 */

public class IconTree extends Icon {
	/** Create a new icon for a robot. */
	public IconTree() {
		super();
	}
	/** Paint the icon. */
	public void paintIcon(Graphics g) {
		g.setColor(Color.GREEN);
		//	body
		g.fillOval(20, 0, 40, 40);
		g.fillOval(50, 0, 30, 30);
		Color darkgreen = new Color(100, 200, 155);
		g.setColor(darkgreen);
		g.fillOval(30, 40, 40, 40);
		g.fillOval(40, 20, 30, 30);
		Color lightgreen = new Color(200, 100, 55);
		g.setColor(lightgreen);
		g.fillOval(20, 30, 30, 30);
		g.fillOval(40, 40, 20, 20);
	}

}
